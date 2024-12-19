# 📘 **Selection Sort**

Selection Sort is a straightforward comparison-based sorting algorithm. It divides the input list into two parts: a sorted subset and an unsorted subset. The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted subset and moves it to the end of the sorted subset.

---

## 🧠 **Concept**

- **Divide** the array into a **sorted** and **unsorted** portion.
- **Find** the smallest element in the unsorted portion.
- **Swap** it with the first element of the unsorted portion.
- **Move** the boundary between sorted and unsorted portions one step forward.
- **Repeat** until the entire array is sorted.

---

## 💡 **Key Points**

- Works on **unsorted arrays**.
- **Simple** and easy to implement.
- **Not stable** by default (unless modified).
- **Performance** is generally worse than more efficient algorithms like Quick Sort or Merge Sort.
- **Consistent** time complexity regardless of initial array state.

---

## 📈 **Time Complexity**

| **Case**          | **Complexity**           |
|-------------------|--------------------------|
| **Best Case**     | O(n²)                    |
| **Average Case**  | O(n²)                    |
| **Worst Case**    | O(n²)                    |

---

## 💾 **Space Complexity**

- **O(1)** (No extra space required; sorting is done in-place).

---

# 🔧 **Selection Sort Implementation**

Below is the Java implementation of the Selection Sort algorithm, including a visual representation of how the algorithm works.

---

## 🔍 **How It Works**

```plaintext
Array: [64, 25, 12, 22, 11]

First Pass:
Find the minimum element (11).
Swap 11 with 64.
Array becomes [11, 25, 12, 22, 64]

Second Pass:
Find the minimum element in [25, 12, 22, 64] → 12.
Swap 12 with 25.
Array becomes [11, 12, 25, 22, 64]

Third Pass:
Find the minimum element in [25, 22, 64] → 22.
Swap 22 with 25.
Array becomes [11, 12, 22, 25, 64]

Fourth Pass:
Find the minimum element in [25, 64] → 25.
No swap needed.
Array remains [11, 12, 22, 25, 64]

Array is now sorted.
```

---

## 💻 **Java Code Implementation**

```java
public class SelectionSort {

    /**
     * Sorts the input array in ascending order using the Selection Sort algorithm.
     *
     * @param arr the array of integers to be sorted
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted portion
        for (int i = 0; i < n - 1; i++) {
            // Assume the first element is the minimum
            int minIdx = i;

            // Find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            if (minIdx != i) {
                swap(arr, minIdx, i);
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
     * The main method to demonstrate the Selection Sort algorithm.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
```

---
