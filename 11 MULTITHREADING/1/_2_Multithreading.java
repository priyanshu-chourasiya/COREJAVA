import java.util.Scanner;

public class _2_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");
        System.out.println("Banking activity started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user number : ");
        int un = sc.nextInt();
        System.out.println("Enter the password");
        int pass = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking activity terminated");

        System.out.println("Prining activity started");
        for (int i = 0; i < 10; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");

        System.out.println("Prining important message started");
        for (int i = 0; i < 10; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message terminated");

        System.out.println("Application terminated");
    }
}
// cpu time cycle is getting wasted 
// line by line execution
// only single thread

/*
PROGRAM SUMMARY
The program performs three sequential activities—banking input, a printing loop, and another printing loop—executed on a single thread. The execution is strictly linear, and repeated Thread.sleep calls introduce intentional delays, demonstrating blocking behavior in a single-threaded workflow.

IMPORTANT CONCEPTS IN THIS CODE
1. Scanner (java.util.Scanner)
   - Input-reading utility used for console-based user input.
   - Here it captures user number and password during the banking section.

2. Thread.sleep(...)
   - Causes the current thread to pause for a specified duration.
   - Used repeatedly to delay output within both printing loops, illustrating time-blocking in a single-threaded program.

3. Single-Threaded Execution
   - All instructions run on the main thread in strict sequential order.
   - Each sleep call halts the entire program’s progress until completion.

STRUCTURE AND ELEMENT PURPOSES
1. public class _2_Multithreading
   - Holds the main method controlling all sequential activities.

2. main method
   - Orchestrates the banking activity, two printing loops, and all associated delays.
   - Contains all program logic without spawning additional threads.

3. System.out.println("Application started")
   - Marks program beginning.

4. System.out.println("Banking activity started")
   - Indicates entry into the banking section.

5. Scanner sc = new Scanner(System.in)
   - Creates a scanner to capture console input.

6. Prompt and read user number (int un = sc.nextInt())
   - Accepts the user identifier entered at the console.

7. Prompt and read password (int pass = sc.nextInt())
   - Accepts the password entered at the console.

8. System.out.println("Collect your cash")
   - Simulates the bank dispensing cash.

9. System.out.println("Banking activity terminated")
   - Ends the banking section.

10. System.out.println("Prining activity started")
    - Begins the first printing loop.

11. for (int i = 0; i < 10; i++)
    - Loops ten times printing a motivational message.

12. System.out.println("Think higher of yourself")
    - Output inside the loop for each iteration.

13. Thread.sleep(4000)
    - Introduces a 4-second pause per iteration, blocking all further execution.

14. System.out.println("Printing activity terminated")
    - Marks end of the first printing loop.

15. System.out.println("Prining important message started")
    - Starts the second printing loop.

16. for (int i = 0; i < 10; i++)
    - Loops ten times printing a simple marker (“**”).

17. System.out.println("**")
    - Output inside the loop for each iteration.

18. Thread.sleep(4000)
    - Another 4-second delay per iteration.

19. System.out.println("Printing important message terminated")
    - Marks the end of the second loop.

20. System.out.println("Application terminated")
    - Signals overall program completion.

CONTROL FLOW (START TO END)
1. Program begins and prints initial startup messages.
2. Banking section runs:
   - Scanner prompts for user number, reads it.
   - Scanner prompts for password, reads it.
   - Prints completion messages.
3. First printing loop begins:
   - Ten iterations of a message.
   - Each iteration pauses 4 seconds.
4. First loop ends.
5. Second printing loop begins:
   - Ten iterations of “**”.
   - Each iteration pauses 4 seconds.
6. Second loop ends.
7. Program prints termination message and concludes.

EXECUTION BEHAVIOR AND OUTPUT
1. Prints startup and banking prompts.
2. Waits for user input twice.
3. Prints completion of banking.
4. Prints “Think higher of yourself” ten times, with a 4-second delay between each line.
5. Prints completion message.
6. Prints “**” ten times, each with a 4-second delay.
7. Prints completion message.
8. Prints final termination message.
*/
