package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.Node;

import java.util.HashSet;

public class DetectLoop {

    public static boolean detectLoop(Node node) {

        HashSet<Node> hashSet = new HashSet<Node>();

        while (node != null) {

            if (hashSet.contains(node)) {
                return true;
            }
            hashSet.add(node);
            node = node.next;
        }
        return false;
    }

    public static boolean detectLoopByMark(Node head) {

        Node temp = head;

        while (head != null) {

            if (head.next == null) {
                return false;
            }

            if (head.next == temp) {
                return true;
            }

            Node next = head.next;
            head.next = temp;
            head = next;
        }
        return false;
    }

    public static boolean detectLoopByLength(Node head) {
        Node first, last;

        first = head;
        last = head;

        int current_length = 0;
        int prev_length = -1;
        while (current_length > prev_length && last != null) {
            prev_length = current_length;
            current_length = distance(first, last);
            last = last.next;
        }
        if (last == null) {
            return false;
        } else {
            return true;
        }
    }

    static int distance(Node first, Node last) {
        int counter = 0;
        Node curr;
        curr = first;
        while (curr != last) {
            counter += 1;
            curr = curr.next;
        }
        return counter + 1;
    }


    public static boolean detectLoopByModifyingValue(Node head) {
        if (head == null)
            return false;
        else {
            while (head != null) {
                if (head.data == -1) {
                    return true;
                } else {
                    head.data = -1;
                    head = head.next;
                }
            }
            return false;
        }
    }
}


