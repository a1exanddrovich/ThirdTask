package com.epam.task.third.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataReader {

    private final static Logger LOGGER = LogManager.getLogger(DataReader.class);

    public List<String> readData(String fileName) throws DataException {

        List<String> output = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {
                output.add(line);
            }

        } catch (IOException e) {

            LOGGER.fatal("The specified file not found " + e);
            throw new DataException("The specified file not found", e);
        }

        return output;

    }

}
