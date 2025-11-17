class AeroPlane{
    void fly(){
        System.out.println("Aeroplace is flying");
    }
    void landing(){
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane extends AeroPlane{
    void fly(){
        System.out.println("Cargo plane is flying");
    }
    void takeOff(){
        System.out.println("Cargo is taking off");
    }
}
class PassangerPlane extends CargoPlane{

}
public class _35_Inheritance {
    public static void main(String[] args) {
        // CargoPlane cp = new CargoPlane();
        // cp.fly();
        // cp.landing();
        

        AeroPlane pp = new PassangerPlane(); // upcasting creating parent type reference for child object
        // refrence variable (same type or parent type)
        pp.fly();
        pp.landing();
        // only in one case the reference varible can be of different type 
        // only of its parent type
        //pp.takeOff();

        ((CargoPlane) pp).takeOff(); // downcasting : temporarly changing parent type reference to child type
        // so that we can access specialized methods in child class
        // way to access specialized behaviour


    }   
}

/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _35_Inheritance (AeroPlane, CargoPlane, PassangerPlane)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates:
- Method overriding in inheritance
- Upcasting and downcasting
- Accessing specialized methods of a subclass using parent reference


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

METHOD OVERRIDING  
- A subclass provides its own implementation of a method defined in the parent class.  
- Here: `CargoPlane.fly()` overrides `AeroPlane.fly()`.  
- Ensures runtime polymorphism: the method called is determined by the actual object type.

UPCASTING  
- Creating a parent type reference to point to a child object.  
- Example: `AeroPlane pp = new PassangerPlane();`  
- Only parent class methods or overridden methods are accessible via the reference.

DOWNCASTING  
- Temporarily converting a parent reference back to a child type to access child-specific methods.  
- Example: `((CargoPlane) pp).takeOff();`  
- Allows access to specialized methods not available in parent class.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `AeroPlane`  
- Base class with methods `fly()` and `landing()`

CLASS `CargoPlane`  
- Extends AeroPlane  
- Overrides `fly()` to provide specific behavior  
- Adds specialized method `takeOff()`

CLASS `PassangerPlane`  
- Extends CargoPlane  
- Inherits overridden `fly()` and specialized `takeOff()` indirectly

MAIN METHOD  
- Upcasts `PassangerPlane` object to `AeroPlane` reference (`pp`)  
- Calls `fly()` → runtime polymorphism ensures `CargoPlane` version executes  
- Calls `landing()` → inherited from `AeroPlane`  
- Downcasts `pp` to `CargoPlane` to call specialized `takeOff()` method


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`fly()`  
- AeroPlane version: prints "Aeroplace is flying"  
- CargoPlane overrides: prints "Cargo plane is flying"

`landing()`  
- AeroPlane method: prints "Aeroplane is landing"

`takeOff()`  
- Specialized method in CargoPlane: prints "Cargo is taking off"

REFERENCE VARIABLE `pp`  
- Type: AeroPlane (parent)  
- Object: PassangerPlane (child)  
- Demonstrates upcasting

DOWNCASTING `((CargoPlane) pp)`  
- Temporarily treats the parent reference as a CargoPlane  
- Accesses specialized method `takeOff()`


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `AeroPlane pp = new PassangerPlane();`  
   - Upcasting: reference type is AeroPlane, actual object is PassangerPlane

③ `pp.fly();`  
   - Runtime polymorphism: CargoPlane’s overridden `fly()` executes → prints  
     "Cargo plane is flying"

④ `pp.landing();`  
   - No overriding → AeroPlane’s `landing()` executes → prints  
     "Aeroplane is landing"

⑤ `((CargoPlane) pp).takeOff();`  
   - Downcasting parent reference to CargoPlane  
   - Calls specialized method → prints "Cargo is taking off"

⑥ Program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Cargo plane is flying  
Aeroplane is landing  
Cargo is taking off


7. ADDITIONAL NOTES
-------------------------------------------------
- Upcasting allows a parent type reference to point to child objects  
  → only parent or overridden methods accessible directly  
- Downcasting allows access to child-specific methods  
- Overridden methods follow runtime polymorphism (actual object determines method execution)  
- Specialized methods in child cannot be accessed directly through parent reference without casting

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
