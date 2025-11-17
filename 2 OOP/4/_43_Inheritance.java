final class Plane1{
    public void fly(){
        System.out.println("Plane 1 is flying");
    }
}
class FighterPlane extends Plane{
    public void fly(){
        System.out.println("Fighter plane is flying");
    }
}
public class _43_Inheritance {
    public static void main(String[] args) {
        
    }
    
}
// final class will not participate in inheritance
/*
 * final keyword can be applied to a class
 * we cannot inherite final class 
 * 
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _43_Inheritance (Final Class)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the use of the `final` keyword on a class in Java and its effect on inheritance.  
It highlights that a `final` class **cannot be subclassed**, preventing any inheritance.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

FINAL CLASS  
- A class declared with `final` cannot be extended (inherited) by any other class  
- Ensures that the class implementation remains **unchanged**  

INHERITANCE RESTRICTION  
- Attempting to extend a `final` class results in a **compile-time error**  

METHODS IN FINAL CLASS  
- Methods in a final class can be declared normally  
- Cannot be overridden indirectly because subclassing is not allowed  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Plane1`  
- Declared as `final`  
- Method `fly()` → prints "Plane 1 is flying"  

CLASS `FighterPlane`  
- Attempts to extend `Plane` (should have been `Plane1` to trigger error)  
- Would result in a **compile-time error** if tried to extend a final class  

MAIN METHOD  
- Empty, nothing executes  
- Demonstrates that no inheritance is possible from a final class  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`Plane1`  
- Final class → cannot be inherited  
- Contains method `fly()` as example method

`FighterPlane`  
- Attempt to extend final class → demonstrates inheritance restriction  

MAIN METHOD  
- Placeholder, program does not perform any runtime operation  


5. FULL CONTROL-FLOW EXPLANATION
--------------------------------------------------
- Program does not execute any output  
- Compile-time restriction prevents subclassing of `Plane1`  
- If `FighterPlane` tried to extend `Plane1`, compiler throws error  
- Ensures that final class remains independent and unchanged  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
No output (main method is empty)  
If `FighterPlane extends Plane1` → compile-time error: "Cannot inherit from final class"


7. ADDITIONAL NOTES
-------------------------------------------------
- `final` keyword can also be applied to:  
  - **Methods** → cannot be overridden  
  - **Variables** → value cannot be changed (constant)  
- Using `final` on classes is useful for security and immutability  
- Final classes are commonly used in Java API (e.g., `String` class)  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
