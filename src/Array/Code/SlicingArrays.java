package Array.Code;

import java.util.Arrays;

/**
 * The {@code SlicingArrays} class demonstrates how to create a subarray (slice) from an existing array.
 */
public class SlicingArrays {

    /**
     * The entry point of the application. Demonstrates slicing an array using the {@code Arrays.copyOfRange} method.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Original array
        int[] original = {1, 2, 3, 4, 5};

        // Create a slice of the array (from index 1 to 3, inclusive of 1, exclusive of 4)
        int[] slice = Arrays.copyOfRange(original, 1, 4);

        // Print the sliced array
        System.out.println("Sliced Array:");
        System.out.println(Arrays.toString(slice));
    }
}

/*
Why It Works:

The method Arrays.copyOfRange creates a new array and copies the specified range of elements
from the original array into it. This ensures that:

1. The original array remains unchanged.
2. A new array is created with the desired slice of elements.

Syntax:
    Arrays.copyOfRange(originalArray, startIndex, endIndex);

- startIndex: Inclusive.
- endIndex: Exclusive.
*/
