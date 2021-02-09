package com.epam.task.third.creator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class TriangleValidator {

    private final static Logger LOGGER = LogManager.getLogger(TriangleValidator.class);

    public boolean validateTriangle(String line) {
        LOGGER.info("Validation of entered data " + line + " has started to approve the triangle is able to exist...");
        List<Double> listOfValues = new ArrayList<>();
        String[] coordinates = line.split("\s+");
        for(String coordinate : coordinates) {
            double element = Double.parseDouble(coordinate);
            listOfValues.add(element);
        }
        int equalX = 0;
        int equalY = 0;
        for(int i = 0, j = 1; i < 2; i += 2, j += 2) {
            equalX = listOfValues.get(i).compareTo(listOfValues.get(i + 2));
            equalY = listOfValues.get(j).compareTo(listOfValues.get(j + 2));
        }
        return !(equalX == 0 || equalY == 0);
    }

}
