package com.epam.task.third.repository;

import com.epam.task.third.entities.Triangle;
import com.epam.task.third.specifications.TriangleSpecification;

import java.util.List;

public interface Repository {

    void addTriangle(Triangle triangle);
    void removeTriangle(Triangle triangle);
    void updateTriangle(Triangle triangle);
    List<Triangle> query(TriangleSpecification specification);

}
