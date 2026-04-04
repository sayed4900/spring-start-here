package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
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
