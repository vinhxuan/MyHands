package com.example.myhands.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myhands.R;

public class ShipmentDetailActivity extends AppCompatActivity {

    Button btnDatHang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_giao_hang);

        btnDatHang = findViewById(R.id.btnDatHangGiaoHang);
        btnDatHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ShipmentDetailActivity.this, DetailOrderActivity.class);
                startActivity(i);
            }
        });
    }
}