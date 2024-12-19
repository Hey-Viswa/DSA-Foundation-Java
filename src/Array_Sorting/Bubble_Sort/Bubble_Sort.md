# 📘 **Bubble Sort**

Bubble Sort is one of the simplest sorting algorithms. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process continues until the list is sorted.

---

## 🧠 **Concept**

- **Repeatedly** compare each pair of adjacent elements.
- **Swap** them if they are in the wrong order.
- After each pass, the largest unsorted element "bubbles up" to its correct position.
- **Repeat** the process for the remaining unsorted elements until the entire array is sorted.

---

## 💡 **Key Points**

- Works on **unsorted arrays**.
- **Simple** and easy to implement.
- **Stable** sorting algorithm (maintains the relative order of equal elements).
- **Optimized versions** can detect if the array is already sorted to reduce unnecessary passes.

---

## 📈 **Time Complexity**

| **Case**          | **Complexity**                           |
|-------------------|------------------------------------------|
| **Best Case**     | O(n) (when the array is already sorted)  |
| **Average Case**  | O(n²)                                    |
| **Worst Case**    | O(n²)                                    |

---

## 💾 **Space Complexity**

- **O(1)** (No extra space required; sorting is done in-place).

---

## 🔍 **How It Works**

1. Start with an unsorted array: `[5, 1, 4, 2, 8]`.
2. **First Pass:**
    - Compare `5` and `1`: Swap → `[1, 5, 4, 2, 8]`
    - Compare `5` and `4`: Swap → `[1, 4, 5, 2, 8]`
    - Compare `5` and `2`: Swap → `[1, 4, 2, 5, 8]`
    - Compare `5` and `8`: No Swap
    - **Array after first pass:** `[1, 4, 2, 5, 8]`

3. **Second Pass:**
    - Compare `1` and `4`: No Swap
    - Compare `4` and `2`: Swap → `[1, 2, 4, 5, 8]`
    - Compare `4` and `5`: No Swap
    - Compare `5` and `8`: No Swap
    - **Array after second pass:** `[1, 2, 4, 5, 8]`

4. No swaps needed in subsequent passes; the array is sorted.

---

## 💻 **Java Code Implementation**

```java
public class BubbleSort {

    /**
     * Sorts the input array in ascending order using the Bubble Sort algorithm.
     *
     * @param arr the array of integers to be sorted
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Traverse through all elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    /**
     * Swaps two elements in the array at the specified indices.
     *
     * @param arr the array containing the elements
     * @param i   the index of the first element
     * @param j   the index of the second element
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Prints the elements of the array to the console.
     *
     * @param arr the array to be printed
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * The main method to demonstrate the Bubble Sort algorithm.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
