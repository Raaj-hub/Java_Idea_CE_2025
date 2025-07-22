package DSADSADSA;

import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_queue {

    //queue using linkedlist
    Queue queue = new LinkedList();

    public void push(int value) {
        int queueSize = queue.size();
        // System.out.println(queueSize);
        queue.add(value);
        // System.out.println(queue.peek());
          System.out.println(queue);
        System.out.println(queueSize);
        for (int i = 0; i < queueSize; i++) {
            System.out.println(queueSize);
            queue.add(queue.remove());
        }
    }

    public void pop() {
        System.out.println("An element removed from a queue is: " + queue.remove());
    }

    public static void main(String[] args) {
        Stack_using_queue test = new Stack_using_queue();
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        System.out.println("The queue is: " + test.queue);
        test.pop();
        System.out.println(test.queue);
    }

}

