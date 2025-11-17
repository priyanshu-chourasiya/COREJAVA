import java.util.LinkedList;
public class _2_Linkedlist {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList<>();
        ll1.add(45);
        ll1.add("java");
        ll1.add(7.5);
        ll1.addFirst(455);
        ll1.addLast(78);
        ll1.add(2,11);
        System.out.println(ll1);
        //ll1.clear();
        //System.out.println(ll1);
        System.out.println(ll1.contains(45));
        ll1.offer("DevOps");
        System.out.println(ll1);
        ll1.offer("HELLO");
        System.out.println(ll1);
        ll1.offerFirst("Sprint");
        System.out.println(ll1);
        System.out.println(ll1.peek());
        System.out.println(ll1.peekLast());
        System.out.println(ll1.poll()); // removes first element
        System.out.println(ll1); // duplicates are allowed
    }
}
/*
====================================================================
REVISION NOTES FOR _2_Linkedlist PROGRAM
====================================================================

--------------------------------------------------------------------
1. WHAT THE PROGRAM DOES
--------------------------------------------------------------------
This program demonstrates various operations on a Java LinkedList, including:
• Adding elements at different positions  
• Inserting at the front and end  
• Offering elements (queue-style insertion)  
• Peeking elements without removal  
• Polling (removing the first element)  
• Checking for element existence  
It prints the list at multiple stages to show how LinkedList updates internally.

--------------------------------------------------------------------
2. IMPORTANT CONCEPTS USED IN THE CODE
(Only concepts appearing in this program)
--------------------------------------------------------------------

A. LinkedList  
   • A doubly linked list implementation of List, Queue, and Deque interfaces.  
   • Allows heterogeneous values when using raw type.  
   • Efficient for insertions/removals at both ends.

B. add()  
   • Adds an element to the end of the list.  
   • Used to insert Integer, String, and Double values into ll1.

C. addFirst()  
   • Inserts an element at the beginning of the LinkedList.

D. addLast()  
   • Inserts an element at the end of the LinkedList.

E. add(int index, Object element)  
   • Inserts an element at a specific position.

F. contains(Object o)  
   • Checks if the element exists in the list.

G. offer(), offerFirst()  
   • Queue-style methods for inserting elements at the end or beginning.  
   • offer() adds at the tail, offerFirst() inserts at the head.

H. peek(), peekLast()  
   • Retrieves—but does NOT remove—the first or last element.

I. poll()  
   • Retrieves AND removes the first element of the list.

J. System.out.println()  
   • Used repeatedly to display the list contents and return values of peek/poll.

--------------------------------------------------------------------
3. PURPOSE OF EACH VARIABLE, STRUCTURE, AND METHOD
--------------------------------------------------------------------

• Class _2_Linkedlist  
  - Holds the main method demonstrating LinkedList operations.

• main(String[] args)  
  - Executes all LinkedList manipulations and prints results.

• LinkedList ll1 = new LinkedList<>();  
  - Creates a raw-type LinkedList capable of storing heterogeneous items.

• ll1.add(45), ll1.add("java"), ll1.add(7.5)  
  - Adds three initial elements to the end of ll1.

• ll1.addFirst(455)  
  - Inserts 455 at the beginning → becomes the new head.

• ll1.addLast(78)  
  - Appends 78 at the end → becomes the new tail.

• ll1.add(2, 11)  
  - Inserts 11 at index 2, shifting existing nodes.

• System.out.println(ll1)  
  - Prints current ordering of nodes.

• ll1.contains(45)  
  - Checks if 45 exists anywhere in the LinkedList.

• ll1.offer("DevOps"), ll1.offer("HELLO")  
  - Adds these elements at the end (queue-style insertion).

• ll1.offerFirst("Sprint")  
  - Inserts "Sprint" at the beginning of the LinkedList.

• ll1.peek()  
  - Retrieves the first element WITHOUT removing it.

• ll1.peekLast()  
  - Retrieves the last element WITHOUT removing it.

• ll1.poll()  
  - Removes AND returns the first element.

• Final println(ll1)  
  - Prints the final state of the LinkedList.

--------------------------------------------------------------------
4. FULL CONTROL-FLOW OF THE PROGRAM
--------------------------------------------------------------------

Step 1: Program enters main().  
Step 2: ll1 is created as an empty LinkedList.  
Step 3: Elements 45, "java", and 7.5 are added → [45, java, 7.5].  
Step 4: addFirst(455) → [455, 45, java, 7.5].  
Step 5: addLast(78) → [455, 45, java, 7.5, 78].  
Step 6: add(2, 11) inserts 11 at index 2 → [455, 45, 11, java, 7.5, 78].  
Step 7: Print list.  
Step 8: Print contains(45) → true.  
Step 9: offer("DevOps") → appended → [455, 45, 11, java, 7.5, 78, DevOps].  
Step 10: Print list.  
Step 11: offer("HELLO") → appended → [455, 45, 11, java, 7.5, 78, DevOps, HELLO].  
Step 12: Print list.  
Step 13: offerFirst("Sprint") → [Sprint, 455, 45, 11, java, 7.5, 78, DevOps, HELLO].  
Step 14: Print list.  
Step 15: peek() prints first element → "Sprint".  
Step 16: peekLast() prints last element → "HELLO".  
Step 17: poll() removes and prints first element ("Sprint").  
Step 18: Print list again → [455, 45, 11, java, 7.5, 78, DevOps, HELLO].  
Step 19: Program ends.

--------------------------------------------------------------------
5. EXACT OUTPUT PRODUCED
--------------------------------------------------------------------
[455, 45, 11, java, 7.5, 78]  
true  
[455, 45, 11, java, 7.5, 78, DevOps]  
[455, 45, 11, java, 7.5, 78, DevOps, HELLO]  
[Sprint, 455, 45, 11, java, 7.5, 78, DevOps, HELLO]  
Sprint  
HELLO  
Sprint  
[455, 45, 11, java, 7.5, 78, DevOps, HELLO]

(Note: Output prints each value on its own line as shown.)

====================================================================
END OF REVISION NOTES
====================================================================
*/
