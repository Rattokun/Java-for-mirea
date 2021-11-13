package ru.mirea3;

import su.ru.mirea3.*;

public class Tester {
    public static void main(String[] args) {
        shape s1 = new circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((circle) s1).getRadius()); //Тут нужен квалифаер ((circle)

        circle c1 = (circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //shape s2 = new shape(); - Нельзя создать экземпляр от абстрактного класса

        shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(((Rectangle) s3).getLength()); //Тут нужен квалифаер ((Rectangle)

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide());

// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(((Square)r2.getSide()); - нельзя использовать род. классу дочерний метод
        System.out.println(r2.getLength());

// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println(point.toString());
        point.moveDown();
        point.moveRight();
        System.out.println(point.toString());
        point.moveLeft();
        point.moveUp();
        System.out.println(point.toString());

        MovableCircle circle = new MovableCircle(0,0,1,1,1);
        System.out.println(circle.toString());
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle.toString());
        circle.moveLeft();
        circle.moveUp();
        System.out.println(circle.toString());

        MovableRectangle rectangle = new MovableRectangle(0,0,1,1,1,1);
        System.out.println(rectangle.toString());
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle.toString());
        rectangle.moveLeft();
        rectangle.moveUp();
        System.out.println(rectangle.toString());

    }
}
