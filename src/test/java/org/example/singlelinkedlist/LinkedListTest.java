package org.example.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTest {

    static LinkedList list;

    @BeforeEach
    void setUp() {
        list = new LinkedList();
    }

    @Test
    void testPrintList() {
        insertNodes();
//        list.printList();
    }

    @Test
    void testInsertAtStart() {
        insertNodes();
        assertEquals(3, list.size());
    }

    @Test
    void testInsertAfter() {
        insertNodes();
        list.insertNodeAfter(20, 15);
        list.insertNodeAfter(10, 5); //insert at end
        list.insertNodeAfter(30, 25); //insert at end
        assertEquals(6, list.size());
    }

    @Test
    void testInsertAtEnd() {
        list.insertNodeAtEnd(100);
        list.insertNodeAtEnd(200);
        list.insertNodeAtEnd(300);
        assertEquals(3, list.size());
    }

    @Test
    void testDeleteStart() {
        insertNodes();
        assertEquals(3, list.size());
        list.deleteNodeAtStart();
        assertEquals(2, list.size());
    }

    @Test
    public void testDeleteEnd() {
        insertNodes();
        assertEquals(3, list.size());
        list.deleteNodeAtEnd();
        assertEquals(2, list.size());
    }

    @Test
    public void testDeleteNode() {
        list.deleteNode(5);
        assertEquals(0, list.size());
        insertNodes();
        assertEquals(3, list.size());
        list.deleteNode(20);
        assertEquals(2, list.size());
        list.deleteNode(10);
        assertEquals(1, list.size());
        list.deleteNode(30);
        assertEquals(0, list.size());
    }


    private void insertNodes() {
        list.insertNodeAtStart(10);
        list.insertNodeAtStart(20);
        list.insertNodeAtStart(30);
    }
}