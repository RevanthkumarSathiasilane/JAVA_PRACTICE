package com.LinkedList;
import java.util.*;
public class LL {
   private Node head;
   private Node tail;
   private int size;
    public LL() {
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }
}
