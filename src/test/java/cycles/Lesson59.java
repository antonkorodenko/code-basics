package cycles;

import org.junit.jupiter.api.Test;

public class Lesson59 {

    @Test
    void test(){
        var str = "If I look back I am lost";
        System.out.println(filterString(str, 'I'));

    }
    public static String filterString(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result = result + currentChar;
            }
            i += 1;
        }

        return result;
        // END
    }
}
