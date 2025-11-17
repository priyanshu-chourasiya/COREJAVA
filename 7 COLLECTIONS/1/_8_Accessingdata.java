import java.util.ArrayList;

public class _8_Accessingdata {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        double d = (Integer)al.get(2);
        System.out.println(d);

        for(int i = 0; i < al.size();i++){
            System.out.print(al.get(i) + " ");
        }
        System.out.println("-------------------");
        for(Object o : al){
            System.out.print(o + " ");
        }
        System.out.println("-------------------");
        for(int i = 0; i < al.size();i++){
            Integer data = (Integer) al.get(i);
            System.out.println(data);
        }
        System.out.println("-------------------");
        for(int i = 0; i < al.size();i++){
            Integer data = (Integer) al.get(i);
            System.out.println(data);
            al.add(44); // infinte loop
            // concurrent modification
        }
    }
}
/*
===========================================
REVISION NOTES FOR _8_Accessingdata PROGRAM
===========================================

1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------
This program demonstrates different ways of accessing data from an ArrayList, 
including:
- Reading an element using get()
- Iterating with a traditional for-loop
- Iterating with an enhanced for-loop
- Type-casting retrieved values
- Showing how modifying a list inside a loop leads to an infinite loop

The program also prints values at each stage.


2. IMPORTANT CONCEPTS USED IN THE CODE
---------------------------------------

**ArrayList**
- A resizable array-based list that allows indexed access to elements.
- Supports random access in O(1) time.
- Allows duplicates and preserves insertion order.

**get(int index)**
- Retrieves an element at a specific position in the ArrayList.
- Used for random read access.

**Type Casting**
- Converting an Object (from a non-generic ArrayList) into a specific type 
  (Integer in this program).
- Necessary because the ArrayList is declared without generics.

**Enhanced For-Loop**
- Iterates over each element without using indices.
- Simplifies access when only reading data.

**Concurrent Modification**
- Occurs when the structure of a list is changed (add/remove) while iterating.
- In this program, adding inside a loop causes an infinite loop because size() 
  keeps increasing.


3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------

- **ArrayList al = new ArrayList<>()**
  Creates a dynamic list storing Integer objects (but treated as Object due to raw type).

- **al.add(…)**
  Adds four integers in order: 100, 200, 300, 400.

- **al.get(2)**
  Retrieves the third element (300), which is then cast to Integer and stored in `d`.

- **for (int i = 0; i < al.size(); i++)**
  Sequentially accesses elements using index-based iteration.

- **for (Object o : al)**
  Iterates through each element in reading mode.

- **al.add(44) inside the loop**
  Causes infinite loop behavior: with each iteration, al.size() increases, so 
  loop condition is never satisfied.


4. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
---------------------------------------------------

- **class _8_Accessingdata**
  The program class containing all demonstration logic.

- **main(String[] args)**
  Program entry point.

- **ArrayList al**
  Stores integer values and is used to demonstrate accessing and iterating techniques.

- **al.add(100), al.add(200), al.add(300), al.add(400)**
  Populates the list with four values in order.

- **double d = (Integer) al.get(2)**
  Retrieves the element at index 2 (300), casts it to Integer, then stores it as double.

- **System.out.println(d)**
  Prints 300.0.

- **First for-loop**
  Prints all elements using index-based access.

- **Enhanced for-loop**
  Prints each element in a simpler iteration style.

- **Third for-loop**
  Retrieves and prints each value using explicit casting within the loop.

- **Fourth for-loop**
  Prints elements but also adds new values during iteration.
  Adding to the list in each iteration prevents the loop from finishing.

- **System.out.println("-------------------")**
  Divider lines used to separate output sections.


5. FULL CONTROL-FLOW (STEP-BY-STEP EXECUTION)
----------------------------------------------

1. Program starts.
2. Creates ArrayList `al`.
3. Adds values: 100, 200, 300, 400.
4. Retrieves index 2 → value 300 → prints 300.0.
5. First loop prints: 100 200 300 400
6. Prints divider.
7. Enhanced loop prints: 100 200 300 400
8. Prints divider.
9. Third loop prints each value on a new line: 100, 200, 300, 400
10. Prints divider.
11. Fourth loop begins:
      - Iteration 1: prints 100, adds 44 → list grows
      - Iteration 2: prints 200, adds 44 → grows again
      - This continues forever because al.size() increases each iteration.
12. Program never terminates naturally due to infinite loop.


6. EXACT OUTPUT BEFORE INFINITE LOOP
-------------------------------------

The program outputs:

    300.0
    100 200 300 400 
    -------------------
    100 200 300 400 
    -------------------
    100
    200
    300
    400
    -------------------
    100
    200
    300
    400
    44
    44
    44
    ...

After this point, the output continues indefinitely as the loop never ends.


===========================================
END OF REVISION NOTES
===========================================
*/
