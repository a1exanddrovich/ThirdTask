package com.epam.task.third.observer;

import com.epam.task.third.entities.Point;
import com.epam.task.third.entities.Triangle;
import java.util.ArrayList;
import java.util.List;

public class TriangleObservable extends Triangle implements Observable  {

    private List<TriangleObserver> observers = new ArrayList<>();

    public TriangleObservable(Point pointA, Point pointB, Point pointC, int id) {
        super(pointA, pointB, pointC, id);
    }

    private void notifyObservers() {
        for(TriangleObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void setPoints(Point pointA, Point pointB, Point pointC) {
        super.setPoints(pointA, pointB, pointC);
        notifyObservers();
    }

    @Override
    public void attach(TriangleObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(TriangleObserver observer) {
        observers.remove(observer);
    }

}
