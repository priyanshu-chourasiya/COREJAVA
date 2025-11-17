//package 1 Java fundamentals;

public class _2_TyepCasting {
    public static void main(String[] args) {
        byte a = 45; //implicite typecasting or numeric type promotion
        double b;
        b = a;
        System.out.println(b);
        
        // double c = 45.0; // error : incompatible types: possible lossy conversion from double to int
        // int d;
        // d = c;
        // System.out.println(d);

        // double c = 45.0; // explicite typecasting
        // int d;
        // d = (int)c;
        // System.out.println(d);

        double c = 45.5; // loss of precition
        //d = (int)c;
        //System.out.println(d);
        
    }
}
/*
==============================================================
REVISION NOTES FOR THE GIVEN CODE
==============================================================

--------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------------------------------------
- This program demonstrates **type casting** in Java.
- It shows:
  - Implicit type casting (automatic widening).
  - Comments explaining what would happen during incompatible assignments.
  - Explicit type casting (manual narrowing).
  - A final double variable `c` that shows potential precision loss when converted to int (though the cast is commented out).
- The only actual output produced is the value of `b`, which comes from assigning a byte to a double.

--------------------------------------------------------------
2. DEFINITIONS OF EVERY CONCEPT APPEARING IN THE CODE
--------------------------------------------------------------
- **Class**: A blueprint or container for Java code.
- **public**: Access modifier allowing visibility everywhere.
- **class keyword**: Used to declare the class `_2_TyepCasting`.
- **main method**: Entry point of Java programs.
- **static**: Allows the method to run without creating an object.
- **void**: Indicates no value is returned.
- **String[] args**: Array of String arguments for command-line inputs.
- **byte**: A primitive integer type (range: -128 to 127).
- **double**: A primitive decimal (floating-point) type.
- **int**: A primitive whole-number type.
- **Variable**: A named storage location for values.
- **Assignment operator (=)**: Stores a value into a variable.
- **Implicit type casting (widening)**: Automatic conversion to a larger type. Example: byte → double.
- **Explicit type casting (narrowing)**: Manual conversion to a smaller type using `(type) value`. Example: double → int.
- **Loss of precision**: Occurs when converting a decimal to an integer (fraction removed).
- **System.out.println()**: Prints output to the console.
- **Comment (//)**: Non-executing explanation for readers.

--------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------------------------------
- **byte a = 45;**  
  Demonstrates storing a small integer value.
- **double b; b = a;**  
  Demonstrates implicit widening conversion from byte → double.
- **println(b);**  
  Prints the widened value.
- **double c = 45.0; int d = (int)c;** (commented)  
  Demonstrates explicit narrowing conversion.
- **double c = 45.5;**  
  Shows that converting 45.5 to int would remove the decimal part.
- **Commented code**  
  Used for educational explanation without actual execution.

--------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
--------------------------------------------------------------
- **Class `_2_TyepCasting`**: Holds all type-casting examples.
- **main method**: Executes the program.
- **Variable `a` (byte)**: Source value for implicit casting.
- **Variable `b` (double)**: Receives the widened value of `a`.
- **Variable `c` (double)**: Demonstrates precision-loss scenario.
- **Commented sections**: Illustrate incorrect code and correct explicit casting.
- **println(b)**: Outputs the result of implicit widening.

--------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------------------
1. Program enters `main`.
2. A byte variable `a` is created and assigned the value **45**.
3. A double variable `b` is declared.
4. `b = a` performs implicit type casting (byte → double).
5. `System.out.println(b);` prints **45.0**.
6. Several blocks of code are present but commented out:
   - Attempting implicit narrowing (invalid).
   - Correct explicit narrowing.
7. A double variable `c` is assigned **45.5** to illustrate possible precision loss.
8. The line casting `c` to int is commented out, so no further actions occur.
9. Program ends.

--------------------------------------------------------------
6. EXACT BEHAVIOR THE PROGRAM PRODUCES WHEN EXECUTED
--------------------------------------------------------------
Actual console output:

45.0

--------------------------------------------------------------
7. NO SUGGESTIONS, NO IMPROVEMENTS — ONLY FACTUAL NOTES
--------------------------------------------------------------

--------------------------------------------------------------
8. CLEAN COPY-PASTE-READY COMMENTED FORMAT (THIS ENTIRE BLOCK)
--------------------------------------------------------------
*/
