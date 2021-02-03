package com.epam.task.third.entities;

public class Point extends Shape {

    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "The coordinates of the point are (" + this.getX() + ";" + this.getY() + ")";
    }

    @Override
    public boolean equals(Object object) {

        if(object == this) {
            return true;
        }

        if(object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Point pointToBeCompared = (Point) object;

        if(Double.compare(pointToBeCompared.getX(), this.getX()) == 0 &&
           Double.compare(pointToBeCompared.getY(), this.getY()) == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {

        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + (int)getX();
        result = PRIME * result + (int)getY();
        return result;

    }

}
