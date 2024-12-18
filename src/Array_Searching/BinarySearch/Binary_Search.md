# 📘 **Binary Search**

Binary Search is an efficient algorithm for finding an element in a sorted array. It works by repeatedly dividing the search interval in half.

---

## 🧠 **Concept**

- **Start** with the entire array.
- **Find the middle element**:
    - If it matches the target, return its index.
    - If the target is smaller, reduce the search to the left half.
    - If the target is larger, reduce the search to the right half.
- **Repeat** until the target is found or the interval becomes empty.

---

## 🔍 **How It Works**

```plaintext
Array: [1, 3, 5, 7, 9, 11]
Target: 7

Step 1: Check middle (index 2, value 5).
         7 > 5 → Search right half.
Step 2: Check middle (index 4, value 9).
         7 < 9 → Search left half.
Step 3: Check middle (index 3, value 7).
         Match found at index 3.
```

---

## 💡 **Key Points**

- Requires a **sorted array**.
- Highly efficient for **large datasets**.
- Reduces search space by **half** in each step.

---

## 📈 **Time Complexity**

| **Case**       | **Complexity** |
|----------------|----------------|
| **Best Case**  | O(1)           |
| **Worst Case** | O(log n)       |
| **Average Case** | O(log n)     |

---

## 💾 **Space Complexity**

- **O(1)** (Iterative approach).

---

## 🔧 **Implementation**

```java
public class BinarySearch {

    /**
     * Performs a binary search for the target value in the given sorted array.
     *
     * @param arr    the sorted array to search in
     * @param target the value to find
     * @return the index of the target if found, otherwise -1
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sortedData = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int resultIndex = binarySearch(sortedData, target);

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
```

---

## 🎨 **Visual Representation**

```plaintext
Array: [1, 3, 5, 7, 9, 11]
Target: 7

Step 1: Middle element: 5 (index 2).
         7 > 5 → Search right half.
Step 2: Middle element: 9 (index 4).
         7 < 9 → Search left half.
Step 3: Middle element: 7 (index 3).
         Match found at index 3.
