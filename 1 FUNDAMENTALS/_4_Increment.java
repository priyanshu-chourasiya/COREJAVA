//package 1 Java fundamentals;

public class _4_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        a = a + 1;
        System.out.println(a);
        ++a;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--; // a = a - 1
        System.out.println(a);
        --a;
        System.out.println(a);
    }
}
/*
==============================================================
REVISION NOTES FOR THE GIVEN CODE
==============================================================

--------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------------------------------------
- This program demonstrates increment and decrement operations in Java.
- It shows:
  - Increasing a variable using `a = a + 1`
  - Pre-increment (`++a`)
  - Post-increment (`a++`)
  - Post-decrement (`a--`)
  - Pre-decrement (`--a`)
- It prints the value of `a` after each operation to illustrate the effect of these operators.

--------------------------------------------------------------
2. DEFINITIONS OF EVERY CONCEPT APPEARING IN THE CODE
--------------------------------------------------------------
- **Class**: A container that holds Java code; here `_4_Increment`.
- **public**: Access modifier allowing access from anywhere.
- **static**: Allows execution without creating an object.
- **void**: Specifies that the method returns no value.
- **main method**: The entry point of Java applications.
- **int**: A primitive data type representing whole numbers.
- **Variable**: A named storage location for values.
- **Assignment operator (=)**: Assigns values to variables.
- **a = a + 1**: Expression that adds 1 to `a` and stores the result back in `a`.
- **Increment operator (`++`)**:
  - **Pre-increment (`++a`)**: Increases the value, then evaluates.
  - **Post-increment (`a++`)**: Evaluates the current value, then increases it.
- **Decrement operator (`--`)**:
  - **Pre-decrement (`--a`)**: Decreases the value, then evaluates.
  - **Post-decrement (`a--`)**: Evaluates the current value, then decreases it.
- **System.out.println()**: Prints a value or text followed by a new line.
- **Comment (//)**: Explanatory text ignored by the compiler.

--------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------------------------------
- **int a = 10;**  
  Declares and initializes the variable `a`.
- **System.out.println(a);**  
  Prints the current value of `a`.
- **a = a + 1;**  
  Demonstrates manual increment.
- **++a;**  
  Uses pre-increment to increase `a`.
- **a++;**  
  Uses post-increment to increase `a`.
- **a--;**  
  Uses post-decrement to decrease `a`.
- **--a;**  
  Uses pre-decrement to decrease `a`.

--------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
--------------------------------------------------------------
- **Class `_4_Increment`**: Holds the demonstration program.
- **main method**: Executes all increment and decrement operations.
- **Variable `a`**: The integer being modified repeatedly.
- **Increment and decrement operations**: Demonstrate how Java changes variable values.
- **Print statements**: Show the result after each modification.

--------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------------------
1. Program execution begins in `main`.
2. Variable `a` is initialized with the value **10**.
3. The value **10** is printed.
4. `a = a + 1` updates `a` to **11**, then prints **11**.
5. `++a` increments `a` to **12**, then prints **12**.
6. `a++` prints the current value **12**, then increments `a` to **13**.  
   (The printed value is 12; the next print will show 13.)
7. The next print outputs **13**.
8. `a--` prints **13**, then decrements `a` to **12**.
9. The next print outputs **12**.
10. `--a` decrements `a` to **11**, then prints **11**.
11. Program ends.

--------------------------------------------------------------
6. EXACT BEHAVIOR THE PROGRAM PRODUCES WHEN EXECUTED
--------------------------------------------------------------
Console output:

10  
11  
12  
12  
13  
12  
11  

--------------------------------------------------------------
7. NO SUGGESTIONS, NO IMPROVEMENTS — ONLY FACTUAL NOTES
--------------------------------------------------------------

--------------------------------------------------------------
8. CLEAN COPY-PASTE-READY COMMENTED FORMAT (THIS ENTIRE BLOCK)
--------------------------------------------------------------
*/
