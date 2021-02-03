package com.epam.task.third.creator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Validator {

    private final static Logger LOGGER = LogManager.getLogger(Validator.class);

    public boolean validate(String stringToBeValidated) {

        int countOfSymbols = 0;

        for(int i = 0; i < stringToBeValidated.length(); i++) {

            char symbol = stringToBeValidated.charAt(i);

            if(symbol == '.') {
                countOfSymbols++;
                continue;
            }

            if(symbol == ' ') {
                continue;
            }

            if(symbol < 48 || symbol > 58) {
                LOGGER.warn("The line \"" + stringToBeValidated + "\" has not been validated because of using inappropriate symbols");
                return false;
            }

        }

        if(countOfSymbols < 2) {
            LOGGER.warn("The line \"" + stringToBeValidated + "\" has not been validated because of lack of the entered information");
            return false;
        }

        if(countOfSymbols > 3) {
            LOGGER.warn("The line \"" + stringToBeValidated + "\" has not been validated because of excess of the entered information");
            return false;
        }

        return true;

    }

}
