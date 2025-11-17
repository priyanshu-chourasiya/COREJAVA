
enum Week{
    // Recommended to make final and constant variables capital
    MON,TUE,WED,THURS,FRI,SAT; // all of them are constants and belong to category of Week

}
public class _1_Enum {
    public static void main(String[] args) {
        Week week = Week.MON;
        System.out.println(week);
        System.out.println(Week.THURS.ordinal()); // index

        Week[] ar = Week.values();
        for(Week or : ar){
            System.out.print(or.ordinal() + " : " + or + " ");
        }
        System.out.println();

    }
}
/*
PROGRAM SUMMARY
The program defines an enum representing days of the week, creates an instance of that enum, prints specific enum information, iterates through all enum constants, and outputs their ordinal indices and names.

IMPORTANT CONCEPTS IN THIS CODE
1. Enum Type (Week)
   - A fixed set of named constant values defined within a specific type.
   - Used in this program to represent days of the week as constant identifiers.

2. Enum Constant
   - A specific named value inside an enum type.
   - Used here to represent individual days: MON, TUE, WED, THURS, FRI, SAT.

3. ordinal()
   - A method that returns the zero-based position of an enum constant within its enum definition.
   - Used here to obtain the index of THURS and the index of each constant during iteration.

4. values()
   - A method that returns an array containing all enum constants in the order they were declared.
   - Used here to enable iteration through all days in the Week enum.

STRUCTURE AND ELEMENT PURPOSES
1. enum Week
   - Defines six constant values representing days.
   - Serves as the custom type used throughout the program.

2. public class _1_Enum
   - Container class holding the main entry point and all program logic.

3. main method
   - Executes the entire sequence: creating an enum variable, printing enum data, iterating over constants, and printing results.

4. Variable: Week week
   - Holds a reference to the MON constant.
   - Used to print a specific enum value.

5. Statement: System.out.println(week)
   - Prints the name of the selected enum constant (MON).

6. Statement: System.out.println(Week.THURS.ordinal())
   - Prints the ordinal index of the THURS constant.

7. Variable: Week[] ar
   - Stores the full array of enum constants returned by values().
   - Used to iterate through all days.

8. for(Week or : ar)
   - Iterates through each enum constant in sequential declaration order.
   - Prints each constant’s ordinal and its name.

CONTROL FLOW (START TO END)
1. Program starts at main.
2. Creates variable week assigned to MON.
3. Prints MON.
4. Evaluates Week.THURS.ordinal() and prints its index.
5. Calls Week.values(), storing all constants in ar.
6. Enters enhanced for-loop.
7. For each constant or:
   - Retrieves its ordinal.
   - Prints ordinal and name in one line without newline separation.
8. Exits loop.
9. Prints a final newline.
10. Program terminates.

EXECUTION BEHAVIOR AND OUTPUT
1. First line prints:
   MON
2. Second line prints the ordinal of THURS:
   3
3. Third line prints all constants with indices in a single line:
   0 : MON 1 : TUE 2 : WED 3 : THURS 4 : FRI 5 : SAT
*/
