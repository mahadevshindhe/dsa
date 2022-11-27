package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.LinkedList;
import org.example.singlelinkedlist.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectLoopTest {

    private LinkedList list;

    @BeforeEach
    public void setUp() {
        list = prepareList();
    }

    @Test
    void testDetectLoop() {
        assertTrue(DetectLoop.detectLoop(list.head));
        assertTrue(DetectLoop.detectLoop(list.head));
        assertTrue(DetectLoop.detectLoopByLength(list.head));
        assertTrue(DetectLoop.detectLoopByModifyingValue(list.head));
    }

    public static LinkedList prepareList() {
        LinkedList list = new LinkedList();

        list.insertNodeAtStart(40);
        list.insertNodeAtStart(30);
        list.insertNodeAtStart(10);
        list.insertNodeAtStart(20);

        assertFalse(DetectLoop.detectLoop(list.head));

        Node temp = list.head;
//        temp.next.next.next.next = list.head;
        temp.next.next.next = list.head;
        return list;
    }


}