package Array_Sorting.Insertion_Sort;

/**
 * InsertionSort class demonstrates the Insertion Sort algorithm.
 *
 * <p>
 * <b>How It Works:</b><br>
 * Insertion Sort builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced
 * algorithms like Quick Sort, Merge Sort, etc., but it has advantages for small data sets and is stable.
 * </p>
 *
 * <p>
 * <b>Steps:</b>
 * <ol>
 *   <li>Start from the second element (index 1).</li>
 *   <li>Compare the current element with the elements before it.</li>
 *   <li>Shift all elements greater than the current element one position to the right.</li>
 *   <li>Insert the current element into its correct position.</li>
 *   <li>Repeat until the entire array is sorted.</li>
 * </ol>
 * </p>
 *
 * <p>
 * <b>Example:</b><br>
 * Consider the array [12, 11, 13, 5, 6].
 * <br><br>
 * <b>First Pass (i=1):</b>
 * <ul>
 *   <li>11 is compared with 12 and swapped.</li>
 *   <li>Array becomes [11, 12, 13, 5, 6].</li>
 * </ul>
 *
 * <b>Second Pass (i=2):</b>
 * <ul>
 *   <li>13 is already in correct position.</li>
 *   <li>Array remains [11, 12, 13, 5, 6].</li>
 * </ul>
 *
 * <b>Third Pass (i=3):</b>
 * <ul>
 *   <li>5 is compared and inserted at the beginning.</li>
 *   <li>Array becomes [5, 11, 12, 13, 6].</li>
 * </ul>
 *
 * <p>
 * <b>Time Complexity:</b><br>
 * <ul>
 *   <li><b>Best Case:</b> O(n) (when the array is already sorted)</li>
 *   <li><b>Average Case:</b> O(n²)</li>
 *   <li><b>Worst Case:</b> O(n²)</li>
 * </ul>
 * </p>
 */
public class Insertion_Sort {

    /**
     * Sorts the input array in ascending order using the Insertion Sort algorithm.
     *
     * @param arr the array of integers to be sorted
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }

    /**
     * Swaps two elements in the array at the specified indices.
     *
     * @param arr the array containing the elements
     * @param i   the index of the first element
     * @param j   the index of the second element
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints the elements of the array to the console.
     *
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * The main method to demonstrate the Insertion Sort algorithm.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}