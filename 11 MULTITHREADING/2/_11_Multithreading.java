class Library implements Runnable{

    String res1 = new String("JAVA");
    String res2 = new String("PYTHON");
    String res3 = new String("DSA");
                                          // DEADLOCK 
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
                synchronized(res3){
                    System.out.println("Student 1 has : " + res3);
                    Thread.sleep(3000);
                    synchronized(res2){
                        System.out.println("Student 2 has : " + res2);
                        Thread.sleep(3000);
                        synchronized(res1){
                            System.out.println("Student 3 has : " + res1);
                            Thread.sleep(3000);
                        } // the moment control comes out to this braces resource is released
                    }
                }
            } catch (Exception e) {
            }
        }

    }
}
public class _11_Multithreading {
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
// DEADLOCK 
// multiple threads are permanently stuck in blocked state due to cyclci dependency of resources

/*
REVISION NOTES

PROGRAM SUMMARY
The program demonstrates a deliberate deadlock scenario using two threads that request shared resources  
in opposite locking orders. Three resource objects (res1, res2, res3) are used as lock monitors.  
Student 1 acquires locks in the order res1 → res2 → res3, while Student 2 acquires locks in the order  
res3 → res2 → res1. The reversed acquisition order creates a cyclic wait condition where both threads  
can block each other permanently.

KEY CONCEPTS AND THEIR ROLE IN THIS PROGRAM
1. Runnable Implementation
   - Library implements Runnable so that both threads execute the same run() method but follow distinct paths  
     depending on thread name.

2. Explicit Resource Objects (res1, res2, res3)
   - Three separate String objects used strictly as lock monitors.
   - Represent resource units that must be acquired in sequence.

3. Synchronized Blocks on Specific Objects
   - synchronized(res1), synchronized(res2), synchronized(res3)
   - Associate each resource with its own lock.
   - Produce strict lock acquisition order, which differs between Student 1 and Student 2 paths.

4. Thread.sleep
   - Enforces visible timing and delays between lock acquisitions, increasing the likelihood of collision  
     between the two threads.

5. Deadlock Through Cyclic Dependency
   - Student 1 path acquires res1 then waits for res2.
   - Student 2 path acquires res3 then waits for res2.
   - If both proceed further, each eventually ends up waiting on a resource held by the other, producing a cycle.

STRUCTURAL COMPONENTS AND THEIR PURPOSE
Class Library
- Defines shared resources and contains logic that produces the deadlock pattern.

res1, res2, res3
- Independent lock objects representing JAVA, PYTHON, and DSA resources.

run()
- Determines execution branch based on thread name.
- Student 1 branch:
  1. Print entry.
  2. Acquire res1.
  3. Acquire res2.
  4. Acquire res3.
- Student 2 branch:
  1. Print entry.
  2. Acquire res3.
  3. Acquire res2.
  4. Acquire res1.
- Nested synchronization structure creates reversed dependency chains.

Class _11_Multithreading
- Sets up two threads that compete for the same resources.

main()
- Instantiates one Library object.
- Creates threads for Student 1 and Student 2.
- Starts both threads, initiating the deadlock-prone behavior.

VARIABLES
l
- Shared Library instance containing all resources.

t1, t2
- Student threads attempting to acquire the same locks in different orders.

name
- Identifies which execution path the current thread follows.

CONTROL FLOW (EXECUTION SEQUENCE)
1. main() creates Library instance and two threads.
2. Both threads start and enter run().
3. Student 1 executes:
   • Prints entry.
   • Sleeps.
   • Locks res1.
   • Sleeps.
   • Attempts to lock res2.
4. Student 2 executes:
   • Prints entry.
   • Sleeps.
   • Locks res3.
   • Sleeps.
   • Attempts to lock res2.
5. If Student 1 holds res1 and Student 2 holds res3 simultaneously, both wait for res2.
6. Whichever acquires res2 first will next attempt to lock the remaining resource:
   • Student 1 → res3 (held by Student 2)
   • Student 2 → res1 (held by Student 1)
7. A cyclic dependency forms (res1 → res2 → res3 → res1).
8. Both threads remain blocked indefinitely, producing a deadlock.

PROGRAM OUTPUT BEHAVIOR
- Both threads print their initial “got into library” messages.
- Additional messages may appear depending on which locks are acquired before deadlock.
- Once both threads reach the point of mutually waiting on each other’s resources, execution halts.
- No further output occurs after the deadlock point.
- Program does not terminate because both threads stay permanently blocked.

*/
