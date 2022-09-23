/*
from LeetCode
 */


package leetcode_linked_list;

import java.util.HashMap;


// Time complexity: O(1)
// Space complexity: O(capacity)
class LRUCache {

    class DLNode {
        int key;
        int value;
        DLNode prev;
        DLNode next;

        DLNode() {

        }

        DLNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

    // member variable
    private int capacity;
    private int size;
    private DLNode head;  // pseudo head
    private DLNode tail;  // pseudo tail
    private HashMap<Integer, DLNode> cache = new HashMap<>();

    // member method
    private void addNode(DLNode addedNode) {
        // if there are nodes inside, put right behind head
        addedNode.prev = head;
        addedNode.next = head.next;
        head.next.prev = addedNode;
        head.next = addedNode;
    }


    private void removeNode(DLNode removedNode) {
        DLNode tempPrev = removedNode.prev;
        DLNode tempNext = removedNode.next;
        tempPrev.next = tempNext;
        tempNext.prev = tempPrev;
    }

    // move a node to the first by deleting it from the current position, and adding it to the first position
    private void move(DLNode movedNode) {
        removeNode(movedNode);
        addNode(movedNode);
    }

    private DLNode pop() {
        DLNode res = tail.prev;
        removeNode(res);
        return res;
    }


    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new DLNode();
        tail = new DLNode();
        head.next = tail;
        tail.prev = head;
    }


    public int get(int key) {
        DLNode node = cache.get(key);
        if (node == null) return -1;
        move(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLNode node = cache.get(key);
        if (node == null) {  // not exist
            DLNode newNode = new DLNode(key, value);
            cache.put(key, newNode);
            addNode(newNode);

            size++;

            if (size > capacity) {
                DLNode tail = pop();
                cache.remove(tail.key);
                size--;
            }
        } else { // update the value
            node.value = value;
            move(node);
        }

    }
}

public class _146_LRUCache {
}
