public class _8_Strings {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Sachin");
        System.out.println(s1.capacity()); // 6 + 16 // if we add from constructor
        StringBuilder s2 = new StringBuilder("Sachin");

        System.out.println(s1.equals(s2)); // 

    }
}
/*
 * When to Use Which? The Golden Rule
Use StringBuilder by default. This covers over 99% of use cases. If your code is manipulating a string
 within a single method or in any context where you are certain only one thread will ever access it, 
 StringBuilder is the correct and more performant choice.

Use StringBuffer only when you specifically need a mutable string to be shared and modified by multiple
 threads. A rare example might be a shared log buffer or a piece of text being constructed by multiple
  concurrent workers. Even then, there are often better, more modern concurrency utilities to handle such scenarios.

In short: Default to StringBuilder. Only switch to StringBuffer if you have a clear and proven need for thread-safety.
 */

 /*
====================== REVISION NOTES FOR _8_Strings PROGRAM ======================

1. WHAT THE PROGRAM DOES
-----------------------------------------------------------------------------------
This program demonstrates:
- How StringBuilder capacity works when initialized with a string.
- How the equals() method behaves for StringBuilder objects.
It prints:
1. The internal capacity of a StringBuilder built from the text "Sachin".
2. The result of comparing two different StringBuilder objects containing the same text.

2. IMPORTANT CONCEPTS USED IN THE CODE (ONLY THOSE PRESENT IN THIS PROGRAM)
-----------------------------------------------------------------------------------

A. StringBuilder  
   • A mutable sequence of characters.  
   • In this program, it is used to show:
       - How constructor-based initialization affects capacity.
       - How its equals() method behaves (identity-based, not content-based).

B. capacity()  
   • A method of StringBuilder that returns the current allocated storage size.  
   • In this program, it reveals how Java calculates initial buffer capacity when a 
     StringBuilder is created with an initial string.

C. equals() (in context of StringBuilder)  
   • StringBuilder does NOT override equals().  
   • Therefore, equals() behaves exactly like Object.equals(): it checks reference equality.  
   • In this program, it shows that two StringBuilder objects with identical text are still 
     considered "not equal" because they are different objects.

D. System.out.println()  
   • Used to print the capacity value and the equals() comparison result to the console.

3. PURPOSE OF EACH VARIABLE, METHOD, AND STRUCTURE
-----------------------------------------------------------------------------------

• Class _8_Strings  
  - Holds the main method that runs the demonstration.

• main(String[] args)  
  - Entry point of the program where all operations are performed.

• StringBuilder s1 = new StringBuilder("Sachin");  
  - Creates a StringBuilder initialized with the text "Sachin".  
  - Purpose: To analyze its initial capacity and later compare it with another object.

• System.out.println(s1.capacity());  
  - Prints the calculated capacity of s1 to show how Java allocates extra buffer space.

• StringBuilder s2 = new StringBuilder("Sachin");  
  - Creates another StringBuilder with the same content as s1.  
  - Purpose: Used to check equality behavior between separate StringBuilder instances.

• System.out.println(s1.equals(s2));  
  - Prints the result of the equals() comparison.  
  - Purpose: To illustrate that StringBuilder equals() checks reference identity, not content.

4. CONTROL-FLOW EXPLANATION
-----------------------------------------------------------------------------------
Step 1: Program starts execution at main().  
Step 2: A new StringBuilder (s1) is created with content "Sachin".  
Step 3: The capacity of s1 is computed:  
        capacity = length("Sachin") + 16 = 6 + 16 = 22.  
Step 4: The program prints "22".  
Step 5: A new StringBuilder (s2) is created with the same content "Sachin".  
Step 6: equals() is called on s1 with s2 as the argument.  
        Since equals() is inherited from Object, it checks whether s1 and s2 refer 
        to the same object (they do not).  
Step 7: The program prints "false".  
Step 8: Execution ends.

5. EXACT OUTPUT PRODUCED
-----------------------------------------------------------------------------------
22
false

===================================================================================
*/
