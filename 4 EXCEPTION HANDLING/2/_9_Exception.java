class Gama{
    public int display(){
        try{
            System.out.println("Display method of alpha");
            return 10;
        }
        finally{
            System.out.println("Finally of gama"); // both will get executed
            return 99;
        }
    }
}
public class _9_Exception {
    public static void main(String[] args) {
        Gama g = new Gama();
        //g.display();
        System.out.println(g.display());
    }
}
//
/*
===========================================
REVISION NOTES FOR THE GIVEN PROGRAM
===========================================

-------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
-------------------------------------------------------
The program demonstrates how return statements behave inside a
try–finally structure. The display() method returns a value from the
try block, but the finally block also contains a return statement,
which overrides and replaces the return from try. The program prints
both messages and finally outputs 99.

-------------------------------------------------------
2. DEFINITIONS OF IMPORTANT CONCEPTS USED IN THIS PROGRAM
-------------------------------------------------------

• try–finally  
  A control structure where:
    - try executes normally.
    - finally executes always, even if try returns, throws, or exits.

• return in finally  
  If a finally block contains a return statement, it overrides any
  previous return from the try block.

-------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS PROGRAM
-------------------------------------------------------

• try block in display()  
  Prints a message and attempts to return 10.

• finally block in display()  
  Prints a message and returns 99, overriding the try block's return.

• return value in main()  
  main() prints the final returned value of g.display(), which is
  determined by the finally block.

-------------------------------------------------------
4. PURPOSE OF EACH VARIABLE, METHOD, BLOCK, AND STRUCTURE
-------------------------------------------------------

• Gama class  
  Contains the display() method that illustrates try–finally behavior
  with return statements.

• display() method  
  - Prints a message from try.
  - Returns 10.
  - Executes finally.
  - Prints another message.
  - Returns 99, overriding the previous return.

• main() method  
  - Creates Gama object.
  - Calls display().
  - Prints the returned value.

-------------------------------------------------------
5. COMPLETE CONTROL FLOW FROM START TO END
-------------------------------------------------------

1. Program begins in main().
2. Gama object g is created.
3. main() calls g.display().
4. Control enters display().
5. try block executes:
    - Prints “Display method of alpha”.
    - Encounters return 10 → prepares to return.
6. before returning, finally block executes:
    - Prints “Finally of gama”.
    - Executes return 99 → overrides the pending return 10.
7. display() finishes by returning 99.
8. main() receives 99 and prints it.
9. Program ends.

-------------------------------------------------------
6. EXACT RUNTIME BEHAVIOR
-------------------------------------------------------

When executed, the program prints:

    Display method of alpha
    Finally of gama
    99

-------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------
*/
