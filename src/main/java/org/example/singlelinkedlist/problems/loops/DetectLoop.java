package org.example.singlelinkedlist.problems.loops;

import org.example.singlelinkedlist.Node;

import java.util.HashSet;

public class DetectLoopInLinkedList {

    public static boolean detectLoop(Node node) {

        HashSet<Node> hashSet = new HashSet<Node>();

        while (node != null) {

            if (hashSet.contains(node)) {
                return true;
            }
            hashSet.add(node);
            node = node.next;
        }
        return false;
    }


}


