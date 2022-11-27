package org.example.singlelinkedlist.problems.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectLoopUsingFlagTest {

    //detect loop using node flag value
    @Test
    static void testDetectLoop() {
        DetectLoopUsingFlag.Node head = null;

        head = DetectLoopUsingFlag.push(head, 20);
        head = DetectLoopUsingFlag.push(head, 4);
        head = DetectLoopUsingFlag.push(head, 15);
        head = DetectLoopUsingFlag.push(head, 10);

        head.next.next.next.next = head;

        assertTrue(DetectLoopUsingFlag.detectLoop(head));
    }
}
