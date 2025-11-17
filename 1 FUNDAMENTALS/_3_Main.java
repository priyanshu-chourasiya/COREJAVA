//package 1 Java fundamentals;

public class _3_Main {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        //byte result = a+b; // result of any whole number in java is int error : 
        //incompatible types: possible lossy conversion from int to byte
        int result = a+b;

        int n1 = 12;
        int n2 = 6;
        int res = n1/n2;
        System.out.println("1 : "+res);
        int n3 = 5;
        System.out.println("2 : "+n1/n3);
        System.out.println("3 : "+(double)n1/n3);
        System.out.println("4 : "+(float)n1/n3);
        float res2 = n1/n3;
        System.out.println("5 : "+res2);

        // rounding to zero or truncation
        // whenever int to int division happens the result is always int doesnt matter where u are storing the result
    }
}
/*
==============================================================
REVISION NOTES FOR THE GIVEN CODE
==============================================================

--------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------------------------------------
- This program demonstrates:
  - How arithmetic operations behave with Java’s numeric types.
  - Why adding two `byte` values produces an `int`.
  - Integer division behavior (truncation toward zero).
  - How casting to `double` or `float` changes division results.
- It prints five different division outcomes to show differences between integer and floating-point division.

--------------------------------------------------------------
2. DEFINITIONS OF EVERY CONCEPT APPEARING IN THE CODE
--------------------------------------------------------------
- **Class**: A Java construct that groups related code; here `_3_Main`.
- **public**: Access modifier allowing global visibility.
- **static**: Allows method execution without an object instance.
- **void**: Indicates the method returns no value.
- **main method**: The program’s entry point.
- **byte**: A primitive integer type (range: –128 to 127).
- **int**: Standard 32-bit whole-number primitive type.
- **float**: 32-bit floating-point primitive type.
- **double**: 64-bit floating-point primitive type.
- **Variable**: A named storage location for data.
- **Arithmetic operators (+, /)**: Used for addition and division.
- **Type promotion**: Automatic conversion of smaller types to larger types during arithmetic.
- **Integer division**: Division where both operands are integers; the result is truncated (decimals removed).
- **Casting**: Converting a value from one type to another using `(type)`.
- **String concatenation**: Combining a string with a value using `+`.
- **System.out.println()**: Method that prints output with a newline.
- **Comment (//)**: Non-executing text explaining parts of the code.

--------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------------------------------
- **byte a, b**: Represent small numeric values.
- **a + b**: Automatically promoted to int; cannot be stored in a byte without explicit cast.
- **int result = a + b;**: Stores the promoted int result.
- **int n1, n2, n3**: Used for integer division examples.
- **n1 / n2**: Demonstrates exact integer division (12 / 6 = 2).
- **n1 / n3**: Demonstrates truncating integer division (12 / 5 = 2).
- **(double)n1 / n3**: Forces floating-point division → 2.4.
- **(float)n1 / n3**: Same as above but in float form → 2.4.
- **float res2 = n1 / n3;**: Demonstrates storing an integer-division result in a float (becomes 2.0).
- **println()**: Outputs each calculation with a label.

--------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
--------------------------------------------------------------
- **Class `_3_Main`**: Container for the demonstration program.
- **main method**: Holds all executable statements.
- **a, b (byte)**: Show numeric promotion when performing arithmetic.
- **result (int)**: Stores the sum of two bytes after promotion.
- **n1, n2, n3 (int)**: Provide values for division examples.
- **res (int)**: Stores integer division result of `n1/n2`.
- **res2 (float)**: Stores integer division result but demonstrates that type of storage does not change integer-division behavior.
- **println statements**: Display results for comparison.
- **Comments**: Explain type promotion and truncation rules.

--------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------------------
1. Program begins execution in `main`.
2. Two byte variables `a` (10) and `b` (20) are created.
3. The expression `a + b` is evaluated; both bytes are promoted to int.
4. The int result (30) is stored in `result`.
5. Integers `n1` (12) and `n2` (6) are declared.
6. `res = n1 / n2` calculates integer division → 2.
7. `println("1 : " + res)` prints **1 : 2**.
8. Integer `n3` (5) is declared.
9. `println("2 : " + n1/n3)` performs **12 / 5** as integer division → 2.
10. `println("3 : " + (double)n1/n3)` casts `n1` to double → floating-point division → 2.4.
11. `println("4 : " + (float)n1/n3)` casts `n1` to float → floating-point division → 2.4.
12. `res2 = n1/n3` performs integer division (12 / 5 = 2), result is stored as float → 2.0.
13. `println("5 : " + res2)` prints **5 : 2.0**.
14. Final comments explain truncation and integer-division rules.
15. Program ends.

--------------------------------------------------------------
6. EXACT BEHAVIOR THE PROGRAM PRODUCES WHEN EXECUTED
--------------------------------------------------------------
Console output:

1 : 2  
2 : 2  
3 : 2.4  
4 : 2.4  
5 : 2.0  

--------------------------------------------------------------
7. NO SUGGESTIONS, NO IMPROVEMENTS — ONLY FACTUAL NOTES
--------------------------------------------------------------

--------------------------------------------------------------
8. CLEAN COPY-PASTE-READY COMMENTED FORMAT (THIS ENTIRE BLOCK)
--------------------------------------------------------------
*/
