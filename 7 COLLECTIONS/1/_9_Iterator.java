import java.util.ArrayList;
import java.util.Iterator;

public class _9_Iterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        Iterator itr = al.iterator();
        while(itr.hasNext()){ // check data is there is next or not
            System.out.println(itr.next()); // print current data
        }
        System.out.println("-------------------");
        Iterator itr2 = al.iterator();
        while(itr2.hasNext()){ // check data is there is next or not
            System.out.println(itr2.next()); // print current data
            al.add(44);
            /*
             *  100
                200
                300
                400
                -------------------
                100
                Exception in thread "main" java.util.ConcurrentModificationException
                        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
                        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
                        at _9_Iterator.main(_9_Iterator.java:19)
                PS C:\Users\priyx\Desktop\COREJAVA\7 COLLECTIONS> 
             */
        }
    }
}
/*
===========================================
REVISION NOTES FOR _9_Iterator PROGRAM
===========================================

1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------
This program demonstrates how to access elements of an ArrayList using an Iterator.
It also shows that modifying the list (adding elements) during iteration causes a 
ConcurrentModificationException.


2. IMPORTANT CONCEPTS USED IN THE CODE
---------------------------------------

**ArrayList**
- A resizable array-based list that maintains insertion order.

**Iterator**
- A cursor that allows sequential traversal of a collection.
- Provides two main methods:
  - hasNext(): checks if more elements exist
  - next(): retrieves the next element
- Designed for safe traversal **as long as the collection is not structurally modified**.

**ConcurrentModificationException**
- Thrown when a collection is structurally modified (add/remove) while an Iterator 
  is actively iterating over it.
- Occurs because the iterator detects that the internal modification count changed.


3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------

- **ArrayList al = new ArrayList<>()**
  A dynamic list storing Integer objects.

- **Iterator itr = al.iterator()**
  Creates an iterator for reading elements.

- **itr.hasNext()**
  Checks if any elements remain for traversal.

- **itr.next()**
  Returns and moves the iterator to the next element.

- **al.add(44) during iteration**
  Causes concurrent modification because the iterator expects the list to remain 
  unchanged while iterating.


4. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
---------------------------------------------------

- **class _9_Iterator**
  Program class encapsulating iterator demonstration.

- **main(String[] args)**
  Entry point of the program.

- **ArrayList al**
  Stores integer data for iteration demonstration.

- **al.add(100)...al.add(400)**
  Populates the list with four Integer values.

- **Iterator itr**
  Used to safely traverse the list for the first time.

- **while (itr.hasNext())**
  Iterates and prints each element of the list.

- **Iterator itr2**
  A second iterator used to demonstrate unsafe modification.

- **al.add(44)**
  Structural modification during iteration → exception thrown.

- **System.out.println("-------------------")**
  Separator between the two output sections.


5. FULL CONTROL-FLOW (STEP-BY-STEP EXECUTION)
----------------------------------------------

1. Program begins execution.
2. Creates ArrayList `al`.
3. Adds 100, 200, 300, 400.
4. Creates first iterator `itr`.
5. Loop 1:
   - itr.hasNext() → true → print 100
   - itr.hasNext() → true → print 200
   - itr.hasNext() → true → print 300
   - itr.hasNext() → true → print 400
   - itr.hasNext() → false → exit loop
6. Prints separator.
7. Creates second iterator `itr2`.
8. Loop 2:
   - itr2.hasNext() → true → prints first element: 100
   - Executes al.add(44)
   - Iterator detects structural modification on next call
9. Next iteration:
   - itr2.hasNext() internally checks modification count → mismatch detected
10. Throws ConcurrentModificationException
11. Program terminates abruptly.


6. EXACT OUTPUT PRODUCED
-------------------------

The program prints the first full iteration normally:

    100
    200
    300
    400
    -------------------
    100

Immediately after printing 100 in the second loop, modifying the list causes:

    Exception in thread "main" java.util.ConcurrentModificationException

The exception message identifies ArrayList’s internal iterator check and the 
specific code line where it occurred.


===========================================
END OF REVISION NOTES
===========================================
*/
