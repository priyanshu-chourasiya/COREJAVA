
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;


public class _10_Failsafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList al = new CopyOnWriteArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        System.out.println(al);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            al.add(44);
        }
        System.out.println("----------");
        ListIterator li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
            //al.add(44);
        }
        System.out.println("----------");
        ListIterator li2 = al.listIterator();
        while(li2.hasNext()){
            System.out.println(li2.next());
            //al.add(44);
        }
        System.out.println("----------");
        ListIterator li3 = al.listIterator(al.size()); 
        while(li3.hasPrevious()){
            System.out.println(li3.previous());
            //al.add(44);
        }
        System.out.println("----------");
    }
}
/*
===========================================
REVISION NOTES FOR _10_Failsafe PROGRAM
===========================================

1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------
This program demonstrates fail-safe iteration using CopyOnWriteArrayList.
It shows:
- Iteration using Iterator (fail-safe behavior)
- Iteration using ListIterator (forward and backward)
- That modifications during iteration do NOT cause ConcurrentModificationException
  when using CopyOnWriteArrayList.
The program prints the list multiple times in different traversal directions.


2. IMPORTANT CONCEPTS USED IN THE CODE
---------------------------------------

**CopyOnWriteArrayList**
- A thread-safe variant of ArrayList.
- Uses a **copy-on-write** mechanism: each structural modification creates a new copy.
- Iterators are **fail-safe** because they traverse an immutable snapshot of the list.
- Modifications during iteration DO NOT affect the iterator's current traversal.

**Iterator**
- Used for forward, one-way traversal.
- With CopyOnWriteArrayList, it is fail-safe and does not detect modifications.

**ListIterator**
- Supports bidirectional traversal (next() and previous()).
- Also fail-safe in CopyOnWriteArrayList.
- The method **listIterator(al.size())** creates an iterator starting at the end.

**hasNext(), next(), hasPrevious(), previous()**
- Methods used to move the iterator forwards or backwards.

  
3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------

- **CopyOnWriteArrayList al = new CopyOnWriteArrayList<>()**
  Creates a fail-safe, thread-safe list storing Integer values.

- **al.add(…)**
  Adds initial integers and later adds 44 multiple times.

- **Iterator itr = al.iterator()**
  Creates a fail-safe iterator working on a snapshot of the list.

- **itr.hasNext() / itr.next()**
  Reads elements from the snapshot; new additions do NOT appear during this iteration.

- **ListIterator li = al.listIterator()**
  Creates a fail-safe iterator supporting forward traversal.

- **ListIterator li2 = al.listIterator()**
  Another forward traversal after new elements have been added.

- **ListIterator li3 = al.listIterator(al.size())**
  Creates a bidirectional iterator starting at the last index to traverse backwards.


4. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
---------------------------------------------------

- **class _10_Failsafe**
  Contains the fail-safe iteration demonstration.

- **main(String[] args)**
  Entry point of execution.

- **CopyOnWriteArrayList al**
  Primary collection used to show safe concurrent modifications.

- **Iterator itr**
  Used to iterate through the original snapshot of the list.

- **ListIterator li, li2**
  Used to traverse the updated list forward.

- **ListIterator li3**
  Used for backward traversal starting from the end.

- **al.add(44)** inside iterator loop
  Demonstrates that modifications do not interfere with fail-safe iteration.


5. FULL CONTROL-FLOW (STEP-BY-STEP EXECUTION)
----------------------------------------------

1. Program begins.
2. Creates CopyOnWriteArrayList `al`.
3. Adds: 100, 200, 300, 400.
4. Prints: `[100, 200, 300, 400]`.

--- ITERATOR SECTION ---
5. Creates `itr` (snapshot iterator).
6. Loop through snapshot:
   - Prints 100 → adds 44 to the live list
   - Prints 200 → adds another 44
   - Prints 300 → adds another 44
   - Prints 400 → adds another 44
   *Snapshot does NOT include 44s.*

--- LISTITERATOR (FORWARD 1) ---
7. Prints all elements including newly added 44s.

--- LISTITERATOR (FORWARD 2) ---
8. Prints all current elements again (same as previous section).

--- LISTITERATOR (BACKWARD) ---
9. Starts from the end using listIterator(al.size()).
10. Traverses backward and prints every element in reverse order.

Program ends.


6. EXACT OUTPUT BEHAVIOR
-------------------------

Initial print:

    [100, 200, 300, 400]

Iterator (snapshot, no 44s included):

    100
    200
    300
    400
    ----------

Forward ListIterator after additions:

    100
    200
    300
    400
    44
    44
    44
    44
    ----------

Second forward ListIterator:

    100
    200
    300
    400
    44
    44
    44
    44
    ----------

Backward ListIterator:

    44
    44
    44
    44
    400
    300
    200
    100
    ----------


===========================================
END OF REVISION NOTES
===========================================
*/
