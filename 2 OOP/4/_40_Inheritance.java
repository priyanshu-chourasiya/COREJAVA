class Plane{

}
class FighterPlane extends Plane{

}
class Animal{
    public void eat(){
        System.out.println("Animals are eating");
    }
    void sleep(){
        System.out.println("Animals are sleeping");
    }
    public Plane run(){
        System.out.println("Animal is running");
        Plane p = new Plane();
        return p;
    } 
}
class Tiger extends Animal{
    // void eat(){ error cannot reduce visibility (public -> default)
    //     System.out.println("Tiger hunts and eats");
    // }
    protected void sleep(){ // we can increase visibility of overridden methods
        System.out.println("Tiger is sleeping");
    }

    // public int run(){ // the primitive return type cannot be changed
    //     System.out.println("Tiger is running to hunt");
    //     return 20;
    // }
    public FighterPlane run(){ // co varient return type (where is-a relationship)
        System.out.println("Tiger is running");
        FighterPlane fp = new FighterPlane();
        return fp;
    }
}
public class _40_Inheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
    
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _40_Inheritance (Animal & Tiger, Method Overriding & Covariant Return)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates **method overriding rules in Java**, including:  
- Access modifier restrictions  
- Return type constraints  
- Covariant return types in overridden methods  
It also shows the effect of inheritance on method accessibility.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

METHOD OVERRIDING  
- A subclass can redefine a method from its superclass with the **same signature**.  
- Rules:  
  1. Access modifier cannot be **more restrictive** than parent method  
  2. Return type must be the same or covariant (object types)  
  3. Primitive return types cannot be changed  

COVARIANT RETURN TYPE  
- Overridden method in child class can return a type that is a **subclass of the parent method’s return type**  
- Example: `Animal.run()` returns `Plane`, overridden `Tiger.run()` returns `FighterPlane`  

ACCESS MODIFIERS IN OVERRIDING  
- Parent method `public` → cannot override with `default` (reducing visibility)  
- Parent method `default` → can override with `protected` or `public` (increasing visibility)  

INHERITANCE  
- Tiger inherits methods from Animal (`eat()`, `sleep()`, `run()`)  
- Child can override these methods respecting above rules


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Animal`  
- `eat()` → public, prints "Animals are eating"  
- `sleep()` → default, prints "Animals are sleeping"  
- `run()` → public, returns `Plane`, prints "Animal is running"

CLASS `Tiger`  
- Overrides `sleep()` → protected, prints "Tiger is sleeping" (visibility increased)  
- Overrides `run()` → public, returns `FighterPlane` (covariant return), prints "Tiger is running"  
- Cannot override `eat()` with reduced visibility (public → default) → commented out  
- Cannot change `run()` to return primitive → commented out

MAIN METHOD  
- Creates `Tiger` object `t`  
- Calls `t.eat()` → executes inherited `Animal.eat()` → prints "Animals are eating"


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`Plane` & `FighterPlane` classes  
- Empty classes to demonstrate covariant return types in overriding

`eat()` (Animal)  
- Prints eating message  
- Cannot be overridden with reduced visibility

`sleep()` (Animal → Tiger)  
- Demonstrates increasing visibility in overridden method

`run()` (Animal → Tiger)  
- Demonstrates covariant return type  
- `Tiger.run()` returns `FighterPlane`, subclass of `Plane`  

MAIN METHOD  
- Demonstrates inheritance and method accessibility


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Tiger t = new Tiger();` → object created

③ `t.eat();` executes:  
   - Method inherited from `Animal`  
   - Prints: "Animals are eating"

④ Program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Animals are eating


7. ADDITIONAL NOTES
-------------------------------------------------
- Overridden methods must follow visibility and return type rules  
- Access modifiers can be **increased**, not decreased  
- Primitive return types cannot change in overriding  
- Covariant return types allow child class to return subtype of parent return type  
- Tiger inherits `eat()` as-is, overrides `sleep()` and `run()` with valid rules

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
