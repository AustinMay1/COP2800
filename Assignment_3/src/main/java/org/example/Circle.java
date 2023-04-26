package org.example;

public class Circle {
    private double diameter;
    private double radius;

    public Circle(double diameter) {
        setDiameter(diameter);
        setRadius(diameter);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double diameter) {
        this.radius = diameter / 2;
    }

    public double calculateCircumference() {
        return 2 * (Math.PI * radius);
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
