
import java.util.Scanner;

class Alpha extends Thread{
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("BANK")){
            Banking();
        }
        else if(threadName.equals("STAR")){
            try {
                stars();
            } catch (Exception ex) {
            }
        }
        else{
            try {
                Importantmessage();
            } catch (Exception ex) {
            }
        }
    }
    public void Banking(){
        System.out.println("Banking activity started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user number : ");
        int un = sc.nextInt();
        System.out.println("Enter the password");
        int pass = sc.nextInt();
        System.out.println("Collect your cash");
        System.out.println("Banking activity terminated");
    }
    public void stars() throws Exception{
        System.out.println("Prining activity started");
        for (int i = 0; i < 3; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");
    }
    public void Importantmessage() throws Exception{
        System.out.println("Prining important message started");
        for (int i = 0; i < 3; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message terminated");
    }
}
public class _6_Multithreading {
    public static void main(String[] args) {
        System.out.println("Application started");

        Alpha a = new Alpha();  // equivalent to creating new thread

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);   // we cannot control which thread will get executed
        Thread t3 = new Thread(a);

        t1.setName("BANK");
        t2.setName("STAR");
        t3.setName("FOCUS");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Application terminated");
    }
}

/*
REVISION NOTES

PROGRAM SUMMARY
The program demonstrates multithreaded execution where three threads share the same runnable object.  
Each thread’s behavior is selected at runtime based on its assigned name, invoking one of three operations:  
a simulated banking process, a motivational printing routine, or an important message print loop.

KEY CONCEPTS AND THEIR ROLE IN THIS PROGRAM
1. Thread Extension (class Alpha extends Thread)
   - Provides a run method that executes when the thread is started.
   - Used to route execution to one of three behaviors depending on the thread’s name.

2. Thread Naming (setName / getName)
   - Used to assign identifiers BANK, STAR, and FOCUS.
   - The run method branches logic based on these names.

3. Shared Runnable Target (same Alpha instance passed to three Thread objects)
   - All threads execute the run method of the same Alpha object.
   - Ensures identical code path is available to all threads, but name-based branching leads to different actions.

4. Thread.sleep
   - Pauses execution for 4000 ms inside loops of stars() and Importantmessage() to simulate timed output.

5. Scanner Input
   - Reads integers from console during the "BANK" thread’s banking operation.

STRUCTURAL COMPONENTS AND THEIR PURPOSE
Class Alpha
- Defines multithreaded task logic.
- Contains run() and three task methods: Banking(), stars(), Importantmessage().

run()
- Entry point for each thread.
- Retrieves current thread name.
- Routes execution to Banking(), stars(), or Importantmessage() based on name.
- Uses conditional branching:
  • name "BANK" → Banking()
  • name "STAR" → stars()
  • otherwise → Importantmessage()

Banking()
- Handles simulated banking workflow: prompts for user number and password, then prints completion messages.

stars()
- Prints a motivational line three times with 4-second delays.
- Represents timed “printing activity.”

Importantmessage()
- Prints "**" three times with 4-second delays.
- Simulates a different timed message routine.

Class _6_Multithreading
- Contains the main control sequence.

main()
- Prints application start message.
- Creates a single Alpha instance to serve as shared thread target.
- Creates three Thread objects t1, t2, t3 using the same Alpha object.
- Assigns names BANK, STAR, FOCUS.
- Starts all three threads.
- Prints application termination message immediately after starting them (non-blocking).

VARIABLES
Alpha a
- Shared instance whose run method will be executed by all threads.

Thread t1, t2, t3
- Separate thread objects executing the same Alpha task.
- Their names determine which method executes.

un, pass (inside Banking)
- Store user number and password input from Scanner.

i (loop variable in stars and Importantmessage)
- Controls the three-iteration print loops.

CONTROL FLOW (EXECUTION SEQUENCE)
1. Program enters main().
2. Prints “Application started”.
3. Creates Alpha instance a.
4. Creates three thread objects t1, t2, t3 targeting a.
5. Assigns names BANK, STAR, FOCUS.
6. Starts all three threads almost simultaneously.
7. Immediately prints “Application terminated” because thread execution is asynchronous.
8. Each thread independently enters run():
   • t1 ("BANK") executes Banking():
       - Prints banking start.
       - Requests user input for number and password.
       - Prints cash and termination messages.
   • t2 ("STAR") executes stars():
       - Prints start.
       - Prints “Think higher of yourself” three times with 4-second pauses.
       - Prints termination message.
   • t3 ("FOCUS") executes Importantmessage():
       - Prints start.
       - Prints "**" three times with 4-second pauses.
       - Prints termination message.
9. All threads run concurrently; ordering of their outputs interleaves unpredictably.

PROGRAM OUTPUT BEHAVIOR
- First: “Application started”.
- After thread starts: “Application terminated”.
- Thread outputs interleave:
   • BANK thread:
       Banking activity started  
       Enter user number :  
       (waits for input)  
       Enter the password  
       Collect your cash  
       Banking activity terminated  
   • STAR thread:
       Prining activity started  
       Think higher of yourself  
       (4-second pause × 3 iterations)  
       Printing activity terminated  
   • FOCUS thread:
       Prining important message started  
       **  
       (4-second pause × 3 iterations)  
       Printing important message terminated  
- Final ordering depends on scheduler timing and user input but all messages eventually appear.

*/
