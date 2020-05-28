package com.everacosta.myhero;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface superHeroService {
    @GET("{id}")
    Call<SuperHero> getData(@Path("id") int id);
}
