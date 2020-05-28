package com.everacosta.myhero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private Retrofit retrofit;
    private String MYTAG="SUPERHERO";
    Random rand = new Random();
    int rdmIdSuperHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String baseUri="https://superheroapi.com/api/2581273005478754/";
        Log.e(MYTAG,"EL ID: "+rand.nextInt(500)+1);
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUri)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ArrayList<SuperHero> superHeroes = new ArrayList<>();
        getData(superHeroes,rand.nextInt(500)+1);
    }
    private void getData(ArrayList<SuperHero> superHeroes, int r){
        superHeroService service = retrofit.create(superHeroService.class);
        Call<SuperHero> superHeroCall =service.getData(r);
        superHeroCall.enqueue(new Callback<SuperHero>() {
            @Override
            public void onResponse(Call<SuperHero> call, Response<SuperHero> response) {
                if(response.isSuccessful()){
                    Log.i(MYTAG,"La respuesta"+response.body().toString());
                    superHeroes.add(response.body());
                    if(superHeroes.size()<15){
                        getData(superHeroes,rand.nextInt(500)+1);
                    }else{
                        onDataLoaded(superHeroes);
                    }

                }else{
                    Log.e(MYTAG,"ERROR LTPM: "+response.errorBody());
                }
            }
            @Override
            public void onFailure(Call<SuperHero> call, Throwable t) {
                Log.e(MYTAG,"ERROR LTPM: "+t.getMessage());
            }
        });
    }
    private void onDataLoaded(ArrayList<SuperHero> superHeroes){
        ProgressBar progressBar = findViewById(R.id.progressBar);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        heroAdapter adapter = new heroAdapter(this,superHeroes);
        recyclerView.setAdapter(adapter);
        if(superHeroes.size()>5){
            Log.i(MYTAG,"Si lo lleno");
            progressBar.setVisibility(View.INVISIBLE);
        }else{
            Log.e(MYTAG,"No lo lleno");

        }
    }

}
