package cycles;

import org.junit.jupiter.api.Test;

public class Lesson55 {

    @Test
    void test(){
        System.out.println(joinNumbersFromRange(1, 1));

    }
    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        var i = start;
        var result = "";

        while (i <= finish) {
            result = result + i;
            i = i + 1;
        }

        return result;
        // END
    }
}
