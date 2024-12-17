package Array.Implementing_Basic_Array_Operation_In_Java;

/**
 * The {@code InsertAtPosition} class demonstrates how to insert an element
 * at a specified position in a fixed-size array by creating a new array.
 */
public class Insert_At_Position {

    /**
     * Inserts an element at the specified position of the array by creating a new array.
     *
     * @param array    The original array.
     * @param position The position where the new element should be inserted.
     * @param element  The element to be added.
     * @return A new array with the element inserted at the specified position.
     * @throws IllegalArgumentException If the position is invalid.
     */
    public static int[] insertAtPosition(int[] array, int position, int element) {
        // Validate position
        if (position < 0 || position > array.length) {
            throw new IllegalArgumentException("Invalid position");
        }

        // Step 1: Create a new array with a size one greater than the original array
        int[] newArray = new int[array.length + 1];

        // Step 2: Copy elements before the specified position
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Step 3: Insert the new element at the specified position
        newArray[position] = element;

        // Step 4: Copy the remaining elements after the position
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        // Return the new array
        return newArray;
    }

    /**
     * The entry point of the application. Demonstrates inserting an element at a specific position.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Step 1: Initialize the original array
        int[] numbers = {1, 2, 4};

        // Step 2: Insert a new element at position 2
        numbers = insertAtPosition(numbers, 2, 3);

        // Step 3: Print the updated array
        System.out.println("Array after inserting at position 2:");
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
 *    - Ensure the position is within the valid range (0 to array.length).
 *
 * 2. **Create a New Array**:
 *    - A new array of size (original length + 1) is created.
 *
 * 3. **Copy Elements Before Position**:
 *    - Elements from the original array before the specified position are copied.
 *
 * 4. **Insert New Element**:
 *    - The new element is inserted at the specified position.
 *
 * 5. **Copy Remaining Elements**:
 *    - Elements after the position are shifted and copied into the new array.
 *
 * Why It Works:
 * By splitting the array into two parts—before and after the insertion point—we can seamlessly
 * insert the new element. The original array remains unchanged, and a new array is returned.
 *
 * Example Usage:
 * Original Array: {1, 2, 4}
 * Position: 2
 * New Element: 3
 * Result: {1, 2, 3, 4}
 */
