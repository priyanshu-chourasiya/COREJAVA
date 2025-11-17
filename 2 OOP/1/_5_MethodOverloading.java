class Calc{
    int mul(int a,int b){
        System.out.println("1 method");
        return a*b;
    }
    double mul(int a,int b, double c){
        System.out.println("2 method");
        return a*b*c;
    }
    double mul(double a, double b,double c){
        System.out.println("3 mthod");
        return a*b;
    }
}
public class _5_MethodOverloading {
    public static void main(String[] args) {
        Calc c = new Calc();
        //System.out.println(c.mul(2,2,2));
        System.out.println(c.mul(44,33,33));
    }
}
/*
=====================================================================
REVISION NOTES FOR _5_MethodOverloading (Calc Class – mul Overloads)
=====================================================================

---------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
---------------------------------------------------------------------
- Defines a `Calc` class containing three overloaded `mul()` methods.
- Each method multiplies numbers but differs in parameter types and count.
- In `main`, an object of `Calc` is created.
- The call `c.mul(44, 33, 33)` triggers compile-time method selection.
- The program prints which overloaded method is chosen, then prints
  the multiplication result.

---------------------------------------------------------------------
2. IMPORTANT CONCEPTS APPEARING IN THE CODE
---------------------------------------------------------------------
**Method Overloading**  
Multiple methods share the same name but must differ in parameters  
(number, type, or order).  
The compiler selects the most specific match at compile time.

**Type Conversion (Widening)**  
Lower-precision types (e.g., int) can automatically convert to  
higher-precision types (e.g., double) when matching method signatures.

**Compile-Time Polymorphism**  
The correct overloaded method is determined before the program runs.

---------------------------------------------------------------------
3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
---------------------------------------------------------------------
- The class `Calc` contains three `mul()` methods with different signatures.
- The call `mul(44, 33, 33)` consists of three **int** arguments.
- The compiler selects `mul(int, int, double)` because:
  - First two parameters perfectly match `int`
  - The third `int` is automatically converted to `double`
  - This method is more specific than `mul(double, double, double)`
- The selected method prints `"2 method"` and returns the product.

---------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
---------------------------------------------------------------------
**Class Calc**  
Holds all overloaded multiplication methods.

**mul(int a, int b)**  
- Prints `"1 method"`  
- Returns product of two ints.

**mul(int a, int b, double c)**  
- Prints `"2 method"`  
- Returns product of a * b * c.  
- This is the method used in the program's execution.

**mul(double a, double b, double c)**  
- Prints `"3 mthod"`  
- Returns product of only a * b (third parameter is unused).

**Class _5_MethodOverloading**  
Contains the entry point of the program.

**main()**  
- Creates a `Calc` object `c`.  
- Calls `c.mul(44, 33, 33)` and prints its return value.

---------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
---------------------------------------------------------------------
1. Program execution starts in `main`.
2. A `Calc` object `c` is created.
3. The statement `c.mul(44, 33, 33)` is executed.
4. The compiler selects `mul(int, int, double)` because it is the best match.
5. Inside that method:
   - `"2 method"` is printed.
   - Calculation occurs:  
     - a * b = 44 × 33 = 1452  
     - 1452 × 33 = 47916  
   - Result `47916.0` (double) is returned.
6. The returned value is printed by `System.out.println(...)`.
7. Program ends.

---------------------------------------------------------------------
6. EXACT OUTPUT WHEN EXECUTED
---------------------------------------------------------------------
2 method  
47916.0  

=====================================================================
END OF REVISION NOTES
=====================================================================
*/
