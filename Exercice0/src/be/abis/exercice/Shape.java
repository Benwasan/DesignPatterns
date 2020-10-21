package be.abis.exercice;

abstract class Shape {
    private String color;

    public abstract double calculateArea();

    public String getColor() {
        return color;
    }
}
