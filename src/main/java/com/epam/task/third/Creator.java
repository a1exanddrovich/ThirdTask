package com.epam.task.third;

import com.epam.task.third.creator.Parser;
import com.epam.task.third.creator.Validator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.logic.PointLogic;

import java.util.ArrayList;
import java.util.List;

public class Creator {

    private final DataReader reader;
    private final Validator validator;
    private final Parser parser;
    private final PointLogic canExist;

    public Creator(DataReader reader, Validator validator, Parser parser, PointLogic canExist) {
        this.reader = reader;
        this.validator = validator;
        this.parser = parser;
        this.canExist = canExist;
    }

    public List<Triangle> create(String fileName) throws DataException {

        List<String> dataFromFile = reader.readData(fileName);

        List<Triangle> listOfTriangles = new ArrayList<>();

        for(int i = 0; i < dataFromFile.size(); i++) {

            String currentLine = dataFromFile.get(i);

            if(validator.validate(currentLine)) {
                Triangle createdShape = parser.parse(currentLine);
                if(canExist.makeUpTriangle(createdShape.getPointA(),
                                           createdShape.getPointB(),
                                           createdShape.getPointC())) {
                    listOfTriangles.add(createdShape);
                }
            }

        }

        return listOfTriangles;

    }

}
