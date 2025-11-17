import java.util.Scanner;
class Alpha{
    public void calc(){
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
class Beta{
    public void display(){
        System.out.println("Beta connection established");
        Alpha a = new Alpha();
        a.calc();
        System.out.println("Beta connection terminated");
    }
}
public class _4_Exception {
    public static void main(String[] args) {
        System.out.println("Main connection established");
        Beta b = new Beta();
        b.display();
        System.out.println("Main connection terminated");

    }
}
/*
 * if excpetion is not handled in one stack frame/ in one method
 * automatically exception object will be propogated down the hirarchy
 * 
 * 
 * 
 *  Main connection established
    Beta connection established
    Alpha connection established
    Kindly enter the numerator : 45
    kindly enter denomirator : 0
    Exception in thread "main" java.lang.ArithmeticException: / by zero
            at Alpha.calc(_4_Exception.java:13)
            at Beta.display(_4_Exception.java:23)
            at _4_Exception.main(_4_Exception.java:31)
 */

/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _4_Exception
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PURPOSE OF THE PROGRAM
-------------------------------------------------------------
/*
The program demonstrates method calling across multiple classes
(Alpha, Beta, and the main class) and shows how an exception
propagates up the call stack when it is not handled inside the
method where it occurs. It executes nested "connection" messages,
performs an arithmetic division, and terminates. If division by zero
occurs, the exception travels upward through Alpha → Beta → main.
*/


-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (DEFINED + USAGE IN THIS PROGRAM)
-------------------------------------------------------------
/*
1. Scanner  
   - Purpose: Reads user input from console.
   - Usage here: Alpha.calc() uses Scanner to read numerator and denominator.

2. Method Invocation Chain  
   - Purpose: Methods call other methods, forming a call hierarchy.
   - Usage here:  
        main() → Beta.display() → Alpha.calc()

3. Exception Propagation  
   - Purpose: When an exception occurs and is not handled where it
     originated, it automatically moves to the caller method.
   - Usage here:
        If n/d causes division by zero in Alpha.calc(),
        the ArithmeticException propagates to Beta.display(),
        then to main(), where it terminates the program.

4. ArithmeticException  
   - Trigger: Division by zero.
   - Usage here: Occurs in Alpha.calc() when user enters 0 as denominator.

5. Object Creation  
   - Purpose: To invoke instance methods.
   - Usage here:
        - Beta creates Alpha object (new Alpha()).
        - main creates Beta object (new Beta()).
*/


-------------------------------------------------------------
3. PURPOSE OF EVERY CLASS, METHOD, VARIABLE, AND STRUCTURE
-------------------------------------------------------------
/*
CLASS: Alpha  
- Contains logic for numeric input and division.

METHOD: calc()  
- Prints connection messages, accepts numerator and denominator,
  performs division, prints result, and ends connection.

VARIABLES IN calc():
  int n → user-entered numerator.
  int d → user-entered denominator.
  int res → result of division (n/d).

---------------------------------------------

CLASS: Beta  
- Provides an intermediate method that calls Alpha.calc().

METHOD: display()  
- Prints connection messages, creates Alpha object, calls calc(),
  then prints termination message.

---------------------------------------------

CLASS: _4_Exception  
- Main class responsible for starting program flow.

METHOD: main(String[] args)  
- Prints connection message, creates Beta object, calls display(),
  then prints termination message.
*/


-------------------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP-BY-STEP)
-------------------------------------------------------------
/*
1. Program starts in main().
2. Prints: "Main connection established".

3. Creates Beta object: b.
4. Calls b.display().

---------- Inside Beta.display() ----------
5. Prints: "Beta connection established".
6. Creates Alpha object: a.
7. Calls a.calc().

---------- Inside Alpha.calc() ----------
8. Prints: "Alpha connection established".
9. Prompts user for numerator → stores in n.
10. Prompts user for denominator → stores in d.
11. Evaluates n/d and stores result in res.
12. Prints: "Result is : <value>".
13. Prints: "Alpha Connection terminated".
14. Returns to Beta.display().

---------- Back to Beta.display() ----------
15. Prints: "Beta connection terminated".
16. Returns to main().

---------- Back to main() ----------
17. Prints: "Main connection terminated".
18. Program ends normally unless an exception occurred.
*/


-------------------------------------------------------------
5. EXACT RUNTIME BEHAVIOR AND OUTPUT
-------------------------------------------------------------
/*
A. NORMAL EXECUTION (valid denominator)
   Output:
     Main connection established
     Beta connection established
     Alpha connection established
     Kindly enter the numerator :
     kindly enter denomirator :
     Result is : <computed_result>
     Alpha Connection terminated
     Beta connection terminated
     Main connection terminated

B. IF DENOMINATOR = 0 (division by zero)
   - Alpha.calc() throws ArithmeticException.
   - No catch blocks exist → exception propagates upward.
   - Beta.display() receives it → no handling → propagates.
   - main() receives it → no handling → program terminates with stack trace.

   Console output:
     Main connection established
     Beta connection established
     Alpha connection established
     Kindly enter the numerator : <value>
     kindly enter denomirator : 0
     Exception in thread "main" java.lang.ArithmeticException: / by zero
         at Alpha.calc(_4_Exception.java:<line_number>)
         at Beta.display(_4_Exception.java:<line_number>)
         at _4_Exception.main(_4_Exception.java:<line_number>)
*/

-------------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------------
