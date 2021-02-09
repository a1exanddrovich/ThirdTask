package com.epam.task.third.specifications;

import com.epam.task.third.calculator.TriangleParametersCalculator;
import com.epam.task.third.calculator.TriangleSideLengthCalculator;
import com.epam.task.third.entities.Triangle;

public class TriangleByAreaBetweenSpecification implements TriangleSpecification {

    private final double fromArea;
    private final double toArea;
    private final TriangleParametersCalculator calculator;

    public TriangleByAreaBetweenSpecification(double fromArea, double toArea) {
        calculator = new TriangleParametersCalculator(new TriangleSideLengthCalculator());
        this.fromArea = fromArea;
        this.toArea = toArea;
    }

    @Override
    public boolean specified(Triangle triangle) {
        double currentArea = calculator.calculateArea(triangle);
        return currentArea >= fromArea && currentArea <= toArea;
    }

}
