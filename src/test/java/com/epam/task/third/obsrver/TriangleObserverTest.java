package com.epam.task.third.obsrver;

import com.epam.task.third.calculator.TriangleParametersCalculator;
import com.epam.task.third.calculator.TriangleSideLengthCalculator;
import com.epam.task.third.entities.Point;
import com.epam.task.third.observer.TriangleObservable;
import com.epam.task.third.observer.TriangleObserver;
import org.junit.Assert;
import org.junit.Test;

public class TriangleObserverTest {

    public final TriangleObservable triangleBeforeUpdating = new TriangleObservable(new Point(2.3, 5.6),
                                                                                    new Point(12.7, 43.6),
                                                                                    new Point(34.8, 78.9),
                                                                                    4);
    private final TriangleObservable triangleAfterUpdating = new TriangleObservable(new Point(4.5, 6.7),
                                                                                    new Point(11.5, 5.6),
                                                                                    new Point(12.4, 67.5),
                                                                                    5);
    private final TriangleParametersCalculator calculator = new TriangleParametersCalculator(new TriangleSideLengthCalculator());
    public final TriangleObserver observer = TriangleObserver.getInstance();
    
    @Test
    public void testObserverFunctionalityArea() {

        //given
        triangleBeforeUpdating.attach(observer);
        observer.update(triangleBeforeUpdating);

        //when
        triangleBeforeUpdating.setPoints(new Point(4.5, 6.7),
                new Point(11.5, 5.6),
                new Point(12.4, 67.5));

        //then
        Assert.assertEquals(observer.getTriangleArea(triangleBeforeUpdating.getId()),
                            calculator.calculateArea(triangleAfterUpdating),
                       0.01);
    }

    @Test
    public void testObserverFunctionalityPerimeter() {

        //given
        triangleBeforeUpdating.attach(observer);
        observer.update(triangleBeforeUpdating);

        //when
        triangleBeforeUpdating.setPoints(new Point(4.5, 6.7),
                new Point(11.5, 5.6),
                new Point(12.4, 67.5));

        //then
        Assert.assertEquals(observer.getTrianglePerimeter(triangleBeforeUpdating.getId()),
                            calculator.calculatePerimeter(triangleAfterUpdating),
                       0.01);
    }
    

}
