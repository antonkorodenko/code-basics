package conditionalconstructions;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

public class Lesson51 {

    @Test
    void test(){
        System.out.println(convertString("hello"));
    }
    public static String convertString(String str) {
        return Character.isUpperCase(str.charAt(0)) ? str : StringUtils.reverse(str);
    }
}
