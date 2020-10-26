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
import com.example.myhands.custom_model.AllCategoryModel;
import com.example.myhands.custom_model.Category;

import java.util.ArrayList;

public class AllCategoryAdapter extends RecyclerView.Adapter<AllCategoryAdapter.AllCategoryViewHolder> {

    Context context;
    ArrayList<AllCategoryModel> categories;
    public AllCategoryAdapter(Context context, ArrayList allCategoryArrayList) {
        this.context = context;
        this.categories = allCategoryArrayList;
    }
    @NonNull
    @Override
    public AllCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.all_category_row_items, parent, false);

        return new  AllCategoryAdapter.AllCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllCategoryViewHolder holder, int position) {
        AllCategoryModel categoryModel = categories.get(position);
        holder.categoryImage.setImageResource(categoryModel.getCategoryImage());
        holder.categoryName.setText(categoryModel.getCategoryName());


    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public static class AllCategoryViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;
        ImageView categoryImage;
        public AllCategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.txtCategoryName);
            categoryImage = itemView.findViewById(R.id.imgCategory);
        }
    }
}
