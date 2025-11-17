
public class _3_Strings {
    public static void main(String[] args) {
        String str = "RajaRamMohanRoy";
        //str = str.toUpperCase();
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(4,12));
        System.out.println(str.substring(4));
        char ch[] = str.toCharArray();
        for(char i : ch){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(str.toCharArray());
        System.out.println(str.charAt(4));
        System.out.println(str.contains("Mohan"));
        System.out.println(str.startsWith("Raj"));
        System.out.println(str.endsWith("y"));
        System.out.println(str.indexOf("a")); // first index
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.lastIndexOf("a"));
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _3_Strings
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PROGRAM PURPOSE
-------------------------------------------------------------
The program demonstrates multiple built-in String operations, including:
- Case conversion (upper/lower)
- Length and substring extraction
- Conversion to character array
- Character-by-character iteration
- Character access by index
- Searching within a string (contains, startsWith, endsWith)
- Finding index positions (first and last occurrence)

It prints outputs for each operation to show how the methods behave.

-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (Defined Only if Appearing in Code)
-------------------------------------------------------------

(1) toUpperCase()  
    - Returns a new String with all characters converted to uppercase.

(2) toLowerCase()  
    - Returns a new String with all characters converted to lowercase.

(3) length()  
    - Returns the number of characters in the string.

(4) substring(int start, int end)  
    - Returns a new String from index `start` to `end - 1`.

(5) substring(int start)  
    - Returns a new String from index `start` to the end.

(6) toCharArray()  
    - Converts the String into a char[] array containing all characters.

(7) Enhanced for-loop  
    - Iterates through each element of an array.

(8) charAt(int index)  
    - Returns the character at the specified index.

(9) contains(CharSequence s)  
    - Returns true if the given sequence of characters exists within the string.

(10) startsWith(String prefix)  
    - Returns true if the string begins with the given prefix.

(11) endsWith(String suffix)  
    - Returns true if the string ends with the given suffix.

(12) indexOf(String or char)  
    - Returns the first index where the character/substring is found.

(13) lastIndexOf(String or char)  
    - Returns the last index where the character/substring occurs.

-------------------------------------------------------------
3. PURPOSE OF VARIABLES, METHODS, STRUCTURES
-------------------------------------------------------------

CLASS: _3_Strings  
- Contains demonstrations of various practical String methods.

METHOD: main()  
- Executes all operations on the string "RajaRamMohanRoy".

VARIABLES:
- str: the original string "RajaRamMohanRoy", used for all method calls.
- ch[]: char array created by str.toCharArray(), storing all characters of str.

LOOP:
- for(char i : ch)  
  Prints each character of str with a space.

PRINT STATEMENTS:
- Display results of uppercase, lowercase, length, substrings, arrays,
  individual characters, boolean checks, and index operations.

-------------------------------------------------------------
4. FULL CONTROL FLOW
-------------------------------------------------------------

1. Program enters main().
2. str = "RajaRamMohanRoy".

3. Print str.toUpperCase() → displays uppercase version.
4. Print str.length() → prints total number of characters.
5. Print str.toLowerCase() → displays lowercase version.
6. Print str.substring(4,12) → extracts characters from index 4 to 11.
7. Print str.substring(4) → extracts from index 4 to end.

8. Convert str to char array (ch).
9. Loop through ch and print each character followed by a space.
10. Print newline.

11. Print str.toCharArray() → prints the char[] as a string representation.
12. Print str.charAt(4) → prints character at index 4.
13. Print str.contains("Mohan") → checks if substring "Mohan" exists.
14. Print str.startsWith("Raj").
15. Print str.endsWith("y").

16. Print str.indexOf("a") → first index of 'a'.
17. Print str.lastIndexOf('a') → last index of 'a'.
18. Print str.lastIndexOf("a") → same as above since argument is identical.

19. Program ends.

-------------------------------------------------------------
5. EXACT OUTPUT BEHAVIOR
-------------------------------------------------------------

Given: str = "RajaRamMohanRoy"

- str.toUpperCase()  
  RAJARAMMOHANROY

- str.length()  
  15

- str.toLowerCase()  
  rajarammohanroy

- str.substring(4,12)  
  RamMohan

- str.substring(4)  
  RamMohanRoy

- Printing ch[] (each char with space):  
  R a j a R a m M o h a n R o y 

- str.toCharArray() (printed as a string):  
  RajaRamMohanRoy

- str.charAt(4)  
  R

- str.contains("Mohan")  
  true

- str.startsWith("Raj")  
  true

- str.endsWith("y")  
  true

- str.indexOf("a")  
  1

- str.lastIndexOf('a')  
  10

- str.lastIndexOf("a")  
  10

-------------------------------------------------------------
END OF REVISION NOTES
-----------------------------------------------------------
*/
