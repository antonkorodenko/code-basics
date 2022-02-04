package conditionalconstructions;

import org.junit.jupiter.api.Test;

public class Lesson52 {

    @Test
    void test(){
        System.out.println(getNumberExplanation(666));

    }
    public static String getNumberExplanation(int number) {
        switch (number) {
            case 666:
                return "devil number";
            case 7:
                return "prime number";
            case 42:
                return "answer for everything";
            default:
                return null;
        }
    }
}
