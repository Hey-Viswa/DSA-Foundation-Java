package Array.Practice_Problems;

/**
 * The {@code ReverseArrayInPlace} class demonstrates how to reverse an array
 * in-place without using additional arrays.
 */
public class Reverse_An_Array_In_Place {

    /**
     * Reverses the elements of the given array in-place.
     *
     * @param array The array to be reversed.
     */
    public static void reverseArrayInPlace(int[] array) {
        // Initialize two pointers: left at the start, right at the end
        int left = 0;
        int right = array.length - 1;

        // Swap elements while left is less than right
        while (left < right) {
            // Swap the elements at the left and right positions
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move the pointers towards the center
            left++;
            right--;
        }
    }

    /**
     * The entry point of the application. Demonstrates reversing an array in-place.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Step 1: Initialize the array
        int[] numbers = {1, 2, 3, 4, 5};

        // Step 2: Reverse the array in-place
        reverseArrayInPlace(numbers);

        // Step 3: Print the reversed array
        System.out.println("Array after reversing:");
        printArray(numbers);
    }

    /**
     * Prints the elements of the given integer array.
     *
     * @param array The array to be printed.
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Explanation:
 *
 * 1. **Initialize Pointers**:
 *    - `left` starts at the beginning (index 0) and `right` starts at the end (last index).
 *
 * 2. **Swap Elements**:
 *    - Swap the elements at the `left` and `right` pointers using a temporary variable.
 *
 * 3. **Move Pointers**:
 *    - Increment the `left` pointer and decrement the `right` pointer.
 *
 * 4. **Continue Until Pointers Meet**:
 *    - The loop runs until `left` is no longer less than `right`.
 *
 * Why It Works:
 * By swapping pairs of elements from the ends towards the center, the array is reversed
 * in-place without requiring extra space. This makes the approach space-efficient.
 *
 * Example Usage:
 * Original Array: {1, 2, 3, 4, 5}
 * Reversed Array: {5, 4, 3, 2, 1}
 */
