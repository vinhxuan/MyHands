package com.example.myhands.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myhands.MainActivity;
import com.example.myhands.R;
import com.example.myhands.adapter.AllCategoryAdapter;
import com.example.myhands.custom_model.AllCategoryModel;

import java.util.ArrayList;

public class AllCategoryActivity extends AppCompatActivity {

    RecyclerView allCategoryRecycler;
    ImageView imgArrowBack;
    ArrayList<AllCategoryModel> allCategoryModelArrayList;

    String categoryName[] = {"Áo","Tranh","Thiệp","Túi","Vòng", "Quạt"};
    int imagesCategory[]={R.drawable.aoicon, R.drawable.artcoloricon, R.drawable.cardicon, R.drawable.handbagicon, R.drawable.vongicon, R.drawable.quaticon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_category);
        //Đổ dữ liệu vào ArrayList
        getAllCategoryData();
        //Khai báo
        allCategoryRecycler = findViewById(R.id.allCategoryRecycler);
        imgArrowBack = findViewById(R.id.imgArrowBack);
        //Adapter
        AllCategoryAdapter adapter = new AllCategoryAdapter(this,allCategoryModelArrayList);
        allCategoryRecycler.setAdapter(adapter);
        allCategoryRecycler.setLayoutManager(new GridLayoutManager(this,3));
        //Event Arrow Back
        imgArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(AllCategoryActivity.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });
    }
    private void getAllCategoryData() {

        allCategoryModelArrayList = new ArrayList<>();
        for(int i=0;i<imagesCategory.length;i++)
        {
            allCategoryModelArrayList.add(new AllCategoryModel(i+1,categoryName[i],imagesCategory[i]));
        }
    }
}