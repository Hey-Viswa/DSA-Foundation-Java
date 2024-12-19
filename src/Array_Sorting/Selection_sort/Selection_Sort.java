package Array_Sorting.Selection_sort;

/**
 * SelectionSort class demonstrates the Selection Sort algorithm.
 *
 * <p>
 * <b>How It Works:</b><br>
 * Selection Sort divides the input list into two parts:
 * <ul>
 *   <li><b>Sorted Portion:</b> Initially empty.</li>
 *   <li><b>Unsorted Portion:</b> Initially the entire list.</li>
 * </ul>
 * The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element
 * from the unsorted portion and moves it to the end of the sorted portion.
 * </p>
 *
 * <p>
 * <b>Steps:</b>
 * <ol>
 *   <li>Start with the first element as the initial position.</li>
 *   <li>Find the smallest element in the unsorted portion.</li>
 *   <li>Swap it with the element at the current position.</li>
 *   <li>Move the boundary between sorted and unsorted portions one step forward.</li>
 *   <li>Repeat until the entire list is sorted.</li>
 * </ol>
 * </p>
 *
 * <p>
 * <b>Example:</b><br>
 * Consider the array [64, 25, 12, 22, 11].
 * <br><br>
 * <b>First Pass:</b>
 * <ul>
 *   <li>Minimum is 11.</li>
 *   <li>Swap 11 with 64.</li>
 *   <li>Array becomes [11, 25, 12, 22, 64].</li>
 * </ul>
 *
 * <b>Second Pass:</b>
 * <ul>
 *   <li>Minimum in [25, 12, 22, 64] is 12.</li>
 *   <li>Swap 12 with 25.</li>
 *   <li>Array becomes [11, 12, 25, 22, 64].</li>
 * </ul>
 *
 * <p><b>Time Complexity:</b><br>
 * <ul>
 *   <li><b>Best Case:</b> O(n²)</li>
 *   <li><b>Average Case:</b> O(n²)</li>
 *   <li><b>Worst Case:</b> O(n²)</li>
 * </ul>
 * Regardless of the initial order of elements, Selection Sort always performs O(n²) comparisons.
 * </p>
 * </p>
 */
public class Selection_Sort {

    /**
     * Sorts the input array in ascending order using the Selection Sort algorithm.
     *
     * @param arr the array of integers to be sorted
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted portion
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum element is the first element of the unsorted portion
            int minIdx = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            if (minIdx != i) {
                swap(arr, minIdx, i);
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
     * The main method to demonstrate the Selection Sort algorithm.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
