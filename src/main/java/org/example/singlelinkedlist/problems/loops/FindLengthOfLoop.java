package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.Node;

public class FindLengthOfLoop {

    public static int countNodesInLoop(Node list) {
        Node slow_p = list, fast_p = list;

        while (slow_p != null && fast_p != null && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p)
                return countNodes(slow_p);
        }
        return 0;
    }

    private static int countNodes(Node n) {
        int res = 1;
        Node temp = n;
        while (temp.next != n) {
            res++;
            temp = temp.next;
        }
        return res;
    }

}
