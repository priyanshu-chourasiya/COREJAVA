class Parent extends Child{
    void display(){
        System.out.println("Parent class method");
    }
}
class Child extends Parent{

}
public class _33_Inheritance {   // error cyclic inheritance not allowed
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
/*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _33_Inheritance (Parent & Child)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program is intended to demonstrate inheritance but contains an illegal
structure known as **cyclic inheritance**.  
It shows that in Java:
- A class cannot extend another class that ultimately extends itself.  
- Such a structure is disallowed to prevent infinite loops in the inheritance hierarchy.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

CYCLIC INHERITANCE  
- Occurs when a class indirectly or directly attempts to inherit from itself.  
- Java compiler does not allow it.  
- Example: Parent extends Child, and Child extends Parent.

INHERITANCE RULES  
- Each class can extend only one parent class (single inheritance).  
- Parent class must exist before child class in inheritance hierarchy.  
- Cycles in inheritance are forbidden.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Parent extends Child`  
- Attempts to inherit from `Child`.

CLASS `Child extends Parent`  
- Attempts to inherit from `Parent`.  

→ Together, this forms a cycle:
    Parent → Child → Parent → ... infinitely  

MAIN METHOD  
- Attempts to create a `Child` object and call `display()`  
- Code will **not compile** due to cyclic inheritance.


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`void display()` in Parent  
- Intended to print "Parent class method"  
- Cannot be used due to compilation failure

MAIN METHOD  
- Would create `Child` object and call `display()` if inheritance were legal  
- In practice, program cannot compile.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Compiler starts compiling `_33_Inheritance`.  

② Detects:  
    - `Parent` extends `Child`  
    - `Child` extends `Parent`  

③ Cyclic inheritance detected → compilation fails.

④ No execution occurs; main method is never run.


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Compilation Error:  
    error: cyclic inheritance involving Parent and Child

(No runtime output)


7. ADDITIONAL NOTES
-------------------------------------------------
- Java does not support cyclic inheritance to avoid ambiguity and infinite loops.  
- Always ensure that inheritance hierarchies are acyclic.  
- Single inheritance is allowed (a class can extend only one other class).  

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
