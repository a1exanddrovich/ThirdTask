package com.epam.task.third.creator;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Shape;
import com.epam.task.third.entities.Triangle;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static final String PATTERN_FOR_DOUBLE = "\\d+\\.\\d+";

    public Shape parse(String stringToBeParsed) {

        List<Double> listOfValues = new ArrayList<>();

        Pattern patternToReadDouble = Pattern.compile(PATTERN_FOR_DOUBLE);

        Matcher matcher = patternToReadDouble.matcher(stringToBeParsed);

        while (matcher.find()) {
            double element = Double.parseDouble(matcher.group());
            listOfValues.add(element);
        }

        if(listOfValues.size() == 2) {
            return new Point(listOfValues.get(0),
                    listOfValues.get(1));
        }

        return new Triangle(listOfValues.get(0),
                listOfValues.get(1),
                listOfValues.get(2));

    }

}
