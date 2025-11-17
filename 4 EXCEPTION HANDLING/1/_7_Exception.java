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
        System.out.println("Alpha Connection terminated"); // this line wont get executed
    }
}
public class _7_Exception {
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
The program takes two integers as input (numerator and denominator),
performs a division inside the Alpha class, and demonstrates how an
exception can be caught in one location (Alpha class) and rethrown
to be handled again by another location (main method). Messages
indicate where connections start and terminate. The line after
throw inside Alpha does not execute.

-------------------------------------------------------
2. DEFINITIONS OF IMPORTANT CONCEPTS USED IN THIS PROGRAM
-------------------------------------------------------

• try–catch block  
  A structure to handle exceptions and prevent abnormal termination.

• throw (Explicit Throwing)  
  A keyword used to manually rethrow an exception to the caller.

• throws (Exception Declaration)  
  Indicates that the method may generate an exception and that the
  method's caller must be prepared to handle it.

• ArithmeticException  
  Runtime exception triggered when dividing by zero.

• Scanner  
  Utility class to take input from keyboard.

• Rethrowing Exception  
  Catching an exception, performing some handling, and then throwing
  it again so it can be handled by another scope.

-------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------

• try block in calc()  
  Contains the input logic and division. If division fails, exception
  is caught locally first.

• catch(ArithmeticException e) in calc()  
  Prints a message (“Handles at Alpha class”) and then rethrows the
  same exception using throw e.

• throw e  
  Sends the caught exception back to the method caller (main).

• throws ArithmeticException in method declaration  
  Required because calc() can rethrow ArithmeticException.

• try block in main()  
  Surrounds the call to a.calc() to catch any rethrown exceptions.

• catch(ArithmeticException e) in main()  
  Prints “Handles at Main class” when the exception comes from Alpha.

• Scanner sc  
  Reads numerator and denominator from user input.

-------------------------------------------------------
4. PURPOSE OF EACH VARIABLE, METHOD, BLOCK, AND STRUCTURE
-------------------------------------------------------

• Scanner sc  
  To read user input.

• int n  
  Stores the numerator entered by the user.

• int d  
  Stores the denominator entered by the user.

• int res  
  Stores the result of division n/d.

• calc() method  
  Performs input, division, handles exception locally, and demonstrates
  rethrowing.

• main() method  
  Establishes main connection, creates Alpha object, calls calc(), and
  handles rethrown exceptions.

• try–catch in calc()  
  Allows Alpha class to partially handle the exception before sending
  it upward.

• try–catch in main()  
  Catches the rethrown exception to prevent program crash.

-------------------------------------------------------
5. COMPLETE CONTROL FLOW FROM START TO END
-------------------------------------------------------

1. Program begins in main().
2. Prints “Main connection established”.
3. Enters try block in main().
4. Creates Alpha object: Alpha a = new Alpha().
5. Calls a.calc().
6. Control enters calc().
7. Prints “Alpha connection established”.
8. Enters try block of calc().
9. User enters numerator → stored in n.
10. User enters denominator → stored in d.
11. res = n/d is attempted:
      - If denominator is not zero → no exception.
      - If denominator is zero → ArithmeticException occurs.
12. SUCCESS PATH:
      a. Prints “Result is : <value>”.
      b. try block ends.
      c. catch block is skipped.
      d. Prints “Alpha Connection terminated”.
      e. Control returns to main().
      f. main() prints “Main connection terminated”.
      g. Program ends normally.

13. EXCEPTION PATH:
      a. ArithmeticException occurs at n/d.
      b. Control jumps to catch block inside Alpha.
      c. Prints “Handles at Alpha class”.
      d. throw e rethrows the exception.
      e. Code after throw inside calc(), including
         “Alpha Connection terminated”, does NOT execute.
      f. Exception returns to main()’s catch block.
      g. main() prints “Handles at Main class”.
      h. After catch, main() prints “Main connection terminated”.
      i. Program ends normally.

-------------------------------------------------------
6. EXACT RUNTIME BEHAVIOR
-------------------------------------------------------

Case 1 — Valid denominator (e.g., 12 and 3):
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
    Handles at Main class
    Main connection terminated

-------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------
*/
