package com.epam.task.third.specifications;

import com.epam.task.third.entities.Triangle;

public class TriangleByIdSpecification implements TriangleSpecification {

    private final int id;

    public TriangleByIdSpecification(int id) {
        this.id = id;
    }

    @Override
    public boolean specified(Triangle triangle) {
        return id == triangle.getId();
    }

}
