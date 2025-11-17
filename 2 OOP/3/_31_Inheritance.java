class AeroPlane{
    void fly(){
        System.out.println("Aeroplace is flying");
    }
    void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane extends AeroPlane{

}
class PassangerPlane extends CargoPlane{

}
public class _31_Inheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.fly();
        cp.landing();
        

        PassangerPlane pp = new PassangerPlane();
        pp.fly();
        pp.landing();



    }   
}
/*
 * inheritance refers to the process of acquiring properties and behaviour(methods) of another class
 * it is also refers to writing code hierarchy of class rather than a class
 * 
 * inheritance can be acheived using extends keyword
 * 
 * Inheritance promotes is-a relationship
 * 
 * a class which requires properties and behaviours(methods) of another class is refered as child class
 * or derived class or sub class
 * 
 * class which is acquiring is called parent class or base class or super class
 * 
 * a class can have many child classes 
 * one parent class can have multiple child classes
 * 
 * default nautre of java that most upper class which dont extents any class extends a class Object
 * Object class is parent of all classes
 * 
 * multiple inheritance is not allowed in java i.e., a class cannot extends multiple classes or
 * one child class cannot have multiple parent classes as it will lead to ambiguity and diamond shape problem
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _31_Inheritance (AeroPlane Hierarchy)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates multi-level inheritance in Java.  
It shows that a subclass inherits methods from its parent and grandparent
classes. Objects of subclasses can call inherited methods without redefining them.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

MULTI-LEVEL INHERITANCE  
- A class inherits from a parent class, which in turn may inherit from another class.  
- Here: AeroPlane → CargoPlane → PassangerPlane.

METHOD INHERITANCE  
- Subclasses automatically acquire all non-private methods from parent classes.

IS-A RELATIONSHIP  
- Each subclass is a specialized type of its parent:  
  CargoPlane is-a AeroPlane  
  PassangerPlane is-a CargoPlane (and is also an AeroPlane indirectly)


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `AeroPlane`  
- Superclass with methods:  
  - `fly()` → prints "Aeroplace is flying"  
  - `landing()` → prints "Aeroplane is landing"

CLASS `CargoPlane`  
- Extends AeroPlane.  
- Inherits `fly()` and `landing()`.

CLASS `PassangerPlane`  
- Extends CargoPlane.  
- Inherits `fly()` and `landing()` indirectly from AeroPlane.

MAIN METHOD  
- Creates `CargoPlane` object `cp` → calls `fly()` and `landing()`  
- Creates `PassangerPlane` object `pp` → calls `fly()` and `landing()`  
- Demonstrates multi-level inheritance.


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`fly()`  
- Prints "Aeroplace is flying"  
- Inherited by CargoPlane and PassangerPlane

`landing()`  
- Prints "Aeroplane is landing"  
- Inherited by CargoPlane and PassangerPlane

CLASS `CargoPlane`  
- Child of AeroPlane; inherits behavior.  
- No new methods or variables defined.

CLASS `PassangerPlane`  
- Child of CargoPlane; inherits behavior from both CargoPlane and AeroPlane.

MAIN METHOD  
- Creates objects and demonstrates method inheritance across multiple levels.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `CargoPlane cp = new CargoPlane();`  
    - Object created.  
    - `cp.fly()` → calls AeroPlane's `fly()` → prints "Aeroplace is flying"  
    - `cp.landing()` → calls AeroPlane's `landing()` → prints "Aeroplane is landing"

③ `PassangerPlane pp = new PassangerPlane();`  
    - Object created.  
    - `pp.fly()` → inherited via CargoPlane → prints "Aeroplace is flying"  
    - `pp.landing()` → inherited via CargoPlane → prints "Aeroplane is landing"

④ Program ends.


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Aeroplace is flying  
Aeroplane is landing  
Aeroplace is flying  
Aeroplane is landing


7. ADDITIONAL NOTES ON INHERITANCE (FROM COMMENTS)
--------------------------------------------------
- Inheritance allows reusing properties and behaviors of another class.  
- Achieved using `extends` keyword.  
- Promotes an IS-A relationship.  
- Parent class: base/super class; Child class: derived/sub class  
- One parent can have multiple children.  
- Java classes without explicit parent extend `Object` by default.  
- Multiple inheritance (a class extending multiple classes) is not allowed in Java to prevent ambiguity (diamond problem).

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
