# Big-O Notation for Array Operations 🚀

Understanding the time complexity of array operations is crucial for writing efficient algorithms. **Big-O notation** describes the upper bound of the time an operation takes relative to the input size.

---

## 🛠️ Insertion Operations

### 1. Insert at End (Append) ➡️ **O(1)** *(Amortized)*
**Why:**
- If the array has space, inserting at the end is a direct operation.
- However, if the array is full, resizing is required. This involves creating a new array and copying elements (**O(n)**), but this happens **infrequently**.
- Hence, the **amortized complexity** is **O(1)**.

### 2. Insert at Start ⬅️ **O(n)**
**Why:**
- All existing elements need to be shifted one position to the **right** to accommodate the new element at the start.

### 3. Insert at Arbitrary Position 📍 **O(n)**
**Why:**
- Similar to inserting at the start, elements from the insertion point to the end need to be **shifted** to make space for the new element.

---

## 🗑️ Deletion Operations

### 1. Delete from End ➡️ **O(1)**
**Why:**
- Simply **reduces the size counter**; no shifting of elements is required.

### 2. Delete from Start ⬅️ **O(n)**
**Why:**
- All elements need to be shifted one position to the **left** to fill the gap left by the removed element.

### 3. Delete from Arbitrary Position 📍 **O(n)**
**Why:**
- Similar to deletion from the start, elements after the deletion point must be **shifted left**.

---

## 🔍 Searching Operations

### 1. Search by Value 🔎 **O(n)**
**Why:**
- In the **worst case**, you may need to inspect **every element** to find the desired value.

### 2. Access by Index 🎯 **O(1)**
**Why:**
- Direct calculation of the element's address allows **immediate access**.

---

## 🎯 Summary Table

| Operation                   | Complexity | Reasoning                                              |
|-----------------------------|------------|-------------------------------------------------------|
| **Insert at End**           | **O(1)**   | Direct insertion unless resizing is required          |
| **Insert at Start**         | **O(n)**   | All elements must shift right                         |
| **Insert at Arbitrary**     | **O(n)**   | Shifting elements to the right                       |
| **Delete from End**         | **O(1)**   | Direct size reduction                                 |
| **Delete from Start**       | **O(n)**   | All elements must shift left                          |
| **Delete at Arbitrary**     | **O(n)**   | Shifting elements to the left                        |
| **Search by Value**         | **O(n)**   | Checking each element in the worst case               |
| **Access by Index**         | **O(1)**   | Direct address calculation                            |

---

🚀 Understanding these complexities will help you design more efficient algorithms when working with arrays!
