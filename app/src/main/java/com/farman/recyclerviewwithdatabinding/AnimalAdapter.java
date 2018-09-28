package com.farman.recyclerviewwithdatabinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.farman.recyclerviewwithdatabinding.databinding.AnimalRowBinding;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ItemViewHolder> {

    Context context;
    ArrayList<AnimalModel> animalList;


    public AnimalAdapter(Context context, ArrayList<AnimalModel> animalList) {
        this.context = context;
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AnimalRowBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.animal_row, parent, false);

        ItemViewHolder viewHolder = new ItemViewHolder(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.anmalRowBinding.setAnimal(animalList.get(position));

    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        AnimalRowBinding anmalRowBinding;

        public ItemViewHolder(AnimalRowBinding annmalRowBinding) {
            super(annmalRowBinding.getRoot());
            this.anmalRowBinding = annmalRowBinding;

        }


    }
}
