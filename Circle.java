package be.abis.execice.one;

public class Circle extends be.abis.execice.one.Shape {
    private double radius;

    public double calculateArea() {
        return 3.14159265357989 *radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}