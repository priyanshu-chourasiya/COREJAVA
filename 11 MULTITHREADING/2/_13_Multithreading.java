class MSWord extends Thread{
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        if(name.equals("Typing")){
            Typing();
        }
        else if(name.equals("Spell")){
            SpellCheck();
        }
        else{
            AutoSaving();
        }
    }
    public void Typing(){
        try {
            for(int i = 0 ; i < 3; i++){
                System.out.println("Typing");
                Thread.sleep(4000);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void SpellCheck(){
        try {
            for(;;){   // executed by demon thread 
                // demon thread follows root of main thread
                // if main is executing 3 times so demon thread will also execute 3 times
                System.out.println("Spell check");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AutoSaving(){
        try {
            for(;;){  // infinte loop
                System.out.println("Auto Saving");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class _13_Multithreading {
    public static void main(String[] args) {
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();
        MSWord ms3 = new MSWord();

        ms1.setName("Typing");
        ms2.setName("Spell");
        ms3.setName("Saving");

        ms2.setDaemon(true);
        ms3.setDaemon(true);
        ms2.setPriority(4);
        ms3.setPriority(3);   // 1 means low priority and 10 means high

        ms1.start();
        ms2.start();
        ms3.start();

        /*
         *  Typing
            Spell check
            Auto Saving
            Auto Saving
            Typing
            Spell check
            Typing
            Auto Saving
            Spell check
            Auto Saving
         */
    }
} 
/*
PROGRAM SUMMARY
The program launches three concurrent threads representing typing, spell checking, and auto-saving functions.  
The "Typing" thread is a normal user thread that runs three times.  
The "Spell" and "Saving" threads are daemon threads that run infinite loops but terminate automatically when the main user thread finishes.

KEY CONCEPTS AND THEIR USAGE
1. Daemon threads  
   - Threads marked as background workers that terminate when all user threads complete.  
   - Used here for SpellCheck and AutoSaving to run indefinitely but end when the Typing thread finishes.

2. Thread priority  
   - Scheduler hint influencing relative likelihood of execution.  
   - ms2 receives priority 4 and ms3 receives priority 3, affecting how often their loops may be scheduled.

3. Infinite loops in threads  
   - for(;;) creates non-terminating execution inside SpellCheck and AutoSaving.  
   - Intended to keep those threads running until the JVM exits due to user thread completion.

4. run() task dispatching  
   - The run() method selects the operational method by checking the thread’s assigned name.  
   - Determines which workload each thread executes.

PROGRAM STRUCTURE DETAILS
MSWord class
- run(): Determines which functional loop to start based on thread name.  
  "Typing" → Typing(), "Spell" → SpellCheck(), anything else → AutoSaving().

- Typing(): Repeats three iterations printing "Typing" with 4-second pauses.

- SpellCheck(): Infinite loop printing "Spell check" with 4-second pauses.  
  Daemon status causes termination once the "Typing" thread ends.

- AutoSaving(): Infinite loop printing "Auto Saving" with 4-second pauses.  
  Also ends automatically due to daemon status.

_13_Multithreading class
- main(): Creates three MSWord thread objects.  
  Assigns names determining their executed routines.  
  Configures ms2 and ms3 as daemon threads.  
  Sets priorities for ms2 and ms3.  
  Starts all threads, allowing concurrent execution.

VARIABLE, METHOD, BLOCK, AND STRUCTURE PURPOSES
- MSWord ms1, ms2, ms3: Independent threads simulating editing features.  
- setName(): Binds each thread to a specific execution path.  
- setDaemon(true): Marks ms2 and ms3 as background threads.  
- setPriority(): Adjusts scheduling preference between Spell and Saving tasks.  
- for(int i = 0; i < 3): Controls the finite repetition of the Typing task.  
- for(;;): Creates unbounded loops for SpellCheck and AutoSaving.  
- Thread.sleep(4000): Inserts consistent pauses between outputs.  
- try–catch blocks: Handles InterruptedException during sleep.

CONTROL FLOW
1. Program enters main().  
2. Three MSWord objects are instantiated.  
3. Names are assigned: ms1 → "Typing", ms2 → "Spell", ms3 → "Saving".  
4. ms2 and ms3 are marked as daemon threads.  
5. Thread priorities for ms2 and ms3 are set.  
6. start() is invoked on all three threads.  
7. Each thread enters run():  
   - ms1 executes Typing() for three cycles.  
   - ms2 executes SpellCheck() in an infinite loop but ends implicitly when ms1 finishes.  
   - ms3 executes AutoSaving() in an infinite loop but ends implicitly when ms1 finishes.  
8. When Typing() completes its three iterations, the only remaining threads are daemons,  
   causing the JVM to exit and terminate ms2 and ms3.

EXECUTION BEHAVIOR AND OUTPUT
- Output interleaves among the three threads in nondeterministic order.  
- "Typing" appears exactly three times.  
- "Spell check" and "Auto Saving" repeat continuously while the Typing thread is alive.  
- Both daemon threads stop abruptly when Typing completes.  
- Actual ordering varies each run; the sample block in the comment reflects one possible interleaving.
*/
