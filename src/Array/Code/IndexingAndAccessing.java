package Array.Code;

/**
 * The {@code IndexingAndAccessing} class demonstrates how to access and modify elements in an array using indexing.
 */
public class IndexingAndAccessing {

    /**
     * The entry point of the application. Demonstrates accessing and modifying array elements.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize an integer array with 5 elements
        int[] numbers = new int[5];

        // Accessing an element (default value is 0)
        int firstNumber = numbers[0]; // Accesses the first element
        System.out.println("First Element (default): " + firstNumber);

        // Modifying an element
        numbers[2] = 10; // Sets the third element to 10
        System.out.println("Updated Third Element: " + numbers[2]);

        // Printing all array elements
        System.out.println("Array Contents:");
        printArray(numbers);
    }

    /**
     * Prints the elements of the given integer array.
     *
     * @param array the array to be printed
     */
    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

/*
Why It Works:

Arrays are stored in contiguous memory locations. Accessing an element by index involves calculating its memory address
using the formula:

    address = base_address + (index * size_of_element)

This allows constant-time access (O(1)) to any element in the array.
*/
