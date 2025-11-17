
import java.time.LocalDate;
import java.time.LocalTime;

public class _20_Date {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();    
        System.out.println(date);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getMonth());

        LocalDate dob = LocalDate.of(2004, 11, 05);
        System.out.println(dob);

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getMinute());
    }
}
/* -----------------------------------------------------------
   REVISION NOTES FOR _20_Date PROGRAM
-------------------------------------------------------------

1. PROGRAM PURPOSE
-------------------
The program demonstrates usage of the java.time API, specifically
LocalDate and LocalTime.  
It retrieves the current date and time, extracts specific date/time 
components, creates a custom date, and prints various results.

2. IMPORTANT CONCEPTS USED
---------------------------

(1) LocalDate  
    - Represents a date without time (year, month, day).  
    - Immutable and part of the modern java.time API.

(2) LocalTime  
    - Represents a time without date (hour, minute, second, nanos).  
    - Also immutable and part of java.time API.

(3) LocalDate.now() / LocalTime.now()  
    - Static methods that return the current system date and time.

(4) LocalDate.of(year, month, day)  
    - Factory method to create a specific date.

(5) Date component extractors  
    - getDayOfMonth()  
    - getDayOfYear()  
    - getMonthValue()  
    - getMonth()  
    These retrieve numerical or enum-based components of a LocalDate.

(6) LocalTime.getMinute()  
    - Extracts the minute value from a LocalTime.

3. USAGE OF CONCEPTS IN THIS SPECIFIC CODE
-------------------------------------------

• LocalDate date = LocalDate.now();  
  - Captures today’s date using the system clock.

• date.getDayOfMonth()  
  - Returns the day part (1–31).

• date.getDayOfYear()  
  - Returns how many days have passed since January 1.

• date.getMonthValue()  
  - Numeric month (1–12).

• date.getMonth()  
  - Month enum (e.g., NOVEMBER).

• LocalDate dob = LocalDate.of(2004, 11, 05);  
  - Creates a birthdate with predefined year, month, and day.

• LocalTime.now()  
  - Captures the current time at the moment of execution.

• LocalTime.now().getMinute()  
  - Extracts only the minute field of the current time.

4. PURPOSE OF VARIABLES, METHODS, STRUCTURES
---------------------------------------------

• LocalDate date  
  - Stores today’s date for extracting components.

• date.getDayOfMonth(), getDayOfYear(), getMonthValue(), getMonth()  
  - Show different ways to read date components.

• LocalDate dob  
  - Stores a hardcoded date of birth.

• LocalTime.now()  
  - Prints the current time in HH:MM:SS.nnn format.

• LocalTime.now().getMinute()  
  - Retrieves only the minute at the moment of call.

• main()  
  - Drives the creation and printing of all date/time values.

5. CONTROL-FLOW EXPLANATION
----------------------------

(1) Program begins in main().  
(2) LocalDate.now() retrieves today's date and stores it in date.  
(3) Program prints date in ISO format: YYYY-MM-DD.  
(4) Prints:  
      - day of month  
      - day of year  
      - month number  
      - month name (enum)  
(5) Creates dob = LocalDate.of(2004, 11, 05) and prints it.  
(6) Prints the current time using LocalTime.now().  
(7) Prints only the current minute using LocalTime.now().getMinute().  
(8) Program ends.

6. EXACT PROGRAM OUTPUT BEHAVIOR
---------------------------------

The exact output varies depending on the system date and time, but 
the structure is always:

    YYYY-MM-DD            ← today’s date  
    DD                    ← today’s day of month  
    DDD                   ← today’s day of year  
    M                     ← month number  
    MONTH                 ← month enum  
    2004-11-05            ← the dob created  
    HH:MM:SS.nnnnnnnnn    ← current time  
    MM                    ← current minute

Example (if today is 2025-01-20 at 17:41):

    2025-01-20  
    20  
    20  
    1  
    JANUARY  
    2004-11-05  
    17:41:12.537392100  
    41

----------------------------------------------------------- */
