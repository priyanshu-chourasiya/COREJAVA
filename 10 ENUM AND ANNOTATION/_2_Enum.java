

enum Results{
    PASS,FAIL;
    //pulic static final Result PASS = new Result();    behind the scenes
    //pulic static final Result FAIL = new Result();

    // enum Week{
    //     MON,TUE;
    // }   we can define enum inside an enum

    int marks;

    Results() {
        System.out.println("Constructor of Enum");
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }

    
}
public class _2_Enum {
    public static void main(String[] args) {
        Results res = Results.PASS;
        res.setMarks(44);
        System.out.println(res.getMarks());

        System.out.println("---------------------------");

        Results.PASS.setMarks(99);
        int marks = Results.PASS.getMarks();
        System.out.println(marks);

        System.out.println("---------------------------");

        int marks2 = Results.FAIL.getMarks();
        System.out.println(marks2);
    }
}
/*
PROGRAM SUMMARY
The program defines an enum with two constants, each capable of storing and modifying an associated marks value. The program demonstrates instance-level fields inside enum constants, constructor execution, and shared state behavior across repeated access to the same enum constant.

IMPORTANT CONCEPTS IN THIS CODE
1. Enum Type (Results)
   - A type containing a fixed set of named constant instances (PASS, FAIL).
   - Each instance can store its own marks value and execute instance methods.

2. Enum Constant
   - A unique object representing a predefined value within the enum.
   - PASS and FAIL each hold their own marks field and invoke the enum constructor upon first access.

3. Enum Constructor
   - A constructor executed once per enum constant during class initialization.
   - Prints a message as each constant is created.

4. Instance Field Inside Enum (marks)
   - A value stored separately for each enum constant object.
   - Used to hold a numeric marks value assignable through methods.

5. Instance Methods Inside Enum (setMarks, getMarks)
   - Methods that operate on the marks field.
   - Used to assign and retrieve the marks stored in each specific enum constant.

STRUCTURE AND ELEMENT PURPOSES
1. enum Results
   - Defines PASS and FAIL along with storage and behavior (marks, constructor, methods).

2. int marks
   - Holds the marks value associated with a specific Results constant.

3. Results() constructor
   - Executes once for PASS and once for FAIL during enum initialization.
   - Prints “Constructor of Enum” each time it runs.

4. setMarks(int marks)
   - Assigns a marks value to the enum constant on which it is called.

5. getMarks()
   - Returns the stored marks value of the enum constant on which it is called.

6. public class _2_Enum
   - Contains the main method where all enum interactions occur.

7. Variable: Results res
   - Stores a reference to the PASS constant.
   - Used to invoke methods affecting PASS.

8. Variable: int marks
   - Temporarily holds the retrieved marks of PASS after modification.

9. Variable: int marks2
   - Holds the retrieved marks of FAIL, which remains uninitialized and defaults to zero.

CONTROL FLOW (START TO END)
1. Program begins at main.
2. First reference to Results.PASS triggers enum initialization:
   - PASS constructor runs, printing “Constructor of Enum”.
   - FAIL constructor runs, printing “Constructor of Enum”.
3. res is assigned PASS.
4. res.setMarks(44) stores 44 in PASS.marks.
5. res.getMarks() retrieves 44 and prints it.
6. Separator line printed.
7. Results.PASS.setMarks(99) overwrites PASS.marks with 99.
8. marks = Results.PASS.getMarks() stores 99 and prints it.
9. Separator line printed.
10. marks2 = Results.FAIL.getMarks() retrieves FAIL.marks (default 0) and prints 0.
11. Program ends.

EXECUTION BEHAVIOR AND OUTPUT
Constructor of Enum
Constructor of Enum
44
---------------------------
99
---------------------------
0
*/
