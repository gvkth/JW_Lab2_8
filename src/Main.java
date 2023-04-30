import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("myCoach",BaseballCoach.class);

        //Phương thức BaseballCoach cài đặt, thể hiện ra ngoài nhờ interface Coach
        String sDailyWorkout = myCoach.getDailyWorkout();
        System.out.println(sDailyWorkout);

        //Phương thức do member của myCoach là 1 interface FortuneService thể hiện
        //cài đặt trong class HappyFortuneService
        String sDailyFortune =myCoach.getDailyFortune();
        System.out.println(sDailyFortune);
        context.close();

    }
}