package com.epam.task.third.parameters;

public class TriangleParameters {

    private double perimeter;
    private double area;

    public TriangleParameters(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

}