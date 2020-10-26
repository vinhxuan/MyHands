package com.example.myhands.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myhands.R;
import com.example.myhands.custom_model.Category;

import java.util.ArrayList;

public class SelectCategoryAdapter extends RecyclerView.Adapter<SelectCategoryAdapter.SelectCategoryViewHolder> {

    Context context;
    ArrayList<Category> categories;
    public SelectCategoryAdapter(Context context, ArrayList discountedProductsArrayList) {
        this.context = context;
        this.categories = discountedProductsArrayList;
    }
    @NonNull
    @Override
    public SelectCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.category_row_items, parent, false);

        return new  SelectCategoryAdapter.SelectCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SelectCategoryViewHolder holder, int position) {
        Category category = categories.get(position);
        holder.categoryImage.setImageResource(category.getCategoryImage());
        holder.categoryName.setText(category.getCategoryName());
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class SelectCategoryViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;
        ImageView categoryImage;
        public SelectCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.txtCategoryName);
            categoryImage = itemView.findViewById(R.id.imgCategory);
        }
    }
}
