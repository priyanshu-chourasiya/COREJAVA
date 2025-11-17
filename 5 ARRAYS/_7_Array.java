
public class _7_Array {
    public static void main(String[] args) {
        int a[] = {4,5,54,3};

        for(int i = a.length - 1; i >= 0;i--){
            System.out.print(a[i] + " ");
        }
        System.out.println("--------------------------------");

        int arr[] = {1,2,3,4,5,6};

        //System.out.println(Arrays.toString(Arrays.sort(arr)));


    }
}
/*
==================================================================
REVISION NOTES – ARRAY REVERSE ITERATION & LENGTH USAGE
==================================================================

--------------------------------------------------------------
1. WHAT THE PROGRAM DOES
--------------------------------------------------------------
• Stores integers in an array.
• Prints the array elements in reverse order using a standard for-loop.
• Contains another array (arr) meant for sorting (sorting code commented out).

--------------------------------------------------------------
2. CONCEPTS USED (ONLY THOSE PRESENT IN CODE)
--------------------------------------------------------------

A) 1D Integer Array  
   int a[] = {4,5,54,3};
   • Stores multiple int values in a single variable.

B) Array Length Property  
   a.length  
   • Built-in property that returns total number of elements in the array.

C) Standard For Loop (Reverse Iteration)  
   for(int i = a.length - 1; i >= 0; i--)  
   • Iterates the array from last index to first.

D) Print Statement  
   System.out.print()  
   • Prints elements on the same line.

E) Separator Line  
   System.out.println("--------------------------------");  
   • Visually divides output sections.

F) Commented Code  
   //System.out.println(Arrays.toString(Arrays.sort(arr)));  
   • Shows intention to sort and print array but is not executed.

--------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
--------------------------------------------------------------

A) Array a  
   • Used to demonstrate reverse indexing.

B) a.length  
   • Provides ending index:
        a.length - 1 → last element’s index.

C) For Loop (reverse)  
   • Starts from the last index.
   • Decrements i until it reaches 0.
   • Prints each value of array a in reverse order.

D) Array arr  
   • Declared but not used beyond this point.
   • Intended for sorting demonstration (commented out).

--------------------------------------------------------------
4. PURPOSE OF VARIABLES / BLOCKS
--------------------------------------------------------------

• int a[] = {4,5,54,3};
  → Main array whose values are printed in reverse.

• for(int i = a.length - 1; i >= 0; i--)
  → Loops backward through array a.

• System.out.print(a[i] + " ");
  → Prints each element of a in reverse order.

• int arr[] = {1,2,3,4,5,6};
  → Secondary array reserved for sorting example.

• Commented Arrays.sort code
  → Not executed; only demonstrates the intended concept.

--------------------------------------------------------------
5. CONTROL FLOW (STEP-BY-STEP)
--------------------------------------------------------------
1. Program enters main().
2. Array a is created with 4 values.
3. Reverse loop begins:
     i = 3 → prints 3  
     i = 2 → prints 54  
     i = 1 → prints 5  
     i = 0 → prints 4  
4. Dashed line is printed.
5. Array arr is created.
6. Commented-out sorting code is skipped.
7. Program ends.

--------------------------------------------------------------
6. RUNTIME OUTPUT
--------------------------------------------------------------
3 54 5 4 
--------------------------------

==================================================================
END OF NOTES
==================================================================
*/
