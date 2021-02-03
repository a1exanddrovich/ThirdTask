package com.epam.task.third.entities;

public class Triangle extends Shape {

    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getFirstSide() {
        return this.firstSide;
    }

    public double getSecondSide() {
        return this.secondSide;
    }

    public double getThirdSide() {
        return this.thirdSide;
    }

    @Override
    public String toString() {
        return "The sides' length of the triangle are " + this.getFirstSide() +
                ", " + this.getSecondSide() + " and " + this.getThirdSide();
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

        if( Double.compare(triangleToBeCompared.getFirstSide(), this.getFirstSide()) == 0 &&
            Double.compare(triangleToBeCompared.getSecondSide(), this.getSecondSide()) == 0 &&
            Double.compare(triangleToBeCompared.getThirdSide(), this.getThirdSide()) == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {

        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + (int)getFirstSide();
        result = PRIME * result + (int)getSecondSide();
        result = PRIME * result + (int)getThirdSide();
        return result;

    }

}
