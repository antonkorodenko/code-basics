package logic;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Lesson47 {

    @Test
    void test() {
        System.out.println(notToday("2012-11-25"));
    }

    public boolean notToday(String dateAsString) {
        var date = LocalDate.now();
        return !dateAsString.equals(date.toString());
    }
}