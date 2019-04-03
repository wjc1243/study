package com.example.study.queue;

import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(5, Integer::compareTo);
        queue.offer(1);
        queue.offer(5);
        queue.offer(3);
        queue.offer(4);
        queue.offer(2);
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
