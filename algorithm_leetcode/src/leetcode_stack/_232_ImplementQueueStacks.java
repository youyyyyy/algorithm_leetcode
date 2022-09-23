package leetcode_stack;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();
    int head;

    public MyQueue() {

    }

    public void push(int x) {
        if (in.isEmpty()) head = x;
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if (!out.isEmpty()) return out.peek();
        return head;
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}

public class _232_ImplementQueueStacks {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        int param_2 = obj.peek();
        int param_3 = obj.pop();
        boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }

}
