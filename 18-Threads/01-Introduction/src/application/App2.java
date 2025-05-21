package application;

public class App2 {
    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> System.out.println("Executing task/tread");
        Runnable task2 = () -> System.out.println("Executing task2");

        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task2);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        Thread.sleep(1000);
        thread2.start();

        System.out.println("\nThread names: ");
        System.out.println(thread.getName());
        System.out.println(thread2.getName());
        System.out.println(Thread.currentThread().getName() + "\n");

    }
}
