package org;

public class MyThread extends Thread {

    private String name;
    private Integer time;

    public MyThread(String name, Integer time) {
        this.name = name;
        this.time = time;
        start();
    }

    public void run() {

        System.out.println("Executing [" + name + "]");
        for (int i = 0; i < 3; i++) {
            System.out.println(name + " Count " + i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.printf("[%s] is dead!\n", name);
    }
}
