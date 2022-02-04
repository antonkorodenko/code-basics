package callingmethods;

import org.junit.jupiter.api.Test;

public class Lesson33 {

    @Test
    void test(){

        var email = " SupporT@hexlet.io\n";

        var processedEmail = email.toLowerCase();
        System.out.println(processedEmail);
    }
}
