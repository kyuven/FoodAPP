package com.example.foodapp.model;

public class CategoryFood {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(Integer imgUrl) {
        this.imgUrl = imgUrl;
    }

    public CategoryFood(String name, Integer imgUrl) {
        this.name = name;
        this.imgUrl = imgUrl;
    }

    String name;
    Integer imgUrl;


}
