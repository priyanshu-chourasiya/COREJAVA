public class _5_Strings {
    public static void main(String[] args) {
        String s1= "Raj aRam Mohan Roy";
        String[] str = s1.split(" ");
        System.out.println(str.length);
        for(String i : str){
            System.out.print(i);
        }
        System.out.println();

        String s2 = "   Raja Ram Mohan Roy  ";
        System.out.println(s2);
        System.out.println(s2.trim()); // leading and trailing space (removes)
        System.out.println(s2.stripTrailing()); // removes last spaces
        System.out.println(s2.stripLeading());
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _5_Strings
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PROGRAM PURPOSE
-------------------------------------------------------------
The program demonstrates:
- Splitting a string into an array using `split()`
- Counting and printing split parts
- Handling whitespace in strings
- Behavior of `trim()`, `stripTrailing()`, and `stripLeading()`

It prints how the original string is divided into tokens and how
different methods remove different types of whitespace.

-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (Defined Only if Appearing in Code)
-------------------------------------------------------------

(1) split(String regex)  
    - Splits a string around matches of the given regular expression.  
    - Returns a String array containing the separated parts.

(2) trim()  
    - Removes leading and trailing **ASCII** whitespace characters only.

(3) stripLeading()  
    - Removes Unicode-leading whitespace from the start of the string.

(4) stripTrailing()  
    - Removes Unicode-trailing whitespace from the end of the string.

(5) Enhanced for-loop (for-each loop)  
    - Iterates over the elements of an array.

-------------------------------------------------------------
3. PURPOSE OF VARIABLES, METHODS, STRUCTURES
-------------------------------------------------------------

CLASS: _5_Strings  
- Demonstrates splitting strings and whitespace manipulation.

METHOD: main()  
- Runs splitting, whitespace removal, and prints outputs.

VARIABLES:
- s1: "Raj aRam Mohan Roy"  
      Contains words separated by spaces; used for splitting.
- str: Result of s1.split(" "); an array of tokens split at spaces.
- s2: "   Raja Ram Mohan Roy  "  
      Contains extra spaces at the beginning and end; used for whitespace removal tests.

LOOPS:
- for(String i : str)  
  Prints each element of the array `str` without spaces between them.

PRINT STATEMENTS:
- Display length of split array.
- Display tokens of `str`.
- Display original `s2`.
- Display results of trim(), stripTrailing(), and stripLeading().

-------------------------------------------------------------
4. FULL CONTROL FLOW
-------------------------------------------------------------

1. Program enters main().

2. s1 = "Raj aRam Mohan Roy".
3. str = s1.split(" ") → splits at spaces; produces an array of four elements.
4. Print str.length → prints number of split tokens.
5. Loop through str and print each token consecutively.
6. Print newline.

7. s2 = "   Raja Ram Mohan Roy  " (with multiple spaces).
8. Print s2 (shows full spaced string).
9. Print s2.trim() → removes leading and trailing ASCII spaces.
10. Print s2.stripTrailing() → removes only trailing whitespace.
11. Print s2.stripLeading() → removes only leading whitespace.

12. Program ends.

-------------------------------------------------------------
5. EXACT OUTPUT BEHAVIOR
-------------------------------------------------------------

Given s1 = "Raj aRam Mohan Roy":

- s1.split(" ") → ["Raj", "aRam", "Mohan", "Roy"]
- str.length → 4
- Printing tokens (no spaces added):  
  RajaRamMohanRoy

Given s2 = "   Raja Ram Mohan Roy  ":

- Original print:  
    "   Raja Ram Mohan Roy  "
- s2.trim():  
    "Raja Ram Mohan Roy"
- s2.stripTrailing():  
    "   Raja Ram Mohan Roy"
- s2.stripLeading():  
    "Raja Ram Mohan Roy  "

-------------------------------------------------------------
END OF REVISION NOTES
-----------------------------------------------------------
*/
