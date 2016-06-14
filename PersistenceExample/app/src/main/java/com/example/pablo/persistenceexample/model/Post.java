package com.example.pablo.persistenceexample.model;

import com.orm.SugarRecord;
import com.orm.dsl.Column;

public class Post extends SugarRecord {
    private String title;
    private String content;

    public Post() {
        title = "";
        content = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return title;
    }
}
