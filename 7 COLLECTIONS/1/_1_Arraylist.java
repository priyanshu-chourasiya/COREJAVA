
import java.util.ArrayList;


public class _1_Arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add("ABC");
        al.add(4.5);
        System.out.println(al);

        ArrayList al2 = new ArrayList<>();
        al2.add(10);
        al2.add(20);
        al2.add(0,33);
        al2.addAll(al);
        System.out.println(al2); // duplicates are allowed in Arraylist
        System.out.println(al2.containsAll(al));
        
    }
}
/*
 * arraylist - list - dynamic DS  
 * linkedlist
 * arraydeque
 * priority queue
 * treeset
 * hashset
 * linkedset
 */
/*
====================================================================
REVISION NOTES FOR _1_Arraylist PROGRAM
====================================================================

--------------------------------------------------------------------
1. WHAT THE PROGRAM DOES
--------------------------------------------------------------------
The program demonstrates:
• Creation of ArrayList objects without generics (raw type usage).  
• Adding different types of elements to an ArrayList.  
• Inserting an element at a specific index.  
• Merging two ArrayLists using addAll().  
• Checking whether one list contains all elements of another.  
It prints:
1. The content of the first ArrayList.
2. The content of the second ArrayList after inserting and merging.
3. The boolean result of containsAll().

--------------------------------------------------------------------
2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
(Only concepts actually used in the code)
--------------------------------------------------------------------

A. ArrayList  
   • A resizable array-based data structure.  
   • Supports dynamic growth and ordered storage.  
   • Allows duplicates and heterogeneous elements when using raw type.

B. add(Object element)  
   • Adds an element at the end of the ArrayList.  
   • Used to insert integers, a string, and a double into al.

C. add(int index, Object element)  
   • Inserts an element at a specified position.  
   • Used to insert 33 at index 0 in al2.

D. addAll(Collection c)  
   • Appends all elements of one collection to another.  
   • Used to merge al into al2.

E. containsAll(Collection c)  
   • Checks whether the calling list contains every element of c.  
   • Used to verify if al2 contains all elements originally inside al.

F. System.out.println()  
   • Prints the ArrayList contents and boolean result to the console.

--------------------------------------------------------------------
3. PURPOSE OF EACH VARIABLE, STRUCTURE, AND METHOD
--------------------------------------------------------------------

• Class _1_Arraylist  
  - Contains the main method demonstrating ArrayList operations.

• main(String[] args)  
  - Entry point where all ArrayList manipulations are performed.

• ArrayList al = new ArrayList<>();  
  - Creates a raw-type ArrayList.  
  - Purpose: Hold heterogeneous elements (Integer, String, Double).

• al.add(100), al.add(200), al.add("ABC"), al.add(4.5)  
  - Adds elements of different data types to al.

• System.out.println(al)  
  - Displays al's contents in insertion order.

• ArrayList al2 = new ArrayList<>();  
  - Creates another ArrayList to demonstrate insertion and merging.

• al2.add(10), al2.add(20)  
  - Adds two integers to al2.

• al2.add(0, 33)  
  - Inserts 33 at index 0; shifts existing elements to the right.

• al2.addAll(al)  
  - Appends all elements from al to al2.  
  - Demonstrates that duplicates and heterogeneous values are allowed.

• System.out.println(al2)  
  - Prints the merged list.

• System.out.println(al2.containsAll(al))  
  - Prints whether all elements from al exist inside al2.

--------------------------------------------------------------------
4. FULL CONTROL-FLOW OF THE PROGRAM
--------------------------------------------------------------------

Step 1: Execution begins at main().  
Step 2: ArrayList al is created.  
Step 3: Elements 100, 200, "ABC", and 4.5 are added.  
Step 4: The program prints al → [100, 200, ABC, 4.5].  
Step 5: ArrayList al2 is created.  
Step 6: Elements 10 and 20 are added.  
Step 7: 33 is inserted at index 0 → al2 becomes [33, 10, 20].  
Step 8: All elements of al are appended →  
        al2 becomes [33, 10, 20, 100, 200, ABC, 4.5].  
Step 9: al2 is printed.  
Step 10: containsAll(al) checks whether all elements of al appear in al2.  
Step 11: true is printed.  
Step 12: Program ends.

--------------------------------------------------------------------
5. EXACT OUTPUT PRODUCED
--------------------------------------------------------------------
[100, 200, ABC, 4.5]
[33, 10, 20, 100, 200, ABC, 4.5]
true

--------------------------------------------------------------------
6. NOTES ABOUT COMMENTED SECTION AT THE END
--------------------------------------------------------------------
The comment lists several Java collection framework classes:
• ArrayList  
• LinkedList  
• ArrayDeque  
• PriorityQueue  
• TreeSet  
• HashSet  
• LinkedHashSet  
These are not used in the program; they merely indicate collection types.

====================================================================
END OF REVISION NOTES
====================================================================
*/
