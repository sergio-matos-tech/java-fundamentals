import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();

        fila.add("Sergio");
        fila.add("Henrique");
        fila.add("Ribeiro");
        fila.add("Matos");

        System.out.println(fila);
    }
}
