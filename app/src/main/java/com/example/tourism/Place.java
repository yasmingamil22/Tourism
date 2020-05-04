package com.example.tourism;

public class Place {
    private int image;
    private String name ,location;

    public Place(int image, String name ,String location) {
        this.image = image;
        this.name = name;
        this.location =location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
