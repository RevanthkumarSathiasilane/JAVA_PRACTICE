package com.FinalLinkedList;

public class Main {
    public static void main(String[] args) {
        /* Singly Linked List
        SLL list = new SLL();
        list.insertFirst(17);
        list.insertFirst(8);
        list.insertFirst(1);
        list.insertFirst(5);
        list.insertLast(12);
        list.insert(100,3);
        System.out.println(list.deleteFirst());
        list.displaySLL();
        System.out.println(list.deleteLast());
        list.displaySLL();
        System.out.println(list.delete(3));
        list.displaySLL();
        System.out.println(list.find(8));
        */
        /*
        Doubly Linked List:
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(99);
        list.insert(2,2);
        list.displayDLL();
         */
        //Circular Linked List
        CLL list = new CLL();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);
        list.displayCLL();
        list.delete(19);
        list.displayCLL();
    }
}
