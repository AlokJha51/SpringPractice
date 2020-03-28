package com.knoldus.annotationExamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.knoldus.annotationExamples")
@PropertySource("classpath:sport.properties")
public class SwimConfig {

    @Bean
    public FortuneService realityCheckFortune() {
     return new RealityCheckFortune();
    }

    @Bean
    public SwimCoach getSwimCoach() {
        return new SwimCoach(realityCheckFortune());
    }
}
