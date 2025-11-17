
import java.util.Scanner;

class Alpha{
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
class Beta{
    public void stars() throws Exception{
        System.out.println("Prining activity started");
        for (int i = 0; i < 3; i++) {
            System.out.println("Think higher of yourself");
            Thread.sleep(4000);
        }
        System.out.println("Printing activity terminated");
    }
}
class Gama{
    public void Importantmessage() throws Exception{
        System.out.println("Prining important message started");
        for (int i = 0; i < 3; i++) {
            System.out.println("**");
            Thread.sleep(4000);
        }
        System.out.println("Printing important message terminated");
    }
}
public class _3_Multithreading {
    public static void main(String[] args) throws Exception {
        System.out.println("Application started");

        Alpha a = new Alpha();
        Beta b = new Beta();
        Gama g = new Gama();
        a.Banking();
        b.stars();
        g.Importantmessage();
        System.out.println("Application terminated");
    }
}
/*
PROGRAM SUMMARY
The program defines three separate classes, each encapsulating a distinct activity: banking input, a message-printing loop, and another message-printing loop. In main, instances of these classes are created and their methods are called sequentially. All work occurs on a single thread, and repeated delays inside the printing loops demonstrate blocking execution.

IMPORTANT CONCEPTS IN THIS CODE
1. Encapsulated Activity Classes (Alpha, Beta, Gama)
   - Each class isolates a specific operation within its own method.
   - Used here to structure the same sequential tasks into separate components.

2. Scanner Input
   - Reads console values during the banking activity.

3. Thread.sleep(...)
   - Pauses the executing thread for a defined duration.
   - Controls timing inside the printing loops and enforces blocking behavior.

4. Sequential Single-Thread Execution
   - All method calls run one after another.
   - Each sleep call halts program progress until it completes.

STRUCTURE AND ELEMENT PURPOSES
1. class Alpha
   - Holds the Banking() method performing user input and printing related to banking.

2. Banking()
   - Prompts for user number and password, reads both values, prints banking messages.

3. class Beta
   - Contains the stars() method performing a timed motivational message loop.

4. stars() throws Exception
   - Prints a message three times with a 4-second delay between each output.

5. class Gama
   - Contains the Importantmessage() method for a second timed loop.

6. Importantmessage() throws Exception
   - Prints “**” three times with a 4-second delay between iterations.

7. public class _3_Multithreading
   - Hosts the program’s entry point.

8. main method
   - Creates instances of Alpha, Beta, and Gama.
   - Calls their methods in sequence.
   - Marks start and end of program execution.

9. Variables: Alpha a, Beta b, Gama g
   - Objects through which each activity method is invoked.

CONTROL FLOW (START TO END)
1. Program begins and prints “Application started”.
2. Instantiates Alpha, Beta, and Gama.
3. Calls a.Banking():
   - Prompts for user number, reads it.
   - Prompts for password, reads it.
   - Prints completion messages.
4. Calls b.stars():
   - Enters a loop of three iterations.
   - Prints the motivational message.
   - Waits 4 seconds between iterations.
   - Prints termination message.
5. Calls g.Importantmessage():
   - Enters a loop of three iterations.
   - Prints “**”.
   - Waits 4 seconds between iterations.
   - Prints termination message.
6. Prints “Application terminated”.
7. Program ends.

EXECUTION BEHAVIOR AND OUTPUT
1. Prints startup.
2. Prompts and waits for two user inputs.
3. Prints banking termination.
4. Prints the motivational message three times with 4-second intervals.
5. Prints first loop termination.
6. Prints “**” three times with 4-second intervals.
7. Prints second loop termination.
8. Prints final termination message.
*/
