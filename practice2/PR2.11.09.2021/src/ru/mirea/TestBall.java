package ru.mirea;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(0,0);
        b1.setX(15);
        b1.setY(10);
        b1.move(1,1);
        System.out.println(b1);
        b1.setXY(0,0);
        System.out.println(b1);
    }
}
