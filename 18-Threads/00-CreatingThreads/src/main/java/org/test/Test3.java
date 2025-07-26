package org.test;

public class Test3 {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
