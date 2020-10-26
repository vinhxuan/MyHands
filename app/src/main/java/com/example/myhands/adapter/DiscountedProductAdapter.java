package com.example.myhands.adapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myhands.activity.ProductDetailActivity;
import com.example.myhands.R;
import com.example.myhands.custom_model.DiscountedProducts;

import java.util.ArrayList;

public class DiscountedProductAdapter extends RecyclerView.Adapter<DiscountedProductAdapter.DiscountedProductViewHolder> {

    private Context context;
    ArrayList<DiscountedProducts> discountedProductsArrayList;
    //private List<DiscountedProducts> discountedProductsList;

    public DiscountedProductAdapter(Context context, ArrayList discountedProductsArrayList) {
        this.context = context;
        this.discountedProductsArrayList = discountedProductsArrayList;
    }
    @NonNull
    @Override
    public DiscountedProductAdapter.DiscountedProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.discounted_row_items, parent, false);

        return new DiscountedProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiscountedProductAdapter.DiscountedProductViewHolder holder, int position) {
//        DiscountedProducts product = discountedProductsList.get(position);
//        holder.id.setText(product.getId());
//        holder.image.setImageResource(Integer.parseInt(product.getImageurl()));
        DiscountedProducts products = discountedProductsArrayList.get(position);
        holder.image.setImageResource(products.getImageUrl());
        holder.name.setText(products.getName());
        holder.sale.setText(products.getSale());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ProductDetailActivity.class);
                i.putExtra("name",products.getName());
                i.putExtra("image",products.getImageUrl());
                i.putExtra("desc", products.getDesc());
                i.putExtra("price", products.getPrice());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return discountedProductsArrayList.size();
    }

    public static class DiscountedProductViewHolder extends RecyclerView.ViewHolder{

        TextView name, sale;
        public ImageView image;
        public DiscountedProductViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txtQtyCart);
            sale = itemView.findViewById(R.id.txtNameCart);
            image = itemView.findViewById(R.id.imgProduct);

        }
    }
}
