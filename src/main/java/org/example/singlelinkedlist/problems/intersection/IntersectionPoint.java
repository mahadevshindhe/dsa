package org.example.singlelinkedlist.problems.intersection;

import org.example.singlelinkedlist.Node;

public class IntersectionPoint {

    public static Node getIntersectionPoint(Node head1, Node head2) {
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                if (temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }

}
