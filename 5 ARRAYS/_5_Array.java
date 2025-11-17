
import java.util.Arrays;

class Tel{
    String courseName;
    int courseCost;
    String city;
}
public class _5_Array {
    public static void main(String[] args) {
        Tel t = new Tel();
        System.out.println(t);

        System.out.println(t.getClass().getName());

        // Tshaped t2 = new Tshaped(); without class we cannot create object

        System.out.println("_________________");

        int a[] = new int[4];
        System.out.println(a);
        System.out.println(a.getClass().getName());


        System.out.println("_________________");
        
        int arr[][] = new int[4][4];
        System.out.println(arr);
        System.out.println(arr.getClass().getName());

        int arr2[] = {8,6,2,4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }   
}
/*
===============================================================
REVISION NOTES – ARRAYS, CLASS OBJECTS & getClass() METHOD
===============================================================

---------------------------------------------------------------
1. WHAT THIS PROGRAM DEMONSTRATES
---------------------------------------------------------------
• Printing object references
• Getting runtime class name using getClass().getName()
• Behavior of arrays as objects
• Internal class names of 1D & 2D arrays
• Sorting arrays using Arrays.sort()
• Converting array to readable string using Arrays.toString()

---------------------------------------------------------------
2. CLASS Tel (User-defined class)
---------------------------------------------------------------
class Tel {
    String courseName;
    int courseCost;
    String city;
}

DEFINITION:
• A simple POJO (Plain Old Java Object) class with 3 fields.

USAGE IN MAIN:
      Tel t = new Tel();
      System.out.println(t);

WHAT HAPPENS?
• No toString() is overridden  
• So Java prints object’s hash representation:
      Tel@5ca881b5  (example)

---------------------------------------------------------------
3. getClass().getName()
---------------------------------------------------------------
DEFINITION:
• Returns the runtime class name of an object.

USAGE:
      t.getClass().getName();

OUTPUT:
      Tel

WHY USED?
• To identify what type of object or array you are dealing with at runtime.

---------------------------------------------------------------
4. ARRAYS ARE OBJECTS
---------------------------------------------------------------
Example:
      int a[] = new int[4];
      System.out.println(a);

OUTPUT LOOKS LIKE:
      [I@2f92e0f4

EXPLANATION:
• '[‘ means array
• 'I' means integer type  
• The part after '@' is hashcode

---------------------------------------------------------------
5. ARRAY CLASS NAMES (INTERNAL JVM NAMES)
---------------------------------------------------------------

A) **1D array of int**
      a.getClass().getName() → [I  
Meaning:
• [ → array  
• I → integer  

B) **2D array of int**
      arr.getClass().getName() → [[I  
Meaning:
• [[ → 2D array  
• I → integer  

C) **3D array would be**
      [[[I

These internal notations are used by the JVM.

---------------------------------------------------------------
6. SORTING AN ARRAY
---------------------------------------------------------------
int arr2[] = {8,6,2,4};
Arrays.sort(arr2);

DEFINITION:
• Sorts the array in ascending order using Dual-Pivot QuickSort.

OUTPUT:
      [2, 4, 6, 8]

---------------------------------------------------------------
7. PRINTING ARRAY CONTENT PROPERLY
---------------------------------------------------------------
System.out.println(Arrays.toString(arr2));

DEFINITION:
• Converts the array to a readable string format.

USAGE:
• Much better than printing array reference.

---------------------------------------------------------------
8. EXAM QUICK RECAP
---------------------------------------------------------------
• Arrays are objects stored in heap.
• Printing an array reference prints internal JVM code (not values).
• getClass().getName() shows:
      [I  → 1D int array
      [[I → 2D int array
• Arrays.sort() → ascending order
• Arrays.toString() → readable array output
• A class object without toString() prints hashCode form.

===============================================================
END OF NOTES
===============================================================
*/
