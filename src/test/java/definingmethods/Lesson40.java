package definingmethods;

import java.time.LocalDate;

public class Lesson40 {
    // BEGIN (write your solution here)
    public static int getCurrentYear() {
        var date = LocalDate.now();
        return Integer.parseInt(date.toString().substring(0, 4));
    }
    // END
}