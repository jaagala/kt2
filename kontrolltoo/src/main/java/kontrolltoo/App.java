package kontrolltoo;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        TextAnalytics text = new TextAnalytics("D:\\Aland\\proge_kt\\randomText.txt");
        String array_string = Arrays.toString(text.array_of_words);
        System.out.println(array_string);
    }
}
