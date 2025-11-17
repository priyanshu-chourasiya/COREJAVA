class Alien{
    static {
        System.out.println("static 1");
    }
    static {
        System.out.println("static 2");
    }
    {
        System.out.println("instance 1");
    }
    {
        System.out.println("instance 2");
    }
}
public class _27_Static {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        
        Alien a2 = new Alien();

    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _27_Static (Alien)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the execution order of:
- Static blocks  
- Instance initialization blocks  
- Object creation in Java

Specifically, it shows that:
- Static blocks execute once when the class is loaded.  
- Instance blocks execute each time an object is created, in the order they appear.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

STATIC BLOCKS  
- Run once when the class is loaded.  
- Can be multiple; execute in the order they appear in the class.

INSTANCE INITIALIZATION BLOCKS  
- Run every time an object is created, before the constructor.  
- Execute in the order they appear in the class.

OBJECT CREATION  
- Triggers instance initialization blocks each time.  
- Static blocks do not execute again after the first object.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

STATIC BLOCKS  
- `static { System.out.println("static 1"); }`  
- `static { System.out.println("static 2"); }`  
- Execute once when the Alien class is loaded.

INSTANCE INITIALIZATION BLOCKS  
- `{ System.out.println("instance 1"); }`  
- `{ System.out.println("instance 2"); }`  
- Execute every time an Alien object is created.

MAIN METHOD  
- Creates two Alien objects: `a1` and `a2`.  
- Triggers instance block execution for each object.


4. PURPOSE OF EVERY BLOCK AND STATEMENT
---------------------------------------

STATIC BLOCKS  
- Print "static 1" and "static 2" when class is loaded.  
- Show that static blocks execute once in order of appearance.

INSTANCE BLOCKS  
- Print "instance 1" and "instance 2" for each object creation.  
- Demonstrate execution order of multiple instance blocks.

MAIN METHOD  
- Triggers class loading (executing static blocks).  
- Creates two objects to demonstrate repeated instance block execution.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program starts; main method begins.  
② Class `Alien` is loaded by JVM.  
    - First static block executes → prints "static 1"  
    - Second static block executes → prints "static 2"

③ `Alien a1 = new Alien();`  
    - Instance block 1 executes → prints "instance 1"  
    - Instance block 2 executes → prints "instance 2"

④ `Alien a2 = new Alien();`  
    - Instance block 1 executes → prints "instance 1"  
    - Instance block 2 executes → prints "instance 2"

⑤ Program ends.


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
static 1  
static 2  
instance 1  
instance 2  
instance 1  
instance 2


------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
