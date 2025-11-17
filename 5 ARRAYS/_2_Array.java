import java.util.Scanner;

public class _2_Array {
    public static void main(String[] args) {
        // int[][] marks = new int[3][4];

        int[][] marks = new int[3][];
        marks[0] = new int[4];
        marks[1] = new int[3];
        marks[2] = new int[2];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < marks.length;i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.print("Enter marks of class " + i + " of student "+ j + " : ");
                marks[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < marks.length;i++){
            for(int j = 0; j < marks[i].length; j++){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
/*
 * we cannot declare array size neagtive it will throw : NegativeArraySizeException
 */
/*
===========================================================
REVISION NOTES – 2D & JAGGED ARRAYS (Nested Arrays)
===========================================================

-----------------------------------------------------------
1. WHAT THE PROGRAM DOES
-----------------------------------------------------------
• Creates a **jagged 2D array** (rows of uneven length).
• Takes marks for students from different classes.
• Prints the marks in matrix form, row by row.

-----------------------------------------------------------
2. IMPORTANT CONCEPTS USED IN THE CODE
-----------------------------------------------------------

-----------------------------------------------------------
A) 2D Array (int[][])
-----------------------------------------------------------
DEFINITION:
• An array of arrays.
• Every element of the first dimension is itself a 1D array.

TYPES:
1) **Regular 2D array** → all rows have equal length
     int[][] arr = new int[3][4];

2) **Jagged 2D array** → rows have different lengths  
     int[][] arr = new int[3][];
     arr[0] = new int[4];
     arr[1] = new int[3];
     arr[2] = new int[2];

USAGE:
• Useful when different groups have different sizes (like classes with different number of students).

WHY USED HERE:
• Because each "class" has a different number of students:
      class 0 → 4 students  
      class 1 → 3 students  
      class 2 → 2 students

-----------------------------------------------------------
B) Scanner
-----------------------------------------------------------
DEFINITION:
• A Java class used to take input from the keyboard.

USAGE:
Scanner sc = new Scanner(System.in);

WHY USED:
• To allow the user to enter marks manually for each student.

-----------------------------------------------------------
C) Nested for Loops
-----------------------------------------------------------
DEFINITION:
• A loop inside another loop.

USAGE:
Outer loop → iterates classes (i index = row)  
Inner loop → iterates students inside that class (j index = column)

WHY NEEDED:
• To access every cell of a 2D array uniquely:
      marks[i][j]  

-----------------------------------------------------------
3. CODE FLOW (Step-by-Step)
-----------------------------------------------------------

1) Declare a jagged 2D array:
      int[][] marks = new int[3][];

2) Individually assign sizes to each row:
      marks[0] → size 4  
      marks[1] → size 3  
      marks[2] → size 2  

3) Create Scanner object for input.

4) First nested loop:
      - For each class (i)
      - For each student in that class (j)
      - Ask user to enter mark
      - Store in marks[i][j]

5) Second nested loop:
      - Print the stored marks in matrix (row-by-row) format.

6) Program ends.

-----------------------------------------------------------
4. IMPORTANT NOTES / EXCEPTIONS
-----------------------------------------------------------
• Arrays cannot have negative sizes.
      new int[-5];  
  → throws NegativeArraySizeException

• In jagged arrays, each row MUST be allocated before use.

• marks.length = number of classes (rows).
• marks[i].length = number of students in class i.

-----------------------------------------------------------
5. SAMPLE OUTPUT FLOW
-----------------------------------------------------------
Enter marks of class 0 of student 0 :
Enter marks of class 0 of student 1 :
...
Enter marks of class 2 of student 1 :

Then prints:
      45 66 78 90
      55 44 88
      98 75

===========================================================
END OF NOTES
===========================================================
*/
