public class _6_Strings {
    public static void main(String[] args) {
        // mutable string : 
        // StringBuffer StringBuilder

        // StringBuffer s = "ABC"; not allowed

        StringBuffer s1 = new StringBuffer("Telusko");
        System.out.println(s1);
        s1.append("AA");
        System.out.println(s1);
        s1.append(true);
        System.out.println(s1.getClass().getName());
        System.out.println(s1);

        System.out.println("--------");

        StringBuilder s2 = new StringBuilder("Telusko");
        System.out.println(s2);
        s2.append("AA");
        System.out.println(s2);
        s2.append(true);
        System.out.println(s2.getClass().getName());
        System.out.println(s2);
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _6_Strings
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PROGRAM PURPOSE
-------------------------------------------------------------
The program demonstrates:
- Use of mutable string classes in Java (StringBuffer and StringBuilder)
- How append() modifies these mutable objects
- The difference between immutable String and mutable buffer classes
- Retrieving the runtime class name using getClass().getName()

It prints changes made to mutable string objects after each modification.

-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (Defined Only if Appearing in Code)
-------------------------------------------------------------

(1) StringBuffer  
    - A mutable (modifiable) sequence of characters.
    - Thread-safe (synchronized).
    - append() directly changes the existing object.

(2) StringBuilder  
    - Similar to StringBuffer but NOT thread-safe.
    - Faster in single-threaded contexts.
    - Also mutable; append() modifies the underlying character sequence.

(3) append()  
    - Adds the given value (String, boolean, char, etc.) to the end of the buffer.
    - Returns the same mutable object after modification.

(4) getClass().getName()  
    - Returns the full class name of the object at runtime.

-------------------------------------------------------------
3. PURPOSE OF VARIABLES, METHODS, STRUCTURES
-------------------------------------------------------------

CLASS: _6_Strings  
- Demonstrates mutability using StringBuffer and StringBuilder.

METHOD: main()  
- Creates mutable string objects, modifies them using append(),
  and displays the intermediate states.

VARIABLES:
- s1: StringBuffer initialized with "Telusko".
      Used to show mutability and ability to append different datatypes.
- s2: StringBuilder initialized with "Telusko".
      Used to demonstrate similar behavior without synchronization.

PRINT STATEMENTS:
- Print original values of s1 and s2.
- Print modified values after each append().
- Print runtime class names for s1 and s2.

-------------------------------------------------------------
4. FULL CONTROL FLOW
-------------------------------------------------------------

1. Enter main().

2. Create StringBuffer s1 with "Telusko".
3. Print s1 → "Telusko".

4. s1.append("AA") → modifies s1 to "TeluskoAA".
5. Print s1.

6. s1.append(true) → adds "true" → "TeluskoAAtrue".
7. Print s1.getClass().getName() → "java.lang.StringBuffer".
8. Print s1 → "TeluskoAAtrue".

9. Print separator line.

10. Create StringBuilder s2 with "Telusko".
11. Print s2 → "Telusko".

12. s2.append("AA") → "TeluskoAA".
13. Print s2.

14. s2.append(true) → "TeluskoAAtrue".
15. Print s2.getClass().getName() → "java.lang.StringBuilder".
16. Print s2.

17. Program ends.

-------------------------------------------------------------
5. EXACT OUTPUT BEHAVIOR
-------------------------------------------------------------

Telusko
TeluskoAA
java.lang.StringBuffer
TeluskoAAtrue
--------
Telusko
TeluskoAA
java.lang.StringBuilder
TeluskoAAtrue

-------------------------------------------------------------
END OF REVISION NOTES
-----------------------------------------------------------
*/
