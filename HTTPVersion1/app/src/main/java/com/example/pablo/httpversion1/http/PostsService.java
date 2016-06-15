package com.example.pablo.httpversion1.http;

import com.example.pablo.httpversion1.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PostsService {
    @GET("/users.json")
    Call<List<User>> getAllUsers();
    @POST("/login.json")
    Call<User> login(@Body User user);
}
