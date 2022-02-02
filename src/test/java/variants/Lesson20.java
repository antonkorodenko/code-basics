package variants;

import org.junit.jupiter.api.Test;

public class Lesson20 {

    @Test
    void test(){
        var eurosCount = 100;

        // BEGIN
        var dollarsCount = eurosCount * 1.25;
        System.out.print(dollarsCount);
        System.out.print("\n");

        var rublesCount = dollarsCount * 60;
        System.out.print(rublesCount);
        System.out.print("\n");
    }
}
