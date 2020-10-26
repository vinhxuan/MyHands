package com.example.myhands.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.myhands.MainActivity;
import com.example.myhands.R;
import com.example.myhands.custom_model.Post;
import com.example.myhands.model.TaiKhoan;
import com.example.myhands.retrofit.UserAPICall;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LoginActivity extends AppCompatActivity {

    TextView txtSignup, txtForgot, txtMessage;
    ImageView arrowBack;
    EditText username, password;
    Button btnSignIn;
    TaiKhoan acc;

    private RequestQueue mQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_2);
        txtSignup = findViewById(R.id.txtSignup2);
        arrowBack = findViewById(R.id.imgArrowBackLogin);
        username = findViewById(R.id.editUsernameSignIn2);
        password = findViewById(R.id.editPass2);
        btnSignIn = findViewById(R.id.btnSignIn2);
        txtForgot = findViewById(R.id.txtforgotPassword2);
        txtMessage = findViewById(R.id.txtMessageLogin);

        mQueue = Volley.newRequestQueue(this);



        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(i);
            }
        });

        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://192.168.0.104:3000/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                UserAPICall userAPICall = retrofit.create(UserAPICall.class);
                Call<List<TaiKhoan>> call = userAPICall.getUsers();
                call.enqueue(new Callback<List<TaiKhoan>>() {
                    @Override
                    public void onResponse(Call<List<TaiKhoan>> call, Response<List<TaiKhoan>> response) {
                        if(!response.isSuccessful()){
                            txtMessage.setText("Code:"+response.code());
                            return;
                        }
                        List<TaiKhoan> users = response.body();
                        for(TaiKhoan user : users){
                            String usernameJson = user.getsTenTaiKhoan()+"";
                            String passwordJson = user.getsMatKhau()+"";
                            String u = username.getText().toString();
                            String p = password.getText().toString();
                            if(u.equals(usernameJson) && p.equals(passwordJson))
                            {
                                txtMessage.append("Login Success! "+user.getsTenTaiKhoan()+" You are welcome!");
                                return;
                            }
                            else {
                                txtMessage.setText("Sai");
                            }

                        }
                    }

                    @Override
                    public void onFailure(Call<List<TaiKhoan>> call, Throwable t) {
                        txtMessage.setText(t.getMessage());
                    }
                });
            }
        });
    }
}
