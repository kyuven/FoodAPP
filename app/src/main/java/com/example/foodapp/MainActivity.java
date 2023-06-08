package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodapp.adapter.CategoryFoodAdapter;
import com.example.foodapp.adapter.PopularFoodAdapter;
import com.example.foodapp.model.CategoryFood;
import com.example.foodapp.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, categoryRecycler;
    PopularFoodAdapter popularFoodAdapter;
    CategoryFoodAdapter categoryFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();
        popularFoodList.add(new PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka", "$25.05", R.drawable.popularfood3));
        popularFoodList.add(new PopularFood("Float Cake Vietnam", "$7.05", R.drawable.popularfood1));
        popularFoodList.add(new PopularFood("Chiken Drumstick", "$17.05", R.drawable.popularfood2));
        popularFoodList.add(new PopularFood("Fish Tikka", "$25.05", R.drawable.popularfood3));

        setPopularRecycler(popularFoodList);

        List<CategoryFood> categoryFoodList = new ArrayList<>();
        categoryFoodList.add(new CategoryFood("Italian", R.drawable.italian_food));
        categoryFoodList.add(new CategoryFood("Asia", R.drawable.asiafood1));
        categoryFoodList.add(new CategoryFood("Brazilian", R.drawable.brasilian_food));
        categoryFoodList.add(new CategoryFood("Candy", R.drawable.ice_cream));

        setCategoryRecycler(categoryFoodList);
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList){
        popularRecycler = findViewById(R.id.food_reclyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setCategoryRecycler(List<CategoryFood> categoryFoodList){
        categoryRecycler = findViewById(R.id.category_recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        categoryRecycler.setLayoutManager(layoutManager);
        categoryFoodAdapter = new CategoryFoodAdapter(this, categoryFoodList);
        categoryRecycler.setAdapter(categoryFoodAdapter);
    }
}