//package 1 Java fundamentals;

public class _6_Condition {
    public static void main(String[] args) {
        int age = 18;
        if(age >= 18){
            System.out.println("Eligible for license");
        }
        else{
            System.out.println("Calm down");
        }
    }
}
/*
==============================================================
REVISION NOTES FOR THE GIVEN CODE
==============================================================

--------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------------------------------------
- This program checks whether a person is eligible for a driving license based on age.
- It compares the value of `age` with 18 and prints one of two possible messages:
  - "Eligible for license" if the condition is true.
  - "Calm down" if the condition is false.

--------------------------------------------------------------
2. IMPORTANT CONCEPTS APPEARING IN THE CODE
(Only concepts directly relevant to this program)
--------------------------------------------------------------
- **int (integer variable)**: A data type used to store whole numbers.
- **if–else condition**: A control-flow structure that executes different blocks depending on whether a condition is true or false.
- **Relational operator (>=)**: Compares two numeric values and returns a boolean result (`true` or `false`).
- **System.out.println()**: Outputs text to the console.

--------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------------------------------
- **int age = 18;**  
  Stores the age value that will be checked in the condition.

- **age >= 18**  
  Compares the age to the minimum required age (18).  
  Used as the condition that determines which block of code executes.

- **if(age >= 18) { ... }**  
  Executes the statements inside the if-block when the condition is true.

- **else { ... }**  
  Executes when the condition in the if-statement evaluates to false.

- **System.out.println(...)**  
  Prints the message corresponding to the executed branch of the condition.

--------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
--------------------------------------------------------------
- **Variable `age`**: Holds the numeric value (18) checked for eligibility.
- **If-block**: Executes the message for eligible users.
- **Else-block**: Executes the fallback message when age is below 18.
- **Print statements**: Provide visual output for the user based on the evaluation result.

--------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------------------
1. Program starts executing the `main` method.
2. Variable `age` is assigned the value **18**.
3. The condition `age >= 18` is evaluated:
   - Since 18 is equal to 18, the condition is **true**.
4. The `if` block executes and prints:
   - "Eligible for license"
5. The `else` block is skipped because the condition was true.
6. Program ends after printing the message.

--------------------------------------------------------------
6. EXACT BEHAVIOR AND OUTPUT WHEN EXECUTED
--------------------------------------------------------------
Console output:

Eligible for license

--------------------------------------------------------------
7. NO SUGGESTIONS, IMPROVEMENTS, OR REWRITES — ONLY FACTUAL NOTES
--------------------------------------------------------------

--------------------------------------------------------------
8. CLEAN COPY-PASTE-READY COMMENTED FORMAT (THIS ENTIRE BLOCK)
--------------------------------------------------------------
*/
