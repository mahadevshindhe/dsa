package org.example.doublelinkedlist;

public class DoubleLinkedList {

    Node head = null;

    class Node {
        int data;

        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void printList() {
        Node temp = head;

        System.out.println("forward traversal:");
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");

        Node last = temp;
        System.out.println("\nbackword traversal:");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    public int size() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }
}
