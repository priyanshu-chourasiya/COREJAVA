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
    }
    void sum(){
        int res = num1-num2;
        int n;
        System.out.println(res);
        System.out.println(n);
        System.out.println(o);
    }
}

public class _2_Second {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        for(int i = 0;i < 4;i++){
            System.out.println(i);
        }
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

/*
==========================================================
REVISION NOTES FOR _2_Second (Calculator Class Program)
==========================================================

----------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
----------------------------------------------------------
- The program defines a `Calculator` class with instance variables and methods.
- Inside `main`, it creates a `Calculator` object and calls the `add()` method.
- The program then runs a `for` loop that prints numbers from 0 to 3.
- The `sum()` method exists but is **never executed** in this program.

----------------------------------------------------------
2. IMPORTANT CONCEPTS APPEARING IN THE CODE
----------------------------------------------------------
**Instance Variable**  
Variables declared inside a class but outside any method.  
They belong to an object and get default values.

**Local Variable**  
Variables declared inside a method, block, or loop.  
They do not receive default values and must be initialized before use.

**Method**  
A block of code performing a specific action when called.

**Heap Memory**  
Memory area where instance variables and objects are stored.

**Stack Memory**  
Memory area where local variables and method call frames are stored.

**For Loop**  
A control structure that repeats a block of code a specific number of times.

----------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
----------------------------------------------------------
- `num1`, `num2`, and `o` are **instance variables** → they exist inside the `Calculator` object.
- In `add()`, the variables `num1` and `num2` are assigned values (10 and 20).
- `res` inside `add()` is a **local variable** used only inside that method.
- In `sum()`, both `res` and `n` are local variables, but `n` is **never initialized**, which would cause a compile-time error if `sum()` were called.
- The `for` loop in `main` prints numbers from 0 to 3.

----------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, STRUCTURE
----------------------------------------------------------
**Class Calculator**  
Holds instance variables and calculator-related methods.

**Instance Variables**  
- `int num1;` → holds a number for calculations (default 0).  
- `int num2;` → holds another number (default 0).  
- `int o;` → used to show default value behavior (default 0).

**Methods**  
- `void add()`  
  - Assigns values to `num1` and `num2`.  
  - Calculates `res = num1 + num2`.  
  - Prints the sum.

- `void sum()`  
  - Computes `res = num1 - num2`.  
  - Attempts to print `n`, but `n` is not initialized (would cause error if called).  
  - Prints instance variable `o`, which contains default value 0.

**Class _2_Second**  
Holds the `main` method and controls program execution.

**main() Method**  
- Creates a `Calculator` object `c`.  
- Calls `c.add()` to print the sum.  
- Runs a `for` loop to print 0, 1, 2, 3.

**For Loop Structure**  
`for(int i = 0; i < 4; i++)`  
- Initializes local variable `i` at 0.  
- Repeats while `i < 4`.  
- Prints `i` on each iteration.

----------------------------------------------------------
5. FULL CONTROL-FLOW FROM START TO END
----------------------------------------------------------
1. Program begins execution inside `main`.  
2. A `Calculator` object `c` is created.  
3. `c.add()` is executed:  
   - `num1 = 10`, `num2 = 20`  
   - `res = 30`  
   - Prints `30`  
4. A for-loop begins:  
   - Iteration 1 → prints `0`  
   - Iteration 2 → prints `1`  
   - Iteration 3 → prints `2`  
   - Iteration 4 → prints `3`  
5. Program ends.

----------------------------------------------------------
6. EXACT RUNTIME OUTPUT
----------------------------------------------------------
30  
0  
1  
2  
3  

(Note: `sum()` does not run, so no error occurs.)

==========================================================
END OF REVISION NOTES
==========================================================
*/
