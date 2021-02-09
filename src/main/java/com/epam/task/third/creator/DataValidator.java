package com.epam.task.third.creator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator {

    private final static String COORDINATES_PATTERN = "(\\d+\\.\\d+(\\s+)?){6}";
    private final static int NUMBER_OF_COORDINATES = 6;
    private final static Logger LOGGER = LogManager.getLogger(DataValidator.class);

    public boolean validateLine(String line) {
        LOGGER.info("Validation of the string " + line + " has started...");
        Pattern patternToReadDouble = Pattern.compile(COORDINATES_PATTERN);
        Matcher matcher = patternToReadDouble.matcher(line);
        int countOfCoordinates = 0;
        while(matcher.find()){
            countOfCoordinates++;
        }
        return countOfCoordinates == NUMBER_OF_COORDINATES;
    }

}