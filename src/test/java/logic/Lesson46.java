package logic;

import org.junit.jupiter.api.Test;

public class Lesson46 {

    @Test
    void test(){
        System.out.println(isLeapYear(400));
    }
    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}