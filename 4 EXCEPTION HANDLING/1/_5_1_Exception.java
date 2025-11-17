import java.util.Scanner;
class Alpha{
    public void calc(){
        System.out.println("Alpha connection established");
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
            System.out.println("Problem occured");
            calc();
        }
        System.out.println("Alpha Connection terminated");
    }
}
public class _5_1_Exception {
    public static void main(String[] args) {
        System.out.println("Main connection established");
        Alpha a = new Alpha();
        a.calc();
        System.out.println("Main connection terminated");

    }
}
/*
 * if we already handle expection it does not get propogated
 */
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _5_1_Exception
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PURPOSE OF THE PROGRAM
-------------------------------------------------------------
/*
The program demonstrates **exception handling inside the same method**
and shows that when an exception is caught, it does **not propagate**
up the call stack. Instead, the method handles the error internally
and then recursively calls itself to retry the input process.
The program establishes a "Main connection", calls Alpha.calc(),
performs division, and terminates.
*/


-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (DEFINED + USAGE IN THIS PROGRAM)
-------------------------------------------------------------
/*
1. Scanner  
   - Purpose: Reads user input from the console.
   - Usage here: Used in Alpha.calc() to read numerator and denominator.

2. try–catch block  
   - Purpose: To detect and handle exceptions that occur inside try.
   - Usage here: Wraps all arithmetic input and division operations.
     Any exception (including division by zero or invalid input) will
     be caught in the catch block.

3. Exception (general exception handler)  
   - Purpose: Catches all types of exceptions not handled specifically.
   - Usage here: Catches any runtime error during input or division.

4. Recursion  
   - Purpose: A method calling itself.
   - Usage here: Inside catch block, calc() calls itself to retry when
     an error occurs.

5. Exception Non-Propagation  
   - Purpose: Demonstrates that if an exception is caught, it does not
     move up to main().
   - Usage here: Because Alpha.calc() handles exceptions internally,
     main() never receives them.
*/


-------------------------------------------------------------
3. PURPOSE OF EVERY CLASS, METHOD, VARIABLE, AND STRUCTURE
-------------------------------------------------------------
/*
CLASS: Alpha  
- Contains logic for reading numeric input, performing division, and
  retrying the operation upon error.

METHOD: calc()  
- Prints start message.
- Reads numerator and denominator.
- Performs n/d and prints result.
- If any exception occurs → prints "Problem occured" and calls calc() again.
- Prints termination message at the end of each call.

VARIABLES IN calc():
  Scanner sc → Reads user input.
  int n → numerator.
  int d → denominator.
  int res → result of division.

---------------------------------------------

CLASS: _5_1_Exception  
- Contains main program flow.

METHOD: main(String[] args)  
- Prints start message.
- Creates Alpha object.
- Calls a.calc().
- Prints termination message after calc() finishes (after successful or repeated attempts).
*/


-------------------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP-BY-STEP)
-------------------------------------------------------------
/*
1. Program starts in main().
2. Prints: "Main connection established".

3. Creates Alpha object: a.
4. Calls a.calc().

---------- Inside Alpha.calc() ----------
5. Prints: "Alpha connection established".
6. Enters try block.
7. Prompts user for numerator → reads into n.
8. Prompts user for denominator → reads into d.
9. Performs res = n / d.
10. Prints: "Result is : <value>".
11. Leaves try block normally.
12. Prints: "Alpha Connection terminated".
13. Returns to main().

---------- If an exception occurs ----------
A. Exception is thrown during input or division.
B. Execution goes to catch(Exception e).
C. Prints: "Problem occured".
D. Calls calc() again (recursion).
E. After recursive call completes successfully, prints:
     "Alpha Connection terminated".
F. Returns to caller.

---------- Back to main() ----------
14. After calc() eventually succeeds, main prints:
       "Main connection terminated".
15. Program ends.
*/


-------------------------------------------------------------
5. EXACT RUNTIME BEHAVIOR AND OUTPUT
-------------------------------------------------------------
/*
A. NORMAL EXECUTION (valid denominator)
     Main connection established
     Alpha connection established
     Kindly enter the numerator :
     kindly enter denomirator :
     Result is : <value>
     Alpha Connection terminated
     Main connection terminated

B. IF USER ENTERS ZERO AS DENOMINATOR OR INVALID INPUT
   - Exception is caught.
   - Program prints "Problem occured".
   - calc() is called again.
   - User is asked again for inputs.
   - This repeats until valid inputs are provided.

   Example behavior:
     Main connection established
     Alpha connection established
     Kindly enter the numerator : 10
     kindly enter denomirator : 0
     Problem occured
     Alpha connection established
     Kindly enter the numerator :
     ...

C. IMPORTANT NOTE  
   - Because exceptions are handled inside calc(), **main() never receives them**.
   - Therefore, the program never terminates with a stack trace.
*/


-------------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------------
