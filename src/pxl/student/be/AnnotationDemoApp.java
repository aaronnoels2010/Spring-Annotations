package pxl.student.be;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("fCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
