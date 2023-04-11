package org.example;

public class SphereTest {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(10,10,10);
        Sphere sphere2 = new Sphere(3, 6, 9);
        Sphere sphere3 = new Sphere(1.5, 2, 5);

        System.out.printf("Points: (%.2f, %.2f, %.2f)\nRadius: %.2f\nDiameter: %.2f\nSurface Area: %.2f\nVolume: %.2f",
                sphere1.getX(), sphere1.getY(), sphere1.getZ(), sphere1.calculateRadius(), sphere1.calculateDiameter(),
                sphere1.calculateSurfaceArea(), sphere1.calculateVolume());

        System.out.println("\n-----------");

        System.out.printf("Points: (%.2f, %.2f, %.2f)\nRadius: %.2f\nDiameter: %.2f\nSurface Area: %.2f\nVolume: %.2f",
                sphere2.getX(), sphere2.getY(), sphere2.getZ(), sphere2.calculateRadius(), sphere2.calculateDiameter(),
                sphere2.calculateSurfaceArea(), sphere2.calculateVolume());

        System.out.println("\n------------");

        System.out.printf("Points: (%.2f, %.2f, %.2f)\nRadius: %.2f\nDiameter: %.2f\nSurface Area: %.2f\nVolume: %.2f",
                sphere3.getX(), sphere3.getY(), sphere3.getZ(), sphere3.calculateRadius(), sphere3.calculateDiameter(),
                sphere3.calculateSurfaceArea(), sphere3.calculateVolume());
    }
}
