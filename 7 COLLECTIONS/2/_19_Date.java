
import java.sql.Date;



public class _19_Date {
    public static void main(String[] args) {
        // Date - util , sql 
        // Date d = new Date(); // date class of util package will return both date and time
        // System.out.println(d);

        // int year = d.getYear();
        // System.out.println(year);

        Date d = new Date(1234565446);
        System.out.println(d); // return only date
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR _19_Date PROGRAM
-------------------------------------------------------------

1. PROGRAM PURPOSE
-------------------
The program demonstrates the use of java.sql.Date and shows that 
java.sql.Date prints only the date portion (year–month–day) even 
when initialized with a millisecond value.

2. IMPORTANT CONCEPTS USED
---------------------------

(1) java.sql.Date  
    - A date-only class used primarily for JDBC and SQL operations.  
    - Stores time internally as milliseconds from Unix epoch but 
      outputs only the date part when printed.

(2) Constructor: new Date(long milliseconds)  
    - Creates a java.sql.Date object using milliseconds since 
      January 1, 1970 (Unix epoch).  
    - Used here to create a date from a given long value.

3. USAGE OF CONCEPTS IN THIS SPECIFIC CODE
-------------------------------------------

• java.sql.Date  
  - Imported and used to create an object (d) with a long timestamp.  
  - When printed, hides the time portion by design.

• new Date(1234565446)  
  - Creates a date corresponding to 1,234,565,446 milliseconds.  
  - This value is converted into a calendar date internally.

• System.out.println(d)  
  - Displays the date in yyyy-MM-dd format because java.sql.Date 
    overrides toString() to output ONLY the date part.

4. PURPOSE OF VARIABLES, METHODS, AND STRUCTURES
-------------------------------------------------

• Date d  
  - Stores a java.sql.Date object constructed from the given 
    millisecond timestamp.

• main()  
  - Entry point of the program; creates and prints the Date object.

• Commented lines  
  - Explain the difference between java.util.Date and java.sql.Date.  
  - Show that util.Date prints date + time while sql.Date prints only date.

5. CONTROL-FLOW EXPLANATION
----------------------------

(1) Program execution begins in main().  
(2) A java.sql.Date object (d) is created using the millisecond 
    value 1234565446.  
(3) System.out.println(d) prints the date-only representation of d.  
(4) Program ends.

6. EXACT PROGRAM OUTPUT BEHAVIOR
---------------------------------

Output will be a date corresponding to the millisecond value 
1234565446, formatted as:

    1970-01-15

(Note: This is because 1234565446 ms ≈ 14.28 days after 1 Jan 1970.)

----------------------------------------------------------- */
