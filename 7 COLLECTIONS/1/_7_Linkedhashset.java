import java.util.LinkedHashSet;

public class _7_Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(50);
        lhs.add(150);
        lhs.add(25);
        lhs.add(75);
        lhs.add(125);
        lhs.add(125);
        lhs.add(175);  // duplicates are not allowed
        System.out.println(lhs); //order of insertion is there
    }
}
/*
===========================================
REVISION NOTES FOR _7_Linkedhashset PROGRAM
===========================================

1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------
This program creates a LinkedHashSet, inserts several integer values into it 
(including one duplicate attempt), and prints the set. A LinkedHashSet preserves 
the **order of insertion**, so elements appear in the same sequence in which they 
were added. The duplicate value (`125`) is ignored.


2. IMPORTANT CONCEPTS USED IN THE CODE
---------------------------------------

**LinkedHashSet**
- A hash table + doubly linked list hybrid.
- Stores only unique elements (duplicates are ignored).
- Maintains **insertion order** by linking elements together internally.
- Uses hashing for fast insertions/lookups and linking to preserve order.

**add(E element)**
- Inserts the given element into the set only if it does not already exist.
- Duplicate additions do nothing.

**System.out.println(lhs)**
- Prints the set in **exact insertion order** due to the linked list structure.


3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------

- **LinkedHashSet lhs = new LinkedHashSet()**
  Creates a LinkedHashSet that stores Integer elements using hashing + linked 
  ordering.

- **lhs.add(...)**
  Inserts integers in a specific order.  
  The second insertion of `125` has no effect because duplicates are not allowed.

- **System.out.println(lhs)**
  Prints the entire set while retaining the insertion order.


4. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
---------------------------------------------------

- **class _7_Linkedhashset**
  Program class containing the main logic.

- **main(String[] args)**
  Entry point where all operations occur.

- **LinkedHashSet lhs**
  Stores unique integers while preserving the sequence in which they were added.

- **lhs.add(100) ... lhs.add(175)**
  Populates the set with integer values.
  The second `lhs.add(125)` call is ignored because 125 already exists.

- **System.out.println(lhs)**
  Outputs the set with elements arranged in insertion order.


5. FULL CONTROL-FLOW (STEP-BY-STEP EXECUTION)
----------------------------------------------

1. Program enters `main`.
2. Creates an empty LinkedHashSet named `lhs`.
3. Adds integer `100`.
4. Adds integer `50`.
5. Adds integer `150`.
6. Adds integer `25`.
7. Adds integer `75`.
8. Adds integer `125`.
9. Attempts to add `125` again → ignored (duplicate).
10. Adds integer `175`.
11. Prints the LinkedHashSet displaying elements in the order they were inserted.
12. Program ends.


6. EXACT OUTPUT BEHAVIOR
-------------------------

Because LinkedHashSet preserves insertion order and ignores duplicates, the output is:

    [100, 50, 150, 25, 75, 125, 175]

This order is deterministic and always matches the order of first insertions.


===========================================
END OF REVISION NOTES
===========================================
*/
