package com.epam.task.third.idgenerator;

public class IdGenerator {
    public final static int DEFAULT_BEGIN_VALUE  = 0;
    private int id;

    public IdGenerator() {
        this.id = DEFAULT_BEGIN_VALUE;
    }

    public int getNextId() {
        return this.id++;
    }

}
