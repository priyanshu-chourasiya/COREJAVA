//package 2 OOP;

class Calculator{
    int num1;  // instance variable default value 0 if boolean then false if string then null double 0.0
    int num2;

    int o;
    void add(){
        num1 = 10;
        num2 = 20;
        int res = num1 + num2; // local variable
        System.out.println(res);
        int n = 0;
        //System.out.println(res);
        System.out.println(n);
        System.out.println(o);
    }
    void sum(){
        int res = num1-num2;
        System.out.println(res);
    }
}

public class _3_Third {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        // for(int i = 0;i < 4;i++){
        //     System.out.println(i);
        // }
        // i = 10
    }
}

// instance variable are directly declared inside a class
//                   memory is allocated inside heap area within object/instance
// instance = object
//                   memory is deallocated by garbage collector when object becomes referenceless
//                   
// local variable are directly declared inside a method/block/loop within a class
// memory is allocated is stack area
// memory is deallocted is stack frame of that method/block/loop is deallocated after completing its task

// scope in instance variable can be used anywhere within the class
// scope of local variables are limited to method/block/loop where it is decalred

// the value of instance variable will be initialized
// but for local variable there is no default value

/*
===============================================================
REVISION NOTES FOR _3_Third (Calculator Class Program)
===============================================================

---------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
---------------------------------------------------------------
- Defines a `Calculator` class containing instance variables and two methods.
- In `main`, a `Calculator` object is created.
- The program calls the `add()` method, which sets values, performs addition, 
  and prints three values.
- The `sum()` method exists but is not executed in this program.

---------------------------------------------------------------
2. IMPORTANT CONCEPTS APPEARING IN THE CODE
---------------------------------------------------------------
**Instance Variable**  
A variable declared inside a class but outside methods; it belongs to an object and  
receives a default value (e.g., int → 0).

**Local Variable**  
A variable declared inside a method or block; it does NOT receive a default value and 
must be initialized before use.

**Method**  
A block of code that performs actions when called.

**Object Instantiation**  
Creating an actual instance of a class using `new`.

---------------------------------------------------------------
3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
---------------------------------------------------------------
- `num1`, `num2`, and `o` are **instance variables** created in the `Calculator` object `c`.
- In `add()`, instance variables `num1` and `num2` are assigned new values (10 and 20).
- `res` and `n` inside `add()` are **local variables** used only within the method.
- `o` is printed without being assigned → it prints its default value 0.
- `sum()` computes `num1 - num2` using instance variables but is not called.
- `Calculator c = new Calculator();` creates the object used for calling methods.

---------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
---------------------------------------------------------------
**Class Calculator**  
Defines the data (`num1`, `num2`, `o`) and behaviors (`add()`, `sum()`) of a calculator.

**Instance Variables**
- `int num1;` → stores a number, default value is 0 before assignment.
- `int num2;` → stores another number, default 0 before assignment.
- `int o;` → prints default value 0 in `add()`.

**Methods**
- `void add()`  
  - Assigns values to instance variables.  
  - Creates and prints local variable `res`.  
  - Creates and prints local variable `n`.  
  - Prints instance variable `o`.

- `void sum()`  
  - Calculates and prints subtraction of instance variables `num1 - num2`.

**Class _3_Third**
Holds the `main` method which controls the program.

**main()**
- Creates a `Calculator` object.  
- Calls `add()` on that object.

---------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION
---------------------------------------------------------------
1. Program execution starts in `main`.
2. A new `Calculator` object `c` is created.  
   - Instance variables `num1`, `num2`, and `o` are initialized to default values (0).
3. `c.add()` is executed:  
   - `num1` becomes 10  
   - `num2` becomes 20  
   - `res` is computed as 10 + 20 → 30  
   - `n` is assigned 0  
   - `res` is printed → 30  
   - `n` is printed → 0  
   - `o` (default 0) is printed  
4. Program ends.  
   (The `sum()` method and commented loop do not run.)

---------------------------------------------------------------
6. EXACT OUTPUT WHEN EXECUTED
---------------------------------------------------------------
30  
0  
0  

===============================================================
END OF REVISION NOTES
===============================================================
*/
