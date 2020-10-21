package be.abis.exercice;

class Rectangle extends Shape {
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
