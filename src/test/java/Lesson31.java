import org.junit.jupiter.api.Test;

public class Lesson31 {

    @Test
    void test(){

        var one = "Naharis";
        var two = "Mormont";
        var three = "Sand";

        var char1 = one.charAt(2);
        var char2 = two.charAt(1);
        var char3 = three.charAt(3);
        var char4 = two.charAt(4);
        var char5 = two.charAt(2);

        System.out.println(
                char1 + " " + char2 + " " + char3 + " " + char4 + " " + char5
        );
    }
}
