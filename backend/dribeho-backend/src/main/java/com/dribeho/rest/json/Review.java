package com.dribeho.rest.json;

public class Review {
    public String cafeName;
    public Integer rating;

    public String title;

    public String review;

    public long unixTimestamp;

    public Review() {}

    public Review(String cafeName, Integer rating, String title, String review, long unixTimestamp) {
        this.cafeName = cafeName;
        this.rating = rating;
        this.title = title;
        this.review = review;
        this.unixTimestamp = unixTimestamp;
    }
}
