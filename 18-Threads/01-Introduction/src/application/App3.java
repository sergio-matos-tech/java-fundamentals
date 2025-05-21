package application;

public class App3 {
    public static void main(String[] args) {

        Runnable downloadTask = () -> {
            System.out.println("Starting download");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Download interrupted", e);
            }
            System.out.println("Download complete");
        };

        Thread downloadThread = new Thread(downloadTask);
        downloadThread.start();

        System.out.println("You can use the program while downloading the file");
    }
}
