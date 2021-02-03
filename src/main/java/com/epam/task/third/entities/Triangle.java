package com.epam.task.third.entities;

public class Triangle {

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;
    private final double sideAB;
    private final double sideBC;
    private final double sideCA;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.sideAB = Math.hypot(Math.abs(pointA.getX() - pointB.getX()), Math.abs(pointA.getY() - pointB.getY()));
        this.sideBC = Math.hypot(Math.abs(pointB.getX() - pointC.getX()), Math.abs(pointB.getY() - pointC.getY()));
        this.sideCA = Math.hypot(Math.abs(pointC.getX() - pointA.getX()), Math.abs(pointC.getY() - pointA.getY()));
    }

    public double getSideAB() {
        return this.sideAB;
    }

    public double getSideBC() {
        return this.sideBC;
    }

    public double getSideCA() {
        return this.sideCA;
    }

    public Point getPointA() {
        return this.pointA;
    }

    public Point getPointB() {
        return this.pointB;
    }

    public Point getPointC() {
        return this.pointC;
    }

    @Override
    public String toString() {
        return "The vertices are " + this.getPointA().toString() +
                ", " + this.getPointB().toString() + " and " + this.getPointC().toString();
    }

    @Override
    public boolean equals(Object object) {

        if(object == this) {
            return true;
        }

        if(object == null || object.getClass() != this.getClass()) {
            return false;
        }

        Triangle triangleToBeCompared = (Triangle) object;

        if( Double.compare(triangleToBeCompared.getSideAB(), this.getSideAB()) == 0 &&
            Double.compare(triangleToBeCompared.getSideBC(), this.getSideBC()) == 0 &&
            Double.compare(triangleToBeCompared.getSideCA(), this.getSideCA()) == 0 &&
            triangleToBeCompared.getPointA().equals(this.getPointA()) &&
            triangleToBeCompared.getPointB().equals(this.getPointB()) &&
            triangleToBeCompared.getPointC().equals(this.getPointC())) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {

        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + (int)getSideAB();
        result = PRIME * result + (int)getSideBC();
        result = PRIME * result + (int)getSideCA();
        return result;

    }

}
