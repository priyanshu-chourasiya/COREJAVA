class Animal{
    public void eat(){
        System.out.println("Animal is eating");
    }
    public void run(){
        System.out.println("Animal is running");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger is eating");
    }
    public void run(){
        System.out.println("Tiger is running");
    }
}
class Monkey extends Animal{
    public void eat(){
        System.out.println("Monkey is eating");
    }
    public void run(){
        System.out.println("Monkey is running");
    }
}
class Forest{
    public void permit(Animal animal){
        animal.eat();
        animal.run();
    }
}
public class _49_Polymorphism {
    public static void main(String[] args) {
        Tiger t = new Tiger();

        Monkey m = new Monkey();

        Forest f = new Forest();

        f.permit(m);
        f.permit(t);
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _49_Polymorphism (Polymorphism with Animal Hierarchy)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **runtime polymorphism** in Java using an animal hierarchy.  
It shows how a **single method in Forest** can handle multiple animal types and call their overridden methods dynamically at runtime.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

RUNTIME POLYMORPHISM / METHOD OVERRIDING  
- Child classes (`Tiger`, `Monkey`) override methods `eat()` and `run()` from parent class `Animal`  
- When a parent class reference refers to a child object, the **child's overridden method executes at runtime**  

POLYMORPHIC METHOD PARAMETER  
- Method `permit(Animal animal)` accepts a parent class reference  
- Allows passing objects of any subclass (`Tiger`, `Monkey`) → demonstrates **1:M polymorphism**  

DYNAMIC METHOD DISPATCH  
- Overridden methods are resolved at runtime based on the actual object type


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Animal`  
- Parent class with methods:  
  - `eat()` → prints "Animal is eating"  
  - `run()` → prints "Animal is running"

CLASS `Tiger` extends `Animal`  
- Overrides `eat()` → "Tiger is eating"  
- Overrides `run()` → "Tiger is running"

CLASS `Monkey` extends `Animal`  
- Overrides `eat()` → "Monkey is eating"  
- Overrides `run()` → "Monkey is running"

CLASS `Forest`  
- Method `permit(Animal animal)`  
- Accepts parent reference and calls `eat()` and `run()`  
- Executes overridden methods of actual object passed  


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`t` → `Tiger` object  
- Demonstrates child object passed to polymorphic method  

`m` → `Monkey` object  
- Demonstrates another child object passed to same polymorphic method  

`f` → `Forest` object  
- Calls `permit()` method with different animal objects  

`permit(Animal animal)`  
- Parent reference parameter allows runtime polymorphism  
- Invokes overridden methods dynamically


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `Tiger t = new Tiger();` → creates Tiger object  
② `Monkey m = new Monkey();` → creates Monkey object  
③ `Forest f = new Forest();` → creates Forest object  

④ `f.permit(m);`  
   - `animal` refers to `Monkey`  
   - `animal.eat()` → "Monkey is eating"  
   - `animal.run()` → "Monkey is running"  

⑤ `f.permit(t);`  
   - `animal` refers to `Tiger`  
   - `animal.eat()` → "Tiger is eating"  
   - `animal.run()` → "Tiger is running"  


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Monkey is eating  
Monkey is running  
Tiger is eating  
Tiger is running  


7. ADDITIONAL NOTES
-------------------------------------------------
- Demonstrates **polymorphic method parameters**: single method can handle multiple object types  
- Overridden methods follow **dynamic dispatch** → actual object type determines method execution  
- Core OOP principle for **flexible and reusable code**  
- No downcasting needed in this example because all methods are common and overridden in child classes  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
