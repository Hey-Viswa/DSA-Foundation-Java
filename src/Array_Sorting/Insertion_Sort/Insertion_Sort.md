# 📘 **Insertion Sort**

Insertion Sort is a simple and intuitive sorting algorithm that builds the final sorted array one item at a time. It's much less efficient on large lists compared to more advanced algorithms like Quick Sort or Merge Sort, but it has advantages for small data sets and is stable.

---

## 🧠 **Concept**

- **Build** the sorted array one element at a time.
- **Start** from the second element, treating the first element as the initial sorted portion.
- **Compare** the current element with the elements before it.
- **Shift** all elements greater than the current element one position to the right.
- **Insert** the current element into its correct position.
- **Repeat** until the entire array is sorted.

---

## 💡 **Key Points**

- Works on **unsorted arrays**.
- **Simple** and easy to implement.
- **Efficient** for small or nearly sorted datasets.
- **Stable** sorting algorithm.
- **Online algorithm** (can sort a list as it receives it).

---

## 📈 **Time Complexity**

| **Case**          | **Complexity**                                        |
|-------------------|-------------------------------------------------------|
| **Best Case**     | O(n) (when the array is already sorted)               |
| **Average Case**  | O(n²)                                                  |
| **Worst Case**    | O(n²)                                                  |

---

## 💾 **Space Complexity**

- **O(1)** (No extra space required; sorting is done in-place).

---

# 🔧 **Insertion Sort Implementation**

Below is the Java implementation of the Insertion Sort algorithm, including a visual representation of how the algorithm works.

---

## 🔍 **How It Works**

```plaintext
Array: [12, 11, 13, 5, 6]

First Pass (i=1):
Compare 11 with 12 → Swap
Array becomes [11, 12, 13, 5, 6]

Second Pass (i=2):
Compare 13 with 12 → No Swap
Array remains [11, 12, 13, 5, 6]

Third Pass (i=3):
Compare 5 with 13 → Shift 13 to the right
Compare 5 with 12 → Shift 12 to the right
Compare 5 with 11 → Shift 11 to the right
Insert 5 at position 0
Array becomes [5, 11, 12, 13, 6]

Fourth Pass (i=4):
Compare 6 with 13 → Shift 13 to the right
Compare 6 with 12 → Shift 12 to the right
Compare 6 with 11 → Shift 11 to the right
Insert 6 at position 1
Array becomes [5, 6, 11, 12, 13]
```

---

## 💻 **Java Code Implementation**

```java
public class InsertionSort {

    /**
     * Sorts the input array in ascending order using the Insertion Sort algorithm.
     *
     * @param arr the array of integers to be sorted
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1)
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
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
     * The main method to demonstrate the Insertion Sort algorithm.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
```

---
