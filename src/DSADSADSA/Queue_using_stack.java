package DSADSADSA;
import java.util.Stack;

public class Queue_using_stack {

        //creating two stacks
        private Stack stack1 = new Stack<>();
        private Stack stack2 = new Stack<>();
        public void enqueue(int element) {
            stack1.push(element);
            System.out.println(element + " inserted");
        }
        public void dequeue() {
            if(stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            System.out.println("An element removed from a queue is: " + stack2.pop());
        }
        public static void main(String args[]) {
            Queue_using_stack test = new Queue_using_stack();
            test.enqueue(10);
            test.enqueue(20);
            test.enqueue(30);
            test.enqueue(40);
            System.out.println("The queue is: " + test.stack1);
            test.dequeue();
        }
    }

