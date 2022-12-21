package com.example.simplenav;


import retrofit2.Call;
import retrofit2.http.POST;

public interface ApiInterface {
   @POST("register")
   Call<Sid> getSid();

}