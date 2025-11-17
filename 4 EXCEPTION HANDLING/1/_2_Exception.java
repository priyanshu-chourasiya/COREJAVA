import java.util.Scanner;

public class _2_Exception {
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
        
        System.out.println("Kindly enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Kindly enter element to be inserted in an array : ");
        int ele = sc.nextInt();

        System.out.println("kindly enter position at which element to be inserted : ");
        int index = sc.nextInt();
        arr[index] = ele;
        System.out.println("Data inserted in an array is : " + arr[index]);
        }
        catch(ArithmeticException e){
            System.out.println("Please enter non zero number");
        }
        catch(NegativeArraySizeException e){
            System.out.println("please give postive array size");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
        catch(Exception e){ // this main exception should be at last else will throw error
            System.out.println("Some problem");
        }
        System.out.println("Connection terminated");
    }
}
/*
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _2_Exception
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PURPOSE OF THE PROGRAM
-------------------------------------------------------------
/*
The program establishes a simulated "connection", takes multiple
inputs from the user, performs arithmetic division, creates an
array, inserts an element at a specified index, and handles
various exceptions (errors) that may occur during these operations.
After execution—whether successful or error-prone—it prints that
the connection is terminated.
*/


-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (DEFINED + HOW THEY ARE USED HERE)
-------------------------------------------------------------
/*
1. Scanner  
   - Purpose: Reads user input from the console.
   - Usage here: Used to take numerical inputs for numerator,
     denominator, array size, element value, and index.

2. try block  
   - Purpose: Contains code that may cause exceptions.
   - Usage here: All user input operations, arithmetic division,
     array creation, and array insertion are placed inside the
     try block to monitor for runtime errors.

3. catch blocks  
   - Purpose: Handle specific exceptions if they occur.
   - Usage here:  
       - ArithmeticException: Handles division by zero.
       - NegativeArraySizeException: Handles negative array size.
       - ArrayIndexOutOfBoundsException: Handles invalid index.
       - Exception: Catches any other unhandled exception.

4. ArithmeticException  
   - Trigger: Occurs when denominator is zero.
   - Usage here: Prevents program crash and prints a custom message.

5. NegativeArraySizeException  
   - Trigger: Occurs when user gives a negative array size.
   - Usage here: Prevents creation of invalid arrays.

6. ArrayIndexOutOfBoundsException  
   - Trigger: Occurs when accessing an array at an invalid index.
   - Usage here: Prevents invalid assignment to the array.

7. Exception (General Exception)  
   - Trigger: Any unexpected runtime exception not covered above.
   - Usage here: Serves as a fallback handler.
*/


-------------------------------------------------------------
3. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
-------------------------------------------------------------
/*
CLASS: _2_Exception  
- The main class containing the program logic.

METHOD: main(String[] args)  
- Entry point of the program. Executes all operations.

STATEMENT: System.out.println("Connection established")  
- Notifies the start of operations.

VARIABLE: Scanner sc  
- Reads all user inputs.

VARIABLE: int n  
- Stores the numerator for division.

VARIABLE: int d  
- Stores the denominator for division.

VARIABLE: int res  
- Stores result of n / d.

VARIABLE: int size  
- Stores size for the integer array.

VARIABLE: int arr[]  
- Dynamically allocated integer array of user-defined size.

VARIABLE: int ele  
- Value to be inserted into the array.

VARIABLE: int index  
- Position in the array where the element will be inserted.

BLOCK: try { ... }  
- Contains operations that may cause exceptions.

BLOCKS: catch(...) { ... }  
- Handle different error conditions and print messages.

STATEMENT: System.out.println("Connection terminated")  
- Indicates completion of the program.
*/


-------------------------------------------------------------
4. CONTROL FLOW (STEP-BY-STEP EXECUTION)
-------------------------------------------------------------
/*
1. Program starts → prints "Connection established".
2. Enters try block.
3. Prompts user to enter numerator → stores in n.
4. Prompts user to enter denominator → stores in d.
5. Performs division res = n / d.
6. Prints the result.
7. Prompts user for array size → stores in size.
8. Creates int array arr of length "size".
9. Prompts user for element to insert → stores in ele.
10. Prompts user for index → stores in index.
11. Inserts element into arr[index].
12. Prints inserted data.

-- POSSIBLE INTERRUPTION POINTS --
- If denominator = 0 → jumps to ArithmeticException catch.
- If size < 0 → jumps to NegativeArraySizeException catch.
- If index is invalid → jumps to ArrayIndexOutOfBoundsException catch.
- If any other unexpected error occurs → goes to general Exception catch.

13. After completing try or catch block, program continues.
14. Prints "Connection terminated".
15. Program ends.
*/


-------------------------------------------------------------
5. EXACT RUNTIME BEHAVIOR AND OUTPUT
-------------------------------------------------------------
/*
A. NORMAL EXECUTION (no exceptions)
   - Prints:
       Connection established
       Kindly enter the numerator :
       kindly enter denomirator :
       Result is : <division_result>
       Kindly enter size of array:
       Kindly enter element to be inserted in an array :
       kindly enter position at which element to be inserted :
       Data inserted in an array is : <inserted_value>
       Connection terminated

B. IF DIVISION BY ZERO OCCURS
   - Prints:
       Connection established
       Please enter non zero number
       Connection terminated

C. IF NEGATIVE ARRAY SIZE IS GIVEN
   - Prints:
       Connection established
       please give postive array size
       Connection terminated

D. IF INVALID ARRAY INDEX IS GIVEN
   - Prints:
       Connection established
       Array out of bound
       Connection terminated

E. ANY OTHER UNEXPECTED ERROR
   - Prints:
       Connection established
       Some problem
       Connection terminated
*/

-------------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------------
*/