package Array.Code;

/**
 * The {@code ArrayStructure} class demonstrates the basics of arrays in Java.
 * It initializes an array, assigns values, and shows how to access and modify array elements.
 */
public class ArrayStructure {

    /**
     * The entry point of the application. Initializes an array, assigns values,
     * and demonstrates basic operations on arrays.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize an integer array with 5 elements
        int[] numbers = new int[5];

        // Assign values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print array contents
        System.out.println("Array Contents:");
        printArray(numbers);

        // Accessing specific elements
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Last Element: " + numbers[4]);

        // Modifying an element
        numbers[2] = 35;
        System.out.println("\nAfter modifying the third element:");
        printArray(numbers);
    }

    /**
     * Prints the elements of the given array.
     *
     * @param array the integer array to be printed
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
