package logic;

import org.junit.jupiter.api.Test;

public class Lesson43 {

    @Test
    void test() {
        System.out.println(isPensioner(55));
    }

    public boolean isPensioner(int age) {
        return age >= 60;
    }
}