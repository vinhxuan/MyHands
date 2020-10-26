package com.example.myhands.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myhands.MainActivity;
import com.example.myhands.R;

public class ProductDetailActivity extends AppCompatActivity {

    ImageView imgArrowBack,imgProduct;
    TextView txtName, txtDesc, txtPrice;

    int image;
    String name, price, desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        //Trỏ
        imgArrowBack = findViewById(R.id.imgArrowBackDetail);
        imgProduct = findViewById(R.id.imgProduct);
        txtName = findViewById(R.id.txtNameCart);
        txtDesc = findViewById(R.id.txtQtyCart);
        txtPrice = findViewById(R.id.txtPriceCart);
        //Dẫn dữ liệu
        Intent i = getIntent();
        name = i.getStringExtra("name");
        image = i.getIntExtra("image",0);
        desc = i.getStringExtra("desc");
        price = i.getStringExtra("price");
        //Binding
        txtName.setText(name);
        txtDesc.setText(desc);
        txtPrice.setText(price);
        imgProduct.setImageResource(image);

        //Event Arrow Back
        imgArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(ProductDetailActivity.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });
    }
}