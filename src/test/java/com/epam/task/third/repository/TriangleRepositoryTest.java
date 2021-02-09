package com.epam.task.third.repository;

import com.epam.task.third.calculator.TriangleParametersCalculator;
import com.epam.task.third.calculator.TriangleSideLengthCalculator;
import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import com.epam.task.third.specifications.TriangleByAreaBetweenSpecification;
import com.epam.task.third.specifications.TriangleByIdSpecification;
import com.epam.task.third.specifications.TriangleByPerimeterBetweenSpecification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TriangleRepositoryTest {

    private final Map<Integer, Triangle> triangles = new HashMap<>();
    private final TriangleRepository repository = new TriangleRepository(triangles);
    private final Map<Integer, Triangle> enteredTriangles = new HashMap<>(); {
        enteredTriangles.put(2, new Triangle(new Point(3.9, 4.1),
                                             new Point(1.5, 6.7),
                                             new Point(19.7, 9.8),
                                             2));
        enteredTriangles.put(4, new Triangle(new Point(2.8, 32.45),
                                             new Point(3.5, 6.6),
                                             new Point(19.9, 11.6),
                                             4));
        enteredTriangles.put(1, new Triangle(new Point(2.3, 4.0),
                                             new Point(3.5, 6.7),
                                             new Point(19.7, 9.8),
                                             1));
    }

    private final TriangleByIdSpecification specificationById = new TriangleByIdSpecification(4);
    private final TriangleByAreaBetweenSpecification specificationAreaBetween = new TriangleByAreaBetweenSpecification(25.1, 30.7);
    private final TriangleByPerimeterBetweenSpecification specificationPerimeterBetween = new TriangleByPerimeterBetweenSpecification(50.5, 89.0);
    private final Triangle firstTriangle = new Triangle(new Point(3.9, 4.1),
                                                       new Point(1.5, 6.7),
                                                       new Point(19.7, 9.8),
                                                       2);
    private final Triangle secondTriangle = new Triangle(new Point(2.8, 32.45),
                                                         new Point(3.5, 6.6),
                                                         new Point(19.9, 11.6),
                                                         4);
    private final Triangle thirdTriangle = new Triangle(new Point(2.3, 4.0),
                                                        new Point(3.5, 6.7),
                                                        new Point(19.7, 9.8),
                                                        1);

    TriangleParametersCalculator calculator = new TriangleParametersCalculator(new TriangleSideLengthCalculator());


    @Before
    public void setUpRepository() {
        repository.addTriangle(firstTriangle);
        repository.addTriangle(secondTriangle);
        repository.addTriangle(thirdTriangle);
    }

    @Test
    public void testQueryShouldReturnCorrectTriangleById() {

        //when
        List<Triangle> resultList = repository.query(specificationById);
        Triangle resultTriangle = resultList.get(0);

        //then
        Assert.assertEquals(resultTriangle, enteredTriangles.get(4));

    }

    @Test
    public void testQueryShouldReturnCorrectTriangleByAreaBetween() {

        //when
        List<Triangle> resultList = repository.query(specificationAreaBetween);
        Triangle resultTriangle = resultList.get(0);

        //then
        Assert.assertEquals(resultTriangle, enteredTriangles.get(2));

    }

    @Test
    public void testQueryShouldReturnCorrectTriangleByPerimeterBetween() {

        //when
        List<Triangle> resultList = repository.query(specificationPerimeterBetween);
        Triangle resultTriangle = resultList.get(0);

        //then
        Assert.assertEquals(resultTriangle, enteredTriangles.get(4));

    }

}
