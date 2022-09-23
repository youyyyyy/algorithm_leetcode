/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package fcc_code_example_recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 66, 12, 3, 1};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void mergeSort(int[] data, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {
        // build temp array to avoid modifying the original contents
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        // while both sub-array have values, then try and merge them in sorted order
        while (i <= mid && j <= end) {
            if (data[i] <= data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        // add the rest of the values from the left sub-array into the result
        while (i <= mid) {
            temp[k++] = data[i++];
        }

        // add the rest of the values from the right sub-array into the result
        while (j <= end) {
            temp[k++] = data[j++];
        }

        for (i = start; i <= end; i++) {
            data[i] = temp[i - start];
        }
    }
}
