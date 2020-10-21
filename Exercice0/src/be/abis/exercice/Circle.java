package be.abis.exercice;

class Circle extends Shape {
    private double radius;

    public double calculateArea() {
        return Math.PI *radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
