interface Shape {
    double calculateArea();
}
class Rectangle implements Shape {
    private double  length;
    private double width;
    public Rectangle( double length ,double width){
        this.length=length;
        this.width= width;
    }
    @Overrid
    public double calculateArea(){
        return length*width;
    }
}
class circle implements shape{
    private double radius;
    public circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * radius*radius;
    }
}
class triangle implements Shape{
    private double base;
    private double height;
    public triangle (double base , double height){
            this.base=base;
            this.height=height;
    }
    @Override
    public double calculateArea(){
        return 0.5*base*height;
    }
}

class calculateArea{
    public double calculateTotalArea(Shape[] shapes) {
        double totalarea=0;
        for (Shape sh:shapes){
            totalarea+=sh.calculateArea();
        }
        return totalarea;
    }
}

public class Main {
    public static void main (String[] args) {
        Shape[] shapes = {
            new Rectangle(10,5),
            new circle(3),
            new triangle(6,4)
        };
        calculateArea cal =new calculateArea();
        double totalarea =cal.calculateTotalArea(shapes);
        System.out.println("TOTAL AREA "+ totalarea);
    }
}
