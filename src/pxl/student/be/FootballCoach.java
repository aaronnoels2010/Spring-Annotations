package pxl.student.be;

import org.springframework.stereotype.Component;

@Component("fCoach")
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Score a goal and win the match";
    }
}
