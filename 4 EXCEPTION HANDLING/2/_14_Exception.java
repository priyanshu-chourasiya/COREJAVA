import java.io.IOException;

class Parent{
    public void study() throws IOException{ // checked
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
class child3 extends Parent{
    public void study() throws Exception{ // partially checked
        System.out.println("Child2 parent");
    }
}
public class _14_Exception {
    public static void main(String[] args) {
        
    }
}
/*
=====================================================
REVISION NOTES – OVERRIDING + CHECKED vs UNCHECKED
=====================================================

-----------------------------------------------------
1. WHAT THIS CODE IS SHOWING
-----------------------------------------------------
This code demonstrates **which exceptions a child class can declare
while overriding a parent method** when the parent declares a
CHECKED exception (IOException).

Parent declares:
    study() throws IOException

Now children override this method with different exception types.

-----------------------------------------------------
2. RULES OF OVERRIDING WITH EXCEPTIONS
-----------------------------------------------------

When overriding:

1️⃣ If parent declares **checked exception(s)**  
   → child can declare:
       ✔ The SAME checked exception  
       ✔ A NARROWER checked exception (subclass of parent's exception)  
       ✔ ANY unchecked exception (ArithmeticException, etc.)  
   → child CANNOT declare:
       ✘ A BROADER checked exception  
       ✘ A NEW unrelated checked exception

2️⃣ If parent declares **no checked exceptions**  
   → child cannot declare any checked exception. (Not applicable here)

-----------------------------------------------------
3. APPLYING THE RULES TO YOUR CODE
-----------------------------------------------------

Parent:
-----------------------------------------------------
public void study() throws IOException
• IOException is a CHECKED exception
• Children must follow checked-exception overriding rules

-----------------------------------------------------
Child1:
public void study() throws ArithmeticException (UNCHECKED)
✔ Allowed  
Reason: Unchecked exceptions are always allowed, regardless of parent.

-----------------------------------------------------
Child2:
public void study() throws IOException (CHECKED)
✔ Allowed  
Reason: Same checked exception as parent.

-----------------------------------------------------
child3:
public void study() throws Exception (CHECKED, BROADER)
✘ NOT allowed  
Reason: Exception is BROADER than IOException.
A child cannot widen the checked exception list.

Exception hierarchy:
Exception
 └── IOException  
(IOException is a SUBCLASS of Exception)

Child3 tries to throw a parent-of-IOException → illegal.

Compiler error:
"overridden method does not throw Exception"

-----------------------------------------------------
4. TAKEAWAY SUMMARY (Memorize!)
-----------------------------------------------------

✔ Child may throw same checked exception  
✔ Child may throw narrower checked exception  
✔ Child may throw any unchecked exception  
✘ Child may NOT throw broader checked exception  
✘ Child may NOT throw unrelated checked exceptions

=====================================================
END OF NOTES
=====================================================
*/
