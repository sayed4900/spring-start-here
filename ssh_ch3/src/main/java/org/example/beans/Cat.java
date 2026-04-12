package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Cat {
    private String name;

//    @Autowired
//    public Cat(String name) {
//        this.name = "Jako";
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
