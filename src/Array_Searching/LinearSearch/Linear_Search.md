# 📘 **Linear Search**

Linear Search is the simplest searching algorithm. It checks each element of the array sequentially until the target element is found or the array ends.

---

## 🧠 **Concept**

- **Start** from the first element of the array.
- **Compare** each element with the target.
- **If found**, return the index of the target element.
- **If not found**, continue to the next element.
- If all elements are checked and none match, return -1.

---

## 🔍 **How It Works**

```plaintext
Array: [4, 2, 7, 1, 9]
Target: 7

Step 1: Compare 4 (index 0) with 7 → Not a match.
Step 2: Compare 2 (index 1) with 7 → Not a match.
Step 3: Compare 7 (index 2) with 7 → Match found at index 2.
```

---

## 💡 **Key Points**

- Works on **unsorted arrays**.
- **Simple** and easy to implement.
- Ideal for **small datasets**.

---

## 📈 **Time Complexity**

| **Case**       | **Complexity**         |
|----------------|------------------------|
| **Best Case**  | O(1) (Target is the first element) |
| **Worst Case** | O(n) (Target is the last element or not present) |
| **Average Case** | O(n) |

---

## 💾 **Space Complexity**

- **O(1)** (No extra space required).

---

## 🔧 **Implementation**

```java
public class LinearSearch {

    /**
     * Performs a linear search for the target value in the given array.
     *
     * @param arr    the array to search in
     * @param target the value to find
     * @return the index of the target if found, otherwise -1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 7, 1, 9};
        int target = 7;
        int index = linearSearch(data, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
```

---

## 🎨 **Visual Representation**

```plaintext
Array: [4, 2, 7, 1, 9]
Target: 7

[4] → Not a match
[2] → Not a match
[7] → Match found at index 2
