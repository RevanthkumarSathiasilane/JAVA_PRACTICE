package com.Stack;
import java.util.*;
public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(29);
//        stack.push(18);
//        stack.push(19);
//        stack.push(20);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(9);
//        queue.add(11);
//        queue.add(17);
//        queue.add(12);
//        queue.add(15);
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(80);
        deque.addLast(78);
        System.out.println(deque.removeFirst());
        //etc etc
    }
}
