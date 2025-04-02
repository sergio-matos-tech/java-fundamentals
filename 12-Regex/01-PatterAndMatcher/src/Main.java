import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "ab";

        String text = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text: " + text);
        System.out.println("Index: 0123456789 ");
        System.out.println("Regex: " + regex );

        System.out.println("\nIndexes found: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}