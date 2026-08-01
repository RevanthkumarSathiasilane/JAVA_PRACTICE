package com.FinalLinkedList;

public class DLL {
    private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) head.prev = node;
        head = node;
    }
    public void displayDLL(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+" -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        while(last!=null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        node.prev = last;
        node.next = null;
        last.next = node;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return node;
    }
    public void insert(int after,int val){
        Node p = find(after);
        if(p==null){
            System.out.println("Does not exists");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }
    private class Node{
        int value;
        Node next;
        Node prev;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
