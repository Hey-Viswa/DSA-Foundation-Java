package Array_Sorting.Merge_Sort;

/**
 * The {@code In_Place_Merge_Sort} class provides an implementation of the in-place merge sort algorithm.
 *
 * <p>In-place merge sort is a divide-and-conquer algorithm that recursively sorts an array by splitting it,
 * sorting each half, and merging them back together without requiring extra space for arrays outside the merge step.
 */
public class In_Place_Merge_Sort {

    /**
     * Recursively sorts an array in place using merge sort.
     *
     * @param arr the array to be sorted
     * @param s   the starting index of the segment to sort
     * @param e   the ending index of the segment to sort
     */
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return; // Base case: single-element segment is already sorted
        }

        int mid = (s + e) / 2;

        // Recursively sort the left half
        mergeSortInPlace(arr, s, mid);

        // Recursively sort the right half
        mergeSortInPlace(arr, mid, e);

        // Merge the two sorted halves
        mergeInPlace(arr, s, mid, e);
    }

    /**
     * Merges two sorted subarrays in place.
     *
     * @param arr the array containing the subarrays to merge
     * @param s   the starting index of the first subarray
     * @param mid the ending index of the first subarray and the starting index of the second subarray
     * @param e   the ending index of the second subarray
     */
    public static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s];
        int i = s; // Pointer for the first subarray
        int j = mid; // Pointer for the second subarray
        int k = 0; // Pointer for the merged array

        // Compare and merge elements from both subarrays
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the first subarray
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the second subarray
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged elements back into the original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

    /**
     * The main method to demonstrate in-place merge sort.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(java.util.Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }
}
