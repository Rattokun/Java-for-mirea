package ru.mirea3;

public class Square extends Rectangle{
    public Square(){
    };
    public Square(double side){};
    public Square(double side, String color, boolean filled){};

    public double getSide(){
    return this.length;
    //return this.width;
    };

    public void setSide(double side){
        this.length = side;
        this.width = side;
    };

    @Override
    public void setWidth(double width){
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public String toString() {
        return null;
    }

}
