class MyCar implements Runnable{
    
    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " has entered parking lot");
            Thread.sleep(4000);
            synchronized(this){
                System.out.println(Thread.currentThread().getName() + " has entered into car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has stared to drive the car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " has came back and parked the car");
            }
        } catch (Exception e) {
        }
    }
}
public class _9_Multithreading {
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

    }
}
/*
REVISION NOTES

PROGRAM SUMMARY
The program demonstrates partially synchronized multithreading using three threads that share the same runnable object.  
Each thread begins by executing an unsynchronized action, then enters a synchronized block that enforces exclusive  
access for the remaining sequence of car-related actions.

KEY CONCEPTS AND THEIR ROLE IN THIS PROGRAM
1. Runnable Implementation
   - MyCar implements Runnable to define a task to be executed by multiple threads.
   - All threads run the same run() method on the same object.

2. Synchronized Block (synchronized(this))
   - Applies mutual exclusion only to the enclosed section.
   - Ensures that only one thread at a time executes the “enter into car → drive → return and park” segment.

3. Thread.sleep
   - Inserts 4000 ms pauses between messages.
   - Affects timing both outside and inside the synchronized block.

4. Shared Runnable Target
   - All Thread objects reference the same MyCar instance.
   - This guarantees that synchronized(this) refers to the same monitor for every thread.

5. Thread Naming
   - CHILD 1, CHILD 2, CHILD 3 uniquely identify output lines produced by distinct threads.

STRUCTURAL COMPONENTS AND THEIR PURPOSE
Class MyCar
- Encapsulates the multistep routine executed by all threads.
- Splits actions into unsynchronized and synchronized phases.

run()
- Executes the first print independently for each thread:
  • “[name] has entered parking lot”
- Pauses 4 seconds.
- Enters synchronized(this):
  • Prints “entered into car”
  • Sleeps 4 seconds
  • Prints “stared to drive the car”
  • Sleeps 4 seconds
  • Prints “came back and parked the car”
- The synchronized block enforces exclusive access; the initial line remains concurrent and interleaving.

Class _9_Multithreading
- Sets up and starts the multithreaded execution.

main()
- Creates a single MyCar object.
- Creates three Thread objects sharing the same runnable.
- Assigns names to the threads.
- Starts all threads, causing the run() routine to execute concurrently with partial synchronization.

VARIABLES
mc
- Shared MyCar instance controlling access to the synchronized block.

t1, t2, t3
- Thread objects executing MyCar.run() with unique names.

CONTROL FLOW (EXECUTION SEQUENCE)
1. main() creates mc and threads t1, t2, t3.
2. Threads are named and started.
3. Each thread executes run():
   A. Prints “[name] has entered parking lot”.
   B. Sleeps 4 seconds.
   C. Attempts to enter synchronized(this):
      • Only one thread succeeds at a time.
      • Inside the block:
          – Prints “entered into car”
          – Sleeps 4 seconds
          – Prints “stared to drive the car”
          – Sleeps 4 seconds
          – Prints “came back and parked the car”
      • Releases the lock after finishing.
4. Remaining threads wait for the lock and then execute the synchronized segment sequentially.
5. The first line of each thread still interleaves freely.

PROGRAM OUTPUT BEHAVIOR
- The first line (“[name] has entered parking lot”) appears interleaved, in any order.
- After the initial message, threads serialize their remaining steps due to synchronized(this).
- Each child produces a complete uninterrupted block of:
    • entered into car  
    • stared to drive the car  
    • came back and parked the car  
- The order of these complete blocks depends on which thread acquires the lock first.

*/
