package Array_Sorting.Merge_Sort;

import java.util.*;

/**
 * The {@code Mergesort} class implements the merge sort algorithm.
 *
 * <p>Merge Sort is a divide-and-conquer algorithm that recursively splits an array,
 * sorts the smaller arrays, and merges them back together into a sorted array.</p>
 */
public class Merge_sort {

    /**
     * Main method to demonstrate merge sort.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }

    /**
     * Recursively sorts an array using the merge sort algorithm.
     *
     * @param arr the array to be sorted
     * @return a sorted array
     */
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr; // Base case: a single-element array is already sorted
        }
        int mid = arr.length / 2;

        // Divide the array into two halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the two sorted halves
        return merge(left, right);
    }

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param first  the first sorted array
     * @param second the second sorted array
     * @return a merged sorted array
     */
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and add the smaller one to the merged array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the first array, if any
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Copy remaining elements from the second array, if any
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
