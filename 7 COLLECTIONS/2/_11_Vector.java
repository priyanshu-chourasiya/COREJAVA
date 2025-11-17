
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class _11_Vector {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.addElement(100);
        v.add(200);
        v.add(300);
        v.addElement(400);
        System.out.println(v);
        System.out.println("-----------------");
        Iterator itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("-----------------");
        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println("-----------------");
    }
}
/*
===========================================================
REVISION NOTES FOR PROGRAM: _11_Vector
===========================================================

1. OVERALL PURPOSE OF THE PROGRAM
---------------------------------
The program demonstrates how to:
- Create and populate a Vector.
- Traverse a Vector using two different cursor mechanisms:
    (a) Iterator
    (b) Enumeration
- Display the Vector contents in all three ways.


2. IMPORTANT CONCEPTS + THEIR ROLE IN THIS CODE
-----------------------------------------------

(1) Vector
----------
A legacy synchronized dynamic array that grows automatically.
Usage in this program:
- Stores a sequence of Integer objects (100, 200, 300, 400).
- Elements are added using both add() and addElement(), showing
  compatibility with old and new APIs.
- Provides iterator() and elements() methods to obtain cursors
  for traversal.

(2) addElement()
----------------
Legacy method of Vector to add an element at the end.
Usage here:
- Adds 100 and 400 to the Vector.

(3) add()
---------
Modern method for adding elements to collections.
Usage here:
- Adds 200 and 300 to the Vector.

(4) Iterator
------------
A fail-fast cursor used to traverse a collection in forward direction.
Usage in this program:
- Obtained via v.iterator().
- Used inside a while loop with hasNext() and next() to print elements.

(5) Enumeration
---------------
A legacy cursor used for forward-only traversal of older collections.
Usage in this program:
- Obtained via v.elements().
- Used inside a while loop with hasMoreElements() and nextElement() 
  to print all elements.

(6) System.out.println()
------------------------
Used multiple times to print:
- The entire Vector
- Separators ("-----------------")
- Individual elements during traversal.


3. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
--------------------------------------------------

- class _11_Vector:
    Holds the code demonstrating Vector traversal.

- main(String[] args):
    Entry point of the program; drives all actions.

- Vector v:
    A Vector instance storing four integer values.

- v.addElement(100), v.add(200), v.add(300), v.addElement(400):
    These four statements populate the Vector with elements.

- System.out.println(v):
    Prints the Vector in array-like format: [100, 200, 300, 400].

- Iterator itr = v.iterator():
    Creates an Iterator to traverse all elements in forward order.

- while(itr.hasNext()):
    Loop that continues as long as the iterator has more items.

- itr.next():
    Retrieves and prints each element during Iterator traversal.

- Enumeration e = v.elements():
    Creates an Enumeration to traverse the same Vector.

- while(e.hasMoreElements()):
    Loop that continues as long as Enumeration has more items.

- e.nextElement():
    Retrieves and prints each element during Enumeration traversal.


4. COMPLETE CONTROL-FLOW DESCRIPTION
------------------------------------

(1) Program starts in main().
(2) A new empty Vector "v" is created.
(3) Elements are added in the following sequence:
        100 → 200 → 300 → 400
(4) Entire Vector is printed as: [100, 200, 300, 400].
(5) A separator line is printed.
(6) An Iterator is obtained from the Vector.
(7) while-loop runs four times, printing:
        100
        200
        300
        400
(8) Another separator line is printed.
(9) An Enumeration is obtained from the Vector.
(10) while-loop runs four times, printing:
        100
        200
        300
        400
(11) Final separator line prints.
(12) Program ends.


5. EXACT OUTPUT PRODUCED WHEN EXECUTED
--------------------------------------
[100, 200, 300, 400]
-----------------
100
200
300
400
-----------------
100
200
300
400
-----------------


===========================================================
END OF REVISION NOTES
===========================================================
*/
