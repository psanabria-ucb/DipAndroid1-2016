package com.example.pablo.httpversion1;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

import com.example.pablo.httpversion1.http.PostsService;
import com.example.pablo.httpversion1.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RequestUsersAsyncTask extends AsyncTask<Void, Void, Void> {
    @Override
    protected Void doInBackground(Void... params) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dip-androiducbv2.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PostsService service = retrofit.create(PostsService.class);

        Call<List<User>> users = service.getAllUsers();
        try {
            Response<List<User>> response = users.execute();
            List<User> list = response.body();
            Log.d("Main Activity", "Objects: " + list.size());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
