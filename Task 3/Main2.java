
package com.mycompany.mavenproject3;


public class Mavenproject3 {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Rectangle(10, 5),
            new Circle(7)
        };

        AreaCalculator calculator = new AreaCalculator();

        System.out.println(
            "Total Area: " + calculator.calculateTotalArea(shapes)
        );
    }
}


interface Shape {
    double calculateArea();
}


class Rectangle implements Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
