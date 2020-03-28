package com.knoldus.annotationExamples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                "annotation-application-context.xml");
        Coach myCoach1 = appContext.getBean("runningCoach", Coach.class);
        Coach myCoach2 = appContext.getBean("runningCoach", Coach.class);
        System.out.println(myCoach1 == myCoach2);
        /*System.out.println(myCoach.giveDailyFortune());
        System.out.println(myCoach.giveDailyWorkout());*/
        appContext.close();
    }
}
