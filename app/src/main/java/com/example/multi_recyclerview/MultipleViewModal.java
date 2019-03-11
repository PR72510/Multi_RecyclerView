package com.example.multi_recyclerview;

public class MultipleViewModal {
    String name;
    int image;
    int type;

    public static final int NAME_ONLY_TYPE = 0;
    public static final int IMAGE_ONLY_TYPE = 1;
    public static final int NAME_IMAGE_TYPE = 2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
