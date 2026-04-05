package org.example.config;

import org.example.beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"org.example.beans","org.example.services"})
public class ProjectConfig {


    @Bean
    @Primary
    Cat c1(){
        Cat c = new Cat();
        c.setName("Jako");
        return c;
    }

    @Bean
    Cat c2(){
        Cat c = new Cat();
        c.setName("Koko");
        return c;
    }
}
