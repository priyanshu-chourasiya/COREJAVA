class Telusko{
    int age;
    void display(){
        age = 10;
        System.out.println("Priyanshu is " + age + " years old!");
    }
}
class Alien extends Telusko{

}
public class _30_Inheritance {
    public static void main(String[] args) {
        // Telusko t = new Telusko();
        // t.display();

        Alien a = new Alien();
        a.display();

    }
    
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _30_Inheritance (Telusko & Alien)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates basic inheritance in Java.  
It shows that a subclass (`Alien`) inherits instance variables and methods
from its superclass (`Telusko`).  
An object of the subclass can directly access and use methods defined in
the superclass.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

INHERITANCE  
- Mechanism by which a class (subclass/child) acquires the properties 
  and behaviors (variables and methods) of another class (superclass/parent).  
- Here, `Alien` inherits from `Telusko`.

METHOD INVOCATION THROUGH SUBCLASS  
- An object of the subclass can invoke methods defined in the superclass.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Telusko`  
- Defines an instance variable `age` and a method `display()` that sets 
  `age` and prints a message.

CLASS `Alien`  
- Extends `Telusko`.  
- Does not define any new members, but inherits `age` and `display()`.

MAIN METHOD  
- Creates an `Alien` object `a`.  
- Calls `a.display()` which uses the inherited method from `Telusko`.


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`int age`  
- Instance variable in `Telusko` to store age.  
- Inherited by `Alien`.

`void display()`  
- Sets `age` to 10.  
- Prints: "Priyanshu is 10 years old!"  
- Inherited by `Alien`.

Class `Alien`  
- Subclass, inherits `age` and `display()` from `Telusko`.  
- Demonstrates simple inheritance without overriding.

MAIN METHOD  
- Instantiates `Alien` and calls `display()` to show inherited behavior.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Alien a = new Alien();`  
    - Creates a new Alien object.  
    - Inherits `age` variable from Telusko.  

③ `a.display();` executes:  
    - The `display()` method from `Telusko` is called.  
    - `age` is set to 10 for this object.  
    - Prints: "Priyanshu is 10 years old!"

④ Program ends.


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Priyanshu is 10 years old!


------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
