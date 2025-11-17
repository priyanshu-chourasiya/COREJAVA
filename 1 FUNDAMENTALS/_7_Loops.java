public class _7_Loops {
    public static void main(String[] args) {
        for(int i = 0;i < 6;i++){
            System.out.println(i + " : *");
        }
        System.out.println("====================");
        int i = 0;
        while(i <= 4){
            System.out.println(i + " : *");
            i++;
        }
        System.out.println("====================");
        int j = 0;
        do{
            System.out.println(j + " : *");
            j++;
        }while(j <= 6);
    }
}
/*
==============================================================
REVISION NOTES FOR THE GIVEN CODE
==============================================================

--------------------------------------------------------------
1. WHAT THE ENTIRE PROGRAM DOES
--------------------------------------------------------------
- This program demonstrates three different loop structures in Java:
  1. A **for loop**
  2. A **while loop**
  3. A **do-while loop**
- Each loop prints numbers followed by " : *", showing how repeated execution works.
- Between each loop's output, a separator line `"===================="` is printed.

--------------------------------------------------------------
2. IMPORTANT CONCEPTS APPEARING IN THE CODE
(Only concepts directly used in the program)
--------------------------------------------------------------
- **for loop**: A loop with initialization, condition, and increment all in one structure.
- **while loop**: A loop that repeats as long as its condition is true (condition checked before each iteration).
- **do-while loop**: A loop that executes at least once because the condition is checked after the loop body.
- **Loop counters (i, j)**: Integer variables used to control how many times loops run.
- **Increment operator (i++ / j++)**: Increases a variable by 1 during loop progression.
- **Relational operators (<, <=)**: Used to control loop termination conditions.
- **System.out.println()**: Prints formatted output inside each loop.

--------------------------------------------------------------
3. USAGE OF EACH CONCEPT IN THIS CODE
--------------------------------------------------------------
- **for(int i = 0; i < 6; i++)**  
  - Initializes `i` to 0  
  - Runs while `i < 6`  
  - Increments `i` after each iteration  
  - Prints `"i : *"` from 0 to 5

- **while(i <= 4)**  
  - Starts with `i = 0`  
  - Repeats as long as `i <= 4`  
  - Prints `"i : *"` from 0 to 4  
  - Uses `i++` to advance the loop

- **do { ... } while(j <= 6);**  
  - Starts with `j = 0`  
  - Executes the body first, then checks the condition  
  - Prints `"j : *"` from 0 to 6  
  - Ensures at least one print even if the condition becomes false later

- **Separator prints**  
  `"===================="` is printed between loop sections for clarity.

--------------------------------------------------------------
4. PURPOSE OF EVERY VARIABLE, METHOD, AND STRUCTURE
--------------------------------------------------------------
- **Variable `i` (inside for loop)**: Controls the number of for-loop iterations.
- **Variable `i` (while loop)**: Separate counter reused for the while-loop demonstration.
- **Variable `j`**: Counter used for the do-while loop.
- **For loop block**: Demonstrates iteration with combined structure.
- **While loop block**: Demonstrates condition-checked-before loop.
- **Do-while loop block**: Demonstrates at-least-one-execution behavior.
- **Print statements**: Show numeric progression and loop output clearly.
- **Separators**: Visually divide the outputs of the three looping mechanisms.

--------------------------------------------------------------
5. FULL CONTROL-FLOW EXPLANATION FROM START TO END
--------------------------------------------------------------
1. Program starts in `main`.
2. **FOR LOOP begins**:
   - `i = 0` → print `"0 : *"`
   - `i = 1` → print `"1 : *"`
   - `i = 2` → print `"2 : *"`
   - `i = 3` → print `"3 : *"`
   - `i = 4` → print `"4 : *"`
   - `i = 5` → print `"5 : *"`
   - Loop stops when `i` becomes 6.
3. Prints: `"===================="`
4. **WHILE LOOP begins**:
   - `i = 0` → print `"0 : *"`
   - `i = 1` → print `"1 : *"`
   - `i = 2` → print `"2 : *"`
   - `i = 3` → print `"3 : *"`
   - `i = 4` → print `"4 : *"`
   - Loop stops when `i` becomes 5.
5. Prints: `"===================="`
6. **DO-WHILE LOOP begins**:
   - `j = 0` → print `"0 : *"`
   - `j = 1` → print `"1 : *"`
   - `j = 2` → print `"2 : *"`
   - `j = 3` → print `"3 : *"`
   - `j = 4` → print `"4 : *"`
   - `j = 5` → print `"5 : *"`
   - `j = 6` → print `"6 : *"`
   - Loop stops when `j` becomes 7 (condition becomes false).
7. Program ends.

--------------------------------------------------------------
6. EXACT OUTPUT WHEN EXECUTED
--------------------------------------------------------------
0 : *  
1 : *  
2 : *  
3 : *  
4 : *  
5 : *  
====================  
0 : *  
1 : *  
2 : *  
3 : *  
4 : *  
====================  
0 : *  
1 : *  
2 : *  
3 : *  
4 : *  
5 : *  
6 : *  

--------------------------------------------------------------
7. NO SUGGESTIONS OR REWRITES — ONLY FACTUAL NOTES
--------------------------------------------------------------

--------------------------------------------------------------
8. CLEAN COPY-PASTE-READY COMMENTED FORMAT (THIS ENTIRE BLOCK)
--------------------------------------------------------------
*/
