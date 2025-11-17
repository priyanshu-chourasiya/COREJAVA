class Demo{
    static int a;
    public static void display(){
        a = 10;
        System.out.println(a);
    }
}
class Demo2 extends Demo{
    public static void display(){ // method hiding 
        a = 10;
        System.out.println(a + " Child class display");
    }
}
public class _42_Inheritance {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.display();
        Demo2.display();
    }
}
// we can inherit static methods but we cannot override
/*
 * static methods do get inherited 
 * but whenever we try to override static methods in child class it will hide the parent 
 * class static method it will behave like a specialized method of child class (overriding would not occur)
 * we cannot override the static methods in child class
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _42_Inheritance (Static Methods & Method Hiding)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **static method inheritance** and **method hiding** in Java.  
It highlights that static methods **cannot be overridden**; instead, the child class can define a **method with the same name**, which hides the parent method.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

STATIC METHODS  
- Belong to the class, not to instances  
- Can be inherited by child classes  
- Cannot be overridden in the usual sense (runtime polymorphism does not apply)  

METHOD HIDING  
- When a child class defines a static method with the same signature as a parent class static method,  
  the child method **hides** the parent method  
- The method called depends on the **reference type or class name**, not the object type  

STATIC VARIABLES  
- Shared across class hierarchy  
- Child class accesses the same static variable as parent unless shadowed


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Demo`  
- `static int a` → class-level variable  
- `static display()` → prints `a = 10`  

CLASS `Demo2` extends `Demo`  
- Defines its own `static display()` → hides parent method  
- Prints `a + " Child class display"`  

MAIN METHOD  
- Creates `Demo2` object `d`  
- Calls `d.display()` → executes **child class method** due to method hiding  
- Calls `Demo2.display()` → executes child class method  
- Demonstrates that **static methods are accessed via class or reference type**


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`a` (Demo / Demo2)  
- Static variable shared between parent and child class  

`display()` (Demo)  
- Prints `a = 10`  
- Inherited by child class (but hidden if child defines method with same signature)

`display()` (Demo2)  
- Hides parent class method  
- Prints `10 Child class display`

MAIN METHOD  
- Demonstrates method hiding using object reference and class name


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Demo2 d = new Demo2();` → object created  

③ `d.display()` executes:  
   - Since `display()` is static, **reference type determines method called**  
   - Reference type is `Demo2` → calls `Demo2.display()`  
   - `a = 10` assigned, prints "10 Child class display"

④ `Demo2.display()` executes:  
   - Directly calls child class static method  
   - Prints "10 Child class display"

⑤ Program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
10 Child class display  
10 Child class display


7. ADDITIONAL NOTES
-------------------------------------------------
- Static methods are **inherited but cannot be overridden**; child defines a new method → method hiding  
- Using object reference to call a static method is legal but not recommended; call via class name is preferred  
- Static variables are shared across the hierarchy unless re-declared (shadowed) in child class  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
