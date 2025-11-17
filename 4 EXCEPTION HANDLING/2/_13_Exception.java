import java.io.IOException;

class Parent{
    public void study() throws ArithmeticException{ // unchecked
        System.out.println("Study parent");
    }

}
class Child1 extends Parent{
    public void study() throws ArithmeticException{ // unchecked
        System.out.println("Child1 parent");
    }
}
class Child2 extends Parent{
    public void study() throws IOException{ // checked
        System.out.println("Child2 parent");
    }
}
public class _13_Exception {
    public static void main(String[] args) {
        
    }
}
/*
 * 
 */
/*
=====================================================
REVISION NOTES – METHOD OVERRIDING & EXCEPTIONS
=====================================================

-----------------------------------------------------
1. WHAT THIS PROGRAM IS SHOWING
-----------------------------------------------------
This program demonstrates how **exceptions behave in method overriding**.

Parent class declares an **unchecked exception (ArithmeticException)**.  
Two child classes override the method:
    • Child1 → declares same unchecked exception → allowed  
    • Child2 → declares a checked exception (IOException) → NOT allowed

This illustrates the rule:
    “If a parent method declares ONLY unchecked exceptions,
     the child method CANNOT declare any checked exceptions.”

-----------------------------------------------------
2. DEFINITIONS OF IMPORTANT TERMS
-----------------------------------------------------

• **Unchecked Exception**  
  - Exceptions that the compiler does NOT check.  
  - Includes ArithmeticException, NullPointerException, etc.  
  - They extend RuntimeException.  
  - You can declare them or ignore them — compiler won't complain.

• **Checked Exception**  
  - Compiler checks them.  
  - Includes IOException, SQLException, etc.  
  - Must be handled (try-catch) or declared (throws).

• **Method Overriding**  
  - A child class provides a new implementation of a method
    already defined in the parent class.

-----------------------------------------------------
3. EXCEPTION RULES IN METHOD OVERRIDING
-----------------------------------------------------

When a child overrides a method:

1️⃣ If parent declares **checked exceptions**,  
   → child can declare the same OR narrower checked exceptions.  

2️⃣ If parent declares **NO checked exceptions**,  
   → child CANNOT declare any checked exception. ❌

3️⃣ Unchecked exceptions are free:  
   → child may declare them regardless of parent’s declaration. ✔️

-----------------------------------------------------
4. USAGE IN THIS PROGRAM
-----------------------------------------------------

• Parent.study()
    throws ArithmeticException (unchecked)
    → Allowed without try/catch.

• Child1.study()
    throws ArithmeticException (unchecked)
    → Allowed because unchecked exceptions have no restriction.

• Child2.study()
    throws IOException (checked)
    → ❌ Compiler error:
         “overridden method does not throw IOException”
    → Because parent does NOT declare any checked exception.

-----------------------------------------------------
5. PURPOSE OF EACH CLASS
-----------------------------------------------------

• Parent  
  Defines study() and declares an unchecked exception.

• Child1  
  Valid override. Uses the same unchecked exception.

• Child2  
  Invalid override. Attempts to add a checked exception.

• main()  
  Empty – no execution/output.

-----------------------------------------------------
6. CONTROL FLOW
-----------------------------------------------------

Since main() does nothing:
    - No object creation,
    - No method calls,
    - No output.

-----------------------------------------------------
7. FINAL RULE SUMMARY (Easy to Memorize)
-----------------------------------------------------

✔ Child can add **unchecked exceptions** freely  
✘ Child cannot add **checked exceptions** if parent does not declare any  
✔ Child can add **same or narrower checked exceptions** if parent declares some  
✔ Child may remove declared exceptions

=====================================================
END OF REVISION NOTES
=====================================================
*/
