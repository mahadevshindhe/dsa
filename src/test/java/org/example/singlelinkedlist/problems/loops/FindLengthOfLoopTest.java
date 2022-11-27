package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLengthOfLoopTest {

    @Test
    void countNodesInLoop() {
        LinkedList list = DetectLoopTest.prepareList();
        assertEquals(3, FindLengthOfLoop.countNodesInLoop(list.head));
    }
}
