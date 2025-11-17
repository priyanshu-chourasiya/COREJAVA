public class _23_Static {

    static int a;
    static {
        a = 10;
        System.out.println(a);
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _23_Static
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates how a *static variable* and a *static block*
behave in Java, specifically showing that:
- The static block executes automatically when the class is loaded.
- Static variables can be initialized inside the static block.
- The main method runs only after all static initialization completes.


2. IMPORTANT CONCEPTS (ONLY THOSE PRESENT IN THIS CODE)
--------------------------------------------------------

STATIC VARIABLE  
- A variable that belongs to the class itself, not to any object.  
- It is created when the class is loaded and exists until the program ends.

STATIC BLOCK  
- A block that executes automatically when the class is loaded into memory.  
- Used for initializing static variables or performing setup tasks  
  before the main method runs.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

STATIC VARIABLE `a`  
- Declared at the class level.  
- Assigned the value `10` inside the static block.  
- Printed inside the static block before "Static block".

STATIC BLOCK  
- Runs before the main method.  
- Initializes `a` to 10.  
- Prints the value of `a`.  
- Prints "Static block".

MAIN METHOD  
- Executes after the static block.  
- Prints "Main method".


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

VARIABLE  
- `static int a;`  
  Holds a single integer value shared by the entire class.  
  It is initialized in the static block.

STATIC BLOCK  
- Initializes the static variable `a`.  
- Prints `a` and a message indicating the static block has executed.

MAIN METHOD  
- Entry point of the program (after static initialization finishes).  
- Prints "Main method" to show the program has begun normal execution.


5. FULL CONTROL FLOW (START → END)
----------------------------------

① The class `_23_Static` is loaded by the JVM.  
② Immediately upon loading, the static block executes:  
   - `a` is assigned the value `10`.  
   - `System.out.println(a);` outputs `10`.  
   - `System.out.println("Static block");` outputs `Static block`.

③ After class loading is complete, the main method starts.  
④ `System.out.println("Main method");` outputs `Main method`.  
⑤ Program ends.


6. EXACT OUTPUT WHEN PROGRAM RUNS
---------------------------------
10  
Static block  
Main method

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
