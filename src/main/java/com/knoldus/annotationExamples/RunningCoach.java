package com.knoldus.annotationExamples;

import org.springframework.stereotype.Component;

@Component("sillyCoach")
public class RunningCoach implements Coach {
    public String giveDailyWorkout() {
        return "Run 5 km in 20 minutes";
    }
}
