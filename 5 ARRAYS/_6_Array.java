public class _6_Array {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        for(int i : arr){
            System.out.println(i);
        }

        int arr1[][] = {{1,2,3},{4,5,6}};
        for(int row[]:arr1){
            for(int ele: row){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
/*
 * for each loop
 * enhanced for loop
 * advanced for loop
 */
/*
===============================================================
REVISION NOTES – ENHANCED FOR LOOP WITH 1D & 2D ARRAYS
===============================================================

---------------------------------------------------------------
1. WHAT THE PROGRAM DOES
---------------------------------------------------------------
• Demonstrates iteration over a 1D array using an enhanced for-loop.
• Demonstrates nested enhanced for-loops to iterate through a 2D array.
• Prints each element of the arrays in sequence.

---------------------------------------------------------------
2. CONCEPTS USED (ONLY THOSE PRESENT IN CODE)
---------------------------------------------------------------

A) 1D Array  
   int arr[] = {1,2,3,4};
   • A linear data structure storing integers.

B) 2D Array  
   int arr1[][] = {{1,2,3},{4,5,6}};
   • An array of arrays, organized in rows and columns.

C) Enhanced For Loop (For-each Loop)  
   Syntax:  
       for(dataType var : array)  
   • Used to iterate through each element of an array sequentially.

D) Nested Enhanced For Loop  
   • Used to traverse 2D arrays: outer loop for rows, inner loop for elements.

---------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
---------------------------------------------------------------

A) 1D Array (arr)
   • Stores 4 integers.
   • Used in enhanced for-loop:
         for(int i : arr)
   • "i" temporarily holds each value from arr.

B) 2D Array (arr1)
   • Contains 2 rows:
         Row 0 → {1,2,3}
         Row 1 → {4,5,6}
   • Iterated using nested enhanced loops:
         for(int row[] : arr1)  
               row → each 1D array inside arr1
         for(int ele : row)  
               ele → each integer inside that row

C) Enhanced For Loop
   • Used to simplify iteration (no index required).
   • Automatically moves through elements in sequence.

---------------------------------------------------------------
4. PURPOSE OF VARIABLES / BLOCKS
---------------------------------------------------------------

• arr  
  → Stores 1D integer values for demonstration.

• arr1  
  → Stores 2D integer values for nested iteration.

• for(int i : arr)  
  → Prints each value of the 1D array on a new line.

• for(int row[] : arr1)  
  → Iterates over each row (which is itself a 1D array).

• for(int ele : row)  
  → Prints each integer of the current row.

---------------------------------------------------------------
5. COMPLETE CONTROL FLOW (STEP-BY-STEP)
---------------------------------------------------------------
1. main() begins execution.
2. arr is initialized with {1,2,3,4}.
3. Enhanced loop starts:
       i = 1 → printed  
       i = 2 → printed  
       i = 3 → printed  
       i = 4 → printed  
4. arr1 is initialized as a 2D array with 2 rows.
5. Outer enhanced loop begins:
   • First iteration:
         row = {1,2,3}
         inner loop prints: 1 2 3
   • Second iteration:
         row = {4,5,6}
         inner loop prints: 4 5 6
6. Program ends.

---------------------------------------------------------------
6. EXACT OUTPUT PRODUCED
---------------------------------------------------------------
1
2
3
4
123
456

===============================================================
END OF NOTES
===============================================================
*/
