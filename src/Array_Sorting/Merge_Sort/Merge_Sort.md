# 📘 **Merge Sort**

Merge Sort is a popular divide-and-conquer algorithm used to sort arrays. It works by recursively dividing the array into halves, sorting each half, and then merging the sorted halves back together.

---

## 🧠 **Concept**

1. **Divide**: Split the array into two halves until each half has one element.
2. **Conquer**: Recursively sort each half.
3. **Merge**: Combine the two sorted halves into one sorted array.

---

## 🔍 **How It Works**

```plaintext
Array: [5, 4, 3, 2, 1]

Step 1: Divide
    [5, 4, 3, 2, 1] → [5, 4] and [3, 2, 1]
    [5, 4] → [5] and [4]
    [3, 2, 1] → [3] and [2, 1]
    [2, 1] → [2] and [1]

Step 2: Conquer (Sort Halves)
    [5] and [4] → [4, 5]
    [2] and [1] → [1, 2]
    [3] → [3]

Step 3: Merge
    [4, 5] and [3, 1, 2]
        → [1, 2, 3, 4, 5]
```

---

## 💡 **Key Points**

- **Stable sorting algorithm**: Maintains the order of equal elements.
- Best suited for **large datasets**.
- Uses extra space for merging arrays.

---

## 📈 **Time Complexity**

| **Case**       | **Complexity** |
|----------------|----------------|
| **Best Case**  | O(n log n)     |
| **Worst Case** | O(n log n)     |
| **Average Case** | O(n log n)   |

---

## 💾 **Space Complexity**

- **O(n)**: Due to temporary arrays used for merging.

---

## 🔧 **Implementation**

```java
import java.util.*;

/**
 * The {@code Mergesort} class implements the merge sort algorithm.
 *
 * <p>Merge Sort is a divide-and-conquer algorithm that recursively splits an array,
 * sorts the smaller arrays, and merges them back together into a sorted array.
 */
public class Mergesort {

    /**
     * Main method to demonstrate merge sort.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Recursively sorts an array using the merge sort algorithm.
     *
     * @param arr the array to be sorted
     * @return a sorted array
     */
    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    /**
     * Merges two sorted arrays into one sorted array.
     *
     * @param first  the first sorted array
     * @param second the second sorted array
     * @return a merged sorted array
     */
    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from first array, if any
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Copy remaining elements from second array, if any
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
```

---

## 🎨 **Visual Representation**

```plaintext
Initial Array: [5, 4, 3, 2, 1]

Step 1: Divide
    [5, 4, 3, 2, 1] → [5, 4] and [3, 2, 1]
    [5, 4] → [5] and [4]
    [3, 2, 1] → [3] and [2, 1]
    [2, 1] → [2] and [1]

Step 2: Conquer (Sort Halves)
    [5] and [4] → [4, 5]
    [2] and [1] → [1, 2]
    [3] → [3]

Step 3: Merge
    [4, 5] and [1, 2, 3]
        → [1, 2, 3, 4, 5]
```

---

## 🚀 **Key Takeaways**

- Merge Sort divides the array into halves, sorts them recursively, and merges the sorted halves.
- It is efficient for large datasets but requires additional memory for merging.
