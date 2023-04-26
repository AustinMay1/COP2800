package org.example;

public class Sphere {
    private double x;
    private double y;
    private double z;

    public Sphere(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double calculateRadius() {
        double points = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        return Math.sqrt(points);
    }

    public double calculateDiameter() {
        return 2 * calculateRadius();
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(calculateRadius(),  2);
    }

    public double calculateVolume() {
        return (4 / 3) * Math.PI * Math.pow(calculateRadius(), 3);
    }
}
