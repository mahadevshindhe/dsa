package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.LinkedList;
import org.example.singlelinkedlist.Node;
import org.example.singlelinkedlist.problems.loops.DetectLoopInLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectLoopInLinkedListTest {

    @Test
    void testDetectLoop() {

        LinkedList list = new LinkedList();

        list.insertNodeAtStart(40);
        list.insertNodeAtStart(30);
        list.insertNodeAtStart(10);
        list.insertNodeAtStart(20);

        assertFalse(DetectLoopInLinkedList.detectLoop(list.head));

        list.printList();

        Node temp = list.head;
        temp.next.next.next.next = list.head;

        assertTrue(DetectLoopInLinkedList.detectLoop(list.head));

    }


}