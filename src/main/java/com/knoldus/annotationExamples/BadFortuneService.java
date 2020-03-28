package com.knoldus.annotationExamples;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {
    public String getFortune() {
        return "marja jaake";
    }
}
