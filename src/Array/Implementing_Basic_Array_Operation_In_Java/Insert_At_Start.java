package Array.Implementing_Basic_Array_Operation_In_Java;

/**
 * The {@code InsertAtStart} class demonstrates how to insert an element
 * at the start of a fixed-size array by creating a new array.
 */
public class Insert_At_Start {

    /**
     * Inserts an element at the start of the array by creating a new array.
     *
     * @param array   The original array.
     * @param element The element to be added.
     * @return A new array containing the new element at the start, followed by the original elements.
     */
    public static int[] insertAtStart(int[] array, int element) {
        // Step 1: Create a new array with a size one greater than the original array
        int[] newArray = new int[array.length + 1];

        // Step 2: Insert the new element at the first position
        newArray[0] = element;

        // Step 3: Copy all elements from the original array to the new array starting at index 1
        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        // Step 4: Return the new array
        return newArray;
    }

    /**
     * The entry point of the application. Demonstrates inserting an element at the start of an array.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Step 1: Initialize the original array
        int[] numbers = {1, 2, 3};

        // Step 2: Insert a new element at the start of the array
        numbers = insertAtStart(numbers, 0);

        // Step 3: Print the updated array
        System.out.println("Array after inserting at the start:");
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
 * 1. **Create a New Array**:
 *    - Since arrays in Java have fixed sizes, a new array with size (original length + 1) is created.
 *
 * 2. **Insert the New Element**:
 *    - The new element is added at index 0 (the start of the array).
 *
 * 3. **Shift Existing Elements**:
 *    - All elements from the original array are copied into the new array starting from index 1.
 *
 * 4. **Return the New Array**:
 *    - The original array remains unchanged, and a new array with the additional element is returned.
 *
 * Why It Works:
 * Inserting at the start of the array requires shifting all existing elements to the right
 * to make space for the new element. This demonstrates how manual resizing can be achieved
 * with fixed-size arrays.
 */
