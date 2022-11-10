package com.example.projectmpecommerceapp.models;

public class SliderData {

    // image url is used to
    // store the url of image
    private int imgUrl;

    // Constructor method.
    public SliderData(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    // Getter method
    public int getImgUrl() {
        return imgUrl;
    }

    // Setter method
    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }
}
