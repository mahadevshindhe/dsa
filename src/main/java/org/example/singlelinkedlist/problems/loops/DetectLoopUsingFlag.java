package org.example.singlelinkedlist.problems.loops;

public class DetectLoopUsingFlag {
    static boolean detectLoop(Node h) {
        while (h != null) {

            if (h.flag == 1)
                return true;
            h.flag = 1;
            h = h.next;
        }
        return false;
    }

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.flag = 0;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static class Node {
        int data;
        Node next;
        int flag;
    }
}
