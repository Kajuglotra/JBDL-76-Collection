package org.gfg.collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.add(73);
        queue.add(13);
        queue.add(23);
        queue.add(30);
        queue.add(23);
        queue.add(83);
        queue.add(93);
        queue.add(3);
        queue.add(38);
        System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
