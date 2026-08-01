package com.FinalLinkedList;

public class Main {
    public static void main(String[] args) {
        //Singly Linked List
        SLL list = new SLL();
        list.insertLast(3);
        list.insertLast(5);
        list.insertLast(9);
        list.insertLast(1);
        list.displaySLL();
        list.insertRec(7,3);
        list.displaySLL();
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
//        CLL list = new CLL();
//        list.insert(23);
//        list.insert(3);
//        list.insert(19);
//        list.insert(75);
//        list.displayCLL();
//        list.delete(19);
//        list.displayCLL();


    }
}
