package org.example;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.0);
        Circle circle2 = new Circle(6.0);
        Circle circle3 = new Circle(12.5);

        System.out.printf("Circle Diameter: %.2f\nCircle Radius: %.2f\nCircle Circumference: %.2f\nCircle Area: %.2f\n",
                circle1.getDiameter(), circle1.getRadius(), circle1.calculateCircumference(), circle1.calculateArea());

        System.out.println("------------");

        System.out.printf("Circle Diameter: %.2f\nCircle Radius: %.2f\nCircle Circumference: %.2f\nCircle Area: %.2f\n",
                circle2.getDiameter(), circle2.getRadius(), circle2.calculateCircumference(), circle2.calculateArea());

        System.out.println("------------");

        System.out.printf("Circle Diameter: %.2f\nCircle Radius: %.2f\nCircle Circumference: %.2f\nCircle Area: %.2f\n",
                circle3.getDiameter(), circle3.getRadius(), circle3.calculateCircumference(), circle3.calculateArea());

    }
}
