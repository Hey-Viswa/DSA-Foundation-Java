package Array_Searching.LinearSearch;

/**
 * The {@code Linear_Search} class provides an implementation of the linear search algorithm.
 *
 * <p>Linear search is the simplest searching algorithm. It checks each element in the array sequentially
 * until it finds the target element (the element you are searching for), or it reaches the end of the array
 * without finding it.
 *
 * <h2>How it Works:</h2>
 * <ul>
 *     <li>Start from the first element of the array.</li>
 *     <li>Compare the current element with the target value.</li>
 *     <li>If they match, return the index of the target.</li>
 *     <li>If not, move to the next element and repeat until the target is found or the array ends.</li>
 * </ul>
 *
 * <h2>Why It Works:</h2>
 * <p>Linear search works on unsorted arrays because it does not rely on any particular ordering.
 * It simply scans through every element. If the target is present, it will be found by eventually
 * checking every position.</p>
 *
 * <h2>Time Complexity:</h2>
 * <ul>
 *     <li>Worst-case: {@code O(n)}, where {@code n} is the number of elements in the array.</li>
 *     <li>Best-case: {@code O(1)}, if the first element is the target.</li>
 *     <li>Average-case: {@code O(n)}.</li>
 * </ul>
 */
public class Linear_Search {

    /**
     * Performs a linear search for the target value in the given array.
     *
     * @param arr    the array to search in
     * @param target the value to find
     * @return the index of the target if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * The entry point of the application. Demonstrates the use of linear search.
     *
     * <p>This method initializes an array and searches for a target value using
     * the {@link #linearSearch(int[], int)} method. It prints the result of the search
     * to the console.</p>
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] data = {10, 5, 3, 7, 11, 15};
        int target = 7;
        int index = linearSearch(data, target);

        if (index != -1) {
            System.out.printf("Element found at index: %d%n", index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
