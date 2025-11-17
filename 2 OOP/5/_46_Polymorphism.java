class Aeroplane{
    public void takingOff(){
        System.out.println("Plane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Plane is landing");
    }
}
class CargoPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("CargoPlane must take off in order to fly");
    }

    public void fly(){
        System.out.println("Cargoplane is flying");
    }
}
class FighterPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("FighterPlane must take off in order to fly");
    }

    public void fly(){
        System.out.println("Fighterplane is flying");
    }
}
public class _46_Polymorphism {
    public static void main(String[] args) {
        Aeroplane cp = new CargoPlane(); // creating parent class referce for child class object
        cp.takingOff();
        cp.landing();
        //cp.fly(); error
        ((CargoPlane) cp).fly();


        Aeroplane fp = new FighterPlane();
        fp.takingOff();
        fp.landing();
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _46_Polymorphism (Runtime Polymorphism & Downcasting)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **runtime polymorphism** (method overriding) and **downcasting** in Java.  
It shows how a parent class reference can refer to child objects, and how overridden methods behave at runtime.  
It also demonstrates accessing child-specific methods using **downcasting**.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

RUNTIME POLYMORPHISM (METHOD OVERRIDING)  
- When a child class provides a new implementation of a method defined in parent class  
- Parent class reference can call overridden methods, **child implementation executes at runtime**  

UPCASTING  
- Creating a parent class reference for a child class object  
- Example: `Aeroplane cp = new CargoPlane();`  
- Only parent methods are accessible via reference (unless downcasted)  

DOWNCASTING  
- Temporarily casting a parent reference back to child type to access child-specific methods  
- Example: `((CargoPlane) cp).fly();`  
- Allows access to specialized behavior in child  

METHOD ACCESS RULES  
- Overridden methods → runtime polymorphism (child executes)  
- Specialized child-only methods → require downcasting  
- Non-overridden parent methods → accessible directly via parent reference


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Aeroplane`  
- `takingOff()` → prints "Plane must take off in order to fly"  
- `landing()` → prints "Plane is landing"

CLASS `CargoPlane` extends `Aeroplane`  
- Overrides `takingOff()` → prints "CargoPlane must take off in order to fly"  
- Specialized method `fly()` → prints "Cargoplane is flying"

CLASS `FighterPlane` extends `Aeroplane`  
- Overrides `takingOff()` → prints "FighterPlane must take off in order to fly"  
- Specialized method `fly()` → prints "Fighterplane is flying"

MAIN METHOD  
- Demonstrates **upcasting**: `Aeroplane cp = new CargoPlane();`  
- Calls overridden methods → child version executes (`takingOff()`)  
- Calls parent method → executes as-is (`landing()`)  
- Uses **downcasting** to access child-only method `fly()`  
- Repeats same for `FighterPlane`


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`cp` (Aeroplane reference)  
- Refers to `CargoPlane` object  
- Demonstrates runtime polymorphism for overridden methods

`fp` (Aeroplane reference)  
- Refers to `FighterPlane` object  
- Demonstrates runtime polymorphism for overridden methods

`takingOff()`  
- Overridden in child classes  
- Demonstrates method overriding and polymorphic behavior

`landing()`  
- Defined only in parent  
- Executes normally via parent reference

`fly()`  
- Specialized method in child classes  
- Requires downcasting to access


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `Aeroplane cp = new CargoPlane();` → parent reference to child object  

② `cp.takingOff()` → overridden method in `CargoPlane` executes → prints "CargoPlane must take off in order to fly"  

③ `cp.landing()` → parent method executes → prints "Plane is landing"  

④ `((CargoPlane) cp).fly()` → downcast to child, prints "Cargoplane is flying"  

⑤ `Aeroplane fp = new FighterPlane();` → parent reference to child object  

⑥ `fp.takingOff()` → overridden method in `FighterPlane` executes → prints "FighterPlane must take off in order to fly"  

⑦ `fp.landing()` → parent method executes → prints "Plane is landing"  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
CargoPlane must take off in order to fly  
Plane is landing  
Cargoplane is flying  
FighterPlane must take off in order to fly  
Plane is landing  


7. ADDITIONAL NOTES
-------------------------------------------------
- Overridden methods are dynamically bound (runtime polymorphism)  
- Specialized methods can only be accessed via **downcasting**  
- Upcasting is safe and allows polymorphic behavior but restricts access to child-only methods  
- Casting incorrectly will result in `ClassCastException` at runtime  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
