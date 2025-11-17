class Library implements Runnable{

    String res1 = new String("JAVA");
    String res2 = new String("PYTHON");
    String res3 = new String("DSA");

    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("Student 1")){
            try {
                System.out.println("Student 1 got into library");
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println("Student 1 has : " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 1 has : " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student 1 has : " + res3);
                            Thread.sleep(3000);
                        } // the moment control comes out to this braces resource is released
                    }
                }
            } catch (Exception e) {
            }
        }
        else{
            try {
                System.out.println("Student 2 got into library");
                Thread.sleep(3000);
                synchronized(res1){
                    System.out.println("Student 1 has : " + res1);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 2 has : " + res2);
                        Thread.sleep(3000);
                        synchronized(res3){
                            System.out.println("Student 3 has : " + res3);
                            Thread.sleep(3000);
                        } // the moment control comes out to this braces resource is released
                    }
                }
            } catch (Exception e) {
            }
        }

    }
}
public class _10Multithreading {
    public static void main(String[] args) {
        Library l = new Library();

        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        t1.setName("Student 1");
        t2.setName("Student 2");

        t1.start();
        t2.start();
    }
}
/*
REVISION NOTES

PROGRAM SUMMARY
The program models two students attempting to access the same library resources concurrently.  
Both threads share a single Library object containing three distinct resource objects (res1, res2, res3).  
Each student thread acquires these resources in the same strict nested order, preventing deadlock and ensuring  
that access to each resource is mutually exclusive.

KEY CONCEPTS AND THEIR ROLE IN THIS PROGRAM
1. Runnable Implementation
   - Library implements Runnable to define the task run by both student threads.
   - Both threads execute identical structural logic with different printed identifiers.

2. Explicit Resource Objects (res1, res2, res3)
   - Three separate String objects act as lock monitors.
   - Each synchronized section locks one resource at a time in a nested sequence.

3. Synchronized Blocks on Specific Objects
   - synchronized(res1), synchronized(res2), synchronized(res3)
   - Control access at the level of individual resources rather than locking the whole Library instance.
   - Nested in a consistent order to guarantee exclusive access and avoid deadlock.

4. Thread.sleep
   - Introduces 3000 ms delays between resource acquisitions.
   - Forces visible staggered progression through the nested resources.

5. Thread Naming
   - Students are identified by names “Student 1” and “Student 2” to differentiate output.

STRUCTURAL COMPONENTS AND THEIR PURPOSE
Class Library
- Encapsulates resource objects and defines the thread behavior.
- Provides run() to simulate resource acquisition in nested synchronized blocks.

res1, res2, res3
- Independent lockable objects representing JAVA, PYTHON, and DSA resources.

run()
- Determines thread behavior based on thread name.
- Common pattern executed by both students:
  1. Print entry message.
  2. Sleep.
  3. Acquire resource res1.
  4. Sleep.
  5. Acquire resource res2.
  6. Sleep.
  7. Acquire resource res3.
  8. Sleep.
- Resources are released immediately when execution exits the corresponding synchronized block.

Class _10Multithreading
- Houses the setup and execution of the two student threads.

main()
- Instantiates one Library object shared by both threads.
- Creates two threads referencing the same runnable.
- Assigns names, then starts the threads.

VARIABLES
l
- Shared Library instance storing resource objects and synchronization logic.

t1, t2
- Threads representing two students competing for the same resources.

name
- Stores the current thread’s name inside run() to determine execution path.

CONTROL FLOW (EXECUTION SEQUENCE)
1. main() creates a single Library instance.
2. Two Thread objects are created using the same Library runnable.
3. Names “Student 1” and “Student 2” are assigned.
4. Both threads start execution.

For each thread:
5. Thread enters run().
6. Prints a message indicating entry into the library.
7. Sleeps 3000 ms.
8. Attempts to acquire lock on res1:
   • If available, proceeds; otherwise waits.
9. Prints message and sleeps, then attempts to acquire lock on res2.
10. Prints message and sleeps, then attempts to acquire lock on res3.
11. Prints message and sleeps.
12. Exiting each synchronized block releases each resource sequentially.

Because both students follow the same nested lock order (res1 → res2 → res3):
- Only one student holds all resources at a time.
- The second student must wait until the first releases res1, then follows the same sequence.

PROGRAM OUTPUT BEHAVIOR
- Both threads print initial entry messages concurrently.
- Beyond that point, only one student progresses into the res1 block.
- The student that acquires res1 first performs the full nested sequence without interruption:
    • has : JAVA  
    • has : PYTHON  
    • has : DSA  
- After this student exits all synchronized blocks, the second student begins its own full sequence.
- The printed identifiers inside the else block contain inconsistencies:
    • “Student 1 has : JAVA” printed by Student 2 thread  
    • “Student 3 has : DSA” printed by Student 2 thread  
  These reflect literal code behavior rather than data errors.

Final output always consists of two serialized, uninterrupted nested sequences, one per student,  
preceded by their initial concurrent “got into library” lines.

*/
