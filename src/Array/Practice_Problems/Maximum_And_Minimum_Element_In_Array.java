package Array.Practice_Problems;

/**
 * The {@code MaximumAndMinimumElement} class demonstrates how to find
 * the maximum and minimum elements in an array.
 */
public class Maximum_And_Minimum_Element_In_Array {

    /**
     * Finds the maximum element in the given array.
     *
     * @param array The array to find the maximum element from.
     * @return The maximum element in the array.
     * @throws IllegalArgumentException If the array is empty.
     */
    public static int findMaximum(int[] array) {
        // Handle edge case: empty array
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize max with the first element
        int max = array[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Finds the minimum element in the given array.
     *
     * @param array The array to find the minimum element from.
     * @return The minimum element in the array.
     * @throws IllegalArgumentException If the array is empty.
     */
    public static int findMinimum(int[] array) {
        // Handle edge case: empty array
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        // Initialize min with the first element
        int min = array[0];

        // Iterate through the array to find the minimum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    /**
     * The entry point of the application. Demonstrates finding the maximum and minimum elements in an array.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] numbers = {3, 1, 4, 1, 5, 9, 2};

        // Step 2: Find the maximum and minimum elements
        int max = findMaximum(numbers);
        int min = findMinimum(numbers);

        // Step 3: Print the results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

/*
 * Explanation:
 *
 * 1. **Handle Edge Cases**:
 *    - Check if the array is empty to avoid errors.
 *
 * 2. **Initialize max and min**:
 *    - Start with the first element of the array as the initial maximum or minimum.
 *
 * 3. **Iterate Through the Array**:
 *    - For `findMaximum`: Update `max` if a larger element is found.
 *    - For `findMinimum`: Update `min` if a smaller element is found.
 *
 * 4. **Return the Result**:
 *    - By the end of the loop, the maximum or minimum value is identified.
 *
 * Why It Works:
 * By iterating through each element and keeping track of the current maximum or minimum,
 * we ensure that we identify the largest or smallest element in the array efficiently.
 *
 * Example Usage:
 * Array: {3, 1, 4, 1, 5, 9, 2}
 * Maximum Element: 9
 * Minimum Element: 1
 */
