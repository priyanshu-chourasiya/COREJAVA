
import java.util.ArrayDeque;

public class _3_Arraydequeue {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque<>();
        ad1.add(10);
        ad1.add(12);
        ad1.add(15);
        ad1.add(48);
        ad1.add("ANC");
        System.out.println(ad1);// duplicates are allowed
    }
}
/*
====================================================================
REVISION NOTES FOR _3_Arraydequeue PROGRAM
====================================================================

--------------------------------------------------------------------
1. WHAT THE PROGRAM DOES
--------------------------------------------------------------------
The program demonstrates:
• Creation of an ArrayDeque using raw type  
• Adding multiple elements of different data types  
• Printing the contents of the ArrayDeque  

It shows that ArrayDeque preserves insertion order and allows heterogeneous
elements when raw type is used.

--------------------------------------------------------------------
2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
(Only concepts actually used in the code)
--------------------------------------------------------------------

A. ArrayDeque  
   • A resizable, array-based implementation of the Deque interface.  
   • Supports operations at both ends with efficient performance.  
   • When created as a raw type, it can store heterogeneous elements.  
   • Does NOT allow null elements (not tested in this program).

B. add(Object e)  
   • Inserts the element at the tail of the deque.  
   • Used repeatedly to add integers and one string.

C. System.out.println()  
   • Prints the contents of the deque.  
   • ArrayDeque prints elements in insertion order.

--------------------------------------------------------------------
3. PURPOSE OF EACH VARIABLE, STRUCTURE, AND METHOD
--------------------------------------------------------------------

• Class _3_Arraydequeue  
  - Contains the main method showing ArrayDeque operations.

• main(String[] args)  
  - Executes the deque operations and printing.

• ArrayDeque ad1 = new ArrayDeque<>();  
  - Creates an empty deque using raw type, allowing mixed element types.

• ad1.add(10), ad1.add(12), ad1.add(15), ad1.add(48)  
  - Appends four integer elements in order.

• ad1.add("ANC")  
  - Adds a String element, demonstrating heterogeneous insertion.

• System.out.println(ad1)  
  - Displays the deque's contents in insertion order.

--------------------------------------------------------------------
4. FULL CONTROL-FLOW OF THE PROGRAM
--------------------------------------------------------------------

Step 1: Program starts execution at main().  
Step 2: An empty ArrayDeque ad1 is created.  
Step 3: Elements 10, 12, 15, and 48 are added sequentially.  
Step 4: "ANC" is added at the end of the deque.  
Step 5: The deque contents are printed as one complete structure.  
Step 6: Program ends.

--------------------------------------------------------------------
5. EXACT OUTPUT PRODUCED
--------------------------------------------------------------------
[10, 12, 15, 48, ANC]

--------------------------------------------------------------------
6. COMMENTED NOTE FROM THE CODE
--------------------------------------------------------------------
The comment “duplicates are allowed” refers to:
• ArrayDeque permits duplicate values  
• It does NOT enforce uniqueness  

====================================================================
END OF REVISION NOTES
====================================================================
*/
