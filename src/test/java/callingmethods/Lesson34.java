package callingmethods;

import org.junit.jupiter.api.Test;

public class Lesson34 {

    @Test
    void test(){

        var name = "hexlet";

        var capitalized = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();
        System.out.println(capitalized);
    }
}
