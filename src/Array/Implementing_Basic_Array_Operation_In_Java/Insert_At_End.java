package Array.Implementing_Basic_Array_Operation_In_Java;

/**
 * The {@code InsertAtEnd} class demonstrates how to insert an element
 * at the end of a fixed-size array by creating a new array.
 */
public class Insert_At_End {

    /**
     * Inserts an element at the end of the array by creating a new array.
     *
     * @param array   The original array.
     * @param element The element to be added.
     * @return A new array containing all elements of the original array, plus the new element at the end.
     */
    public static int[] insertAtEnd(int[] array, int element) {
        // Step 1: Create a new array with a size one greater than the original array
        int[] newArray = new int[array.length + 1];

        // Step 2: Copy all elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // Step 3: Add the new element at the last position of the new array
        newArray[array.length] = element;

        // Step 4: Return the new array
        return newArray;
    }

    /**
     * The entry point of the application. Demonstrates inserting an element at the end of an array.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Step 1: Initialize the original array
        int[] numbers = {1, 2, 3};

        // Step 2: Insert a new element at the end of the array
        numbers = insertAtEnd(numbers, 4);

        // Step 3: Print the updated array
        System.out.println("Array after inserting at the end:");
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
 * 2. **Copy Elements**:
 *    - All elements from the original array are copied into the new array using a for loop.
 *
 * 3. **Add the New Element**:
 *    - The new element is placed at the last index of the new array.
 *
 * 4. **Return the New Array**:
 *    - The original array remains unchanged, and a new array with the additional element is returned.
 *
 * Why It Works:
 * Arrays in Java have a fixed size. By creating a larger array and copying existing elements,
 * we effectively "resize" the array. This demonstrates how dynamic resizing can be achieved manually.
 */