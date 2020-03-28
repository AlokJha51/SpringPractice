package com.knoldus.annotationExamples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                "annotation-application-context.xml");
        Coach myCoach = appContext.getBean("sillyCoach", Coach.class);
        System.out.println(myCoach.giveDailyWorkout());
    }
}
