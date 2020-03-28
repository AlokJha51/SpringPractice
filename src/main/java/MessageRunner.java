import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageRunner {
    public static void main(String[] args) {
       
        /*

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Message message = (Message) applicationContext.getBean("message");
        System.out.println(message.getMessage());

        */

        /*ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        Country countryObj = (Country) appContext.getBean("country");
        System.out.println("Capital Name:"+countryObj.getCapitalName("capital"));*/

        ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        Message message1 = appContext.getBean("messageObject",Message.class);
        Message message2 = appContext.getBean("messageObject",Message.class);
        System.out.println(message1 == message2);

        System.out.println("Memory object for address1 : " + message1);
        System.out.println("Memory object for address1 : " + message2);
        /*TrackCoach trackCoach = appContext.getBean("trackCoachObject",TrackCoach.class);
        System.out.println(trackCoach.giveDailyWorkout());
        System.out.println();*/
    }
}
