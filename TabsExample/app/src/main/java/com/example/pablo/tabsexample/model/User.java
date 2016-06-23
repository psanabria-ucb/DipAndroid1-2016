package com.example.pablo.tabsexample.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pablo on 6/16/2016.
 */
public class User {
    private String email;
    private String username;
    private String picture_url;
    private List<Post> posts;

    public User() {
        email = "";
        username = "";
        picture_url = "";
        posts = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPicture_url() {
        return picture_url;
    }

    public void setPicture_url(String pictureUrl) {
        this.picture_url = pictureUrl;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
