package com.farman.recyclerviewwithdatabinding;

import android.databinding.BaseObservable;
public class AnimalModel{

    public String animalName;
    public String animalImage;

    public AnimalModel(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }


    public String getAnimalImage() {
        return animalImage;
    }

    public void setAnimalImage(String animalImage) {
        this.animalImage = animalImage;
    }
}
