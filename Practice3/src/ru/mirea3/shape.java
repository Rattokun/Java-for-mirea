package ru.mirea3;

public abstract class shape {
protected String color;
protected boolean filled;

public shape(){};
public shape(String color, boolean filled){};

abstract String getColor();
abstract void setColor(String color);

abstract boolean isFilled();
abstract void setFilled(boolean filled);

abstract double getArea();
abstract double getPerimeter();

public abstract String toString();
}

