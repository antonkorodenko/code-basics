package cycles;

import org.junit.jupiter.api.Test;

public class Lesson54 {

    @Test
    void test(){
        System.out.println(multiplyNumbersFromRange(1, 5));
    }
    public static int multiplyNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)
        var i = start;
        var result = 1;

        while (i <= finish) {
            result = result * i;
            i = i + 1;
        }

        return result;
        // END
    }
}
