package com.assignment.shid;

class Shape {
	public double getArea() {
		return 0;
	}

}
class Rectangle extends Shape{
	
    private double length;
    private double width;
	
	public Rectangle(double l,double w) {
		this.length = l;
		this.width = w;
		
	}

	@Override
	public double getArea() {
		
		return this.length * this.width;
	}
	
}

public class Main {

	public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50, 40);
        System.out.println("Area of rectangle--- " + rectangle.getArea());

	}

}
