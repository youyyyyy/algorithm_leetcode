package leetcode_design;

import java.util.PriorityQueue;

class MedianFinder0295 {

    private PriorityQueue<Integer> minQ;
    private PriorityQueue<Integer> maxQ;

    public MedianFinder0295() {
        minQ = new PriorityQueue<>((a, b) -> b - a);
        maxQ = new PriorityQueue<>();
    }


    /*
     * Always balance between two heaps:
     * (1) if total size is even, minQ and maxQ have same number of elements
     * (2) if total size is odd, minQ has one more element than maxQ
     *
     * How to keep balance:
     * 1. add first element to minQ
     * 2. if num <= max in minQ, add it to minQ
     *    2.1 if minQ.size() > minQ.size() + 1, move max in minQ to maxQ
     * 3. if num < max in minQ, add it to maxQ
     *    3.1 if maxQ.size() > minQ.size(), move min in maxQ to minQ
     * */
    public void addNum(int num) {
        if (minQ.isEmpty() || num <= minQ.peek()) {
            minQ.add(num);
            if (minQ.size() > maxQ.size() + 1) maxQ.add(minQ.poll());
        } else {
            maxQ.add(num);
            if (maxQ.size() > minQ.size()) minQ.add(maxQ.poll());
        }
    }

    public double findMedian() {
        return (minQ.size() + maxQ.size()) % 2 == 0 ? (minQ.peek() + maxQ.peek()) / 2.0 : (double) minQ.peek();
    }
}

public class _0295_FindMedianDataStream {
    public static void main(String[] args) {
        MedianFinder0295 medianFinder = new MedianFinder0295();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        System.out.println(medianFinder.findMedian()); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        System.out.println(medianFinder.findMedian()); // return 2.0
    }
}
