package pxl.student.be;

import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your aces.";
    }
}
