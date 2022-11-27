package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.Node;

public class DetectLoopUsingFloydCycle {

    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        int flag = 0;

        while (slow != null && fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                flag = 1;
                break;
            }
        }

        return flag == 1 ? true : false;
    }
}
