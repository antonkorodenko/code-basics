package definingmethods;

import org.junit.jupiter.api.Test;

public class Lesson42 {

    @Test
    void test() {
        System.out.println(getHiddenCard("1234567812345678", 2));
    }

    public String getHiddenCard(String cardNumber, int starsCount) {
        var visibleDigitsLine = cardNumber.substring(12);
        return "*".repeat(starsCount) + visibleDigitsLine;
    }

    public String getHiddenCard(String cardNumber) {
        return getHiddenCard(cardNumber, 4);
    }
}

