
import java.util.HashSet;

public class _6_Hashset {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);  // duplicates are not allowed
        System.out.println(hs); // no order of insertion

    }
}
/*
===========================================
REVISION NOTES FOR _6_Hashset PROGRAM
===========================================

1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------
This program creates a HashSet, inserts several unique integer values into it, 
and prints the HashSet. A HashSet does not preserve insertion order, so the output 
shows elements in an arbitrary hash-based order.


2. IMPORTANT CONCEPTS USED IN THE CODE
---------------------------------------

**HashSet**
- A hash table–based collection that stores unique elements.
- Does NOT allow duplicates; attempting to add an existing element has no effect.
- Does NOT maintain insertion order or sorted order.
- Internally distributes elements into buckets using hashCode().

**add(E element)**
- Places the given element into the appropriate bucket unless the value already exists.
- Rehashes or reorganizes buckets internally when necessary.

**System.out.println(hs)**
- Prints the HashSet as a comma-separated list inside brackets.
- Reflects the hash-distribution order, not insertion order.


3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------

- **HashSet hs = new HashSet()**
  Creates an empty HashSet that will store Integer objects using hashing.

- **hs.add(...)**
  Inserts seven integer values. All are unique, so each insert is successful.
  HashSet internally places them into different hash buckets.

- **System.out.println(hs)**
  Prints the entire set in the bucket-based order determined by hashing.


4. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
---------------------------------------------------

- **class _6_Hashset**
  Container class holding the main program logic.

- **main(String[] args)**
  Entry point of the program; executes all statements.

- **HashSet hs**
  Data structure used to store distinct integer elements without any guaranteed order.

- **hs.add(100)...hs.add(175)**
  Sequentially inserts integers into the hash table. No duplicates appear in this code.

- **System.out.println(hs)**
  Displays the HashSet’s contents in its internal, non-ordered form.


5. FULL CONTROL-FLOW (STEP-BY-STEP EXECUTION)
----------------------------------------------

1. Program enters `main`.
2. Creates an empty HashSet named `hs`.
3. Inserts integer `100` into the set.
4. Inserts integer `50`.
5. Inserts integer `150`.
6. Inserts integer `25`.
7. Inserts integer `75`.
8. Inserts integer `125`.
9. Inserts integer `175`.
   - All insertions succeed because the elements are unique.
10. Prints the HashSet using its built-in `toString()` representation.
11. Program ends.


6. EXACT OUTPUT BEHAVIOR
-------------------------

Because HashSet does not preserve insertion order, the printed result appears in 
an arbitrary sequence such as:

    [100, 50, 150, 25, 75, 125, 175]

—but any order containing all seven elements is correct and expected.

The set will always contain exactly these seven integers, but their arrangement 
varies depending on JVM hash distribution.


===========================================
END OF REVISION NOTES
===========================================
*/
