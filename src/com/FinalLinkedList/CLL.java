package com.FinalLinkedList;

public class CLL {
    Node head;
    Node tail;
    public CLL() {
        this.head = head;
        this.tail = tail;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail = node;
    }
    public void delete(int value){
        Node node = head;
        if(node == null) return;
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while(node!=head);
    }
    public void displayCLL(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }
    private class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
