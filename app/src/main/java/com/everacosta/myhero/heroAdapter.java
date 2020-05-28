package com.everacosta.myhero;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class heroAdapter extends RecyclerView.Adapter<heroAdapter.ViewHolderSuperHero> {
    ArrayList<SuperHero> SuperHeroesList;

    public heroAdapter(ArrayList<SuperHero> superHeroesList) {
        SuperHeroesList = superHeroesList;
    }

    @NonNull
    @Override
    public ViewHolderSuperHero onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,null,false);
        return new ViewHolderSuperHero(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSuperHero viewHolderSuperHero, int i) {
        viewHolderSuperHero.tvName.setText(SuperHeroesList.get(i).getName());
        viewHolderSuperHero.tvFullName.setText("secret identity: \n"+SuperHeroesList.get(i).getBiography().getFullName());
        viewHolderSuperHero.tvAlignment.setText("Is: "+SuperHeroesList.get(i).getBiography().getAlignment());
        viewHolderSuperHero.tvPublisher.setText("Published by: \n"+SuperHeroesList.get(i).getBiography().getPublisher());
    }

    @Override
    public int getItemCount() {
        return SuperHeroesList.size();
    }

    public class ViewHolderSuperHero extends RecyclerView.ViewHolder {
        TextView tvName,tvFullName,tvPublisher,tvAlignment;
        ImageView foto;
        ConstraintLayout parent;
        public ViewHolderSuperHero(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvFullName=itemView.findViewById(R.id.tvFullName);
            tvPublisher=itemView.findViewById(R.id.tvPublisher);
            tvAlignment=itemView.findViewById(R.id.tvAlignment);
            foto=itemView.findViewById(R.id.foto);
            parent=itemView.findViewById(R.id.parent_layout);

        }
    }
}
