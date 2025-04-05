import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Weather");
        words.add("Howdy");

        List<String> words2 = new ArrayList<>();
        words.add("Kakaroto");
        words.add("DBZ");

        System.out.println(words);
        System.out.println(words.size());


        List<Integer> integerList = new ArrayList<>();

        Collections.addAll(integerList, 105, 43, 54, 32, 88, 54, 987);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);


    }
}