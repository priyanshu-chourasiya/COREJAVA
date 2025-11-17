class Telesco1{
    private String name = "Priyanshu";
    void display(){
        System.out.println("Name is " + name);
    }
}
class Alien extends Telesco1{
    void display2(){
        name = "alien";
    }
}
public class _32_Inheritance {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.display();
        a.display2();
    }
    
}
/*
 * private members of a class will not get inherited. this is to ensure encapsulation does not get affected
 * 
 * multi level inheritance is allowed 1 child -> parent -> parent
 * 
 * 
 */

 /*  
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: _32_Inheritance (Telesco1 & Alien)
------------------------------------------------------------

1. OVERALL PROGRAM PURPOSE
--------------------------
This program demonstrates the behavior of `private` members in Java inheritance.  
It shows that private variables of a superclass are not directly accessible in the subclass,
even though the subclass inherits other accessible members.  
It also highlights encapsulation enforcement in Java.


2. IMPORTANT CONCEPTS USED IN THIS PROGRAM
------------------------------------------

PRIVATE MEMBER  
- A variable or method declared `private` is only accessible within the same class.  
- Not inherited by subclasses in a way that allows direct access.

ENCAPSULATION  
- Restricts access to class data to maintain integrity.  
- Private variables are part of encapsulation.

INHERITANCE  
- Subclass can inherit public/protected/default members of parent.  
- Private members are technically inherited but **not directly accessible**.


3. USAGE OF THESE CONCEPTS IN THIS PROGRAM
------------------------------------------

CLASS `Telesco1`  
- `private String name` → cannot be accessed directly in `Alien`  
- Method `display()` prints the private `name` variable

CLASS `Alien`  
- Subclass of `Telesco1`  
- Attempts to modify `name` in `display2()` → **will cause a compilation error**  
  because `name` is private in the superclass

MAIN METHOD  
- Creates an `Alien` object `a`.  
- Calls `a.display()` → prints inherited method, which accesses `name` inside Telesco1.  
- Calls `a.display2()` → compilation error occurs due to illegal access of private variable.


4. PURPOSE OF EVERY VARIABLE, METHOD, AND BLOCK
-----------------------------------------------

`private String name`  
- Stores the name inside Telesco1  
- Private → enforces encapsulation; not directly accessible by subclass

`void display()`  
- Prints the value of `name`  
- Accessible to subclass and main method via object of subclass

`void display2()`  
- Attempts to modify `name` in subclass → not allowed for private variables

MAIN METHOD  
- Creates Alien object and calls inherited methods to demonstrate accessibility.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------

① Program enters `main()`.  

② `Alien a = new Alien();` → object created.  

③ `a.display()` executes → prints:  
    "Name is Priyanshu"  

④ `a.display2()` attempts to execute → compilation error:  
    cannot assign a value to `name` because it has private access in Telesco1  

⑤ Program does **not** run successfully due to private member access violation.


6. EXACT OUTPUT WHEN PROGRAM RUNS
-------------------------------------------------
Compilation Error:  
    error: name has private access in Telesco1  
    name = "alien";  

(No runtime output because code fails to compile)


7. ADDITIONAL NOTES
-------------------------------------------------
- Private members maintain encapsulation and are not accessible directly in subclasses.  
- Multi-level inheritance is allowed in Java.  
- To modify a private variable in a subclass, you must use a public/protected setter method.

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
