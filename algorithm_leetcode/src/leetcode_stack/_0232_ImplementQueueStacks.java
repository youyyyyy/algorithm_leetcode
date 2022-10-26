package leetcode_stack;

import java.util.Stack;

class MyQueue0232 {

    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;
    int first;

    public MyQueue0232() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        if (stackIn.isEmpty()) first = x;
        stackIn.push(x);
    }

    public int pop() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }

    public int peek() {
        if (!stackOut.isEmpty()) return stackOut.peek();
        return first;
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
}

public class _0232_ImplementQueueStacks {
    public static void main(String[] args) {
        MyQueue0232 obj = new MyQueue0232();
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
