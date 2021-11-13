package ru.mirea3;

public class circle extends shape {

    protected double radius;

    public circle(){
    };
    public circle(double radius){
    };

    public circle(double radius, String color, boolean filled) {
    };

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
      this.radius = radius;
    };

    @Override
    String getColor() {
        return color;
    }

    @Override
    void setColor(String color) {
        this.color = color;
    }

    @Override
    boolean isFilled() {
        return this.filled;
    }

    @Override
    void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Color - "+getColor()+",Perimeter - "+getPerimeter()+",Area - "+getArea();
    }
}
