package cycles;

import org.junit.jupiter.api.Test;

public class Lesson61 {

    @Test
    void test(){
        System.out.println(hasChar("Renly", 'R'));

    }
    public static boolean hasChar(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }

            i += 1;
        }

        return false;
        // END
    }
}
