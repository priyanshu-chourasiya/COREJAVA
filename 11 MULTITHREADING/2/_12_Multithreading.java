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
            for(int i = 0 ; i < 3; i++){
                System.out.println("Spell check");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AutoSaving(){
        try {
            for(int i = 0 ; i < 3; i++){
                System.out.println("Auto Saving");
                Thread.sleep(4000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class _12_Multithreading {
    public static void main(String[] args) {
        MSWord ms1 = new MSWord();
        MSWord ms2 = new MSWord();
        MSWord ms3 = new MSWord();

        ms1.setName("Typing");
        ms2.setName("Spell");
        ms3.setName("Saving");
        
        ms1.start();
        ms2.start();
        ms3.start();
    }
} 
/*
PROGRAM SUMMARY
The program launches three independent threads that simulate features of a word-processing application.  
Each thread determines its task based on its assigned name and repeatedly prints a specific operation  
(typing, spell checking, or auto saving) three times with pauses between prints.

KEY CONCEPTS AND THEIR USAGE IN THIS CODE
1. Thread subclassing  
   - The class MSWord extends Thread, enabling each MSWord instance to function as a concurrent execution unit.  
   - Each object created in main runs independently when start() is invoked.

2. run() method override  
   - Replaces the Thread class’s default run implementation.  
   - Acts as the execution entry point for each MSWord thread.  
   - Contains logic to select which operation method to execute based on thread name.

3. Thread.currentThread() and getName()  
   - Retrieves the actively executing thread instance and its assigned name.  
   - Used to decide which operation (Typing, SpellCheck, AutoSaving) the thread must perform.

4. Thread.sleep()  
   - Suspends the executing thread for 4 seconds between repeated prints.  
   - Creates visible delays showing independent thread execution.

PROGRAM STRUCTURE DETAILS
MSWord class
- run(): Determines the task associated with the thread.  
  Compares the thread’s name to "Typing", "Spell", or other values, then calls the matching method.

- Typing(): Executes a loop three times printing "Typing", pausing four seconds each cycle.

- SpellCheck(): Executes a loop three times printing "Spell check", pausing four seconds each cycle.

- AutoSaving(): Executes a loop three times printing "Auto Saving", pausing four seconds each cycle.

_12_Multithreading class
- main(): Entry point.  
  Creates three MSWord thread objects (ms1, ms2, ms3).  
  Assigns them names indicating their intended behavior.  
  Starts all three threads, allowing their run() methods to execute concurrently.

VARIABLE, METHOD, BLOCK, AND STRUCTURE PURPOSES
- MSWord ms1, ms2, ms3: Three independent thread instances performing different tasks.  
- setName("Typing"), setName("Spell"), setName("Saving"): Assigns task-identifying names to threads.  
- start(): Triggers each thread’s run() execution.  
- for loops inside Typing(), SpellCheck(), AutoSaving(): Controls repetition count (three iterations).  
- try–catch blocks: Ensures the thread does not crash if sleep() throws an exception.

CONTROL FLOW
1. Program begins in main().  
2. Three MSWord objects are instantiated.  
3. Names are assigned:  
   - ms1 → "Typing"  
   - ms2 → "Spell"  
   - ms3 → "Saving"  
4. start() is invoked on each instance.  
5. Each thread independently enters its run() method.  
6. run() reads the current thread's name:  
   - Thread named "Typing" executes Typing().  
   - Thread named "Spell" executes SpellCheck().  
   - Thread named "Saving" executes AutoSaving().  
7. Inside the chosen method, a loop prints the task message three times with 4-second pauses.  
8. After loop completion, each thread finishes execution.

EXECUTION BEHAVIOR AND OUTPUT
- All three threads run concurrently, interleaving their printed messages nondeterministically.  
- Expected message types:  
  "Typing"  
  "Spell check"  
  "Auto Saving"  
- Each appears three times from its respective thread.  
- Ordering varies run-to-run due to concurrent scheduling.
*/
