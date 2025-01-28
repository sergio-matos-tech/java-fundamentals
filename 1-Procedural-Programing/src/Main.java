

public class Main {
    public static void main(String[] args) {

        System.out.println(maxInt(234, 983, 2398));
    }

    public static int maxInt(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}