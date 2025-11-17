class Alien{
    public void alpha(){
        beta();
    }
    public void beta(){
        alpha();
    }
}
public class _10_Exception {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.beta();
    }
}
/*
===========================================
REVISION NOTES FOR THE GIVEN PROGRAM
===========================================

-------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------
The program creates an Alien object and calls its beta() method.
beta() calls alpha(), and alpha() again calls beta().  
This creates an infinite cycle of method calls, which eventually fills
the call stack and causes a StackOverflowError.

-------------------------------------------------------
2. DEFINITIONS OF IMPORTANT CONCEPTS USED IN THIS PROGRAM
-------------------------------------------------------

• Infinite Recursion  
  A situation where methods keep calling each other (or themselves)
  without any stopping condition.

• StackOverflowError  
  An error thrown when the call stack runs out of memory due to
  uncontrolled or infinite recursive calls.

-------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------

• alpha() method  
  Calls beta() without any exit condition.

• beta() method  
  Calls alpha() without any exit condition.

• Infinite recursion  
  Occurs because alpha() → beta() → alpha() → beta() ... continues
  endlessly.

• StackOverflowError  
  Will inevitably occur once the stack memory is exhausted.

-------------------------------------------------------
4. PURPOSE OF EACH METHOD, BLOCK, AND STRUCTURE
-------------------------------------------------------

• Alien class  
  Defines alpha() and beta(), which repeatedly call each other.

• alpha() method  
  Calls beta(), initiating or continuing the recursive cycle.

• beta() method  
  Calls alpha(), keeping the recursive cycle running.

• main() method  
  - Creates an Alien object.
  - Calls a.beta(), starting the recursion chain.

-------------------------------------------------------
5. COMPLETE CONTROL FLOW FROM START TO END
-------------------------------------------------------

1. Program begins in main().
2. Alien object a is created.
3. main() calls a.beta().
4. Inside beta():
      → Calls alpha().
5. Inside alpha():
      → Calls beta().
6. Control jumps back and forth:
      beta() → alpha() → beta() → alpha() → …
7. The recursive calls continue indefinitely.
8. No method ever returns because no termination condition exists.
9. The call stack keeps growing until memory is exhausted.
10. The JVM throws StackOverflowError.
11. Program terminates abnormally.

-------------------------------------------------------
6. EXACT RUNTIME BEHAVIOR
-------------------------------------------------------

The program will output **nothing**, because no print statements exist.

After many recursive calls, it terminates with:

    Exception in thread "main" java.lang.StackOverflowError

-------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------
*/
