class Parent{

    Parent() {
        System.out.println("Parent zero para constructor");
    }
    
}
class Alien extends Parent{
    Alien(){
        // super()
    }
}
public class _34_Inheritance {
    public static void main(String[] args) {
        Alien a = new Alien();
        
    }
    
}
/*
 * constructor never participate in inheritance
 * in the backend alien constructor is called and by default it is calling the super which
 * refers to parent constructor
 * 
 * they do get executed when we create instance of child class because of super method call present in child class 
 * constructor
 * 
 * inherited method : methods from parent which child uses without modification as it is
 * overridden method : methods from parent which child uses after modifiying them
 * specialized method : methods in child which are not inherited
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _34_Inheritance (Parent & Alien)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the behavior of constructors in inheritance.  
It shows that constructors are **not inherited** but the child class constructor
implicitly calls the parent class constructor via `super()`.  
This ensures proper initialization of the parent part of the object when a 
child object is created.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

CONSTRUCTOR INHERITANCE RULES  
- Constructors are **never inherited** in Java.  
- Every child class constructor automatically calls the no-argument constructor
  of its parent class using an implicit `super()` if no explicit call is made.

IMPLICIT SUPER CALL  
- If the first line of a child constructor does not explicitly call another constructor
  (using `super(...)` or `this(...)`), Java automatically inserts `super()`.  
- This ensures parent initialization occurs.

METHOD TYPES IN INHERITANCE  
- Inherited method: used by child without changes  
- Overridden method: child modifies parent’s method  
- Specialized method: defined only in child


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Parent`  
- Has zero-parameter constructor → prints "Parent zero para constructor"

CLASS `Alien`  
- Extends Parent  
- Constructor has no explicit `super()` → JVM automatically inserts it.  
- Ensures the Parent constructor executes before Alien constructor (though Alien constructor has no additional code)

MAIN METHOD  
- Creates an `Alien` object  
- Triggers execution of Parent constructor automatically via implicit `super()`


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

Parent constructor  
- Prints "Parent zero para constructor"  
- Initializes the parent part of the object

Alien constructor  
- Implicitly calls `super()`  
- Ensures parent constructor runs before child constructor body

MAIN METHOD  
- Instantiates Alien to demonstrate constructor chaining


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Alien a = new Alien();` → object creation starts

③ JVM calls `Alien()` constructor

④ Since there is no explicit call to `super()`, JVM inserts `super()` as the first statement

⑤ `Parent()` constructor executes → prints:  
    "Parent zero para constructor"

⑥ Alien constructor body executes → empty in this case

⑦ Object creation completes, program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Parent zero para constructor


7. ADDITIONAL NOTES
-------------------------------------------------
- Constructors are **not inherited**, but always executed via `super()` when creating child objects.  
- This ensures proper initialization of parent state in child objects.  
- Inherited vs overridden vs specialized methods:  
  - Inherited: parent method used without change  
  - Overridden: parent method modified in child  
  - Specialized: method defined only in child

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
