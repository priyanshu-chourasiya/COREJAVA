// class 
public class _4_Array {
    public static void main(String[] args) {
        // int arr[];
        // arr = new int[5]; can be done

        int arr[] = new int[] {1,2,3,4,5};

        int a[] = {1,2,3,4,5};

        int arr1[][] = {{1,5,2},{3,4}};
    }
}
/*
===========================================================
REVISION NOTES – ARRAY INITIALIZATION TYPES
===========================================================

-----------------------------------------------------------
1. WHAT THE PROGRAM SHOWS
-----------------------------------------------------------
This program demonstrates different ways of declaring and initializing:
• 1D arrays
• 2D arrays
• Jagged arrays (irregular row sizes)

-----------------------------------------------------------
2. IMPORTANT CONCEPTS USED
-----------------------------------------------------------

-----------------------------------------------------------
A) Array Declaration
-----------------------------------------------------------
DEFINITION:
• Declaring an array means telling Java the variable will hold
  a reference to an array.

EXAMPLE:
      int arr[];

USAGE:
• This does NOT allocate memory.
• Memory is allocated only when using `new`.

-----------------------------------------------------------
B) Array Initialization (Using new)
-----------------------------------------------------------
Example:
      arr = new int[5];

MEANING:
• Allocates memory for 5 integers.
• Default values = 0.

WHY USED:
• When size is known but values aren’t.

-----------------------------------------------------------
C) Array Initialization (Direct Initialization Block)
-----------------------------------------------------------
Example:
      int arr[] = new int[] {1,2,3,4,5};

DEFINITION:
• This is explicit initialization using 'new' + data.

Another shorter version:
      int a[] = {1,2,3,4,5};

USAGE:
• Used when values are already known.
• Compiler automatically determines size from values.

BENEFITS:
• Cleaner, faster to write.

-----------------------------------------------------------
D) 2D Array Initialization (Jagged Array)
-----------------------------------------------------------
Example:
      int arr1[][] = { {1,5,2}, {3,4} };

DEFINITION:
• Jagged array = a 2D array where each row has different length.

In this example:
Row 0 → {1,5,2} → length = 3  
Row 1 → {3,4}   → length = 2

WHY USED:
• To save memory
• Useful when rows don’t need equal size (e.g., monthly days)

-----------------------------------------------------------
3. MEMORY VISUALIZATION
-----------------------------------------------------------

a[] = {1,2,3,4,5}

Index | Value
---------------
0     | 1
1     | 2
2     | 3
3     | 4
4     | 5


arr1 (Jagged Array)

Index | Row Content
-------------------------
0     | [1, 5, 2]   (length 3)
1     | [3, 4]      (length 2)

-----------------------------------------------------------
4. KEY NOTES FOR EXAMS
-----------------------------------------------------------
• Array declaration ≠ memory allocation.
• Direct initialization `{...}` can be used only during declaration.
• Jagged arrays are allowed in Java.
• Java always treats arrays as objects stored in heap memory.
• Default values:
      int → 0
      float → 0.0
      boolean → false
      object references → null

===========================================================
END OF NOTES
===========================================================
*/
