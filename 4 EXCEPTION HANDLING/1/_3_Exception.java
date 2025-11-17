import java.util.Scanner;

public class _3_Exception {
    public static void main(String[] args) {
        System.out.println("Connection established");

        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Kindly enter the numerator : ");
        int n = sc.nextInt();

        System.out.print("kindly enter denomirator : ");
        int d = sc.nextInt();

        int res = n/d;
        System.out.println("Result is : " +res);       
        }
        catch(ArithmeticException e){
            System.out.println("Please enter non zero number");
        }
        try{
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
/* -----------------------------------------------------------
   REVISION NOTES FOR PROGRAM: _3_Exception
   -----------------------------------------------------------

-------------------------------------------------------------
1. OVERALL PURPOSE OF THE PROGRAM
-------------------------------------------------------------
/*
The program simulates establishing a connection, then performs two
independent operations separated into two try–catch blocks:
(1) arithmetic division, and (2) array creation and element insertion.
Each block handles its own exceptions. The program always ends by
printing "Connection terminated," regardless of errors.
*/


-------------------------------------------------------------
2. IMPORTANT CONCEPTS USED (DEFINED + USAGE IN THIS PROGRAM)
-------------------------------------------------------------
/*
1. Scanner  
   - Purpose: Read user input from the console.
   - Usage here: Reads values for numerator, denominator, array size,
     element value, and index.

2. try block  
   - Purpose: Section of code that may throw exceptions.
   - Usage here: Two separate try blocks isolate two kinds of operations:
       • First try block: arithmetic division.
       • Second try block: array creation and insertion.

3. catch block  
   - Purpose: Handle exceptions thrown in the corresponding try block.
   - Usage here:
       • ArithmeticException: Handles division by zero in first block.
       • NegativeArraySizeException: Handles negative array size.
       • ArrayIndexOutOfBoundsException: Handles invalid array index.
       • Exception: Acts as a final handler for unexpected errors.

4. ArithmeticException  
   - Trigger: Dividing by zero.
   - Usage here: If denominator is zero, error is caught and a message
     is printed.

5. NegativeArraySizeException  
   - Trigger: Using a negative number to create an array.
   - Usage here: Prevents invalid array allocation.

6. ArrayIndexOutOfBoundsException  
   - Trigger: Inserting into or accessing an invalid index.
   - Usage here: Prevents insertion outside array bounds.

7. Exception (General Exception)  
   - Trigger: Any other exception not covered by earlier catches.
   - Usage here: Catches unexpected errors in the second try block.
*/


-------------------------------------------------------------
3. PURPOSE OF EVERY VARIABLE, METHOD, BLOCK, AND STRUCTURE
-------------------------------------------------------------
/*
CLASS: _3_Exception  
- Contains the complete program logic.

METHOD: main(String[] args)  
- Program entry point.

STATEMENT: System.out.println("Connection established")  
- Indicates program start.

OBJECT: Scanner sc  
- Allows reading numerical user inputs.

FIRST TRY–CATCH BLOCK  
  VARIABLES:
    int n → Numerator for division.
    int d → Denominator for division.
    int res → Result of division (n/d).
  PURPOSE:
    Collects division inputs, performs arithmetic division,
    prints result, and handles division-by-zero errors.

SECOND TRY–CATCH BLOCK  
  VARIABLES:
    int size → Determines length of array.
    int arr[] → Integer array of length `size`.
    int ele → Element to be stored in the array.
    int index → Position in the array where element is stored.
  PURPOSE:
    Accepts array size, creates array, inserts an element, prints
    inserted value, and handles:
       • negative array size,
       • invalid index access,
       • any other unexpected error.

FINAL STATEMENT: System.out.println("Connection terminated")
- Printed after both try–catch sections finish.
*/


-------------------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP-BY-STEP)
-------------------------------------------------------------
/*
1. Program starts → prints "Connection established".
2. Scanner object is created.

---------- FIRST TRY–CATCH BLOCK ----------
3. Prompts user for numerator → reads into n.
4. Prompts user for denominator → reads into d.
5. Performs res = n / d.
6. Prints: "Result is : <value>".
7. If denominator is zero → jumps to ArithmeticException catch block
   → prints "Please enter non zero number".

---------- SECOND TRY–CATCH BLOCK ----------
8. Prompts user for array size → reads into size.
9. Creates array of given size.
10. Prompts user for element value → reads into ele.
11. Prompts user for index → reads into index.
12. Stores element: arr[index] = ele.
13. Prints inserted value.
14. If size < 0 → NegativeArraySizeException catch.
15. If index invalid → ArrayIndexOutOfBoundsException catch.
16. If any other unexpected error → general Exception catch.

---------- END ----------
17. Program prints: "Connection terminated".
18. Program ends.
*/


-------------------------------------------------------------
5. EXACT RUNTIME BEHAVIOR AND OUTPUT
-------------------------------------------------------------
/*
A. NORMAL EXECUTION  
   Output sequence:
     Connection established
     Kindly enter the numerator :
     kindly enter denomirator :
     Result is : <n/d result>
     Kindly enter size of array:
     Kindly enter element to be inserted in an array :
     kindly enter position at which element to be inserted :
     Data inserted in an array is : <element>
     Connection terminated

B. IF USER ENTERS ZERO AS DENOMINATOR  
   - Only the first block is affected.
   - Output:
       Connection established
       Please enter non zero number
       (Then continues with second try block normally)
       Connection terminated

C. IF NEGATIVE ARRAY SIZE IS GIVEN  
   Output:
       Connection established
       Kindly enter the numerator :
       kindly enter denomirator :
       Result is : <result>
       Kindly enter size of array:
       please give postive array size
       Connection terminated

D. IF INVALID ARRAY INDEX IS GIVEN  
   Output:
       Connection established
       <division part output or error>
       Kindly enter size of array:
       Array out of bound
       Connection terminated

E. ANY OTHER UNEXPECTED ERROR IN SECOND BLOCK  
   Output:
       Some problem
       Connection terminated
*/

-------------------------------------------------------------
END OF REVISION NOTES
-------------------------------------------------------------

