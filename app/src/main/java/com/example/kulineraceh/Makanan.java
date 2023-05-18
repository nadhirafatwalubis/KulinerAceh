package com.example.kulineraceh;

import java.io.Serializable;

public class Makanan implements Serializable {
    private String judul, rate;

    public Makanan(String judul, String rate, int img) {
        this.judul = judul;
        this.rate = rate;
        this.img = img;
    }

    public Makanan(String judul, String rate) {
        this.judul = judul;
        this.rate = rate;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    private int img;


}
