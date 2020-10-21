package be.abis.execice.one;

public class Rectangle extends be.abis.execice.one.Shape {
    private double height;
    private double width;
    private Point origin;

    public double calculateArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
