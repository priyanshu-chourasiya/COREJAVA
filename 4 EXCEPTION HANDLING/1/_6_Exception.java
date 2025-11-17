import java.util.Scanner;
class Alpha{
    public void calc() throws ArithmeticException{ // informing that this method will throw
                // caller must handle exception
                // is called duck the exception
        System.out.println("Alpha connection established");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Kindly enter the numerator : ");
        int n = sc.nextInt();

        System.out.print("kindly enter denomirator : ");
        int d = sc.nextInt();

        int res = n/d;
        System.out.println("Result is : " +res);       
        
        System.out.println("Alpha Connection terminated");
    }
}
public class _6_Exception {
    public static void main(String[] args) {
        try{
        System.out.println("Main connection established");
        Alpha a = new Alpha();
        a.calc();
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught at main method");
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
attempts to divide them, and prints the result. If the denominator is
zero, an ArithmeticException occurs and is caught in the main method,
preventing the program from crashing. The program also prints messages
showing when each part (Main and Alpha) establishes and terminates
connection.

-------------------------------------------------------
2. DEFINITIONS OF IMPORTANT CONCEPTS USED IN THIS PROGRAM
   (Only concepts actually relevant to the code logic)
-------------------------------------------------------

• Class  
  A blueprint containing methods and logic. Used to organize code.

• Object  
  A runtime instance of a class used to call non-static methods.

• Method  
  A block of code that performs a specific task.

• throws (Exception Specification)  
  A keyword indicating that the method may generate an exception and
  the caller must handle it.

• ArithmeticException  
  A runtime exception typically thrown when dividing by zero.

• try–catch block  
  A structure used to handle exceptions and prevent abnormal program
  termination.

• Scanner  
  A utility class from java.util used to take input from the keyboard.

-------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------

• Class "Alpha"  
  Contains the calc() method which performs input, division,
  and prints connection status messages.

• Class "_6_Exception"  
  Contains the main method and creates an object of Alpha.

• Object "a" (Alpha a = new Alpha();)  
  Used to call the calc() method.

• Method calc()  
  - Takes integer input using Scanner.
  - Performs division.
  - Prints connection messages.
  - Declares throws ArithmeticException, meaning main must handle any
    such exception generated inside.

• throws ArithmeticException  
  Applied to calc() to pass division errors up to the main method.

• try–catch in main  
  Surrounds the call to a.calc().  
  If division by zero occurs, catch(ArithmeticException e) handles it
  gracefully.

• Scanner sc  
  Reads numerator and denominator from keyboard input.

-------------------------------------------------------
4. PURPOSE OF EACH VARIABLE, METHOD, BLOCK, AND STRUCTURE
-------------------------------------------------------

• Scanner sc  
  To read user input for numerator and denominator.

• int n  
  Stores the numerator entered by the user.

• int d  
  Stores the denominator entered by the user.

• int res  
  Stores the result of the division (n / d).

• calc() method  
  Performs input, division, and prints connection status.

• main() method  
  Establishes main connection, creates Alpha object, calls calc(),
  handles possible exceptions, and prints termination message.

• try block  
  Ensures that any ArithmeticException from calc() is caught.

• catch(ArithmeticException e)  
  Executes if denominator is zero, avoiding program crash.

-------------------------------------------------------
5. COMPLETE CONTROL FLOW FROM START TO END
-------------------------------------------------------

1. Program starts in main().
2. “Main connection established” is printed.
3. Alpha object “a” is created.
4. a.calc() is called inside try block.
5. Control moves to calc() method.
6. “Alpha connection established” is printed.
7. Scanner asks the user to enter numerator → stored in n.
8. Scanner asks the user to enter denominator → stored in d.
9. res = n/d is executed:
     - If d != 0 → division succeeds.
     - If d == 0 → ArithmeticException is thrown.
10. If division succeeds:
      • “Result is : res” is printed.
      • “Alpha Connection terminated” is printed.
      • Control returns to main().
11. main() prints “Main connection terminated”.
12. Program ends normally.

-- Exception Path --
If denominator is zero:
  a. Division attempt throws ArithmeticException inside calc().
  b. Because calc() declares "throws", exception goes to main().
  c. catch(ArithmeticException e) executes.
  d. “Exception caught at main method” is printed.
  e. After catch, main prints “Main connection terminated”.
  f. Program ends.

-------------------------------------------------------
6. EXACT RUNTIME BEHAVIOR
-------------------------------------------------------

Case 1 — Valid denominator (e.g., 10 and 2):
    Main connection established
    Alpha connection established
    Kindly enter the numerator :
    Kindly enter denomirator :
    Result is : 5
    Alpha Connection terminated
    Main connection terminated

Case 2 — Denominator is zero (e.g., 10 and 0):
    Main connection established
    Alpha connection established
    Kindly enter the numerator :
    Kindly enter denomirator :
    Exception caught at main method
    Main connection terminated

-------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------
*/
