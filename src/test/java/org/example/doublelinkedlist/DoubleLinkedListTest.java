package org.example.doublelinkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleLinkedListTest {

    DoubleLinkedList dlist;

    @BeforeEach
    void setUp() {
        dlist = new DoubleLinkedList();
    }

    @Test
    void testPush() {
        insertNodes();
        assertEquals(3, dlist.size());
    }

    @Test
    void testPrintList() {
        insertNodes();
//        dlist.printList();
    }

    private void insertNodes() {
        dlist.push(10);
        dlist.push(20);
        dlist.push(30);
    }
}