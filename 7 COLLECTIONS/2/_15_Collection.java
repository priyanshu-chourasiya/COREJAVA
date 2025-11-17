import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _15_Collection {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        List<Integer> l1= new LinkedList<>();
        
        List<Integer> l2 = Arrays.asList(10,20,30,40);
        System.out.println(l2);
    }
    pubic static Iterable<Integer> getIntegers(){
        // return new ArrayList<Integer>; // allowed
        return new TreeSet<Integer>; // allowed
    }
    pubic static List<Integer> getInteger(){
        return new ArrayList<Integer>; // allowed
        // return new TreeSet<Integer>; not allowed
    }
}
/*
===========================================================
REVISION NOTES FOR PROGRAM: _15_Collection
===========================================================

1. OVERALL PURPOSE OF THE PROGRAM
---------------------------------
This program demonstrates:
- Different ways to create List collections in Java.
- The difference between interface return types (Iterable, List).
- Why some return statements are allowed or disallowed depending on the return type.
- How Arrays.asList() creates a fixed-size list.


2. IMPORTANT CONCEPTS + THEIR ROLE IN THIS CODE
-----------------------------------------------

(1) List Interface
------------------
Represents an ordered collection.
Usage:
- `List<Integer> l = new ArrayList<>();`
- `List<Integer> l1 = new LinkedList<>();`
Both store Integer elements and demonstrate interface-based programming.

(2) ArrayList
-------------
Resizable array-based implementation of List.
Usage:
- l = new ArrayList<>()
- Returned in getInteger() because return type is List.

(3) LinkedList
--------------
Doubly linked list implementation of List.
Usage:
- l1 = new LinkedList<>()

(4) Arrays.asList()
--------------------
Creates a fixed-size List backed by an array.
Usage:
- `List<Integer> l2 = Arrays.asList(10,20,30,40);`
Printed directly, showing its elements.

(5) Iterable Interface
-----------------------
Topmost interface implemented by all Collection classes.
Usage:
- Return type of getIntegers()
- Allows returning any class that implements Iterable (ArrayList, TreeSet, etc.)

(6) Return Type Constraints
---------------------------
Java allows returning any object that IS-A the declared return type.

Usage:
- getIntegers() returns Iterable<Integer>
  → Allowed to return ArrayList or TreeSet (both implement Iterable)
- getInteger() returns List<Integer>
  → Allowed to return ArrayList (implements List)
  → Not allowed to return TreeSet (does NOT implement List)


3. PURPOSE OF EACH VARIABLE, METHOD, AND BLOCK
----------------------------------------------

MAIN METHOD
-----------
1) List<Integer> l = new ArrayList<>();
   - Creates an empty resizable list.

2) List<Integer> l1 = new LinkedList<>();
   - Creates an empty linked-list-based structure.

3) List<Integer> l2 = Arrays.asList(10,20,30,40);
   - Creates a fixed-size list with 4 elements.
   - Printed directly.

METHOD getIntegers()
--------------------
Return type: Iterable<Integer>
Purpose:
- To show that Iterable is a very flexible return type.
- Can return any class implementing Iterable (ArrayList, TreeSet, LinkedList, etc.)

METHOD getInteger()
-------------------
Return type: List<Integer>
Purpose:
- To demonstrate stricter return type rules.
- Only allows returning classes that implement List.
- ArrayList is allowed; TreeSet is not.


4. FULL CONTROL-FLOW EXPLANATION
---------------------------------

(1) Program starts in main().
(2) Creates an empty ArrayList l.
(3) Creates an empty LinkedList l1.
(4) Creates a fixed-size list l2 using Arrays.asList().
(5) Prints l2 → prints “[10, 20, 30, 40]”.
(6) Program ends (other methods not invoked).


5. EXACT OUTPUT PRODUCED
-------------------------
[10, 20, 30, 40]


6. NOTES ABOUT COMPILATION ISSUES IN THE SHOWN CODE
----------------------------------------------------
(Not suggestions—just factual observations)
- "pubic" should be "public".
- Missing parentheses in return statements such as:
     new ArrayList<Integer>()
     new TreeSet<Integer>()
- TreeSet import is missing.
- Semicolons are missing after constructors.

These are syntactic issues preventing compilation, but the revision notes above
describe the intended program behavior.


===========================================================
END OF REVISION NOTES
===========================================================
*/
