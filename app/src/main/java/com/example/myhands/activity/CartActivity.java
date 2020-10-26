package com.example.myhands.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myhands.MainActivity;
import com.example.myhands.R;

public class CartActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnDatHang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        imageView = findViewById(R.id.imgBackArrowCart);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CartActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        btnDatHang = findViewById(R.id.btnDatHangCart);
        btnDatHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CartActivity.this, ShipmentDetailActivity.class);
                startActivity(i);

            }
        });
    }
}