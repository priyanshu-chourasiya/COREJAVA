public class _20_Ternatry{
    public static void main(String[] args) {
        int num1 = 14;
        int num2 = 34;
        int num3 = 122;
        // if(num1 > num2){
        //     System.out.println("Num1 is greater");
        // }
        // else{
        //     System.out.println("Num2 is greater");
        // }

        int res = (num1>num2)? num1 : num2;
        //          if condition is  true then left of semicolom else right side of semicolon (it returns)
        System.out.println(res);

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("num1");
            }
            else{
                System.out.println("num3");
            }

        }
        else if(num1 > num2){
            System.out.println("num2");
        }

        res = (num1>num2)? (num1 > num3 ? num1 : num3):(num2 > num3? num2 : num3) ;
        System.out.println(res);
        //
    }
}

/* ============================================================
   REVISION NOTES — ANALYSIS OF THE GIVEN PROGRAM
   ============================================================

1. WHAT THE ENTIRE PROGRAM DOES
------------------------------------------------------------
The program demonstrates the use of the ternary operator to compare
multiple integers and determine the largest value.  
It also includes a nested if-else structure performing similar
comparisons. The program prints the results of these evaluations.


2. IMPORTANT CONCEPTS APPEARING IN THE CODE
------------------------------------------------------------

• Ternary Operator (Conditional Operator)  
  A compact conditional expression of the form:  
      condition ? valueIfTrue : valueIfFalse  
  It returns one of the two values based on the condition’s truth value.

• Nested Ternary Expression  
  A ternary expression used inside another ternary to evaluate multiple
  conditions in a single line.

• Nested if-else Block  
  A control-flow structure where one if-statement exists inside another,
  used to evaluate multiple conditions sequentially.


3. USAGE OF EACH CONCEPT SPECIFICALLY IN THIS CODE
------------------------------------------------------------

• Ternary Operator  
  `int res = (num1 > num2) ? num1 : num2;`  
  → Stores the larger of `num1` and `num2` in `res`.

• Nested if-else  
  The block compares `num1` against `num2`, and if true, compares `num1`
  against `num3` to determine the largest among the two.

• Nested Ternary  
  `res = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);`  
  → Determines the largest among all three numbers in a single expression.


4. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
------------------------------------------------------------

• int num1 = 14  
  First number used in comparisons.

• int num2 = 34  
  Second number used in comparisons.

• int num3 = 122  
  Third number used in comparisons.

• int res  
  Stores the result of ternary evaluations (the larger value).

• First ternary expression  
  Finds the larger of `num1` and `num2`.

• First nested if-else block  
  Attempts to compare all three numbers:
  - If num1 > num2:
       then compare num1 and num3
  - Else if num1 > num2: (redundant condition; never executes)

• Second ternary (nested)  
  Determines the largest among num1, num2, and num3.

• main(String[] args)  
  Executes all comparisons and prints results.


5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
------------------------------------------------------------

(1) Program enters `main()`.  
(2) Variables num1=14, num2=34, num3=122 are initialized.  

(3) First ternary:  
      (num1 > num2) → (14 > 34) → false  
      So res = num2 → 34  
(4) Prints:  
      34  

(5) Nested if-else:  
      if (num1 > num2) → (14 > 34) → false  
      else if (num1 > num2) → same condition → false  
      → No branch executes and nothing is printed from this block.

(6) Second ternary:  
      (num1 > num2)? ... : ...  
         (14 > 34) → false  
      So evaluate right side: (num2 > num3 ? num2 : num3)  
         (34 > 122) → false  
      So result = num3 → 122  
(7) Prints:  
      122  

(8) Program ends.


6. EXACT OUTPUT PRODUCED WHEN THE PROGRAM RUNS
------------------------------------------------------------

34
122


7. (Per requirement) — No suggestions, improvements, or rewrites included.

============================================================ */
