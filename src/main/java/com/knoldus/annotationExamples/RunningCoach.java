package com.knoldus.annotationExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RunningCoach implements Coach {

    @Autowired
    @Qualifier("badFortuneService") // Give the bean id
    private FortuneService fortuneService;


    public void notFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter method");
        this.fortuneService = fortuneService;
    }

    public RunningCoach() {
        System.out.println("This is default constructor");
    }

   /* public RunningCoach(FortuneService fortuneService) {
        System.out.println("This is not a default constructor");
        this.fortuneService = fortuneService;
    }*/

    public String giveDailyFortune() {
        return fortuneService.getFortune();
    }

    public String giveDailyWorkout() {
        return "Run 5 km in 20 minutes";
    }
}
