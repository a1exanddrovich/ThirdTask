package com.epam.task.third;

import com.epam.task.third.creator.DataValidator;
import com.epam.task.third.creator.TriangleParser;
import com.epam.task.third.creator.TriangleValidator;
import com.epam.task.third.data.DataException;
import com.epam.task.third.data.DataReader;
import com.epam.task.third.entities.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TriangleCreator {

    private final static Logger LOGGER = LogManager.getLogger(TriangleCreator.class);
    private final DataReader reader;
    private final DataValidator dataValidator;
    private final TriangleValidator triangleValidator;
    private final TriangleParser triangleParser;

    public TriangleCreator(DataReader reader,
                           DataValidator dataValidator,
                           TriangleParser triangleParser,
                           TriangleValidator triangleValidator) {
        this.reader = reader;
        this.dataValidator = dataValidator;
        this.triangleValidator = triangleValidator;
        this.triangleParser = triangleParser;
    }

    public List<Triangle> create(String fileName) throws DataException, IOException {
        LOGGER.info("The process of creating triangles has started...");
        List<String> dataFromFile = reader.readData(fileName);
        List<Triangle> listOfTriangles = new ArrayList<>();
        for(String currentLine : dataFromFile) {
            if(dataValidator.validateLine(currentLine) && triangleValidator.validateTriangle(currentLine)) {
                Triangle createdTriangle = triangleParser.parse(currentLine);
                listOfTriangles.add(createdTriangle);
            }
        }
        LOGGER.info("The process of creating triangles has finished successfully");
        return listOfTriangles;
    }

}