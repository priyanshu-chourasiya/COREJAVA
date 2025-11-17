
import java.util.Scanner;

class Alpha implements Runnable{
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
class Beta implements Runnable{
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
class Gama implements Runnable{
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
public class _5_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");

        Alpha a = new Alpha();  // equivalent to creating new thread
        Beta b = new Beta();
        Gama g = new Gama();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(g);

        System.out.println(t1.isAlive()); // false
        System.out.println(t2.isAlive()); // false
        System.out.println(t3.isAlive()); // false

        t1.start();
        t2.start();
        t3.start();

        System.out.println(t1.isAlive()); // true
        System.out.println(t2.isAlive()); // true
        System.out.println(t3.isAlive()); // true

        System.out.println("Application terminated");
    }
}
// main thread always finishes first
/*
PROGRAM SUMMARY
This program demonstrates multithreading using the Runnable interface rather than subclassing Thread. Three independent tasks—banking, printing text, and printing symbols—are implemented in Alpha, Beta, and Gama. Each is wrapped inside a Thread object and executed concurrently.

CONCEPTS DEMONSTRATED
1. Runnable Interface
   - Provides a clean separation between task logic and thread control.
   - run() defines the activity executed when the thread starts.

2. Thread Wrapping
   - new Thread(runnable) binds a Runnable task to a Thread instance.
   - start() initiates a new call stack executing run() asynchronously.

3. isAlive() Method
   - Queries whether a thread has started and is still running.
   - Prints false before start() and true after start().

4. Thread Scheduling
   - main does not wait for any thread to finish.
   - All three worker threads run independently while main exits immediately afterward.

STRUCTURE AND ROLE OF EACH COMPONENT
1. class Alpha implements Runnable
   - Banking-related task.
   - run() delegates to Banking().
   - Banking() performs blocking input and prints status.

2. class Beta implements Runnable
   - Timed message-printing task.
   - stars() loops three times with 4-second delays.

3. class Gama implements Runnable
   - Timed symbol-printing task.
   - Importantmessage() loops three times with 4-second delays.

4. Thread t1 = new Thread(a)
   - Connects Alpha’s logic to an actual Thread object.

5. isAlive() checks
   - Before start(): all false because no thread has begun execution.
   - After start(): all true while threads continue to run.

6. main flow
   - Prints start message.
   - Instantiates Runnable tasks.
   - Wraps each in Thread objects.
   - Prints their alive status before starting.
   - Starts all three.
   - Prints alive status again while they run.
   - Prints termination notice and exits without synchronization.

CONTROL FLOW
1. main prints “Application started”.
2. Creates Alpha, Beta, Gama objects.
3. Wraps each Runnable in a corresponding Thread.
4. Prints alive-state checks (false).
5. Calls start() on all three threads.
6. Threads execute Banking(), stars(), and Importantmessage() concurrently.
7. Prints alive-state checks (likely true at that moment).
8. Prints “Application terminated”.
9. main thread ends while worker threads continue running in parallel.

EFFECT OF NO join()
main terminates before Alpha, Beta, and Gama finish. Worker threads keep running until their loops and input operations complete.

NOTES
Each task executes concurrently; no sequencing or waits imposed by main.
*/
