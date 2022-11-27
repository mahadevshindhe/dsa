package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectLoopUsingFloydCycleTest {

    @Test
    void detectLoop() {
        LinkedList list = DetectLoopTest.prepareList();
        assertTrue( DetectLoopUsingFloydCycle.detectLoop(list.head));
    }
}
