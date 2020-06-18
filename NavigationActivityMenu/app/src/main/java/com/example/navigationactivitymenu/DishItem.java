package com.example.navigationactivitymenu;

public class DishItem {
    private String food_name;
    private String food_price;
    private String food_weight;
    private int resImage;

    public DishItem(String food_name, String food_price,  String weight) {
        this.food_name = food_name;
        this.food_price = food_price;
        this.food_weight = weight;
    }
    public DishItem(String food_name, String food_price,  String food_weight, int resImage) {
        this.food_name = food_name;
        this.food_price = food_price;
        this.food_weight = food_weight;
        this.resImage = resImage;
    }
    String getFood_name() {
        return food_name;
    }

    void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    String getFood_price() {
        return food_price;
    }

    void setFood_price(String food_price) {
        this.food_price = food_price;
    }
    String getWeight() {
        return food_weight;
    }

    void setWeight(String food_weight) {
        this.food_weight = food_weight;
    }

    public int getResImage() {
        return resImage;
    }

    void setResImage(int resImage) {
        this.resImage = resImage;
    }




}
