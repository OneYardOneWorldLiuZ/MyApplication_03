package com.huaxilvshe.myapplication_03.adapts;

public class Weather {

    private String name;
    private String imageUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Weather(String name, String imageUrl){
        this.name = name;
        this.imageUrl = imageUrl;

    }

}
