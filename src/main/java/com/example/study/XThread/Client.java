package com.example.study.XThread;

public class Client {
    public static void main(String[] args) {
        //Test02 test02 = new Test02();
        Runnable test02 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                    if(i == 5){
                        Thread.yield();
                    }
                }
            }
        };
        Thread t1 = new Thread(test02, "A");
        Thread t2 = new Thread(test02, "B");

        t1.start();
        t2.start();
    }
}
