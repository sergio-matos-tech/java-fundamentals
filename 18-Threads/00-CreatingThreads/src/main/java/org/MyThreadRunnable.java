package org;

public class MyThreadRunnable implements Runnable {

    private String name;
    private Integer time;

    public MyThreadRunnable(String name, Integer time) {
        this.name = name;
        this.time = time;
        Thread t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            System.out.printf("%s time -> %d\n", name, i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Finished Thread " + name + "\n");
    }
}
