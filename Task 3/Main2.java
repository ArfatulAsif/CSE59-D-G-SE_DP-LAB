package com.mycompany.lab3;
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    double calculateTotalArea(Shape[] shapes) {
        double area = 0;
          for (Shape shape : shapes) {
            area += shape.calculateArea();
        }

        return area;
    }
}
        


public class task2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(length 5, width 4),
            new Circle(3)
        };

        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Total Area = " +
                calculator.calculateTotalArea(shapes));
    }
}
    


