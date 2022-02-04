package logic;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;



public class Lesson44 {

    @Test
    void test() {
        System.out.println(isPalindrome("oho"));
    }

    public boolean isPalindrome(String word) {
        var normalizedWord = word.toLowerCase();
        var reversedWord = StringUtils.reverse(normalizedWord);
        return normalizedWord.equals(reversedWord);
    }
}