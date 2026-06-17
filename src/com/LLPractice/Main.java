package com.LLPractice;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(4);
        list.addFirst(18);
        list.addFirst(23);
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(40);
        list.addLast(50);
        list.add(20,2);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.delete(1);
        list.find(23);
        list.display();
    }
}
