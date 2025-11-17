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
        }
        System.out.println("Alpha Connection terminated");
    }
}
class Beta{
    public void display(){
        System.out.println("Beta connection established");
        Alpha a = new Alpha();
        a.calc();
        System.out.println("Beta connection terminated");
    }
}
public class _5_Exception {
    public static void main(String[] args) {
        System.out.println("Main connection established");
        Beta b = new Beta();
        b.display();
        System.out.println("Main connection terminated");

    }
}
/*
 * if we already handle expection it does not get propogated
 */

 /* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _5_Exception
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PURPOSE OF THE PROGRAM
-------------------------------------------------------------
/*
The program demonstrates how handling an exception inside the same 
method prevents the exception from propagating up the call stack.  
It executes a chain of method calls (main → Beta.display → Alpha.calc),
performs a division operation, and handles any runtime error (such as 
division by zero) inside Alpha.calc(), ensuring the program continues 
its flow normally.
*/


-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (DEFINED + USAGE IN THIS PROGRAM)
-------------------------------------------------------------
/*
1. Scanner  
   - Purpose: Reads input from the console.
   - Usage: Alpha.calc() uses Scanner to read numerator and denominator.

2. try–catch block  
   - Purpose: Handle exceptions that may occur inside the try section.
   - Usage: Alpha.calc() wraps input and division inside try; any error
     is caught in the catch block.

3. Exception (general handler)  
   - Purpose: Captures any type of runtime exception.
   - Usage: Alpha.calc() catches all possible issues (e.g., division by zero,
     invalid input) and prints a message.

4. Exception Non-Propagation  
   - Purpose: Show that if an exception is caught, it does NOT move to caller.
   - Usage: Alpha.calc() handles exceptions internally, so Beta.display()
     and main() are unaffected.

5. Method Invocation Chain  
   - Purpose: Demonstrates call flow through multiple classes.
   - Usage:  
       main() → Beta.display() → Alpha.calc()
*/


-------------------------------------------------------------
3. PURPOSE OF EVERY CLASS, METHOD, VARIABLE, AND STRUCTURE
-------------------------------------------------------------
/*
CLASS: Alpha  
- Handles user input and division operation.

METHOD: calc()  
- Prints connection start.
- Reads numerator and denominator.
- Performs division.
- If any error occurs, prints "Problem occured".
- Prints termination message.

VARIABLES IN calc():
  Scanner sc → Reads user input.
  int n → numerator entered by user.
  int d → denominator entered by user.
  int res → result of n/d.

---------------------------------------------

CLASS: Beta  
- Acts as an intermediate layer between main and Alpha.

METHOD: display()  
- Prints connection start.
- Creates Alpha object.
- Calls calc() on Alpha.
- Prints termination message.

---------------------------------------------

CLASS: _5_Exception  
- Main driver class.

METHOD: main(String[] args)  
- Prints main connection start.
- Creates Beta object.
- Calls display().
- Prints main connection termination.
*/


-------------------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP-BY-STEP)
-------------------------------------------------------------
/*
1. Program starts.
2. main() prints: "Main connection established".
3. Beta object is created.
4. main() calls b.display().

---------- Inside Beta.display() ----------
5. Prints: "Beta connection established".
6. Creates Alpha object.
7. Calls a.calc().

---------- Inside Alpha.calc() ----------
8. Prints: "Alpha connection established".
9. Enters try block.
10. Prompts user for numerator → stores in n.
11. Prompts user for denominator → stores in d.
12. Evaluates res = n / d.
13. Prints: "Result is : <value>".
14. If any exception occurs:
       Jumps to catch block,
       Prints: "Problem occured".
15. Prints: "Alpha Connection terminated".
16. Returns to Beta.display().

---------- Back to Beta.display() ----------
17. Prints: "Beta connection terminated".
18. Returns to main().

---------- Back to main() ----------
19. Prints: "Main connection terminated".
20. Program ends.
*/


-------------------------------------------------------------
5. EXACT RUNTIME BEHAVIOR AND OUTPUT
-------------------------------------------------------------
/*
A. NORMAL EXECUTION (no exception)
     Main connection established
     Beta connection established
     Alpha connection established
     Kindly enter the numerator :
     kindly enter denomirator :
     Result is : <value>
     Alpha Connection terminated
     Beta connection terminated
     Main connection terminated

B. IF AN EXCEPTION OCCURS (e.g., denominator = 0)
   Alpha.calc() catches it, prints "Problem occured", 
   and program continues normally.

   Output:
     Main connection established
     Beta connection established
     Alpha connection established
     Kindly enter the numerator :
     kindly enter denomirator :
     Problem occured
     Alpha Connection terminated
     Beta connection terminated
     Main connection terminated

C. Because the exception is handled inside Alpha.calc(),  
   it does NOT propagate to Beta.display() or main().
*/


-------------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------------
