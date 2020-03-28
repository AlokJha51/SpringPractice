package com.knoldus.annotationExamples;

import org.springframework.stereotype.Component;

@Component
public class Heart {
    public void pump(){
        System.out.println("Your heart is pumping");
    }
}
