package Array.Implementing_Basic_Array_Operation_In_Java;

/**
 * The {@code DeleteAtPosition} class demonstrates how to remove an element
 * from a specified position in a fixed-size array by creating a new array.
 */
public class Delete_At_Position {

    /**
     * Deletes an element at the specified position of the array by creating a new array.
     *
     * @param array    The original array.
     * @param position The position of the element to be removed.
     * @return A new array with the element removed from the specified position.
     * @throws IllegalArgumentException If the position is invalid.
     */
    public static int[] deleteAtPosition(int[] array, int position) {
        // Validate position
        if (position < 0 || position >= array.length) {
            throw new IllegalArgumentException("Invalid position");
        }

        // Step 1: Create a new array with size one less than the original array
        int[] newArray = new int[array.length - 1];

        // Step 2: Copy elements before the specified position
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Step 3: Copy elements after the specified position, shifting them left
        for (int i = position + 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }

        // Return the new array
        return newArray;
    }

    /**
     * The entry point of the application. Demonstrates deleting an element from a specific position.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Step 1: Initialize the original array
        int[] numbers = {1, 2, 3, 4};

        // Step 2: Delete an element at position 2
        numbers = deleteAtPosition(numbers, 2);

        // Step 3: Print the updated array
        System.out.println("Array after deleting at position 2:");
        printArray(numbers);
    }

    /**
     * Prints the elements of the given integer array.
     *
     * @param array The array to be printed.
     */
    public static void printArray(int[] array) {
        // Print array elements in a formatted way
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Explanation:
 *
 * 1. **Validate Position**:
 *    - Ensure the position is within the valid range (0 to array.length - 1).
 *
 * 2. **Create a New Array**:
 *    - A new array of size (original length - 1) is created.
 *
 * 3. **Copy Elements Before Position**:
 *    - Elements before the specified position are copied into the new array.
 *
 * 4. **Skip the Element at Position**:
 *    - The element at the specified position is skipped.
 *
 * 5. **Copy Remaining Elements**:
 *    - Elements after the position are shifted left and copied into the new array.
 *
 * Why It Works:
 * By excluding the element at the specified position and shifting subsequent elements left,
 * we effectively remove the desired element. The original array remains unchanged,
 * and a new array is returned.
 *
 * Example Usage:
 * Original Array: {1, 2, 3, 4}
 * Position: 2
 * Result: {1, 2, 4}
 */
