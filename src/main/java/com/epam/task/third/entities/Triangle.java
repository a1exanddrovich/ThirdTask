package com.epam.task.third.entities;

public class Triangle {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private int id;

    public Triangle(Point pointA, Point pointB, Point pointC, int id) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.id = id;
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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPoints(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
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
        return triangleToBeCompared.getPointA().equals(this.getPointA()) &&
                triangleToBeCompared.getPointB().equals(this.getPointB()) &&
                triangleToBeCompared.getPointC().equals(this.getPointC());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int)getPointA().getX();
        result = prime * result + (int)getPointB().getX();
        result = prime * result + (int)getPointC().getX();
        return result;
    }

}