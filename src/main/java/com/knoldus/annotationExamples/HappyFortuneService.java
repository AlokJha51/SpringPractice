package com.knoldus.annotationExamples;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Best of luck";
    }
}
