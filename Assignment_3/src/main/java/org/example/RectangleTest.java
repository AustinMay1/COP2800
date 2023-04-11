package org.example;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(17.5, 20.2);
        Rectangle rect3 = new Rectangle(3, 100);

        System.out.printf("Length: %.2f\nWidth: %.2f\nPerimeter: %.2f\nArea: %.2f\nDiagonals: %.2f",
                rect1.getLength(), rect1.getWidth(), rect1.calculatePerimeter(), rect1.calculateArea(), rect1.calculateDiagonals());

        System.out.println("\n------------");

        System.out.printf("Length: %.2f\nWidth: %.2f\nPerimeter: %.2f\nArea: %.2f\nDiagonals: %.2f",
                rect2.getLength(), rect2.getWidth(), rect2.calculatePerimeter(), rect2.calculateArea(), rect2.calculateDiagonals());

        System.out.println("\n------------");

        System.out.printf("Length: %.2f\nWidth: %.2f\nPerimeter: %.2f\nArea: %.2f\nDiagonals: %.2f",
                rect3.getLength(), rect3.getWidth(), rect3.calculatePerimeter(), rect3.calculateArea(), rect3.calculateDiagonals());

    }
}
