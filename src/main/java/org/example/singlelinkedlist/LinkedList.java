package org.example.singlelinkedlist;

public class LinkedList {

    public Node head;

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public void insertNodeAtStart(int data) {
        Node n = new Node(data);
        n.next = head;
        head = n;
    }

    public void insertNodeAfter(int key, int data) {
        Node n = new Node(data);
        if (key == head.data) {
            n.next = head.next;
            head.next = n;
            return;
        }
        Node temp = head;
        while (temp.data != key) {
            temp = temp.next;
            if (temp == null) {
                return;
            }
        }
        n.next = temp.next;
        temp.next = n;
    }

    public void insertNodeAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
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

    public int sizeRC() {
//        return getCount(head);

        //reursion using constant space
        return getCountByConstatntSpace(head,0);

    }

    private int getCountByConstatntSpace(Node node, int count) {
        if (node == null) {
            return 0;
        }
        return getCountByConstatntSpace(node.next, 1 + count);
    }

    private int getCount(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getCount(node.next);
    }

    public void deleteNodeAtStart() {
        if (head == null) {
            return;
        }
        Node temp = head;
        head = temp.next;
    }

    public void deleteNodeAtEnd() {
        if (head == null) {
            return;
        }
        Node end = head;
        Node prev = null;
        while (end.next != null) {
            prev = end;
            end = end.next;
        }
        prev.next = null;
    }

    public void deleteNode(int key) {
        if (head == null) {
            return;
        }
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
}
