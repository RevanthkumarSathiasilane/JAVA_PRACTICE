package com.LinkedList;

public class DLL {
     Node head;
     public void insertFirst(int val){
         Node node = new Node(val);
         node.next = head;
         node.prev = null;
         if(head!=null) {
             head.prev = node;
         }
         head = node;
     }
     public void display(){
         Node temp = head;
         Node last = null;
         while(temp!=null){
             System.out.print(temp.value+" -> ");
             last = temp;
             temp = temp.next;
         }
         System.out.println("END");
         System.out.println("Print in reverse:");
         while(last!=null){
             System.out.print(last.value+" -> ");
             last=last.prev;
         }
         System.out.println("START");
     }
     public Node find(int val){
         Node node = head;
         while(node!=null){
             if(node.value == val) return node;
             node = node.next;
         }
         return null;
     }
     public void insert(int after,int val){
         Node p = find(after);
         if(p == null){
             System.out.println("does not exist");
             return;
         }
         Node node = new Node(val);
         node.next = p.next;
         p.next = node;
         node.prev = p;
         if(node.next!=null) {
             node.next.prev = node;
         }
     }
    public void insertLast(int val){
         Node node = new Node(val);
         Node last = head;
         node.next = null;
         if(head==null){
             node.prev = null;
             head = node;
             return;
         }
         while(last.next!=null){
             last = last.next;
         }
         last.next = node;
         node.prev = last;
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
