package com.epam.task.third.creator;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.idgenerator.IdGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class TriangleParser {

    private final IdGenerator idGenerator = new IdGenerator();
    private final static Logger LOGGER = LogManager.getLogger(TriangleParser.class);
    public Triangle parse(String line) {
        LOGGER.info("Parsing of the entered triangle has started...");
        List<Double> listOfValues = new ArrayList<>();
        String[] coordinates = line.split("\s+");
        for(String coordinate : coordinates) {
            double element = Double.parseDouble(coordinate);
            listOfValues.add(element);
        }
        return new Triangle(new Point(listOfValues.get(0), listOfValues.get(1)),
                            new Point(listOfValues.get(2), listOfValues.get(3)),
                            new Point(listOfValues.get(4), listOfValues.get(5)),
                            idGenerator.getNextId());
    }

}