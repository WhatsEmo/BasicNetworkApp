package com.example.whatsemo.basicnetworkapp;


import java.util.Map;

public class NewsFeedItem {

    private Map<String, Integer> badege_counts;
    private String display_name;
    private String profile_image;

    public Map<String, Integer> getBadege_counts() {
        return badege_counts;
    }

    public void setBadege_counts(Map<String, Integer> badege_counts) {
        this.badege_counts = badege_counts;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getProfile_image() {
        return profile_image;
    }

    public void setProfile_image(String profile_image) {
        this.profile_image = profile_image;
    }
}