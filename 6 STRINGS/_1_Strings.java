
public class _1_Strings {
    public static void main(String[] args) {
        // "a" - string
        // 'a' - character
        String s1 = "abc";
        String s2 = new String("abc"); // immutable
        System.out.println("1 : " + " " +  s1 == s2); // references of a string
        System.out.println("2 : " + s1.equals(s2)); // actual data 

        String s3 = "priyanshu";
        String s4 = "priyanshu";
        System.out.println("3 : " + s3 == s4);
        System.out.println("4 : " + s3.equals(s4));

        String s5 = new String("abc");
        String s6 = new String("abc");
        System.out.println(s5 == s6); 
        System.out.println(s5.equals(s6));

        String s7 = "Abc";
        String s8 = "abc";
        System.out.println(s7 == s8);
        System.out.println(s7.equals(s8));
        System.out.println(s7.equalsIgnoreCase(s8));
    }
}
// java is case sensitive language // 
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _1_Strings
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PROGRAM PURPOSE
-------------------------------------------------------------
The program demonstrates how Java handles Strings in terms of:
- Reference comparison (==)
- Content comparison (equals)
- Case-insensitive comparison (equalsIgnoreCase)
- String literal pooling vs. explicitly created String objects

It prints the results of various comparisons to show how different
string creation methods affect memory references and equality checks.

-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (Defined Only if Appearing in Code)
-------------------------------------------------------------

(1) String Literal Pool  
    - A special memory area where Java stores string literals.
    - Identical literals point to the same memory reference.
    - Used in the program when assigning strings like: String s1 = "abc".

(2) new String("abc")  
    - Explicit object creation that places the new String in heap memory,
      NOT the string pool.
    - Guarantees a new, separate object reference.

(3) == (Reference Comparison for Objects)  
    - Checks whether two references point to the same memory location.
    - Used repeatedly in the program to demonstrate difference between
      pooled vs. non-pooled strings.

(4) equals()  
    - Compares the actual sequence of characters inside the strings.
    - Returns true when contents are identical, regardless of reference.

(5) equalsIgnoreCase()  
    - Compares characters ignoring case differences (A = a).

-------------------------------------------------------------
3. PURPOSE OF VARIABLES, METHODS, STRUCTURES
-------------------------------------------------------------

CLASS: _1_Strings  
- Contains the main method demonstrating different String comparisons.

METHOD: main()  
- Runs all comparisons and prints results.

VARIABLES:
- s1: String literal "abc" (stored in string pool)
- s2: New String object with content "abc" (separate heap object)
- s3: String literal "priyanshu" (in pool)
- s4: Another literal "priyanshu" (shares reference with s3)
- s5: New String object "abc", separate from s1 and s6
- s6: Another new String object "abc", separate from s5
- s7: Literal "Abc"
- s8: Literal "abc"

PRINT STATEMENTS:
- Show comparisons between reference equality and content equality.

-------------------------------------------------------------
4. CONTROL FLOW FROM START TO END
-------------------------------------------------------------

1. Program starts at main().
2. s1 assigned literal "abc" (pooled).
3. s2 assigned new String("abc") (new object).
4. Evaluates ("1 : " + " " + s1) == s2:
     - "1 :  abc" is created first (string concatenation),
       then compared by reference to s2 → false.
5. Prints whether s1.equals(s2) → compares content → true.

6. s3 and s4 assigned identical literals → same reference.
7. Evaluates ("3 : " + s3) == s4:
     - Concatenation creates a new String object,
       comparing reference with pooled s4 → false.
8. Prints s3.equals(s4) → true (same content).

9. s5 and s6 created separately using new → different references.
10. Prints s5 == s6 → false.
11. Prints s5.equals(s6) → true.

12. s7 = "Abc"; s8 = "abc";
13. Prints s7 == s8 → false (different literals).
14. Prints s7.equals(s8) → false (case mismatch).
15. Prints s7.equalsIgnoreCase(s8) → true.

16. Program ends.

-------------------------------------------------------------
5. EXACT OUTPUT BEHAVIOR
-------------------------------------------------------------

Expression evaluations produce:

("1 : " + " " + s1) == s2  
→ false

("2 : " + s1.equals(s2))  
→ prints: 2 : true

("3 : " + s3) == s4  
→ false

("4 : " + s3.equals(s4))  
→ prints: 4 : true

s5 == s6  
→ false

s5.equals(s6)  
→ true

s7 == s8  
→ false

s7.equals(s8)  
→ false

s7.equalsIgnoreCase(s8)  
→ true

-------------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------------
*/
