package javaTask06;

public class Circle {
	
	private double radius;
	
	public Circle() {
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
        this.radius = radius;
    }
	
	public double calculateCircumference() {
        
        return 2 * Math.PI * radius;
    }
	
	public double getRadius() {
        return radius;
    }

	public static void main(String[] args) {
		
		Circle myObj = new Circle();
		System.out.println("Circle 1 radius: " + myObj.getRadius());
        System.out.println("Circumference of Circle 1: " + myObj.calculateCircumference());
        
        Circle myObj2 = new Circle(5.0);
        System.out.println("Circle 2 radius: " + myObj2.getRadius());
        System.out.println("Circumference of Circle 2: " + myObj2.calculateCircumference());

	}

}
