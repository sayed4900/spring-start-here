package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    private final Cat cat;


//    @Autowired // becasue we have 1 constructor we don't to write @Autowired
    public Person(Cat cat){
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }
}
