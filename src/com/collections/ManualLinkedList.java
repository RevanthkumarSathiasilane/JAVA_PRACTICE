package com.collections;

    import java.util.Scanner;

    // Node class representing each element in the linked list
    class Node {
        int data;       // Data stored in the node
        Node next;      // Pointer to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class with basic operations
    class LinkedList {
        private Node head; // Head pointer of the list

        // Method to add a new node at the end
        public void insert(int data) {
            Node newNode = new Node(data);

            if (head == null) { // If list is empty
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) { // Traverse to last node
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to display the linked list
        public void display() {
            if (head == null) {
                System.out.println("The list is empty.");
                return;
            }
            Node current = head;
            System.out.print("Linked List: ");
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public class ManualLinkedList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            LinkedList list = new LinkedList();

            try {
                System.out.print("Enter the number of nodes: ");
                int n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Number of nodes must be positive.");
                    return;
                }

                for (int i = 1; i <= n; i++) {
                    System.out.print("Enter data for node " + i + ": ");
                    int data = scanner.nextInt();
                    list.insert(data);
                }

                list.display();

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter integers only.");
            } finally {
                scanner.close();
            }
        }
    }

