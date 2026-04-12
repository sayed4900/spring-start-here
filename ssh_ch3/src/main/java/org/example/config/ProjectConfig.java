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


    @Bean
    Person person(Cat cat){
        Person person = new Person();
        person.setName("Ahmed");
        person.setCat(cat);
        return person;
    }


}