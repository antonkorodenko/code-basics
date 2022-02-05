package cycles;

import org.junit.jupiter.api.Test;

public class Lesson60 {

    @Test
    void test(){

        var text = "I never look back";
        System.out.println(makeItFunny(text, 3));
    }
    public static String makeItFunny(String str, int n) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var current = str.charAt(i);
            if ((i + 1) % n == 0) {
                result = result + Character.toUpperCase(current);
            } else {
                result = result + current;
            }
            i++;
        }

        return result;
        // END
    }
}
