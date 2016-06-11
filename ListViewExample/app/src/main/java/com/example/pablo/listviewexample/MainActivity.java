package com.example.pablo.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pablo.listviewexample.adapter.PostAdapter;
import com.example.pablo.listviewexample.model.Post;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Post> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        // Hardcoded list
        list = new ArrayList<>();
        list.add(new Post("Post 1", "Bla bla bla"));
        list.add(new Post("Post 2", "Lorem"));
        list.add(new Post("Post 3", "Bla bla bla 2"));

        PostAdapter arrayAdapter = new PostAdapter(this);
        listView.setAdapter(arrayAdapter);
        arrayAdapter.addAll(list);
    }
}
