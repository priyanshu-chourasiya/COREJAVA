import java.util.Scanner;

class _1_Exception{
    public static void main(String[] args) {
        System.out.println("Connection established");

        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Kindly enter the numerator : ");
            int n = sc.nextInt();

            System.out.print("kindly enter denomirator : ");
            int d = sc.nextInt();

            int res = n/d;
            System.out.println("Result is : " +res);
        }
        catch(Exception e){
            System.out.println("Please enter non zero denominarator");
        }
        System.out.println("Connection terminated");
    }
}
/*
------------------------------------------------------------
REVISION NOTES FOR PROGRAM: EXCEPTION HANDLING IN JAVA
------------------------------------------------------------

1. PURPOSE OF THE PROGRAM
-------------------------
- Demonstrates **exception handling** in Java using `try-catch`.
- Prevents the program from crashing when dividing by zero.
- Ensures the program prints termination message even if an exception occurs.

2. EXPLANATION OF CODE COMPONENTS
---------------------------------

`Scanner sc = new Scanner(System.in);`
- Used to take input from the user.

`try { ... }`
- Contains code that might throw an exception.
- Here, dividing two integers `n/d` may cause `ArithmeticException` if denominator is zero.

`catch(Exception e) { ... }`
- Catches any exception of type `Exception` or its subclasses.
- Executes the block to handle the error.
- In this program, it prints `"Please enter non zero denominarator"`.

`System.out.println("Connection terminated");`
- Executes after the try-catch block.
- Demonstrates **normal flow continuation** after handling exception.

3. CONTROL FLOW
----------------
1. Program prints `"Connection established"`.
2. User enters numerator and denominator.
3. Java evaluates `n/d`:
   - If denominator ≠ 0 → prints result.
   - If denominator = 0 → throws `ArithmeticException`, control goes to `catch` block.
4. Prints termination message `"Connection terminated"`.

4. NOTES ON EXCEPTION HANDLING
-------------------------------
- `Exception` is the **superclass** for all checked and unchecked exceptions.
- Specific exceptions like `ArithmeticException` can also be caught for more precise handling.
- `try-catch` ensures the program does not crash.
- Multiple `catch` blocks can be used to handle different exceptions separately.
- `finally` block can be used to execute code regardless of exception occurrence (e.g., closing resources).

5. SAMPLE RUN
---------------
Example 1 (no exception):
Connection established
Kindly enter the numerator : 10
kindly enter denomirator : 2
Result is : 5
Connection terminated

Example 2 (division by zero):
Connection established
Kindly enter the numerator : 10
kindly enter denomirator : 0
Please enter non zero denominarator
Connection terminated

------------------------------------------------------------
END OF REVISION NOTES
------------------------------------------------------------
*/
