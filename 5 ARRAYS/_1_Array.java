import java.util.Scanner;

public class _1_Array {
    public static void main(String[] args) {
        int marks[] = new int[5];
        // or
        int[] arr = new int[5];
        // marks[0] = 110;
        // marks[1] = 920;;;;
        // marks[2] = 102;
        // marks[3] = 190;
        // marks[4] = 130;
        // System.out.println(marks[0]);

        // marks.length // keyword not method

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks of student : "); 
        // marks[0] = sc.nextInt();                      ;

        for (int i = 0; i < 5;i++) {
            System.out.print("Enter the marks of student : " + i + " : ");
            marks[i] = sc.nextInt();
        }
        for(int i = 0; i < marks.length ; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
/*
 * in java array is treated as an Object
 *  // 
 */
/*
=====================================================
REVISION NOTES – ARRAY INPUT & OUTPUT PROGRAM
=====================================================

-----------------------------------------------------
1. WHAT THE PROGRAM DOES
-----------------------------------------------------
This program:
• Creates an integer array of size 5.
• Takes 5 marks from the user using Scanner.
• Stores each mark in the array.
• Prints all the entered marks.

-----------------------------------------------------
2. IMPORTANT PROGRAM-SPECIFIC CONCEPTS
-----------------------------------------------------

1) Integer Array (int[])
   • A fixed-size container storing multiple int values.
   • In Java, arrays are objects stored in heap memory.

2) Array Indexing
   • marks[i] is used to access or assign values at index i.

3) marks.length
   • A built-in array property that gives the number of elements.

4) for Loop
   • Used twice:
       - First loop: store input into array.
       - Second loop: print array values.

5) Scanner
   • Reads user-entered integers from keyboard.

-----------------------------------------------------
3. PURPOSE OF EACH VARIABLE / STATEMENT / BLOCK
-----------------------------------------------------

Variable: int marks[] = new int[5];
• Declares an integer array named marks with 5 slots.

Variable: int[] arr = new int[5];
• Another array declaration (not used later; demonstrates alternate syntax).

Object: Scanner sc = new Scanner(System.in);
• Used to read input for each student’s marks.

First for Loop:
for (int i = 0; i < 5; i++)
• Iterates 5 times.
• Prompts user to enter marks and stores them in marks[i].

Second for Loop:
for (int i = 0; i < marks.length; i++)
• Iterates using marks.length.
• Prints all stored marks in sequence.

-----------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP–BY–STEP)
-----------------------------------------------------

1) Program starts in main().
2) marks array and arr array are created (only marks is used).
3) Scanner object created for input.
4) First for loop begins:
      • For each i from 0 to 4:
          - Program prints prompt for marks of student i.
          - User enters value → stored in marks[i].
5) After storing all inputs, second for loop begins:
      • For each i from 0 to 4:
          - marks[i] is printed with a trailing space.
6) Program ends.

-----------------------------------------------------
5. EXACT RUNTIME BEHAVIOR
-----------------------------------------------------

• User sees prompt 5 times:
      Enter the marks of student : 0 :
      …
      Enter the marks of student : 4 :
• User enters 5 integers.
• Then program prints them all on one line, e.g.:
      50 60 55 70 90 

=====================================================
END OF NOTES
=====================================================
*/
