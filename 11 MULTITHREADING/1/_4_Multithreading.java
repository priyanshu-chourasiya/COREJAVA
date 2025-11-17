
import java.util.Scanner;

class Alpha extends Thread{
    @Override
    public void run(){
        Banking();
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
}
class Beta extends Thread{
    @Override
    public void run(){
        try {
            stars();
        } catch (Exception ex) {
        }
    }
    public void stars() throws Exception{
        System.out.println("Prining activity started");
        for (int i = 0; i < 3; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");
    }
}
class Gama extends Thread{
    @Override
    public void run(){
        try {
            Importantmessage();
        } catch (Exception ex) {
        }
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
public class _4_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");

        Alpha a = new Alpha();  // equivalent to creating new thread
        Beta b = new Beta();
        Gama g = new Gama();

        // a.Banking();
        // b.stars();      there activites are already present in run methods
        // g.Importantmessage();

        // a.run();
        // b.run();
        // g.run();

        a.start();
        b.start();
        // g.start();
        a.join();
        b.join();
        g.join(); // main thread have to wait until this thread is done and join main thread

        g.start();
        System.out.println("Application terminated");
    }
}
/*
 * creating object of child class == creating object of parent class
 * 
 * when we have to use Thread then we have to create object of thread class
 * 
 * whenever we call thread do we have to call run method explicitly ? no
 * we just have to give life to thread by giving start method
 * thread will start to execute without wasting CPU's time lifecycle
 * 
 * 
 */

 /*
PROGRAM SUMMARY
The program defines three thread subclasses (Alpha, Beta, Gama), each overriding run() to execute its respective activity. In main, separate thread objects are created and started. Alpha and Beta are started first, and main waits for them using join(). Gama is joined before being started, causing main to block until Gama has finished executing—even though it has not yet started—then Gama is started afterward. The overall program demonstrates thread creation, concurrent execution, and join-based thread coordination.

IMPORTANT CONCEPTS IN THIS CODE
1. Thread Subclassing (extends Thread)
   - A technique for creating independent execution paths.
   - Used here so Alpha, Beta, and Gama each define their own run() logic.

2. run() Method Override
   - Defines the code executed by a thread once start() is invoked.
   - Each class routes run() into its respective activity method.

3. start() Method
   - Initiates a new thread of execution and schedules run().
   - Used to begin Alpha, Beta, and Gama execution independently of main.

4. join()
   - Causes the calling thread (main) to wait until the target thread completes.
   - In this program, join() is called on Alpha, Beta, and then Gama before Gama has been started.

5. Thread.sleep(...)
   - Pauses the executing thread inside loops of Beta and Gama.

STRUCTURE AND ELEMENT PURPOSES
1. class Alpha extends Thread
   - Represents the banking thread.

2. run() in Alpha
   - Calls Banking(), defining Alpha’s thread behavior.

3. Banking()
   - Handles user input and prints banking-related messages.

4. class Beta extends Thread
   - Represents the motivational message printing thread.

5. run() in Beta
   - Calls stars(), catching any thrown exception.

6. stars()
   - Loops three times printing a message with 4-second delays.

7. class Gama extends Thread
   - Represents the important-message printing thread.

8. run() in Gama
   - Calls Importantmessage(), catching any exception.

9. Importantmessage()
   - Prints “**” three times with 4-second delays.

10. public class _4_Multithreading
    - Contains main and manages thread creation and coordination.

11. main method
    - Creates Alpha, Beta, and Gama thread objects.
    - Starts Alpha and Beta.
    - Calls join() on Alpha, Beta, and Gama.
    - Starts Gama after the join calls.
    - Prints termination message.

12. a.start(), b.start()
    - Launch Alpha and Beta threads concurrently.

13. g.start()
    - Starts Gama only after join calls return.

14. a.join(), b.join(), g.join()
    - Main waits for Alpha and Beta.
    - Main also waits for Gama before Gama is started, causing immediate return from join() once Gama completes.

CONTROL FLOW (START TO END)
1. main prints “Application started”.
2. Instantiates Alpha, Beta, and Gama thread objects.
3. Calls a.start():
   - Alpha begins executing run() on a separate thread.
   - Banking() begins and reads user input.
4. Calls b.start():
   - Beta begins executing run() on a separate thread.
   - stars() prints messages with delays.

5. main calls a.join():
   - main blocks until Alpha completes its Banking() sequence.

6. main calls b.join():
   - main blocks until Beta completes its timed loop.

7. main calls g.join():
   - Gama has not been started yet, so join() returns immediately once Gama has nothing to wait for.

8. main calls g.start():
   - Gama runs Importantmessage() on its own thread with timed delays.

9. After g finishes, main prints “Application terminated”.

10. Program ends.

EXECUTION BEHAVIOR AND OUTPUT
1. Prints “Application started”.
2. Alpha and Beta run concurrently:
   - Alpha prompts for user number and password, prints banking messages.
   - Beta prints its motivational message three times with 4-second intervals.
3. main waits for both to finish.
4. main waits on Gama before it starts; this join returns without delay.
5. main starts Gama.
6. Gama prints “**” three times with 4-second intervals.
7. main prints “Application terminated”.
*/
