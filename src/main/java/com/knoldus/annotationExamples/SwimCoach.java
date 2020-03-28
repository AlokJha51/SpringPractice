package com.knoldus.annotationExamples;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach  implements Coach{

    private FortuneService fortuneService;

    @Value("${myEmail}")
    private String email;

    @Value("${myTeam}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String giveDailyWorkout() {
        System.out.println("Your email is : " + email + " and your password is : " + team);
        return "Do 1000m swimming as an warm up";
    }

    public String giveDailyFortune() {
        return fortuneService.getFortune();
    }
}
