public class Main {
    public static void main(String[] args) {
        String name1 = "      Sergio      ";
        name1 = name1.trim();
        String name2 = "Sergio";
        System.out.println(name1);
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        name1 = name1.concat(" Henrique");
        // Strings are immutable
        System.out.println(name1);
        // name1 and name2 has the same reference in heap memory (String constant pool)
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}