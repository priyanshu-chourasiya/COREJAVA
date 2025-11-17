import java.util.Scanner;
class Alpha{
    public void calc() throws ArithmeticException{ // informing that this method will throw
                // caller must handle exception
                // is called duck the exception
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
        catch(ArithmeticException e){
            System.out.println("Handles at Alpha class");
            throw e; // like return after throw lines will not get executed
        }
        finally{ // executes every time
            // try and finally can be used 
            // finally alone cannot be used
            System.out.println("Alpha Connection terminated"); 
        }
    }
}
public class _8_Exception {
    public static void main(String[] args) {
        
        System.out.println("Main connection established");
        try{
        Alpha a = new Alpha();
        a.calc();
        }
        catch(ArithmeticException e){
            System.out.println("Handles at Main class");
        }
        System.out.println("Main connection terminated");

    }
}
/*
===========================================
REVISION NOTES FOR THE GIVEN PROGRAM
===========================================

-------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------
The program reads two numbers (numerator and denominator), attempts
to divide them inside the Alpha class, and demonstrates how an
exception can be caught, rethrown, and still ensure that the
finally block executes regardless of success or failure.
Both Alpha and Main print connection messages indicating the flow.

-------------------------------------------------------
2. DEFINITIONS OF IMPORTANT CONCEPTS USED IN THIS PROGRAM
-------------------------------------------------------

• try–catch–finally  
  A structure where:
    - try contains code that may cause exceptions.
    - catch handles specific exceptions.
    - finally executes always, regardless of success, catch, or rethrow.

• finally block  
  A guaranteed-execution block used for cleanup or closing resources.

• throw (Explicit Throwing)  
  Used to rethrow the caught exception to the caller.

• throws (Exception Declaration)  
  Declares that the method may let the exception propagate outward.

• ArithmeticException  
  Occurs when dividing by zero.

• Rethrowing Exception  
  Once caught, it is thrown again to be handled by a higher-level caller.

• Scanner  
  Used for reading input from the user.

-------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------

• try block in calc()  
  Holds the input-taking and division logic.

• catch(ArithmeticException e) in calc()  
  Prints “Handles at Alpha class” and rethrows the exception so the
  caller may also handle it.

• finally block in calc()  
  Prints “Alpha Connection terminated” every time:
    - after normal execution,
    - after exception handling,
    - even if an exception is rethrown.

• throws ArithmeticException in calc()  
  Required since the method can rethrow the exception.

• try block in main()  
  Surrounds the call to a.calc().

• catch(ArithmeticException e) in main()  
  Executes when calc() rethrows the exception.

• Scanner sc  
  Reads numerator and denominator.

-------------------------------------------------------
4. PURPOSE OF EACH VARIABLE, METHOD, BLOCK, AND STRUCTURE
-------------------------------------------------------

• int n  
  Stores numerator entered by user.

• int d  
  Stores denominator entered by user.

• int res  
  Stores calculation result of n/d.

• calc() method  
  Handles input, division, local exception handling, rethrowing, and
  ensures final termination message through finally.

• main() method  
  Creates Alpha object, calls calc(), handles propagated exceptions,
  and prints main connection messages.

• try–catch–finally in calc()  
  try   → division logic  
  catch → prints message and rethrows  
  finally → prints termination message always

• try–catch in main()  
  Receives rethrown exception from calc() and prints appropriate message.

-------------------------------------------------------
5. COMPLETE CONTROL FLOW FROM START TO END
-------------------------------------------------------

1. Program begins in main().
2. Prints “Main connection established”.
3. Enters try block in main().
4. Creates Alpha object: Alpha a = new Alpha().
5. Calls a.calc().
6. Control moves into calc().
7. Prints “Alpha connection established”.

8. Enters try block inside calc():
    a. User enters numerator (stored in n).
    b. User enters denominator (stored in d).
    c. Attempt to compute res = n/d.

---- SUCCESS PATH (Denominator not zero) ----
9. Division succeeds, result printed.
10. catch block skipped.
11. finally block executes:
      → Prints “Alpha Connection terminated”.
12. Control returns to main().
13. main’s catch block is skipped.
14. Prints “Main connection terminated”.
15. Program ends normally.

---- EXCEPTION PATH (Denominator is zero) ----
9. ArithmeticException occurs at n/d.
10. Control moves to catch block:
      → Prints “Handles at Alpha class”.
      → throw e rethrows the exception.
11. finally block executes:
      → Prints “Alpha Connection terminated”.
12. Exception travels back to main().
13. main’s catch executes:
      → Prints “Handles at Main class”.
14. After catch, prints “Main connection terminated”.
15. Program ends normally.

-------------------------------------------------------
6. EXACT RUNTIME BEHAVIOR
-------------------------------------------------------

Case 1 — Valid denominator (example: 12 and 3):
    Main connection established
    Alpha connection established
    Kindly enter the numerator :
    kindly enter denomirator :
    Result is : 4
    Alpha Connection terminated
    Main connection terminated

Case 2 — Denominator is 0:
    Main connection established
    Alpha connection established
    Kindly enter the numerator :
    kindly enter denomirator :
    Handles at Alpha class
    Alpha Connection terminated
    Handles at Main class
    Main connection terminated

-------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------
*/
