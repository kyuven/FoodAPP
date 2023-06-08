package com.example.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.CategoryFood;
import com.example.foodapp.model.PopularFood;

import java.util.List;

public class CategoryFoodAdapter extends RecyclerView.Adapter<CategoryFoodAdapter.CategoryFoodViewHolder> {

    public CategoryFoodAdapter(Context context, List<CategoryFood> categoryFoodList) {
        this.context = context;
        this.categoryFoodList = categoryFoodList;
    }

    Context context;
    List<CategoryFood> categoryFoodList;

    @NonNull
    @Override
    public CategoryFoodAdapter.CategoryFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.category_row_food, parent, false);
        return new CategoryFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryFoodAdapter.CategoryFoodViewHolder holder, int position) {
        holder.categoryImg.setImageResource(categoryFoodList.get(position).getImgUrl());
        holder.name.setText(categoryFoodList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return categoryFoodList.size();
    }

    public static final class CategoryFoodViewHolder extends RecyclerView.ViewHolder{
        ImageView categoryImg;
        TextView name;

        public CategoryFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryImg = itemView.findViewById(R.id.category_image);
            name = itemView.findViewById(R.id.category_name);
        }
    }
}
