class AdditionCalc{
    int add(int n1,int n2){
        return n1+n2;
    }
    int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    double add(int n1, double n2){
        return n1+n2;
    }
    double add(double  n1, double n2){
        return n1+n2;
    }
    double add(int n1,double n2,double n3){
        return n1+n2+n3;
    }
    double add(double  n1,double n2,double n3){
        return n1+n2+n3;
    }
}
public class _4_MethodOverLoading {
    public static void main(String[] args) {
        AdditionCalc a1 = new AdditionCalc();
        System.out.println(a1.add(4, 5));
        System.out.println(a1.add(2.2,3.2));
    }
}
/*
 * Methodoverloading refers to creating multiple methods with same name but different parameters
 * java compiler will resolve this at compile time based on number of parameters,datatype of parameters
 * and order of parameters
 * 
 * compile time polymorphism or false polymorphism
 */
// Basic naming convention:
/*
 * class name must starting with Capital letter or uppercase and if there are multiple words 
 * in class name without any space in between every word first letter must be capital
 * Ex- StudentDetail
 * 
 * Method name should be in lowercase if there are multiple words in name 
 * then first word will be small letters and second word first letter will be in capital letter so on for everynew word 
 * without space
 * 
 * variable name must be in small letter however if there are multiple names in variable and we use camle case
 * Ex- noOfWings
 */

 /*
=======================================================================
REVISION NOTES FOR _4_MethodOverLoading (AdditionCalc Overloading Demo)
=======================================================================

-----------------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-----------------------------------------------------------------------
- Defines a class `AdditionCalc` that contains multiple `add()` methods 
  with different parameter lists (method overloading).
- The `main` method creates an `AdditionCalc` object and calls two 
  overloaded `add()` methods.
- The program prints the results of these addition operations.

-----------------------------------------------------------------------
2. IMPORTANT CONCEPTS APPEARING IN THE CODE
-----------------------------------------------------------------------
**Method Overloading**  
Creating multiple methods with the same name but different parameter lists 
(different number, type, or order of parameters).  
The compiler decides which method to call during compile time.

**Compile-Time Polymorphism**  
Polymorphism resolved at compile time based on method signatures.  
Method overloading is an example of this.

**Return Type**  
The value type a method outputs.  
Return type alone does NOT differentiate overloaded methods.

-----------------------------------------------------------------------
3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
-----------------------------------------------------------------------
- The class `AdditionCalc` has six `add()` methods, each with different 
  parameter signatures → demonstrating method overloading.
- The compiler selects which `add()` method to call based on:
  - the number of arguments,
  - the data types of arguments.
- In `main`, calling `a1.add(4, 5)` invokes the version with two `int` parameters.
- Calling `a1.add(2.2, 3.2)` invokes the version with two `double` parameters.

-----------------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, STRUCTURE
-----------------------------------------------------------------------
**Class AdditionCalc**  
Stores all the overloaded `add()` methods.

**add(int n1, int n2)**  
Returns sum of two integers.

**add(int n1, int n2, int n3)**  
Returns sum of three integers.

**add(int n1, double n2)**  
Returns sum of one int and one double.

**add(double n1, double n2)**  
Returns sum of two doubles.

**add(int n1, double n2, double n3)**  
Returns sum of three parameters (int + double + double).

**add(double n1, double n2, double n3)**  
Returns sum of three doubles.

**Class _4_MethodOverLoading**  
Contains `main` method used to execute the program.

**main()**  
- Creates object `a1` of type `AdditionCalc`.  
- Calls overloaded `add()` methods and prints results.

-----------------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
-----------------------------------------------------------------------
1. Program starts in `main`.
2. An `AdditionCalc` object `a1` is created.  
3. `a1.add(4, 5)` is executed:  
   - Compiler selects `add(int, int)`.  
   - Returns 9.  
   - `System.out.println(9)` prints `9`.
4. `a1.add(2.2, 3.2)` is executed:  
   - Compiler selects `add(double, double)`.  
   - Returns 5.4.  
   - `System.out.println(5.4)` prints `5.4`.
5. Program ends.

-----------------------------------------------------------------------
6. EXACT OUTPUT WHEN EXECUTED
-----------------------------------------------------------------------
9  
5.4  

=======================================================================
END OF REVISION NOTES
=======================================================================
*/
