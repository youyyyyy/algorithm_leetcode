/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */


package resources.fcc_code_example_recursion;
// (1) divide problem into several smaller subproblems, normally, the subproblem are similar to the original
// (2) Conquer the subproblems by solving them recursively
//     Base case: solve small enough problem by brute force
// (3) Combine the solutions to get a solution to the subproblems and finally a solution to the original problem
// (4) Divide a solution to the original problem

public class DivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 12, 14, 19, 22, 43, 55, 66, 77, 100};
        int res = binarySearch(arr, 0, arr.length, 75);
        System.out.println(res);
    }

    public static int binarySearch(int[] arr, int lo, int hi, int target) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch(arr, mid + 1, hi, target);
        } else {
            return binarySearch(arr, lo, hi - 1, target);
        }
    }
}
