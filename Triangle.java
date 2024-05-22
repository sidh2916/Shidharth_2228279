package com.assignment.abhi;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;


    public Triangle() {
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    
    public double perimeter() {
        return side1 + side2 + side3;
    }

    // Method to calculate the area using Heron's formula
    public double area() {
        double s = perimeter() / 2;
        double sqrt = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return sqrt;
    }

    public static void main(String[] args) {
      
        Triangle tri1 = new Triangle(3, 6, 7);
        
       
        System.out.println("Sides of triangle: " + tri1.getSide1() + ", " +
                           tri1.getSide2() + ", " + tri1.getSide3());
        System.out.println("Area of triangle: " + tri1.area());
        System.out.println("Perimeter of triangle: " + tri1.perimeter());
    }
}

