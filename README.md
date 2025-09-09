# Binary Heap (Java Implementation)

A generic **max binary heap** implementation in Java with a simple demo and a full JUnit test suite.

---

## 📖 Overview
This project implements a binary heap using an `ArrayList` as the underlying data structure.  
The heap maintains the **max-heap property**, ensuring that the largest element is always at the root.

It is useful for priority-based retrieval, scheduling, and ordering tasks where efficient insert and remove operations are required.

---

## ✨ Features
- Generic max binary heap (`BinaryHeap<T extends Comparable<T>>`)
- Supports:
  - `insert()` – add an element while maintaining heap order (bubble-up)
  - `remove()` – remove and return the maximum element (bubble-down)
  - `peek()` – view the maximum element without removing it
  - `size()`, `isEmpty()`, and `clear()` utility operations
- Works with any type that implements `Comparable`
- Includes:
  - `Main.java` – demonstration with strings and integers
  - `BinaryHeapTest.java` – JUnit test suite for correctness and edge cases

---

## 📂 Project Structure
