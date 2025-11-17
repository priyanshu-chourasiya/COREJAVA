import java.io.IOException;

class Parent{
    public void study(){
        System.out.println("Study parent");
    }

}
class Child1 extends Parent{
    public void study() throws ArithmeticException{
        System.out.println("Child1 parent");
    }
}
class Child2 extends Parent{
    public void study() throws IOException{
        System.out.println("Child2 parent");
    }
}
public class _12_Exception {
    public static void main(String[] args) {
        
    }
}
/*
 * if a parent class is not declaring any exception child class can declare any unchecked exception but
 * cannot declare any checked exception
 */
/*
===========================================
REVISION NOTES FOR THE GIVEN PROGRAM
===========================================

-------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------
The program defines a Parent class with a study() method that does not
declare any exceptions.  
Two child classes override this method:
  • Child1 declares an unchecked exception (ArithmeticException).  
  • Child2 declares a checked exception (IOException).  
This demonstrates Java’s overriding rule regarding exceptions.

-------------------------------------------------------
2. DEFINITIONS OF IMPORTANT CONCEPTS USED IN THIS PROGRAM
-------------------------------------------------------

• Method Overriding  
  When a subclass provides its own implementation for a method already
  defined in its parent class.

• Checked Exception  
  Exceptions checked at compile time (e.g., IOException). Must be
  handled or declared using throws.

• Unchecked Exception  
  Exceptions not checked at compile time (e.g., ArithmeticException).
  Do not require throws declaration or try–catch.

• Exception Rules in Method Overriding  
  When overriding a parent method:
    - The child may declare **fewer** or **narrower checked exceptions**.
    - If the parent method declares **no checked exceptions**, the child
      **cannot declare any checked exceptions**.
    - The child is allowed to declare unchecked exceptions freely.

-------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------

• Parent’s study()  
  Declares no exceptions.

• Child1’s study()  
  Declares ArithmeticException (unchecked), which is allowed because
  unchecked exceptions are exempt from overriding rules.

• Child2’s study()  
  Declares IOException (checked), which is NOT allowed because the
  parent method does not declare any checked exceptions.

• extends keyword  
  Child1 and Child2 inherit behavior from Parent, enabling method
  overriding.

-------------------------------------------------------
4. PURPOSE OF EACH CLASS, METHOD, AND STRUCTURE
-------------------------------------------------------

• Parent class  
  Defines a base study() method that prints “Study parent”.

• study() in Parent  
  Serves as the original method to be overridden.

• Child1 class  
  Overrides study() and introduces an unchecked exception declaration
  to show it is allowed.

• Child1’s study()  
  Prints “Child1 parent” and declares ArithmeticException.

• Child2 class  
  Attempts to override study() but adds a checked exception declaration
  (IOException) to demonstrate forbidden overriding behavior.

• Child2’s study()  
  Prints “Child2 parent” but violates overriding rules by declaring a
  checked exception not present in the parent method.

• main() method  
  Empty; it does not execute or invoke any methods.

-------------------------------------------------------
5. COMPLETE CONTROL FLOW FROM START TO END
-------------------------------------------------------

1. Program begins in main().
2. No objects are created and no methods are invoked.
3. Program ends immediately.

(If objects were created, study() would execute, printing the
respective class message.)

-------------------------------------------------------
6. EXACT RUNTIME BEHAVIOR
-------------------------------------------------------

Since main() does not execute any code:
    → No output is produced at runtime.

-------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------
*/
