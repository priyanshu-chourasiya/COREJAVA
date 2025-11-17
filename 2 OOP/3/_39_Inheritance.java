class Parent{
    int i = 10;
    void display(){
        System.out.println("Display of parent");
    }
}
class Child extends Parent{
    int i = 100;
    void display2(){

        System.out.println("Display of child");
        System.out.println(i);

        System.out.println(super.i);
        super.display();
    }
    void display(){
        System.out.println("Display of child");
    }
    
}
public class _39_Inheritance {
    public static void main(String[] args) {
        new Child().display2();
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _39_Inheritance (Parent & Child, super keyword)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates:
- Shadowing of parent variables by child variables
- Method overriding
- Use of `super` keyword to access parent members (both variables and methods)  
It highlights the difference between accessing a child’s own variable/method versus 
parent’s variable/method when there is a name clash or overriding.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

VARIABLE SHADOWING  
- When a child class defines a variable with the same name as a parent variable,  
  the child variable **shadows** the parent variable.  
- Accessing the parent variable requires `super.variableName`.

METHOD OVERRIDING  
- A child class can provide its own implementation of a parent class method.  
- The child method overrides the parent method if the signature matches.  
- Parent method can still be called using `super.methodName()`.

`super` KEYWORD  
- Used to refer explicitly to the **parent class members**.  
- `super.i` → accesses the parent variable `i`  
- `super.display()` → calls the parent method `display()`


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Parent`  
- Variable `i = 10`  
- Method `display()` → prints "Display of parent"

CLASS `Child`  
- Variable `i = 100` (shadows parent `i`)  
- Method `display2()`  
  - Prints "Display of child"  
  - Prints child `i` → 100  
  - Prints parent `i` using `super.i` → 10  
  - Calls parent method `display()` using `super.display()` → prints "Display of parent"  
- Overrides `display()` → prints "Display of child"


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

Parent variable `i`  
- Stores value 10, accessed via `super.i` in child

Child variable `i`  
- Stores value 100, shadows parent variable

Parent method `display()`  
- Prints "Display of parent", accessed directly or via `super.display()`

Child method `display()`  
- Overrides parent method, prints "Display of child"

Child method `display2()`  
- Demonstrates shadowing and `super` usage for both variables and methods

MAIN METHOD  
- Creates Child object  
- Calls `display2()` to demonstrate variable shadowing and method overriding


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① `main()` executes → `new Child().display2();`  

② `display2()` executes:  
   - Prints "Display of child"  
   - Prints child variable `i = 100`  
   - Prints parent variable `i = 10` via `super.i`  
   - Calls parent method `display()` → prints "Display of parent"

③ Program ends


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Display of child  
100  
10  
Display of parent


7. ADDITIONAL NOTES
-------------------------------------------------
- Child variables can shadow parent variables; `super` is used to access parent variables  
- Method overriding allows child to redefine a method; `super.methodName()` calls the parent version  
- Shadowing applies to **instance variables**, not methods.  
- Always remember: direct variable access refers to the child variable if shadowed  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
