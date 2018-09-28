package com.farman.recyclerviewwithdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.farman.recyclerviewwithdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AnimalModel> animalList = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        animalList.add(new AnimalModel("Tiger"));
        animalList.add(new AnimalModel("Lion"));
        animalList.add(new AnimalModel("Horse"));
        animalList.add(new AnimalModel("Zebra"));
        animalList.add(new AnimalModel("Elephant"));
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.rvAnimal.setLayoutManager(new LinearLayoutManager(this));
       activityMainBinding.rvAnimal.setAdapter(new AnimalAdapter(this,animalList));

       /*
      */





    }






}
