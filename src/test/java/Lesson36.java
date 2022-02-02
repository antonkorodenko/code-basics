import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lesson36 {
    public static void main(String[] args) throws IOException {

        var path = Paths.get("Test.java");
        var data = Files.readString(path);

        System.out.println(data);
    }
}
