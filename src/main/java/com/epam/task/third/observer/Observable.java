package com.epam.task.third.observer;

public interface Observable {

    void attach(TriangleObserver obs);
    void detach(TriangleObserver obs);

}
