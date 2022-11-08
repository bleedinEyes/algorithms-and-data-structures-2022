package ru.mirea.workfour.Task2;

public abstract class Clothes implements MenClothing, WomenClothing{
    private Size size;
    private double price;
    private String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getEuro(){
        return this.size.getEuroSize();
    }
    public String getDescription(){
        return size.getDescription();
    }
    @Override
    public void dressMan() {
    }
    @Override
    public void dressWomen() {
    }
}
