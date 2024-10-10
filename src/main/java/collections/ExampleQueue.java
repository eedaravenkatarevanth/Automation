package collections;

import java.util.*;
import java.util.ArrayList;

public class ExampleQueue {

    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<>();
        queue.offer("revanth");
        queue.offer("bhuvan");
        queue.offer("sumanth");
        queue.offer("charan");
        System.out.println("queue at start "+ queue);
        System.out.println("top element "+ queue.peek());
        System.out.println("removing an element "+ queue.poll());


        //priority queue wont allow null values

        Queue<Integer> queue2= new PriorityQueue<>();
        queue2.add(15);
        queue2.add(4);
        queue2.add(6);


        System.out.println(queue2.poll());
        System.out.println(queue2.peek());


        // Array Dequeue

        ArrayDeque<String> arr= new ArrayDeque<>();
        arr.addFirst("Revanth");
        arr.addFirst("Bhuvan");
        arr.add("Cherry");
        arr.removeFirstOccurrence("Revanth");
        System.out.println(arr);

    }
}
