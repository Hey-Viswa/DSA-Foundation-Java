package Array_Searching.BinarySearch;

/**
 * The {@code Binary_Search} class provides an implementation of the binary search algorithm.
 *
 * <p>Binary search is an efficient searching algorithm that works on sorted arrays. By leveraging
 * the ordering of elements, it repeatedly narrows down the search range by comparing the target
 * with the middle element.
 *
 * <h2>How it Works:</h2>
 * <ul>
 *     <li>Start with the entire array (initial {@code low = 0} and {@code high = n - 1}).</li>
 *     <li>Find the middle index: {@code mid = (low + high) / 2} or {@code mid = (low + high) >>> 1} to avoid overflow.</li>
 *     <li>Compare the element at {@code mid} with the target.</li>
 *     <ul>
 *         <li>If {@code arr[mid] == target}, return {@code mid}.</li>
 *         <li>If {@code arr[mid] > target}, reduce the search space to the left half by setting {@code high = mid - 1}.</li>
 *         <li>If {@code arr[mid] < target}, reduce the search space to the right half by setting {@code low = mid + 1}.</li>
 *     </ul>
 *     <li>Repeat until {@code low > high}, meaning the element is not found, or until the target is found.</li>
 * </ul>
 *
 * <h2>Why It Works:</h2>
 * <p>Binary search exploits the sorted order of the array. By comparing the target to the middle element,
 * half of the search space is eliminated in each step. This "divide and conquer" approach drastically
 * reduces the number of comparisons needed.</p>
 *
 * <h2>Time Complexity:</h2>
 * <ul>
 *     <li>Worst-case: {@code O(log n)}, where {@code n} is the number of elements in the array.</li>
 *     <li>Best-case: {@code O(1)}, if the middle element is the target on the first guess.</li>
 *     <li>Average-case: {@code O(log n)}.</li>
 * </ul>
 */
public class Binary_Search {

    /**
     * Performs a binary search for the target value in the given sorted array.
     *
     * @param arr    the sorted array to search in
     * @param target the value to find
     * @return the index of the target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    /**
     * The entry point of the application. Demonstrates the use of binary search.
     *
     * <p>This method initializes a sorted array and searches for a target value using
     * the {@link #binarySearch(int[], int)} method. It prints the result of the search
     * to the console.</p>
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] sortedData = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;
        int resultIndex = binarySearch(sortedData, target);

        if (resultIndex != -1) {
            System.out.printf("Element found at index: %d%n", resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
