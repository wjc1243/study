package com.example.study.XThread;

import java.util.concurrent.atomic.AtomicInteger;

public class Test01 extends Thread {
    //private int count;
    private AtomicInteger count = new AtomicInteger(5);

    public void run(){
        //count--;
        System.out.println(Thread.currentThread().getName() + ":" + count.decrementAndGet());
    }

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Test01 test02 = new Test01();
        Test01 test03 = new Test01();
        Test01 test04 = new Test01();
        Test01 test05 = new Test01();

        Thread t1 = new Thread(test01, "t1");
        Thread t2 = new Thread(test01, "t2");
        Thread t3 = new Thread(test01, "t3");
        Thread t4 = new Thread(test01, "t4");
        Thread t5 = new Thread(test01, "t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
