package com.epam.task.third.data;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private final static Logger LOGGER = LogManager.getLogger(DataReader.class);

    public List<String> readData(String fileName) throws DataException, IOException {
        LOGGER.info("The process of reading from file \"" + fileName +  "\" has started...");
        List<String> output = new ArrayList<>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                output.add(line);
            }
            LOGGER.info("The process of reading from file \"" + fileName +  "\" has finished successfully");
        } catch (IOException e) {
            LOGGER.fatal("The process of reading from file \"" + fileName +  "\" has failed...");
            throw new DataException("The specified file not found", e);
        }
        finally {
            if(reader != null) {
                reader.close();
            }
        }
        return output;
    }

}