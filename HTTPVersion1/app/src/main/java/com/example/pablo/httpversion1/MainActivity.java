package com.example.pablo.httpversion1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText = (EditText)findViewById(R.id.username_text);
        passwordEditText = (EditText)findViewById(R.id.password_text);
    }

    public void onLogin(View view) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        RequestUsersAsyncTask task = new RequestUsersAsyncTask();
        task.execute();
    }
}
