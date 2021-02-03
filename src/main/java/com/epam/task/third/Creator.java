package com.epam.task.third;

import com.epam.task.third.creator.Parser;
import com.epam.task.third.creator.Validator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Shape;
import java.util.ArrayList;
import java.util.List;

public class Creator {

    private final DataReader reader;
    private final Validator validator;
    private final Parser parser;

    public Creator(DataReader reader, Validator validator, Parser parser) {
        this.reader = reader;
        this.validator = validator;
        this.parser = parser;
    }

    public List<Shape> create(String fileName) throws DataException {

        List<String> dataFromFile = reader.readData(fileName);

        List<Shape> listOfShapes = new ArrayList<>();

        for(int i = 0; i < dataFromFile.size(); i++) {

            String currentLine = dataFromFile.get(i);

            if(validator.validate(currentLine)) {
                Shape createdShape = parser.parse(currentLine);
                listOfShapes.add(createdShape);
            }

        }

        return listOfShapes;

    }

}
