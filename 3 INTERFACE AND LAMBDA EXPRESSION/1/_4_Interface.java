// interface Demo1{
//     void disp();

// }
// interface Demo2 implements Demo1{ not possible

// }
interface Demo1{
    void disp();

}
interface Demo2 extends Demo1{ 
    void show();
}
class Alpha implements Demo2{
    public void disp(){
        System.out.println("Alpha class");
    }
    public void show(){
        System.out.println("Focus is key");
    }
}
public class _4_Interface {
    public static void main(String[] args) {
        Demo1 d = new Alpha();
        d.disp();

        Demo2 d2 = new Alpha();
        d2.disp();
        d2.show();
        
    }
}
/*
 * an interface cannot implement another interface
 * an interface can extend another interface
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _4_Interface (Interface Inheritance)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **interface inheritance** in Java.  
It shows how an interface can **extend another interface**, and how a class implementing the child interface must override **all methods** from both parent and child interfaces.  
It also demonstrates using interface references for polymorphism.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INTERFACE EXTENDING INTERFACE  
- `interface Demo2 extends Demo1` → `Demo2` inherits all methods from `Demo1`  
- A class implementing `Demo2` must provide concrete implementations for **all methods from Demo1 and Demo2**  

INTERFACE IMPLEMENTATION  
- `class Alpha implements Demo2` → must override both `disp()` (from Demo1) and `show()` (from Demo2)  

POLYMORPHISM USING INTERFACE REFERENCE  
- Interface references (`Demo1 d`, `Demo2 d2`) can refer to objects of implementing class  
- Allows access only to the methods declared in that interface reference  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

INTERFACE `Demo1`  
- Declares one method: `disp()`  

INTERFACE `Demo2`  
- Extends `Demo1` → inherits `disp()`  
- Adds new method: `show()`  

CLASS `Alpha`  
- Implements `Demo2`  
- Overrides `disp()` → prints "Alpha class"  
- Overrides `show()` → prints "Focus is key"  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`Demo1 d = new Alpha();`  
- Interface reference to parent interface (`Demo1`)  
- Can only call `disp()` → prints "Alpha class"  

`Demo2 d2 = new Alpha();`  
- Interface reference to child interface (`Demo2`)  
- Can call both `disp()` and `show()`  
- Prints "Alpha class" and "Focus is key"  

Methods `disp()` and `show()`  
- Provide concrete behavior for interface methods in implementing class  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `Demo1 d = new Alpha();` → creates `Alpha` object referred by `Demo1`  
② `d.disp()` → calls `Alpha.disp()` → prints "Alpha class"  

③ `Demo2 d2 = new Alpha();` → creates `Alpha` object referred by `Demo2`  
④ `d2.disp()` → calls `Alpha.disp()` → prints "Alpha class"  
⑤ `d2.show()` → calls `Alpha.show()` → prints "Focus is key"  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Alpha class  
Alpha class  
Focus is key  


7. ADDITIONAL NOTES
-------------------------------------------------
- **Interface cannot implement another interface**  
- **Interface can extend another interface** → supports multi-level interface inheritance  
- Class implementing child interface must implement **all inherited and new methods**  
- Polymorphic interface references restrict access to only methods declared in that interface  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
