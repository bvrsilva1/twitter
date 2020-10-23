package com.bruno.twitter.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class User {

    @Getter(AccessLevel.NONE)
    private String userId;
    private String username;
    private String avatar;
    private List<String> following;
    private List<String> followers;
    private List<Post> tweetThread;
    private List<String> threadsParticipated;

    public User(String username) {
        this.userId = UUID.randomUUID().toString();
        this.username = username;
        followers = new ArrayList<>();
        following = new ArrayList<>();
        tweetThread = new ArrayList<>();
    }

    public void follow(String id) {
        following.add(id);
    }

}
