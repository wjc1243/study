package com.example.study.XThread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    volatile int key = 0;
    String[] s = {"A","B","C","D","E"};
    int[] nums = {1,2,3,4,5};
    Lock l = new ReentrantLock();
    Condition c = l.newCondition();

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        new Thread(lockTest.new A()).start();
        new Thread(lockTest.new B()).start();
        System.out.println("fdgha".hashCode());
    }

    class A implements Runnable{
        @Override
        public void run() {
            int i = 5;
            while (i > 0){
                l.lock();
                try {
                    if(key == 1){
                        System.out.print(s[5-i]);
                        i--;
                        key = 0;
                        c.signal();
                    }else{
                        c.awaitUninterruptibly();
                    }
                }finally {
                    l.unlock();
                }
            }
        }
    }

    class B implements Runnable{
        @Override
        public void run() {
            int i = 5;
            while (i > 0){
                l.lock();
                try {
                    if(key == 0){
                        System.out.print(nums[5-i]);
                        i--;
                        key = 1;
                        c.signal();
                    }else{
                        c.awaitUninterruptibly();
                    }
                }finally {
                    l.unlock();
                }
            }
        }
    }
}
