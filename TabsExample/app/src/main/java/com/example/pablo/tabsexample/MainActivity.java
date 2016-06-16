package com.example.pablo.tabsexample;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pablo.tabsexample.adapter.PostAdapter;
import com.example.pablo.tabsexample.model.Post;
import com.example.pablo.tabsexample.network.RetrievePostsAsyncTask;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setElevation(0);
        }
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("Posts"));
        tabLayout.addTab(tabLayout.newTab().setText("Users"));
    }
}
