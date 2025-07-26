package org.test;

import org.MyThread;

public class Test {
    public static void main(String[] args) {

        MyThread thread = new MyThread("Thread #1", 600);

        MyThread thread2 = new MyThread("Thread #2", 900);

    }
}
