//package 1 Java fundamentals;

public class _1_First {
    public static void main(String[] args) {
        System.out.println("ABC");
        System.out.println(")");
        
        int a = 77;
        long d = 3333l;

        System.out.println(a);
        System.out.println(d);

        int num = 454; // default data type of whole numbers

        double num_dec = 3.4; // default for decimal

        System.out.println("a");
        System.out.println(a);
        // 
    }
}

/*
==============================================================
REVISION NOTES FOR THE GIVEN CODE
==============================================================

--------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------------------------------------
- This program defines a Java class named `_1_First`.
- It contains a `main` method that prints several values to the console:
  - The string "ABC"
  - The string ")"
  - The integer value stored in variable `a`
  - The long value stored in variable `d`
  - The string "a"
  - The integer value stored in variable `a` again
- It also declares integer and double variables, though not all of them are printed.

--------------------------------------------------------------
2. DEFINITIONS OF EVERY CONCEPT APPEARING IN THE CODE
--------------------------------------------------------------
- **Class**: A blueprint for creating objects; a container for code.
- **public**: An access modifier allowing visibility from anywhere.
- **class keyword**: Used to declare a class.
- **_1_First**: The name of the class.
- **main method**: The entry point of a Java program (`public static void main(String[] args)`).
- **static**: Allows the method to run without creating an object of the class.
- **void**: Return type meaning the method returns nothing.
- **String[] args**: An array of Strings used to receive command-line arguments.
- **System**: A built-in Java class from the standard library.
- **out**: A static member of `System` representing standard output.
- **println()**: A method that prints text or values to the console with a newline.
- **int**: A primitive data type for whole numbers.
- **long**: A primitive data type for larger whole numbers.
- **double**: A primitive data type for decimal numbers.
- **Variable**: A named storage location holding data.
- **Assignment operator (=)**: Assigns a value to a variable.
- **L literal suffix**: Indicates a long literal.
- **Comment (//)**: A single-line comment ignored by the compiler.

--------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------------------------------
- **Class `_1_First`**: Used to group all code logically in one unit.
- **main method**: Used as the start point when the program runs.
- **System.out.println()**: Used repeatedly to print values and strings.
- **int variable `a`**: Stores the value `77`, later printed.
- **long variable `d`**: Stores the value `3333L`, later printed.
- **int variable `num`**: Stores `454`, demonstrating whole-number type.
- **double variable `num_dec`**: Stores `3.4`, demonstrating decimal type.
- **Comments**: Used to describe default data types.

--------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
--------------------------------------------------------------
- **Class `_1_First`**: Container that holds the program.
- **main method**: Executes all statements inside it when the program starts.
- **`a` (int)**: Demonstrates storing and printing an integer.
- **`d` (long)**: Demonstrates storing and printing a long number.
- **`num` (int)**: Demonstrates default whole-number type (not printed).
- **`num_dec` (double)**: Demonstrates default decimal type (not printed).
- **println statements**: Output specific strings and variable values to the console.

--------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------------------
1. Program execution begins at the `main` method.
2. `System.out.println("ABC");` prints **ABC**.
3. `System.out.println(")");` prints **)**.
4. Variable `a` is created and assigned `77`.
5. Variable `d` is created and assigned `3333L`.
6. `System.out.println(a);` prints **77**.
7. `System.out.println(d);` prints **3333**.
8. Variable `num` is declared and assigned `454` (not printed).
9. Variable `num_dec` is declared and assigned `3.4` (not printed).
10. `System.out.println("a");` prints the letter **a** (string).
11. `System.out.println(a);` prints **77** again.
12. Program ends.

--------------------------------------------------------------
6. EXACT BEHAVIOR THE PROGRAM PRODUCES WHEN EXECUTED
--------------------------------------------------------------
The console output will be:

ABC
)
77
3333
a
77

--------------------------------------------------------------
7. NO SUGGESTIONS, NO IMPROVEMENTS — ONLY FACTUAL NOTES
--------------------------------------------------------------

--------------------------------------------------------------
8. CLEAN COPY-PASTE READY COMMENTED FORMAT (THIS WHOLE BLOCK)
--------------------------------------------------------------
*/
