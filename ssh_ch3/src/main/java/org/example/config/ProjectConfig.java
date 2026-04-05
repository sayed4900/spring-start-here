package org.example.config;

import org.example.beans.Cat;
import org.example.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = {"org.example.beans","org.example.services"})
public class ProjectConfig {


    @Bean
    Cat cat() {
        Cat c = new Cat();
        c.setName("Jako");
        return c;
    }

    //    @Bean
//    Person person() {
//        Person p = new Person();
//        p.setName("Belal");
//        p.setCat(cat());
//        return p;
//    }
    @Bean
    Person person(Cat c) {
        Person p = new Person();
        p.setName("Belal");
        p.setCat(c);
        return p;
    }


}