
import java.util.PriorityQueue;

public class _4_Priorityqueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>(); // min heap
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);
        //pq.add(450);

        System.out.println(pq); // BST // Min heap
        // duplicates are allowed
    }
}
/*
===========================================
REVISION NOTES FOR _4_Priorityqueue PROGRAM
===========================================

1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------
This program creates a PriorityQueue (which is a Min-Heap in Java) and inserts 
several integer values into it. It then prints the internal heap representation 
of the PriorityQueue.


2. IMPORTANT CONCEPTS USED IN THE CODE
---------------------------------------

**PriorityQueue**
- A PriorityQueue in Java is a data structure that stores elements in a heap-based
  priority ordering. By default, it is a **Min-Heap**, meaning the smallest element
  always has the highest priority.
- Internally implemented as a binary heap (an array-based complete binary tree).
- Does NOT maintain sorted order when printed; it shows the internal heap array.
- Removes elements in increasing order (smallest first).

**add(E element)**
- Inserts the given element into the PriorityQueue.
- Reorganizes the heap to maintain the min-heap property after each insertion.

**System.out.println(pq)**
- Prints the internal heap array representation, NOT the sorted order.


3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------

- **PriorityQueue pq = new PriorityQueue<>()**
  Creates a Min-Heap that stores integers. No comparator is passed, so natural 
  ordering (ascending) applies.

- **pq.add(...)**
  Each add call inserts the given integer into the heap. After each insertion,
  the PriorityQueue automatically performs "heapify-up" to maintain the 
  min-heap structure.

- **System.out.println(pq)**
  Prints the complete internal heap structure, showing how the min-heap is arranged
  after all insertions.


4. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
---------------------------------------------------

- **class _4_Priorityqueue**
  Defines the container for the program.

- **main method**
  Entry point of the program; performs all execution steps.

- **PriorityQueue pq**
  A data structure used to hold and organize the integer elements using min-heap rules.

- **pq.add(100), pq.add(50), pq.add(150), ...**
  Stepwise insertion of elements into the heap, triggering internal restructuring.

- **System.out.println(pq)**
  Displays the heap's internal array form after all insertions are complete.


5. FULL CONTROL-FLOW (STEP-BY-STEP EXECUTION)
----------------------------------------------

1. Program starts in the `main` method.
2. A PriorityQueue `pq` is created as an empty Min-Heap.
3. Value `100` is inserted → heap: [100].
4. Value `50`  is inserted → heap reorganizes → [50, 100].
5. Value `150` is inserted → heap: [50, 100, 150].
6. Value `25`  is inserted → rises to top → [25, 50, 150, 100].
7. Value `75`  is inserted → placed and adjusted → [25, 50, 150, 100, 75].
8. Value `125` is inserted → fits in heap → [25, 50, 125, 100, 75, 150].
9. Value `175` is inserted → added to bottom → [25, 50, 125, 100, 75, 150, 175].
10. The queue is printed. Java prints the internal heap array.
11. Program ends.


6. EXACT OUTPUT BEHAVIOR
-------------------------

When executed, `System.out.println(pq)` prints the internal representation of the 
PriorityQueue's min-heap after all insertions.

The output is typically similar to:

    [25, 50, 125, 100, 75, 150, 175]

(Note: The structure always maintains heap order, but array positions other than 
the root are not strictly sorted.)

This printed form represents the min-heap, **not** a sorted list.


===========================================
END OF REVISION NOTES
===========================================
*/
