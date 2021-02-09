package com.epam.task.third.specifications;

import com.epam.task.third.calculator.TriangleParametersCalculator;
import com.epam.task.third.calculator.TriangleSideLengthCalculator;
import com.epam.task.third.entities.Triangle;

public class TriangleByPerimeterBetweenSpecification implements TriangleSpecification {

    private final double fromPerimeter;
    private final double toPerimeter;
    private final TriangleParametersCalculator calculator;

    public TriangleByPerimeterBetweenSpecification(double fromPerimeter, double toPerimeter) {
        calculator = new TriangleParametersCalculator(new TriangleSideLengthCalculator());
        this.fromPerimeter = fromPerimeter;
        this.toPerimeter = toPerimeter;
    }

    @Override
    public boolean specified(Triangle triangle) {
        double currentPerimeter = calculator.calculatePerimeter(triangle);
        return currentPerimeter >= fromPerimeter && currentPerimeter <= toPerimeter;
    }

}
