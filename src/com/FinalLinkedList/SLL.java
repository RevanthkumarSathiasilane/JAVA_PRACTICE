package com.FinalLinkedList;

public class SLL {
    private Node head;
    private Node tail;
    private int size;
    public SLL(){
        this.size = 0;
    }
    //insert using recursion



    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size++;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
    }
    public boolean find(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.value==val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public void displaySLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
       private int value;
       private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
 // Questions:
    public void duplicates(){
        Node node = head;
        if(head == null) return;
        while(node.next!=null){
            if(node.next.value == node.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    //Merge Two Sorted list:
    public static SLL merge(SLL first,SLL second){
        Node f = first.head;
        Node s = second.head;
        SLL ans = new SLL();
        while(f!=null && s!=null){
            if(f.value == s.value){
                ans.insertLast(f.value);
                ans.insertLast(s.value);
                f = f.next;
                s = s.next;
            }else if(f.value>s.value){
                ans.insertLast(s.value);
                s=s.next;
            }
            else{
                ans.insertLast(f.value);
                f = f.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        SLL list1 = new SLL();
        SLL list2 = new SLL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list2.insertLast(1);
        list2.insertLast(3);
        list2.insertLast(4);
        list1.displaySLL();
        list2.displaySLL();
        SLL list3 = new SLL();
        list3 = merge(list1,list2);
        list3.displaySLL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.displaySLL();
//        list.duplicates();
//        list.displaySLL();


    }
}
