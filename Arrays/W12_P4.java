package Arrays;

import java.util.Scanner;

abstract class Shape {
    protected abstract void calcArea();
    public abstract void printArea();
}

class Circle extends Shape {
    private double radius;
  	public String shapeType;
  protected double area;

    public Circle(String shapeType, double radius) {
        this.shapeType=shapeType;
        this.radius = radius;
    }

    
    protected void calcArea() {
        double area = Math.PI * radius * radius;
    }

    
    public void printArea() {
        //System.out.print("Area of "+shapeType+": "+);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    public String shapeType;
  protected double area;

    public Rectangle(String shapeType, double length, double width) {
        this.shapeType=shapeType;
        this.length = length;
        this.width = width;
    }

   
    protected void calcArea() {
        double area = length * width;
    }

   
        public void printArea() 
        {
       // System.out.print("Area of "+shapeType+": "+);
        }
}

class Square extends Shape {
    private double side;
    public String shapeType;
    public double area;

    public Square(String shapeType, double side) {
        this.shapeType=shapeType;
        this.side = side;
    }

    
    protected void calcArea() {
       double area = side * side;
    }

    
    public void printArea() {
        //System.out.print("Area of "+shapeType+": "+);
    }
}

public class W12_P4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter shape type (Circle, Rectangle or Square): ");
        String shapeType = scanner.nextLine();
        // System.out.print("Enter first dimension: ");
        double arg1 = scanner.nextDouble();
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle(shapeType, arg1);
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            double arg2 = scanner.nextDouble();
            shape = new Rectangle(shapeType, arg1, arg2);
        } else if (shapeType.equalsIgnoreCase("Square")) {
            shape = new Square(shapeType, arg1);
        } else {
            System.out.println("Invalid shape type");
            scanner.close();
            return;
        }
        shape.calcArea();
        shape.printArea();
        scanner.close();
    }
}


