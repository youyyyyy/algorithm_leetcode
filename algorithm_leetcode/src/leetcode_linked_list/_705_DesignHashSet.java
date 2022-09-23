package leetcode_linked_list;

class MyHashSet {

    class Node {
        int val;
        Node next;

        Node() {

        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    Node prev;
    Node cur;

    public MyHashSet() {
        prev = new Node();
        cur = prev;
    }

    public void add(int key) {

        Node added = new Node(key);
        Node temp = prev.next;
        while (temp != null) {
            if (temp.val == key) return;
            temp = temp.next;
        }

        cur.next = added;
        cur = cur.next;
    }

    public void remove(int key) {
        if (prev.next == null) return;
        Node temp = prev;
        while (temp.next != null) {
            if (temp.next.val == key) temp.next = temp.next.next;
            else temp = temp.next;
        }
        cur = temp;

    }

    public boolean contains(int key) {
        Node temp = prev.next;
        while (temp != null) {
            if (temp.val == key) return true;
            temp = temp.next;
        }
        return false;
    }
}

public class _705_DesignHashSet {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(2);
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(3));

        myHashSet.add(2);
        System.out.println(myHashSet.contains(2));
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2));

        myHashSet.add(1000000);
        System.out.println(myHashSet.contains(1000000));

        System.out.println("end of program");
    }
}
