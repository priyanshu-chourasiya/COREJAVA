
public class Plane{

}
class FighterPlane extends Plane{

}
class Animal{
    public void eat(String name){
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
    public void eat(String name){ // this is overloaded 
        System.out.println("Animals are eating");
    }
    public void eat(){ // this is specialized
        System.out.println("Animals are eating");
    }
    protected void sleep(){ 
        System.out.println("Tiger is sleeping");
    }

    public FighterPlane run(){ // co varient return type (where is-a relationship)
        System.out.println("Tiger is running");
        FighterPlane fp = new FighterPlane();
        return fp;
    }
}
public class _41_Inheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
    
}

/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _41_Inheritance (Tiger & Animal, Overloading, Specialization, Covariant Return)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates different types of **methods in inheritance**, including:  
- Method overloading  
- Specialized methods (unique to child)  
- Covariant return types in overridden methods  
- Visibility rules in method overriding


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

METHOD OVERLOADING  
- Same method name, different parameter list within the same class  
- Example: `Tiger.eat(String name)` vs `Animal.eat(String name)`  
- Compiler determines which method to call based on arguments at compile-time

SPECIALIZED METHOD  
- Method defined only in child class, not present in parent  
- Example: `Tiger.eat()` → unique to Tiger

METHOD OVERRIDING WITH COVARIANT RETURN TYPE  
- Overriding a parent method while changing return type to a subclass of parent return type  
- Example: `Animal.run()` returns `Plane` → overridden `Tiger.run()` returns `FighterPlane`  

ACCESS MODIFIERS  
- Overridden methods can increase visibility, not reduce  
- Example: `sleep()` in Animal is default → overridden as `protected` in Tiger


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Animal`  
- `eat(String name)` → prints "Animals are eating"  
- `sleep()` → default visibility, prints "Animals are sleeping"  
- `run()` → returns `Plane`, prints "Animal is running"

CLASS `Tiger`  
- `eat(String name)` → overloads parent method (same signature as parent)  
- `eat()` → specialized, unique to Tiger  
- `sleep()` → overrides parent with increased visibility (protected)  
- `run()` → overrides parent method with covariant return type `FighterPlane`  

MAIN METHOD  
- Creates `Tiger` object `t`  
- Calls `t.eat()` → executes **specialized method** in Tiger (no parameters)  
- Demonstrates that specialized methods are distinct from inherited/overloaded methods


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`Plane` & `FighterPlane`  
- Empty classes to demonstrate covariant return types

`eat(String name)` (Animal & Tiger)  
- Method overloading example  
- Tiger version has same signature, allowed

`eat()` (Tiger)  
- Specialized method unique to Tiger  
- No parameters → demonstrates methods unique to child

`sleep()` (Animal → Tiger)  
- Demonstrates increasing visibility in overriding

`run()` (Animal → Tiger)  
- Demonstrates covariant return type overriding  

MAIN METHOD  
- Demonstrates specialized method invocation (`t.eat()`)


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Tiger t = new Tiger();` → object created

③ `t.eat();` executes:  
   - Calls specialized method in Tiger (no parameters)  
   - Prints: "Animals are eating"

④ Program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Animals are eating


7. ADDITIONAL NOTES
-------------------------------------------------
- Overloaded methods are resolved at **compile-time** based on parameter types  
- Specialized methods exist only in child class and cannot be called via parent reference  
- Covariant return types allow overridden methods to return a subclass  
- Overridden methods can increase visibility but not reduce it  
- Inheritance allows Tiger to override, overload, and specialize methods while keeping parent behavior intact

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
