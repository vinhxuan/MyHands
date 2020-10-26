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
import com.example.myhands.custom_model.HotProducts;

import java.util.ArrayList;

public class HotProductAdapter extends RecyclerView.Adapter<HotProductAdapter.HotProductViewHolder> {

    private Context context;
    ArrayList<HotProducts> hotProductsArrayList;
    //private List<DiscountedProducts> discountedProductsList;

    public HotProductAdapter(Context context, ArrayList hotProductsArrayList) {
        this.context = context;
        this.hotProductsArrayList = hotProductsArrayList;
    }
    @NonNull
    @Override
    public HotProductAdapter.HotProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.hot_row_items, parent, false);

        return new HotProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotProductAdapter.HotProductViewHolder holder, int position) {
//        DiscountedProducts product = discountedProductsList.get(position);
//        holder.id.setText(product.getId());
//        holder.image.setImageResource(Integer.parseInt(product.getImageurl()));
        HotProducts products = hotProductsArrayList.get(position);
        holder.image.setImageResource(products.getImageUrl());
        holder.name.setText(products.getName());
        holder.desc.setText(products.getDesc());
        holder.price.setText(products.getPrice());

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
        return hotProductsArrayList.size();
    }

    public static class HotProductViewHolder extends RecyclerView.ViewHolder{

        TextView name,desc,price;
        public ImageView image;
        public HotProductViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.txtNameCart);
            desc = itemView.findViewById(R.id.txtQtyCart);
            price = itemView.findViewById(R.id.txtPriceCart);
            image = itemView.findViewById(R.id.imgProduct);

        }
    }
}
