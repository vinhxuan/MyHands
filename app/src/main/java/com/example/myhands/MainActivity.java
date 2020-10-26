package com.example.myhands;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myhands.activity.AllCategoryActivity;
import com.example.myhands.activity.CartActivity;
import com.example.myhands.activity.OrderActivity;
import com.example.myhands.activity.NotificationActivity;
import com.example.myhands.activity.ProfileActivity;
import com.example.myhands.adapter.DiscountedProductAdapter;
import com.example.myhands.adapter.HotProductAdapter;
import com.example.myhands.adapter.SelectCategoryAdapter;
import com.example.myhands.custom_model.Category;
import com.example.myhands.custom_model.DiscountedProducts;
import com.example.myhands.custom_model.HotProducts;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static int loginState = 0;
    RecyclerView discountedRecyclerView;
    RecyclerView categoryRecyclerView;
    RecyclerView hotRecyclerView;
    ImageView imgCart;
    TextView txtXemThem;
    BottomNavigationView bottomNavigationView;

    int images[] = {R.drawable.bestfriendrope, R.drawable.enternityknot,R.drawable.greyluckyknot,R.drawable.handmadeacrylicbraceletredevileyebead,R.drawable.menbraceletleather};
    int imagesCategory[]={R.drawable.aoicon, R.drawable.artcoloricon, R.drawable.cardicon, R.drawable.handbagicon, R.drawable.vongicon, R.drawable.quaticon};
    int imagesHot[] = {R.drawable.hotquatjapanstyle,R.drawable.hotinu,R.drawable.hotquatmuahe,R.drawable.hotmeo,R.drawable.hotthiepsinhnhat2,R.drawable.hotquatchinestyle};

    String discountProductName[] = {"Bestfriend Rope","Enternity Knot","Grey Lucky Knot","Red Evil Eye Bead","Men's Bracelet Leather"};
    String categoryName[] = {"Áo","Tranh","Thiệp","Túi","Vòng", "Quạt"};
    String hotName[] = {"Quạt kiểu Nhật", "Áo in Inu", "Quạt mùa hè","Áo in Miao","Thiệp sinh nhật loại 2", "Quạt kiểu Trung"};
    //Danh sach du lieu cua 2 RecyclerView:
    ArrayList<DiscountedProducts> discountedProductsList;
    ArrayList<Category> categoriesList;
    ArrayList<HotProducts> hotProductsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);

        getDiscountedProductData();
        //Trỏ
        discountedRecyclerView = findViewById(R.id.discountedRecycler);
        categoryRecyclerView = findViewById(R.id.selectCategoryRecycler);
        hotRecyclerView = findViewById(R.id.topHotRecycler);
        txtXemThem = findViewById(R.id.txtXemThem);
        imgCart = findViewById(R.id.imgCart);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        //Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.home);
        //Item Selected Listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.order: startActivity(new Intent(getApplicationContext(), OrderActivity.class));
                                    overridePendingTransition(0,0);
                                    return true;
                    case R.id.home:
                        return true;
                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext(), NotificationActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        //Adapter của sản phẩm giảm giá
        DiscountedProductAdapter adapter = new DiscountedProductAdapter(this,discountedProductsList);
        discountedRecyclerView.setAdapter(adapter);
        discountedRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        //Adapter của danh mục sản phẩm
        SelectCategoryAdapter categoryAdapter = new SelectCategoryAdapter(this, categoriesList);
        categoryRecyclerView.setAdapter(categoryAdapter);
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        //Adapter của sản phẩm Hot
        HotProductAdapter hotProductAdapter = new HotProductAdapter(this,hotProductsArrayList);
        hotRecyclerView.setAdapter(hotProductAdapter);
        hotRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        txtXemThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AllCategoryActivity.class);
                startActivity(i);
            }
        });
        //Xem giỏ hàng:
        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CartActivity.class);
                startActivity(i);
            }
        });
    }

    private void getDiscountedProductData() {
        discountedProductsList = new ArrayList<>();
        for(int i=0; i<images.length;i++)
        {
            discountedProductsList.add(new DiscountedProducts(i+1,discountProductName[i],images[i],"30%","Description","180000"));
        }
        categoriesList = new ArrayList<>();
        for(int i=0;i<imagesCategory.length;i++)
        {
            categoriesList.add(new Category(i+1,categoryName[i],imagesCategory[i]));
        }
        hotProductsArrayList = new ArrayList<>();
        for(int i=0;i<imagesCategory.length;i++)
        {
            hotProductsArrayList.add(new HotProducts(i+1,hotName[i],imagesHot[i],"Description","200000"));
        }

    }
}
