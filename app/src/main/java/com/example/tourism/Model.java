package com.example.tourism;

public class Model {
    int img;
    private String title;
    private String desc;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Model(int img, String title, String desc ) {
        this.img = img;
        this.title = title;
        this.desc = desc;

    }
}
