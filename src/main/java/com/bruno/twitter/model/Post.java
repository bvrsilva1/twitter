package com.bruno.twitter.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Post {

    @Getter(AccessLevel.NONE)
    private String id;
    private String userId;
    private String text;
    private int likes;
    private List<Post> posts;

    public Post(String userId, String text) {
        this.id = UUID.randomUUID().toString();
        this.userId = userId;
        this.text = text;
        this.likes = 0;
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

}
