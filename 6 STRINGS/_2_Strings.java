
public class _2_Strings {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);
        s1.concat(" alien"); 
        System.out.println(s1);
        String s2 = s1.concat(" alien");
        System.out.println(s2);


        System.out.println("----------------------");

        String s3 = "alien  ";
        String s4 = s3.concat(" java");
        String s5 = s3 + s4;
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        System.out.println("----------------------");

        String s = "Spring" + 12 + 221; // Spring12221
        // to a string anything we concatinate it will become string
        System.out.println(s);

        String s6 = 43 + 212 + " Spring";
        System.out.println(s6);
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _2_Strings
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PROGRAM PURPOSE
-------------------------------------------------------------
The program demonstrates:
- String immutability
- Behavior of concat()
- Behavior of + operator with Strings and numbers
- How new String objects are created during concatenation
- How evaluation order affects final concatenated output

It prints multiple values showing how Strings do not change unless
assigned and how concatenation produces new string objects.

-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (Defined Only if Appearing in Code)
-------------------------------------------------------------

(1) String Immutability  
    - Once a String is created, its value cannot be changed.
    - Any modification (concat or +) generates a new String object.

(2) concat() Method  
    - Returns a new String by appending the given argument.
    - Does NOT change the original String object.

(3) String Concatenation Operator (+)  
    - When at least one operand is a String, the result becomes a new String.
    - Evaluation happens left to right.
    - Numbers added before encountering a String perform arithmetic addition first.

(4) Left-to-Right Evaluation  
    - Critical when mixing integers and strings.
    - Demonstrated in:
        "Spring" + 12 + 221
        43 + 212 + " Spring"

-------------------------------------------------------------
3. PURPOSE OF VARIABLES, METHODS, STRUCTURES
-------------------------------------------------------------

CLASS: _2_Strings  
- Contains test cases showing String immutability and concatenation behavior.

METHOD: main()  
- Executes all string operations and prints outcomes.

VARIABLES:
- s1: literal "abc"; used to show immutable behavior of Strings.
- s2: stores the new String produced by s1.concat(" alien").
- s3: literal "alien  " (with trailing spaces).
- s4: new String from s3.concat(" java").
- s5: result of concatenating s3 and s4 with +.
- s: result of "Spring" + 12 + 221 showing left-to-right evaluation.
- s6: result of 43 + 212 + " Spring" showing arithmetic first, then string conversion.

PRINT STATEMENTS:
- Display how original strings remain unchanged.
- Display the new concatenated strings produced.

-------------------------------------------------------------
4. CONTROL FLOW FROM START TO END
-------------------------------------------------------------

1. Program enters main().

2. s1 = "abc".
3. Print s1 → prints: abc.
4. s1.concat(" alien") creates new String but result is discarded.
5. Print s1 → remains unchanged: abc.
6. s2 = s1.concat(" alien") stores new value "abc alien".
7. Print s2.

8. Print separator line.

9. s3 = "alien  " (with two spaces at end).
10. s4 = s3.concat(" java") → produces "alien   java".
11. s5 = s3 + s4 concatenates both into one long string.
12. Print s3 (original unchanged).
13. Print s4.
14. Print s5.

15. Print separator line.

16. s = "Spring" + 12 + 221:
      - "Spring" + 12 → "Spring12"
      - "Spring12" + 221 → "Spring12221"
17. Print s.

18. s6 = 43 + 212 + " Spring":
      - 43 + 212 → 255
      - 255 + " Spring" → "255 Spring"
19. Print s6.

20. Program ends.

-------------------------------------------------------------
5. EXACT OUTPUT BEHAVIOR
-------------------------------------------------------------

abc
abc
abc alien
----------------------
alien  
alien   java
alien  alien   java
----------------------
Spring12221
255 Spring

(Spacing exactly matches the code: s3 contains two trailing spaces.)

-------------------------------------------------------------
END OF REVISION NOTES
-----------------------------------------------------------
*/
