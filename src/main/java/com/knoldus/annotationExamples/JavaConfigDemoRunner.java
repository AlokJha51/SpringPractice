package com.knoldus.annotationExamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoRunner {
    public static void main(String[] args) {
        /*AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(HumanConfig.class);
        Human human = appContext.getBean("human",Human.class);
        human.isAlive();*/

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SwimConfig.class);
        Coach myCoach = appContext.getBean("getSwimCoach",Coach.class);
        System.out.println(myCoach.giveDailyFortune());
        System.out.println(myCoach.giveDailyWorkout());
    }
}
