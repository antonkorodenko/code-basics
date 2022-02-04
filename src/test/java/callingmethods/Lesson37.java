package callingmethods;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Lesson37 {

    @Test
    void test(){

        LocalDate dateFrom = LocalDate.of(2017, Month.MAY, 24);
        LocalDate dateTo = LocalDate.of(2017, Month.JULY, 29);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
    }
}
