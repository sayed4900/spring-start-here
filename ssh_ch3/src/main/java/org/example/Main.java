package org.example;

import org.example.beans.Cat;
import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);
        Cat c = context.getBean(Cat.class);
        System.out.println(p);
        System.out.println(p.getCat() == c); // true
    }
}
