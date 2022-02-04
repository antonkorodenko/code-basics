package conditionalconstructions;
import org.junit.jupiter.api.Test;

public class Lesson48 {

    @Test
    void test(){
        System.out.println(normalizeUrl("google.com"));
    }

    public String normalizeUrl(String site) {
        if (site.startsWith("https://")) {
            return site;
        }

        return "https://" + site;
    }
}
