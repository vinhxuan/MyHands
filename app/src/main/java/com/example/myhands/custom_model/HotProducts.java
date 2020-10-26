package com.example.myhands.custom_model;

public class HotProducts {
    Integer id;
    String name;
    int imageUrl;
    String desc;
    String price;

    public HotProducts() {
    }

    public HotProducts(Integer id, String name, int imageUrl, String desc, String price) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.desc = desc;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
