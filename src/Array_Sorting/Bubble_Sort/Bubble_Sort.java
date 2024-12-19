package Array_Sorting.Bubble_Sort;

/**
 * BubbleSort class demonstrates the Bubble Sort algorithm.
 *
 * <p>
 * <b>How It Works:</b><br>
 * Bubble Sort is a simple comparison-based algorithm. It repeatedly steps through the list,
 * compares adjacent elements, and swaps them if they are in the wrong order. This process
 * repeats until the list is sorted.
 * </p>
 *
 * <p>
 * <b>Steps:</b>
 * <ol>
 *   <li>Compare each pair of adjacent elements.</li>
 *   <li>Swap them if they are in the wrong order.</li>
 *   <li>After each pass, the largest unsorted element "bubbles up" to its correct position.</li>
 *   <li>Repeat the process for the remaining unsorted elements.</li>
 * </ol>
 * </p>
 *
 * <p>
 * <b>Example:</b><br>
 * Consider the array [5, 1, 4, 2, 8].
 * <br><br>
 * <b>First Pass:</b>
 * <ul>
 *   <li>Compare 5 and 1 → swap → [1, 5, 4, 2, 8]</li>
 *   <li>Compare 5 and 4 → swap → [1, 4, 5, 2, 8]</li>
 *   <li>Compare 5 and 2 → swap → [1, 4, 2, 5, 8]</li>
 *   <li>Compare 5 and 8 → no swap</li>
 *   <li>Array after first pass: [1, 4, 2, 5, 8]</li>
 * </ul>
 *
 * <b>Second Pass:</b>
 * <ul>
 *   <li>Compare 1 and 4 → no swap</li>
 *   <li>Compare 4 and 2 → swap → [1, 2, 4, 5, 8]</li>
 *   <li>Compare 4 and 5 → no swap</li>
 *   <li>Compare 5 and 8 → no swap</li>
 *   <li>Array after second pass: [1, 2, 4, 5, 8]</li>
 * </ul>
 *
 * <p>
 * <b>Time Complexity:</b><br>
 * <ul>
 *   <li><b>Best Case:</b> O(n) (when the array is already sorted, with an optimized version)</li>
 *   <li><b>Average Case:</b> O(n²)</li>
 *   <li><b>Worst Case:</b> O(n²)</li>
 * </ul>
 * </p>
 */
public class Bubble_Sort {

    /**
     * Sorts the input array in ascending order using the Bubble Sort algorithm.
     *
     * @param arr the array of integers to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Traverse through all elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, then break
            if (!swapped) {
                break;
            }
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
     * The main method to demonstrate the Bubble Sort algorithm.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}