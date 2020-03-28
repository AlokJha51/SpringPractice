import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "bean-scope-application-context.xml");
        TrackCoach myCoach = context.getBean("trackCoachObject", TrackCoach.class);
        System.out.println(myCoach.giveDailyWorkout());
        context.close();
    }
}
