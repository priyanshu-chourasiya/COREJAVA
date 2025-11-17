public class _21_Wrapper {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a : " + a);
        Integer i = new Integer(10);
        // - line means if u write this no problem but dont do this
        System.out.println("i : " +  i);

        Integer j = Integer.valueOf(10); // with class name i am calling method
        System.out.println("j : " + j);

        int n1 = 10;    // Boxing
        Integer n2 = n1; // primitive data type to its corresponding wrapper class // Autoboxing : automatic boxing
        
        Integer x = Integer.valueOf(10);
        // Unboxing
        // wrapper to corresponding data type
        // autounboxing

        Integer n3 = Interger.valueOf(99);
        int n4 = n3;

        // manually
        int n5 = n3.intValue();


    }
}
/* ============================================================
   REVISION NOTES — ANALYSIS OF THE GIVEN PROGRAM
   ============================================================

1. WHAT THE ENTIRE PROGRAM DOES
------------------------------------------------------------
The program demonstrates Java Wrapper Classes, specifically the
`Integer` wrapper for the primitive type `int`.  
It shows:
• Creating wrapper objects in different ways  
• Autoboxing (automatic conversion from int → Integer)  
• Unboxing (automatic conversion from Integer → int)  
• Manual unboxing using `intValue()`  
The code prints a few wrapper values and performs several conversions.


2. IMPORTANT CONCEPTS APPEARING IN THE CODE
------------------------------------------------------------

• Wrapper Classes  
  Object representations of primitive data types.  
  Here, `Integer` is used as the wrapper for the primitive type `int`.

• Boxing  
  Converting a primitive value into its wrapper class object.

• Autoboxing  
  Automatic conversion performed by the compiler when assigning a primitive
  to a wrapper variable.

• Unboxing  
  Converting a wrapper object back into its primitive value.

• Autounboxing  
  Automatic unboxing performed by the compiler when assigning a wrapper
  object to a primitive variable.


3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
------------------------------------------------------------

• Wrapper Class (Integer)  
  `Integer i = new Integer(10);`  
  Creates a wrapper object using the constructor.

• Boxing  
  `Integer n2 = n1;`  
  The primitive `n1` (int) is converted to an Integer.

• Autoboxing  
  Performed implicitly in the above assignment.  
  Also shown when calling `Integer.valueOf(10)`.

• Unboxing  
  `int n4 = n3;`  
  The Integer object `n3` is converted automatically back to a primitive int.

• Manual Unboxing  
  `int n5 = n3.intValue();`  
  Explicit method call to extract the primitive value.


4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
------------------------------------------------------------

• int a = 10  
  A primitive integer printed to show basic primitive behavior.

• Integer i = new Integer(10)  
  Wrapper object created using a constructor.

• Integer j = Integer.valueOf(10)  
  Wrapper object created using a factory method (`valueOf`).

• int n1 = 10  
  Primitive value used to demonstrate boxing.

• Integer n2 = n1  
  Demonstrates autoboxing: primitive → wrapper.

• Integer x = Integer.valueOf(10)  
  Another wrapper object for use in unboxing examples.

• Integer n3 = Interger.valueOf(99)  
  Intended to create a wrapper object using the value 99  
  (NOTE: code contains a misspelling "Interger", but factual behavior
  required → this line will cause a compilation error).

• int n4 = n3  
  Demonstrates autounboxing.

• int n5 = n3.intValue()  
  Manual unboxing using an instance method.

• main(String[] args)  
  Runs all wrapper demonstrations.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
------------------------------------------------------------

(1) Program enters `main()`.  
(2) `a` is assigned 10 and printed as a primitive.  
(3) `i` is created using `new Integer(10)` and printed.  
(4) `j` is created via `Integer.valueOf(10)` and printed.  
(5) Boxing/autoboxing occurs:  
       n1 = 10  
       n2 = n1  → autoboxing  
(6) `x` is created via `Integer.valueOf(10)`.  
(7) `n3` attempts to be created via `Interger.valueOf(99)`  
       (will not compile due to incorrect class name unless corrected).  
(8) Unboxing occurs:  
       n4 = n3  → autounboxing  
(9) Manual unboxing:  
       n5 = n3.intValue()  
(10) Program ends.


6. EXACT BEHAVIOR (IF THE NAME "Interger" WERE FIXED)
------------------------------------------------------------
Console output would be:

a : 10  
i : 10  
j : 10

(After that, no printed output—remaining operations do not print anything.)

NOTE: As written, the code will not compile because:
      Interger.valueOf(99)
      → "Interger" is not a valid class.


7. (Per requirement) — No suggestions, improvements, or rewrites included.

============================================================ */
