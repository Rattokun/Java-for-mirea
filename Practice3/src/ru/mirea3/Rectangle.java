package ru.mirea3;

public class Rectangle extends shape{
    protected double width;
    protected double length;

    public Rectangle(){
    };
    public Rectangle(double width, double length){
    };
    public Rectangle(double width, double length, String color, boolean filled){
    };

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength() {
        return  length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    String getColor() {
        return null;
    }

    @Override
    void setColor(String color) {

    }

    @Override
    boolean isFilled() {
        return false;
    }

    @Override
    void setFilled(boolean filled) {

    }

    @Override
    double getArea() {
        return (length*width);
    }

    @Override
    double getPerimeter() {
        return ((length+width)*2);
    }

    @Override
    public String toString() {
        return "Color - "+getColor()+",Perimeter - "+getPerimeter()+",Area - "+getArea();
    }
}
