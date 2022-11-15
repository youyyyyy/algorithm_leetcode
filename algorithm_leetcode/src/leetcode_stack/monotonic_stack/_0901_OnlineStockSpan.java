package leetcode_stack.monotonic_stack;

import java.util.Stack;

class StockSpanner0901 {

    private Stack<int[]> stack;
    private int index;

    public StockSpanner0901() {
        stack = new Stack<>();
        stack.push(new int[]{Integer.MAX_VALUE, -1});
        index = -1;
    }

    public int next(int price) {
        index++;
        while (!stack.isEmpty() && price >= stack.peek()[0]) stack.pop();
        int res = index - stack.peek()[1];
        stack.push(new int[]{price, index});
        return res;
    }
}

public class _0901_OnlineStockSpan {
    public static void main(String[] args) {
        StockSpanner0901 stockSpanner = new StockSpanner0901();
        System.out.println(stockSpanner.next(31));
        System.out.println(stockSpanner.next(41));
        System.out.println(stockSpanner.next(48));
        System.out.println(stockSpanner.next(59));
        System.out.println(stockSpanner.next(79));
    }
}
