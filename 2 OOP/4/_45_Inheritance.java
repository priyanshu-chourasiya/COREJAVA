class Plane1{
    final int age = 10; // final keyword can be assigned to a variable
    final public void fly(){
        age = 90; // cannot assign value to a final variable (cannot be reasigned)
        System.out.println("Plane 1 is flying");
    }
}
class FighterPlane extends Plane1{
    // public void fly(){ // we cannot override final method
    //     System.out.println("Plane 1 is flying");
    // }
}
public class _45_Inheritance {
    public static void main(String[] args) {
        FighterPlane fp = new FighterPlane();
        fp.fly();
    }
    
}
// final can be applied to static variable , static method, cannot to constructor
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _45_Inheritance (Final Variables & Methods)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the **final keyword** applied to **variables** and **methods** in Java.  
It shows that:  
- Final variables **cannot be reassigned**  
- Final methods **cannot be overridden**  
- Both can still participate in inheritance, but with restrictions.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

FINAL VARIABLE  
- Declared using `final` keyword  
- Value assigned at declaration cannot be changed later  
- Example: `final int age = 10` → any reassignment like `age = 90` will cause compile-time error

FINAL METHOD  
- Declared using `final` keyword  
- Cannot be overridden in a subclass  
- Inherited normally and can be called by child objects

INHERITANCE WITH FINAL MEMBERS  
- Final methods and variables **do participate in inheritance**  
- Final method cannot be overridden; final variable cannot be modified in child class


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Plane1`  
- `final int age = 10` → final variable, cannot be reassigned  
- `final public void fly()` → final method, cannot be overridden  
- Attempt to assign `age = 90` inside `fly()` is **illegal** → compile-time error  

CLASS `FighterPlane`  
- Extends `Plane1`  
- Attempting to override `fly()` is **illegal** due to `final`  

MAIN METHOD  
- Creates `FighterPlane` object `fp`  
- Calls `fp.fly()` → executes inherited final method from `Plane1`


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`age` (Plane1)  
- Final instance variable  
- Cannot be reassigned after initialization  

`fly()` (Plane1)  
- Final method  
- Prints message (or attempted assignment to final variable will cause error)  
- Cannot be overridden in `FighterPlane`  

`FighterPlane`  
- Inherits `age` and `fly()`  
- Cannot modify `age` or override `fly()`  

MAIN METHOD  
- Demonstrates inherited final method invocation using child object


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`  

② `FighterPlane fp = new FighterPlane();` → object of child class created  

③ `fp.fly()` executes:  
   - Calls inherited final method `Plane1.fly()`  
   - Attempting `age = 90` will cause **compile-time error**  

④ Program ends (if `age = 90` line is removed, prints "Plane 1 is flying")  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Plane 1 is flying  
(Note: If `age = 90` line remains, code will not compile)


7. ADDITIONAL NOTES
-------------------------------------------------
- `final` keyword can be applied to:  
  - **Variables** → cannot be reassigned  
  - **Methods** → cannot be overridden  
  - **Classes** → cannot be extended  
- Final **cannot be applied to constructors**  
- Static variables and methods can also be declared final, restricting reassignment or overriding respectively  
- Final variables are often used for constants  


------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
