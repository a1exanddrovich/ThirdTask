package com.epam.task.third.observer;

import com.epam.task.third.calculator.TriangleParametersCalculator;
import com.epam.task.third.calculator.TriangleSideLengthCalculator;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.parameters.TriangleParameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Map;

public class TriangleObserver implements Observer{

    private final static Logger LOGGER = LogManager.getLogger(TriangleObserver.class);
    private static TriangleObserver instance;
    private final TriangleParametersCalculator triangleParametersCalculator;
    private TriangleParameters triangleParameters;
    private Map<Integer, TriangleParameters> parameters;

    private TriangleObserver() {
        triangleParametersCalculator = new TriangleParametersCalculator(new TriangleSideLengthCalculator());
        parameters = new HashMap<>();
    }

    public static TriangleObserver getInstance() {
        if(instance == null) {
            instance = new TriangleObserver();
        }
        return instance;
    }

    @Override
    public void update(Triangle triangle) {
        LOGGER.info("Updating of the triangle " + triangle.toString() + " has started...");
        int id = triangle.getId();
        double perimeter = triangleParametersCalculator.calculatePerimeter(triangle);
        double area = triangleParametersCalculator.calculateArea(triangle);
        triangleParameters  = new TriangleParameters(perimeter, area);
        parameters.put(id, triangleParameters);
    }

    public double getTrianglePerimeter(int id) {
        TriangleParameters parameter = parameters.get(id);
        return  parameter.getPerimeter();
    }

    public double getTriangleArea(int id) {
        TriangleParameters parameter = parameters.get(id);
        return  parameter.getArea();
    }

}
