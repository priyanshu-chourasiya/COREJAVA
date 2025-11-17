
import java.util.ArrayList;
import java.util.Collections;

public class _16_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(50);
        list.add(150);
        list.add(25);
        list.add(75);
        list.add(125);
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        System.out.println("------------------");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Orange");
        list1.add("Banana");   
        list1.add("Grapes");
        System.out.println(list1);
        Collections.sort(list1);
    }
}
/*
===========================================================
REVISION NOTES FOR PROGRAM: _16_Collections
===========================================================

1. OVERALL PURPOSE OF THE PROGRAM
---------------------------------
This program demonstrates:
- How to store elements in an ArrayList.
- How the Collections.sort() method sorts lists of Comparable elements.
- How sorting works for Integer and String lists.
- The difference between original ordering and sorted ordering.


2. IMPORTANT CONCEPTS + THEIR ROLE IN THIS CODE
-----------------------------------------------

(1) ArrayList
-------------
A resizable list used to store ordered elements.
Usage:
- list  → stores Integer values.
- list1 → stores String values.
Both are sorted using Collections.sort().

(2) Collections.sort()
----------------------
A utility method that sorts a List in ascending order.
Internally uses natural ordering defined by the Comparable interface.

Usage:
- Sorts Integer list numerically: 25, 50, 75, 100, 125, 150.
- Sorts String list alphabetically (lexicographically): Apple, Banana, Grapes, Orange.

(3) Comparable Interface (Implicit)
-----------------------------------
Defines natural ordering.
Usage:
- Integer implements Comparable<Integer>, so numeric sorting works.
- String implements Comparable<String>, so alphabetical sorting works.
- No custom comparator is used; natural ordering is applied.

(4) System.out.println()
------------------------
Used multiple times to print:
- Original list
- Sorted list
- Separator line
- The String list before sorting


3. PURPOSE OF EACH VARIABLE, METHOD, AND BLOCK
----------------------------------------------

- ArrayList<Integer> list:
  Holds six unsorted integer values.

- list.add(...):
  Inserts integer values in unsorted order.

- Collections.sort(list):
  Sorts the Integer list in ascending numeric order.

- ArrayList<String> list1:
  Holds a list of fruit names.

- list1.add(...):
  Inserts String values in arbitrary order.

- Collections.sort(list1):
  Sorts strings alphabetically.

- Printed lines:
  Show original vs. sorted results and allow comparing both outputs.


4. FULL CONTROL-FLOW EXPLANATION
---------------------------------

(1) Program starts in main().
(2) Integer list is created and populated with:
      100, 50, 150, 25, 75, 125
(3) Original list is printed:
      [100, 50, 150, 25, 75, 125]
(4) Collections.sort(list) sorts the elements numerically.
(5) Sorted list is printed:
      [25, 50, 75, 100, 125, 150]
(6) Separator line prints.
(7) String list (list1) is created and filled with:
      Apple, Orange, Banana, Grapes
(8) The list1 is printed before sorting.
(9) Collections.sort(list1) sorts strings alphabetically.
(10) Program ends (sorted list1 is not printed).


5. EXACT OUTPUT PRODUCED
-------------------------
Original List: [100, 50, 150, 25, 75, 125]
Sorted List: [25, 50, 75, 100, 125, 150]
------------------
[Apple, Orange, Banana, Grapes]


===========================================================
END OF REVISION NOTES
===========================================================
*/
