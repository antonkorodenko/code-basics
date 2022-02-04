package conditionalconstructions;

import org.junit.jupiter.api.Test;

public class Lesson50 {

    @Test
    void test(){
        System.out.println(whoIsThisHouseToStarks("Karstark"));

    }
    public static String whoIsThisHouseToStarks(String houseName) {
        if ("Karstark".equals(houseName) || "Tally".equals(houseName)) {
            return "friend";
        } else if ("Lannister".equals(houseName) || "Frey".equals(houseName)) {
            return "enemy";
        }

        return "neutral";
    }
}
