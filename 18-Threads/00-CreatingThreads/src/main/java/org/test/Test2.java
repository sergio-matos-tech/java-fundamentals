package org.test;

import org.MyThreadRunnable;

public class Test2 {
    public static void main(String[] args) {

        MyThreadRunnable thread1 = new MyThreadRunnable("Thread #1", 600);
        MyThreadRunnable thread2 = new MyThreadRunnable("Thread #2", 850);
        MyThreadRunnable thread3 = new MyThreadRunnable("Thread #3", 350);


    }
}
