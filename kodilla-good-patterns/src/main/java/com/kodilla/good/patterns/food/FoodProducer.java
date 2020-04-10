package com.kodilla.good.patterns.food;

public class FoodProducer {
    private String brand;
    private String product;
    private int amount;

    public FoodProducer(String brand, String product, int amount) {
        this.brand = brand;
        this.product = product;
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public String getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }

    public void process() {

    }
}
