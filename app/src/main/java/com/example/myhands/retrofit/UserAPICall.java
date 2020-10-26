package com.example.myhands.retrofit;

import com.example.myhands.custom_model.Post;
import com.example.myhands.model.TaiKhoan;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserAPICall {
    //https://run.mocky.io/v3/5f765b64-3c22-477b-bd18-39a3216d3c06

    @GET("users")
    Call<List<TaiKhoan>> getUsers();


}
