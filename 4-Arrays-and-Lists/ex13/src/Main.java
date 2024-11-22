import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Goku");
        list.add("is");
        list.add("the");
        list.add(1, "best!");
        list.remove(2);
        list.removeIf(x -> x.charAt(0) == 't');

        for (String words : list) {
            System.out.println(words);
        }

        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.indexOf("Goku"));
    }
}