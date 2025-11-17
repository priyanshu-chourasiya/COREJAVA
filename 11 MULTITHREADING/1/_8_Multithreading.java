class MyCar implements Runnable{
    
    @Override
    synchronized public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " has entered parking lot");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has entered into car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has stared to drive the car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " has came back and parked the car");
        } catch (Exception e) {
        }
    }
}
public class _8_Multithreading {
    public static void main(String[] args) {
        MyCar mc = new MyCar();

        Thread t1 = new Thread(mc);
        Thread t2 = new Thread(mc);
        Thread t3 = new Thread(mc);

        t1.setName("CHILD 1");
        t2.setName("CHILD 2");
        t3.setName("CHILD 3");

        t1.start();
        t2.start();
        t3.start();

        /*
         *  CHILD 1 has entered parking lot
            CHILD 1 has entered into car
            CHILD 1 has stared to drive the car
            CHILD 1 has came back and parked the car
            CHILD 2 has entered parking lot
            CHILD 2 has entered into car
            CHILD 2 has stared to drive the car
            CHILD 2 has came back and parked the car
            CHILD 3 has entered parking lot
            CHILD 3 has entered into car
            CHILD 3 has stared to drive the car
            CHILD 3 has came back and parked the car
         */

    }
}
/*
REVISION NOTES

PROGRAM SUMMARY
The program demonstrates synchronized multithreaded execution where three threads share the same runnable object.  
Because the run() method is synchronized, only one thread can execute the entire sequence at a time, causing each  
child’s actions to occur in complete, uninterrupted order before the next child begins.

KEY CONCEPTS AND THEIR ROLE IN THIS PROGRAM
1. Synchronized Instance Method
   - run() is declared synchronized.
   - Threads must acquire the MyCar object’s intrinsic lock before entering run().
   - Ensures exclusive execution: one thread completes the entire routine before another starts.

2. Runnable Implementation (MyCar implements Runnable)
   - Provides the task executed by each thread.
   - Allows three Thread objects to share a single synchronized run().

3. Thread.sleep
   - Introduces 4000 ms pauses between action messages.
   - Enforces time gaps inside the exclusive synchronized block.

4. Shared Runnable Target
   - One MyCar instance (mc) is passed to all threads.
   - The shared instance guarantees that synchronization applies to all threads collectively.

5. Thread Naming (setName)
   - CHILD 1, CHILD 2, CHILD 3 identifiers distinguish each thread’s activity in the output.

STRUCTURAL COMPONENTS AND THEIR PURPOSE
Class MyCar
- Defines the thread logic and synchronizes access to ensure serialized execution.

run()
- Entire method is synchronized.
- Executes four sequential stages:
  1. Enter parking lot
  2. Enter car
  3. Start driving
  4. Return and park
- Sleeps between each stage to simulate timed progression.
- Contains a try-catch to handle sleep interruptions.

Class _8_Multithreading
- Houses the main execution logic controlling thread creation and startup.

main()
- Creates a single MyCar instance.
- Constructs three Thread objects using the same runnable target.
- Assigns thread names.
- Starts all three threads, triggering serialized execution due to synchronization.

VARIABLES
mc
- Shared MyCar object whose synchronized run() governs exclusive execution.

t1, t2, t3
- Individual Thread objects running the same synchronized routine.
- Names label the output sequences.

CONTROL FLOW (EXECUTION SEQUENCE)
1. main() creates MyCar instance mc.
2. Three Thread objects t1, t2, t3 are created, each referencing mc.
3. Names are assigned.
4. All threads are started.
5. Because run() is synchronized, the first thread that reaches it acquires mc’s lock.
6. That thread prints:
   • “[name] has entered parking lot”
   • Sleeps 4 seconds
   • “[name] has entered into car”
   • Sleeps 4 seconds
   • “[name] has stared to drive the car”
   • Sleeps 4 seconds
   • “[name] has came back and parked the car”
7. Upon completion, it releases the lock.
8. One of the remaining threads acquires the lock and repeats the entire sequence.
9. The third thread runs last in the same serialized manner.
10. No interleaving occurs due to synchronization.

PROGRAM OUTPUT BEHAVIOR
- Output always appears in complete blocks for each child.
- Order of children is nondeterministic, but each child’s four lines always appear together without interruption.
- A typical run produces the sequence shown in the comment block, but the order of CHILD 1, CHILD 2, and CHILD 3 may vary across executions.

*/
