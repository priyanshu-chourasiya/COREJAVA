public class _7_Method {
    public static void main(String[] args) {
        System.out.println("Main method with string args[]");
        main(44);
        main("Rohan",4);
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
    // we can override main method but jvm will envoke main method with String[] args
}
/*
===============================================================================
REVISION NOTES FOR _7_Method  (Main Method Overloading + Manual Invocation)
===============================================================================

-------------------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------------------------------
- This program demonstrates **method overloading** on the `main()` method.
- Unlike the previous example, here the overloaded main methods are **manually called**
  inside the standard `main(String[] args)` method.
- JVM only starts execution from `main(String[] args)`, but this version internally
  calls the other overloaded main() methods.

-------------------------------------------------------------------------------
2. DEFINITIONS OF ALL IMPORTANT CONCEPTS
-------------------------------------------------------------------------------

MAIN METHOD  
- JVM entry point method: `public static void main(String[] args)`
- Must be `public`, `static`, return type `void`, and parameter `String[]`.

METHOD OVERLOADING  
- Creating multiple methods with the same name but different:
  → number of parameters  
  → data types  
  → order of parameters  
- The compiler decides which method to execute (compile-time polymorphism).

STATIC METHOD  
- Belongs to the class, not the object.  
- Can be called without creating an object (e.g., `main(44)`).

PARAMETERS  
- Inputs passed to methods.  
- Used here to differentiate overloaded methods.

-------------------------------------------------------------------------------
3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
-------------------------------------------------------------------------------
- **Method Overloading:**  
  Four versions of `main()` with different parameter combinations.
- **Manual Invocation:**  
  Inside `main(String[] args)` you call:  
  → `main(44);`  
  → `main("Rohan", 4);`
- **Static:**  
  Allows calling all overloaded main methods without creating objects.

-------------------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
-------------------------------------------------------------------------------

CLASS _7_Method  
- Contains all overloaded main() methods.

METHODS:

1. **main(String[] args)**  
   - Primary JVM entry point.  
   - Prints `"Main method with string args[]"`.  
   - Calls two overloaded main methods:
     → `main(44)`  
     → `main("Rohan", 4)`

2. **main(int[] args)**  
   - Overloaded version with int-array.  
   - Prints `"Main method with int[] args"`  
   - Not used unless manually called.

3. **main(int args)**  
   - Overloaded version with an integer.  
   - Prints `"Main method with int args"`  
   - Called from main(String[] args).

4. **main(String name, int age)**  
   - Overloaded version with String + int.  
   - Prints `"String name int age"`  
   - Called from main(String[] args).

COMMENT  
- Correctly explains that JVM will only invoke main(String[] args) automatically.

-------------------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
-------------------------------------------------------------------------------

1. Program starts.
2. JVM finds and executes the method:
   → `public static void main(String[] args)`
3. It prints:
   → `"Main method with string args[]"`
4. Calls `main(44)`
   - Control jumps to: `public static void main(int args)`
   - Prints: `"Main method with int args"`
5. Returns to primary main.
6. Calls `main("Rohan", 4)`
   - Control jumps to: `public static void main(String name, int age)`
   - Prints: `"String name int age"`
7. Program ends.

-------------------------------------------------------------------------------
6. EXACT OUTPUT OF THIS PROGRAM
-------------------------------------------------------------------------------
Main method with string args[]
Main method with int args
String name int age

-------------------------------------------------------------------------------
END OF REVISION NOTES
===============================================================================
*/
