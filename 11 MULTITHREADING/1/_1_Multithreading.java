
public class _1_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");
        // Thread.sleep(5000);
        Thread thread =  Thread.currentThread();
        System.out.println(thread.getName());  // default name
        System.out.println(thread.getPriority()); // default priority
        thread.setName("Priyanshu");
        thread.setPriority(4);
        System.out.println(thread.getName());  
        System.out.println(thread.getPriority());
        System.out.println("Application terminated");
    }
}
// we can change name and priority of main thread
/*
PROGRAM SUMMARY
The program inspects and modifies properties of the main application thread. It retrieves the current thread, prints its default name and priority, changes those values, prints the updated values, and completes execution.

IMPORTANT CONCEPTS IN THIS CODE
1. Current Thread (Thread.currentThread())
   - The thread executing the code at the moment the call is made.
   - In this program, it refers to the main thread of the application.

2. Thread Name
   - A descriptive identifier assigned to a thread.
   - Used here to display the main thread’s default name and then assign a custom name.

3. Thread Priority
   - A numeric value representing the scheduling priority of a thread.
   - Used here first to display the default value and then set a new one.

STRUCTURE AND ELEMENT PURPOSES
1. public class _1_Multithreading
   - Contains the main execution workflow demonstrating thread inspection and modification.

2. main method
   - Entry point of the program.
   - Performs all thread operations and outputs.

3. System.out.println("Application started")
   - Marks the beginning of program execution.

4. Thread thread = Thread.currentThread()
   - Obtains a reference to the main thread and stores it in thread.

5. thread.getName()
   - Retrieves and prints the main thread’s default name.

6. thread.getPriority()
   - Retrieves and prints the main thread’s default priority.

7. thread.setName("Priyanshu")
   - Assigns a new name to the main thread.

8. thread.setPriority(4)
   - Sets the main thread’s priority to 4.

9. Updated getName() and getPriority()
   - Prints the modified thread name and priority.

10. System.out.println("Application terminated")
   - Marks the completion of program execution.

CONTROL FLOW (START TO END)
1. Program begins at main.
2. Prints “Application started”.
3. Retrieves the main thread reference and assigns it to thread.
4. Prints the default thread name.
5. Prints the default thread priority.
6. Sets the thread’s name to “Priyanshu”.
7. Sets the thread’s priority to 4.
8. Prints the updated name.
9. Prints the updated priority.
10. Prints “Application terminated”.
11. Program ends.

EXECUTION BEHAVIOR AND OUTPUT
Application started
main
5
Priyanshu
4
Application terminated
*/
