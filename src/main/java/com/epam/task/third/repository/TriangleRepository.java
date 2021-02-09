package com.epam.task.third.repository;

import com.epam.task.third.entities.Triangle;
import com.epam.task.third.idgenerator.IdGenerator;
import com.epam.task.third.specifications.TriangleSpecification;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TriangleRepository implements Repository{

    private final Map<Integer, Triangle> triangles;

    public TriangleRepository(Map<Integer, Triangle> triangles) {
        this.triangles = triangles;
    }

    @Override
    public List<Triangle> query(TriangleSpecification specification) {
        List<Triangle> chosenTriangles = new ArrayList<>();
        for(Triangle triangle : this.triangles.values()) {
            if(specification.specified(triangle)) {
                chosenTriangles.add(triangle);
            }
        }
        return chosenTriangles;
    }

    @Override
    public void addTriangle(Triangle triangle) {
        Triangle triangleToBeAdded = new Triangle(triangle.getPointA(),
                                              triangle.getPointB(),
                                              triangle.getPointC(),
                                              triangle.getId());

        triangleToBeAdded.setId(triangle.getId());
        triangles.put(triangleToBeAdded.getId(), triangleToBeAdded);
    }

    @Override
    public void removeTriangle(Triangle triangle) {
        int id = triangle.getId();
        triangles.remove(id);
    }

    @Override
    public void updateTriangle(Triangle triangle) {
        Triangle triangleToBeUpdated = new Triangle(triangle.getPointA(),
                                                 triangle.getPointB(),
                                                 triangle.getPointC(),
                                                 triangle.getId());
        int id = triangle.getId();
        triangles.replace(id, triangleToBeUpdated);
    }

}
