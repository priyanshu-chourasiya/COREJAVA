public class _6_Method {
    public static void main(String[] args) {
        System.out.println("Main method with string args[]");
    }
    public static void main(int[] args) {
        System.out.println("Main method with int[] args");
    }
    public static void main(int args) {
        System.out.println("Main method with int args");
    }
    public static void main(String name, int age) {
        System.out.println("String name int age");
    }
    // we can override main method but jvm with envoke main method with String[] args
}
/*
===============================================================================
REVISION NOTES FOR _6_Method  (Main Method Overloading in Java)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **method overloading** applied to the `main()` method.
- Several versions of `main()` exist, each with different parameter types.
- **Only** the standard `public static void main(String[] args)`  
  is called automatically by the JVM when the program starts.
- Other overloaded `main()` methods will not run unless you call them manually.

-------------------------------------------------------------------------------
2. DEFINITIONS OF ALL IMPORTANT CONCEPTS USED IN THE CODE
-------------------------------------------------------------------------------
**main() method**  
The entry point of any Java program. JVM calls only this signature:  
`public static void main(String[] args)`.

**Method Overloading**  
Multiple methods with the same name but different parameter types/quantity.  
Selection occurs at **compile time** based on the method call.

**JVM (Java Virtual Machine)**  
Runs Java bytecode. It *always* looks for the main method with  
`String[] args`. It ignores other overloaded main methods unless manually invoked.

**Parameters (String, int, int[], etc.)**  
Used to pass data to methods. In overloading, parameter types determine method selection.

**Access Modifiers (`public`)**  
Defines the visibility of the method. The main method must be `public`.

**Static Keyword**  
Static methods belong to the class, not objects. JVM requires `main()` to be static.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN YOUR CODE
-------------------------------------------------------------------------------
- You overload `main()` four times using different parameter types.
- JVM will call only the version with `String[] args`.
- Other methods simply demonstrate overloading but will not run unless called.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------
**Class _6_Method**  
Contains all overloaded main() methods.

**main(String[] args)**  
→ JVM entry point.  
→ Prints: `"Main method with string args[]"`

**main(int[] args)**  
→ Overloaded version. Prints: `"Main method with int[] args"`  
→ Won’t run automatically.

**main(int args)**  
→ Another overloaded version. Prints: `"Main method with int args"`  
→ Won’t run automatically.

**main(String name, int age)**  
→ Overloaded version with 2 parameters.  
→ Prints: `"String name int age"`  
→ Also won’t run automatically.

**Comment**  
Correctly states that you *can* overload main(), but JVM only calls the one with `String[]`.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION (STEP-BY-STEP)
-------------------------------------------------------------------------------
1. Program starts.
2. JVM searches for:  
   → `public static void main(String[] args)`
3. JVM finds the correct version and executes it.
4. Line executed:  
   `System.out.println("Main method with string args[]");`
5. Program ends.  
6. No other overloaded `main()` method is ever executed.

-------------------------------------------------------------------------------
6. EXACT OUTPUT OF THIS PROGRAM
-------------------------------------------------------------------------------
Main method with string args[]

===============================================================================
END OF REVISION NOTES
===============================================================================
*/
