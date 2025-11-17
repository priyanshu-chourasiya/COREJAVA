class Demo{
    // static int a;
    
    // static{
    //     a = 10;  // valid
    // }
    // ========================================================
    // static {
    //     // a = 10;
    //     System.out.println(a); // error
    // }
    // static int a;

    static {
        display();
    }
    static int a = 10;

    public static void display(){
        System.out.println(a);
    }

}
public class _28_Static {
    public static void main(String[] args) {
        Demo.display();
        Demo d1 = new Demo();
        d1.display();
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _28_Static (Demo)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates:
- The order of static variable initialization and static block execution in Java.
- That static methods can be called from static blocks.
- The behavior of accessing a static variable before and after its declaration.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

STATIC VARIABLE  
- Belongs to the class, shared across all instances.  
- Initialized when the class is loaded.  
- Initialization order matters: variables are initialized in the order they appear in the source code.

STATIC BLOCK  
- Executes when the class is loaded.  
- Can call static methods.

STATIC METHOD  
- Can be invoked using the class name or inside static blocks.  
- Can access static variables (subject to initialization order).


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

STATIC VARIABLE `a`  
- Declared as `static int a = 10;`  
- Initialized after the static block in source code.  
- Before this initialization, `a` holds the default value 0 (as per JVM rules).

STATIC BLOCK  
- Executes `display()` before `a` is explicitly assigned 10.  
- Prints the default value of `a` → 0

STATIC METHOD `display()`  
- Prints the current value of `a`.  
- Called both inside static block and from main method.

MAIN METHOD  
- Calls `Demo.display()` → prints `10`  
- Creates `Demo d1 = new Demo();` → no constructor output  
- Calls `d1.display()` → prints `10` again


4. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① JVM loads `Demo` class for the first time (due to reference in main).  
② Static block executes:  
    - Calls `display()`  
    - At this moment, `a` has default value 0 (because it is declared **after** the static block)  
    - Prints: 0

③ Static variable `a` is initialized to 10.

④ Program enters `main()`.

⑤ `Demo.display();` executes:  
    - Prints `a = 10`

⑥ `Demo d1 = new Demo();`  
    - Constructor is default, does nothing special.

⑦ `d1.display();` executes:  
    - Prints `a = 10`


5. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

STATIC VARIABLE `a`  
- Holds the class-level integer.  
- Demonstrates initialization order: accessed before explicit assignment → default 0.

STATIC BLOCK  
- Calls `display()` to show value of `a` at class-load time.

STATIC METHOD `display()`  
- Prints the current value of `a`.

MAIN METHOD  
- Calls static method and creates an object to illustrate static variable access and initialization order.


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
0  
10  
10


------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
