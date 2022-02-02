package variants;

import org.junit.jupiter.api.Test;

public class Lesson23 {

    @Test
    void test(){
        var king = "King Balon the 6th";

        var numberOfKing = 6;
        var numberOfRooms = 17;
        System.out.println(king + " has " + (numberOfKing * numberOfRooms) + " rooms.");
    }
}
