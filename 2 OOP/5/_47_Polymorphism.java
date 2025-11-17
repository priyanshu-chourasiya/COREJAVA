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
public class _47_Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();

        FighterPlane fp = new FighterPlane();
        // int a = 10;
        // long b;
        // b = a;
        Aeroplane ref;
        ref = cp;
        ref.takingOff();
        ref.fly();
        ref.landing();
        System.out.println("______________________");
        ref = fp;   // 1:M  
        ref.takingOff();
        ref.fly();
        ref.landing();
        System.out.println("______________________");

        PassangerPlane pp = new PassangerPlane();
        ref = pp;
        ref.takingOff();
        ref.fly();
        ref.landing();
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _47_Polymorphism (Polymorphic References & Runtime Method Overriding)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **runtime polymorphism** in Java using multiple child classes of a parent class `Aeroplane`.  
It shows how a **single parent class reference** can refer to objects of multiple child types and invoke overridden methods dynamically.  
This is also known as **1:M polymorphism** (one reference, many objects).


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

RUNTIME POLYMORPHISM / METHOD OVERRIDING  
- When a child class provides its own implementation of a method defined in parent class  
- Parent class reference calls overridden methods → **child implementation executes at runtime**  

POLYMORPHIC REFERENCE  
- A variable of parent type can hold reference to any object of its subclass  
- Example: `Aeroplane ref; ref = cp;`  

UPCASTING  
- Assigning a child object to a parent reference  
- Happens implicitly, safe, enables polymorphic behavior  

1:M POLYMORPHISM  
- One reference (`ref`) can refer to **multiple child objects sequentially**  
- Demonstrates flexibility and reuse of parent type references  


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Aeroplane`  
- Parent class with methods `takingOff()`, `landing()`, `fly()` → default implementations  

CLASS `CargoPlane` / `PassangerPlane` / `FighterPlane`  
- Extend `Aeroplane`  
- Override all parent methods → provide specific behavior for each plane type  

MAIN METHOD  
- Creates objects: `CargoPlane cp`, `FighterPlane fp`, `PassangerPlane pp`  
- Declares **polymorphic reference**: `Aeroplane ref`  
- Sequentially assigns child objects to `ref` and calls methods → demonstrates **dynamic dispatch**  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`cp`, `fp`, `pp`  
- Child class objects with overridden methods  
- Represent different plane types  

`ref`  
- Parent class reference used to demonstrate polymorphism  
- Points to different child objects dynamically  

`takingOff()` / `landing()` / `fly()`  
- Overridden in each child class  
- Demonstrates runtime polymorphism when invoked via parent reference  


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `CargoPlane cp = new CargoPlane();` → creates CargoPlane object  

② `FighterPlane fp = new FighterPlane();` → creates FighterPlane object  

③ Declare parent reference `Aeroplane ref;`  

④ Assign `ref = cp;` (upcasting)  
   - `ref.takingOff()` → calls `CargoPlane.takingOff()` → prints "CargoPlane must take off in order to fly"  
   - `ref.fly()` → calls `CargoPlane.fly()` → prints "Cargoplane is flying"  
   - `ref.landing()` → calls `CargoPlane.landing()` → prints "Cargolane is landing"  

⑤ Separator printed → "______________________"  

⑥ Assign `ref = fp;` (upcasting)  
   - `ref.takingOff()` → "FighterPlane must take off in order to fly"  
   - `ref.fly()` → "Fighterplane is flying"  
   - `ref.landing()` → "Fighterplane is landing"  

⑦ Separator printed → "______________________"  

⑧ Assign `ref = pp;` (upcasting)  
   - `ref.takingOff()` → "PassangerPlane must take off in order to fly"  
   - `ref.fly()` → "PassangerPlane is flying"  
   - `ref.landing()` → "PassangerPlane is landing"  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
CargoPlane must take off in order to fly  
Cargoplane is flying  
Cargolane is landing  
______________________  
FighterPlane must take off in order to fly  
Fighterplane is flying  
Fighterplane is landing  
______________________  
PassangerPlane must take off in order to fly  
PassangerPlane is flying  
PassangerPlane is landing  


7. ADDITIONAL NOTES
-------------------------------------------------
- Overridden methods in child classes are **dynamically dispatched** at runtime  
- Parent reference cannot access child-only methods (no casting used here)  
- 1:M polymorphism allows **reuse of single reference** to handle multiple object types  
- Enhances flexibility, reduces code duplication, and demonstrates core concept of **OOP polymorphism**  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
