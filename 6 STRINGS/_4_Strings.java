public class _4_Strings {
    public static void main(String[] args) {
        final String s1 = "Alien";
        // s1 = s1 + " java"; cannot assign a value to final variable s1

        final String s2 = "Alien";
        String s3 = s2 + " java";
        System.out.println(s3);

        String s4 = "SACHIN";
        String s5 = "SACHIN";
        System.out.println(s4.compareTo(s5)); // character to character comparistion
        // 0 if equal else ascii difference of first characters which are not equal

        String s6 = "SAURAV";
        String s7 = "SEHWAG";
        System.out.println(s6.compareTo(s7));


        
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _4_Strings
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PROGRAM PURPOSE
-------------------------------------------------------------
The program demonstrates:
- The effect of the `final` keyword on String variables.
- String concatenation with final references.
- How `compareTo()` compares two strings lexicographically.
- The integer results produced by compareTo() based on ASCII/Unicode
  differences of the first mismatching characters.

-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (Defined Only if Appearing in Code)
-------------------------------------------------------------

(1) final (when applied to a String reference)  
    - Prevents the variable from being reassigned to a different object.  
    - Does NOT affect immutability of the String itself (Strings are already immutable).  
    - Appears in the code with `final String s1` and `final String s2`.

(2) compareTo()  
    - Performs lexicographical (dictionary-order) comparison.  
    - Compares character by character using their Unicode values.  
    - Returns:
        0 if both strings are equal,
        Positive value if the calling string is lexicographically greater,
        Negative value if the calling string is smaller.

-------------------------------------------------------------
3. PURPOSE OF VARIABLES, METHODS, STRUCTURES
-------------------------------------------------------------

CLASS: _4_Strings  
- Demonstrates final behavior and lexicographical string comparison.

METHOD: main()  
- Executes all operations and prints results.

VARIABLES:
- s1: final reference to the literal "Alien". Cannot be reassigned.
- s2: another final reference to the same literal "Alien".
- s3: created by concatenating s2 with " java". Shows that a final reference
      can be used to create new strings, but s2 itself is unchanged.
- s4, s5: identical literals "SACHIN"; used to demonstrate compareTo()
          when strings are equal.
- s6: literal "SAURAV".
- s7: literal "SEHWAG"; used to demonstrate compareTo() when strings differ.

PRINT STATEMENTS:
- Print s3 (result of concatenation).
- Print results of compareTo() for s4 vs. s5 and s6 vs. s7.

-------------------------------------------------------------
4. FULL CONTROL FLOW
-------------------------------------------------------------

1. Program enters main().
2. s1 declared as final with value "Alien".
3. Assignment attempt is commented out because final variables cannot be reassigned.
4. s2 declared as final with value "Alien".
5. s3 computed as s2 + " java" → creates new String "Alien java".
6. Print s3.

7. s4 and s5 assigned "SACHIN".
8. s4.compareTo(s5) executed:
    - Since both strings are identical, compareTo() returns 0.
9. Print the result.

10. s6 = "SAURAV"; s7 = "SEHWAG".
11. s6.compareTo(s7) executed:
    - Comparison proceeds character by character:
        S == S  
        A == E? No → returns ('A' - 'E') = 65 − 69 = -4
12. Print the result.

13. Program ends.

-------------------------------------------------------------
5. EXACT OUTPUT BEHAVIOR
-------------------------------------------------------------

Alien java
0
-4

-------------------------------------------------------------
END OF REVISION NOTES
-----------------------------------------------------------
*/
