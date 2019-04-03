package com.example.study.XThread;

public class Test02 implements Runnable {
    @Override
    public synchronized void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            if(i == 5){
                Thread.yield();
            }
        }
    }
}
