package com.example.nmoya.tees;

import java.io.Serializable;

/**
 * Created by nmoya on 7/11/15.
 */
public class TShirt implements Serializable {
    private String shirt_img_url, store_url, store_img_url;
    private float price;
    private boolean isFavourite;

    public TShirt(String shirt_img_url, String store_url, String store_img_url, float price, boolean isFavourite) {
        this.shirt_img_url = shirt_img_url;
        this.store_url = store_url;
        this.store_img_url = store_img_url;
        this.price = price;
        this.isFavourite = isFavourite;
    }

    public String getShirt_img_url() {
        return shirt_img_url;
    }

    public void setShirt_img_url(String shirt_img_url) {
        this.shirt_img_url = shirt_img_url;
    }

    public String getStore_url() {
        return store_url;
    }

    public void setStore_url(String store_url) {
        this.store_url = store_url;
    }

    public String getStore_img_url() {
        return store_img_url;
    }

    public void setStore_img_url(String store_img_url) {
        this.store_img_url = store_img_url;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setIsFavorited(boolean isFavorited) {
        this.isFavourite = isFavorited;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "store_url='" + store_url + '\'' +
                ", isFavourite=" + isFavourite +
                '}';
    }
}
