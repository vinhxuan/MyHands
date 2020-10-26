package com.example.myhands.custom_model;

public class DiscountedProducts {
    Integer id;
    String name;
    int imageUrl;
    String sale;
    String desc;
    String price;

    public DiscountedProducts() {
    }

    public DiscountedProducts(Integer id, String name, int imageUrl, String sale, String desc, String price) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.sale = sale;
        this.desc = desc;
        this.price = price;
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

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }
}
