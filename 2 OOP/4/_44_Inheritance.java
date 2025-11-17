class Plane1{
    final public void fly(){
        System.out.println("Plane 1 is flying");
    }
}
class FighterPlane extends Plane1{
    
}
public class _44_Inheritance {
    public static void main(String[] args) {
        FighterPlane fp = new FighterPlane();
        fp.fly();
    }
    
}
// final keyword can be applied to a method
// final methods do participate in inheritance
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _44_Inheritance (Final Method)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the use of the `final` keyword on a method in Java.  
It shows that **final methods can be inherited** but **cannot be overridden** in child classes.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

FINAL METHOD  
- Declared with `final` keyword  
- Prevents overriding in any subclass  
- Ensures the implementation remains unchanged in all child classes

INHERITANCE OF FINAL METHODS  
- Child classes inherit the final method normally  
- The method can be called using child class objects  
- Attempting to override it in child class will cause a **compile-time error**


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Plane1`  
- Method `fly()` → declared `final public`, prints "Plane 1 is flying"  
- Can be inherited by child classes but cannot be overridden

CLASS `FighterPlane`  
- Extends `Plane1`  
- Inherits `fly()` method automatically  

MAIN METHOD  
- Creates `FighterPlane` object `fp`  
- Calls `fp.fly()` → executes inherited final method from `Plane1`  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`fly()` (Plane1)  
- Final method, prints "Plane 1 is flying"  
- Cannot be overridden in child class  

`FighterPlane`  
- Inherits `fly()` method from Plane1  
- No additional behavior  

MAIN METHOD  
- Demonstrates inherited final method invocation using child object  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`  

② `FighterPlane fp = new FighterPlane();` → object of child class created  

③ `fp.fly()` executes:  
   - Calls inherited final method `Plane1.fly()`  
   - Prints "Plane 1 is flying"

④ Program ends  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Plane 1 is flying


7. ADDITIONAL NOTES
-------------------------------------------------
- `final` methods participate in inheritance but cannot be overridden  
- Ensures critical functionality of a method remains unchanged across subclasses  
- Final methods are commonly used for utility methods or methods that should not change behavior in subclasses  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
