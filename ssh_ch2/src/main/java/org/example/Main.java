package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat c = context.getBean(Cat.class);

        System.out.println(c);
    }
}
