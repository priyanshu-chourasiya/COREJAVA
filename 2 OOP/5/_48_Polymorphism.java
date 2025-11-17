class Aeroplane{
    public void takingOff(){
        System.out.println("Plane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Plane is landing");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("CargoPlane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Cargolane is landing");
    }
    public void fly(){
        System.out.println("Cargoplane is flying");
    }
}
class PassangerPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("PassangerPlane must take off in order to fly");
    }
    public void landing(){
        System.out.println("PassangerPlane is landing");
    }
    public void fly(){
        System.out.println("PassangerPlane is flying");
    }
}
class FighterPlane extends Aeroplane{
    public void takingOff(){
        System.out.println("FighterPlane must take off in order to fly");
    }
    public void landing(){
        System.out.println("Fighterplane is landing");
    }
    public void fly(){
        System.out.println("Fighterplane is flying");
    }
}
class Airport{
    public void permit(Aeroplane ap){
        ap.takingOff();
        ap.fly();
        ap.landing();
    }
}
public class _48_Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        FighterPlane fp = new FighterPlane();
        
        PassangerPlane pp = new PassangerPlane();
        
        Airport a = new Airport();
        a.permit(cp);
        a.permit(fp);
        a.permit(pp);
    }
}
 
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _48_Polymorphism (Polymorphism via Method Parameter)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **runtime polymorphism** in Java by passing **different child class objects** to a method that accepts a **parent class reference**.  
It shows how a **single method** can handle multiple types of planes dynamically using polymorphism.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

RUNTIME POLYMORPHISM / METHOD OVERRIDING  
- Child classes override methods from parent class  
- When parent class reference refers to child objects, **child method executes at runtime**  

UPCASTING  
- Child object is assigned to parent reference implicitly  
- Example: `Aeroplane ap = cp` inside `permit()` method  

POLYMORPHIC METHOD PARAMETER  
- Method accepts a parent class reference as argument  
- Enables **1:M polymorphism**: one method handles many object types  

METHOD DISPATCH  
- Overridden methods are resolved at runtime based on **actual object type**  

SPECIALIZED BEHAVIOR  
- Each child class provides its own implementation for `takingOff()`, `fly()`, `landing()`


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Aeroplane`  
- Parent class with methods `takingOff()`, `landing()`, `fly()` → default implementations  

CLASS `CargoPlane` / `PassangerPlane` / `FighterPlane`  
- Extend `Aeroplane`  
- Override all parent methods → provide specific behavior for each plane type  

CLASS `Airport`  
- Method `permit(Aeroplane ap)`  
- Accepts **parent class reference** and calls `takingOff()`, `fly()`, `landing()`  
- Demonstrates polymorphic behavior for any subclass object  

MAIN METHOD  
- Creates objects of `CargoPlane`, `FighterPlane`, `PassangerPlane`  
- Calls `Airport.permit()` passing each object → demonstrates runtime polymorphism via method parameters  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`cp`, `fp`, `pp`  
- Child class objects representing different plane types  
- Each overrides parent methods for specific behavior  

`Airport a`  
- Object of Airport class used to call `permit()`  

`permit(Aeroplane ap)`  
- Method demonstrating polymorphism  
- `ap` can refer to any subclass object  
- Calls overridden methods dynamically depending on actual object type  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `CargoPlane cp = new CargoPlane();` → creates CargoPlane object  
② `FighterPlane fp = new FighterPlane();` → creates FighterPlane object  
③ `PassangerPlane pp = new PassangerPlane();` → creates PassangerPlane object  

④ `Airport a = new Airport();` → creates Airport object  

⑤ `a.permit(cp);`  
   - `ap` refers to `CargoPlane`  
   - Calls overridden methods:  
     - `takingOff()` → "CargoPlane must take off in order to fly"  
     - `fly()` → "Cargoplane is flying"  
     - `landing()` → "Cargolane is landing"  

⑥ `a.permit(fp);`  
   - `ap` refers to `FighterPlane`  
   - Calls overridden methods:  
     - `takingOff()` → "FighterPlane must take off in order to fly"  
     - `fly()` → "Fighterplane is flying"  
     - `landing()` → "Fighterplane is landing"  

⑦ `a.permit(pp);`  
   - `ap` refers to `PassangerPlane`  
   - Calls overridden methods:  
     - `takingOff()` → "PassangerPlane must take off in order to fly"  
     - `fly()` → "PassangerPlane is flying"  
     - `landing()` → "PassangerPlane is landing"  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
CargoPlane must take off in order to fly  
Cargoplane is flying  
Cargolane is landing  
FighterPlane must take off in order to fly  
Fighterplane is flying  
Fighterplane is landing  
PassangerPlane must take off in order to fly  
PassangerPlane is flying  
PassangerPlane is landing  


7. ADDITIONAL NOTES
-------------------------------------------------
- Polymorphism via **method parameters** allows a single method to handle multiple object types  
- Demonstrates **dynamic method dispatch**: actual method executed depends on object type at runtime  
- Avoids code duplication for methods that operate on multiple subclass objects  
- Core concept for **flexible and maintainable OOP design**  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
