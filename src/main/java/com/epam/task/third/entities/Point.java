package com.epam.task.third.entities;

public class Point {

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
        return "(" + this.getX() + ";" + this.getY() + ")";
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
        return Double.compare(pointToBeCompared.getX(), this.getX()) == 0 &&
                Double.compare(pointToBeCompared.getY(), this.getY()) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int)getX();
        result = prime * result + (int)getY();
        return result;
    }

}