package com.example.tomek.londonschoolapp;

public class Product {
    private int id;
    private String title,shortdesc;
    private int image;

    public Product(String title, String shortdesc, int image) {
        this.title = title;
        this.shortdesc = shortdesc;
        this.image = image;
    }


    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public int getImage() {
        return image;
    }
}
