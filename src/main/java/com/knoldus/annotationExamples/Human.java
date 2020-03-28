package com.knoldus.annotationExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    Heart heart;

    @Autowired
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void isAlive() {
        if(heart == null)
            System.out.println("You are dead");
        else {
            heart.pump();
            System.out.println("You are alive");
        }
    }
}
