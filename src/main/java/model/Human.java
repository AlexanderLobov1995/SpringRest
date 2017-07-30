package model;

import java.io.Serializable;

public class Human implements Serializable {
    public String name;
    public int age;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }
}
