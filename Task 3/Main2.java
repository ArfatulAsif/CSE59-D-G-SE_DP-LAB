package lab3;
interface Shape{
	double calculateArea();
}
class Rectangle implements Shape{
	public double length;
	public double width;
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
		
	}
	public double calculateArea() {
        return length * width;
    }
	
}
class Circle implements Shape{
	public double radius;
	public Circle(double radius) {
		this.radius= radius;
	}
	public double calculateArea()
	{
		return Math.PI * radius*radius;
	}
}
class AreaCalculator{
	public double calculateTotalArea(Shape[] shapes) {
		double area=0;
		for(Shape shape : shapes) {
			area+= shape.calculateArea();
			
		}
		return area;
	}
}
/*
class Triangle implements Shape {
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
*/
public class main2 {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[] {
				new Rectangle(10,5),new Circle(7)
				
		};
		AreaCalculator calculator = new AreaCalculator();
		double totalArea= calculator.calculateTotalArea(shapes);
		System.out.println("Total Area: "+totalArea);
	}

}
