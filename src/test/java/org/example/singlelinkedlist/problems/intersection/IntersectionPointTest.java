package org.example.singlelinkedlist.problems.intersection;

import org.example.singlelinkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IntersectionPointTest {
    Node head1 = null;
    Node head2 = null;

    @BeforeEach
    public void setup() {
//        1st 10->15->30
//        2nd 3->6->9->15->30

        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;
    }

    @Test
    void getIntersectionPoint() {
        assertTrue(IntersectionPoint.getIntersectionPoint(head1, head2) != null);
    }
}