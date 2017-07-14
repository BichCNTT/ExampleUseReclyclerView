package com.example.ominext.exampleuserecyclerview;

/**
 * Created by Ominext on 7/13/2017.
 */

public class TitleAndContent {

    private String title;
    private String content;

    public TitleAndContent() {
    }

    public TitleAndContent(String title, String content) {
        this.title = title;
        this.setContent(content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}