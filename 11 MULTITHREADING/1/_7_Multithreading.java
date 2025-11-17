class MyCar implements Runnable{
    
    @Override
    public void run(){
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
public class _7_Multithreading {
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
            CHILD 2 has entered parking lot
            CHILD 3 has entered parking lot
            CHILD 1 has entered into car
            CHILD 2 has entered into car
            CHILD 3 has entered into car
            CHILD 2 has stared to drive the car
            CHILD 1 has stared to drive the car
            CHILD 3 has stared to drive the car
            CHILD 2 has came back and parked the car
            CHILD 3 has came back and parked the car
            CHILD 1 has came back and parked the car
         */
    }
}

/*
REVISION NOTES

PROGRAM SUMMARY
The program demonstrates concurrent execution using three threads that all share the same runnable task.  
Each thread simulates a sequence of actions representing a child entering a parking lot, getting into a car,  
driving it, and returning it, with fixed delays between each stage.

KEY CONCEPTS AND THEIR ROLE IN THIS PROGRAM
1. Runnable Implementation (MyCar implements Runnable)
   - Defines a task that can be executed by multiple threads.
   - run() contains the complete sequence of simulated car-use actions.

2. Thread.sleep
   - Inserts 4000 ms pauses between stages to enforce a timed step-by-step progression for each thread.

3. Shared Runnable Target (same MyCar instance used by all threads)
   - Ensures all threads execute identical behavior defined in run().
   - Produces interleaved output because threads progress independently.

4. Thread Naming (setName)
   - Assigns identifiers CHILD 1, CHILD 2, CHILD 3.
   - Used to distinguish which thread is performing each action.

STRUCTURAL COMPONENTS AND THEIR PURPOSE
Class MyCar
- Defines the multistep routine executed by all threads.
- Contains run() which prints each stage of the simulated activity with delays.

run()
- Prints current thread name along with action messages.
- Progression:
  1. Enter parking lot
  2. Enter car
  3. Start driving
  4. Return and park
- Pauses 4 seconds between each step.
- Wrapped in try-catch to handle sleep interruptions.

Class _7_Multithreading
- Contains the main execution flow that sets up and starts threads.

main()
- Instantiates one MyCar object.
- Creates three threads (t1, t2, t3) using the same runnable target.
- Assigns names to threads.
- Starts all threads, triggering concurrent execution of run().

VARIABLES
mc
- Single MyCar instance shared by all threads.

t1, t2, t3
- Separate Thread objects executing MyCar.run().
- Their assigned names appear in output messages.

CONTROL FLOW (EXECUTION SEQUENCE)
1. main() creates a MyCar instance.
2. Three Thread objects are constructed with mc as their runnable target.
3. Names CHILD 1, CHILD 2, CHILD 3 are assigned.
4. start() is invoked on each thread, beginning asynchronous execution.
5. Each thread enters run():
   • Prints “[name] has entered parking lot”
   • Sleeps 4 seconds
   • Prints “[name] has entered into car”
   • Sleeps 4 seconds
   • Prints “[name] has stared to drive the car”
   • Sleeps 4 seconds
   • Prints “[name] has came back and parked the car”
6. Because all threads run concurrently, outputs from the three sequences interleave,  
   producing various possible ordering patterns within the constraints of each thread’s internal sequence.

PROGRAM OUTPUT BEHAVIOR
- All three threads print the same four messages with their unique names.
- Within each thread, the order of its four messages is fixed.
- Across threads, message ordering is nondeterministic and interleaved due to concurrent execution.
- A typical observed output matches the commented block, but actual ordering may vary between runs.

*/
