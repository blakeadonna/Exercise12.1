package com.blakey.exercise12;
import java.util.*;

//Exercise12 | Implement queue system with enqueue/dequeue methods | 15/4/2019

public class Main {
    static class Queue{
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        static void enQueue(int x){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            stack1.push(x);
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

        static int deQueue(){
            int x = stack1.peek();
            stack1.pop();
            return x;
        }
    }

    public static void main(String[] args) {
        Queue e = new Queue();
        e.enQueue(777);
        e.enQueue(787);
        e.enQueue(747);

        System.out.println(e.deQueue());
        System.out.println(e.deQueue());
        System.out.println(e.deQueue());
    }
}
