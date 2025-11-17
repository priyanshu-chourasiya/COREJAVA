import java.util.Scanner;

class InvalidCustomerException extends Exception{ // it must extend any of the predefined exception
    
}
class Atm{
    private int acc = 4545;
    private int pass = 1234;

    int accNo;
    int password;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter account number : ");
        accNo = sc.nextInt();

        System.out.println("Kindly enter password : ");
        password = sc.nextInt();
    }

    public void verify() throws InvalidCustomerException{
        if(acc == accNo && pass == password){
            System.out.println("Proceed to withdraw cash");
        }
        else{
            // InvalidCustomerException ice = new InvalidCustomerException();
            // throw ice;                  both are same

            throw new InvalidCustomerException();
        }
    }
}

class Bank{
    public void initiate(){
        Atm atm = new Atm();

        try{
            atm.input();
            atm.verify();
        }
        catch(InvalidCustomerException ice){
            //System.out.println("ICE");
            try{
            atm.input();
            atm.verify();
            }
            catch(InvalidCustomerException ice1){
                //System.out.println("ICE");
                try{
            atm.input();
            atm.verify();
        }
        catch(InvalidCustomerException ice2){
            System.out.println("U have tried 3 times");
        }
            }
        }
    }
}
public class _16_Exception {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();
    }
}
/*
=====================================================
REVISION NOTES – CUSTOM EXCEPTION & ATM RETRY SYSTEM
=====================================================

-----------------------------------------------------
1. WHAT THE PROGRAM DOES
-----------------------------------------------------
This program implements an ATM login system with:
• A custom exception (InvalidCustomerException)
• Maximum 3 login attempts
• If the user enters wrong credentials 3 times, a final message is shown.

-----------------------------------------------------
2. IMPORTANT PROGRAM-SPECIFIC CONCEPTS
-----------------------------------------------------

1) Custom Exception (InvalidCustomerException extends Exception)
   • A user-defined exception class.
   • Becomes a checked exception because it extends Exception.
   • Must be handled or declared using throws.

2) throws Keyword
   • Used in Atm.verify() to indicate that the method may throw
     InvalidCustomerException.

3) throw Keyword
   • Used to actually create and throw a new InvalidCustomerException
     object if credentials are incorrect.

4) try–catch Blocks (nested)
   • Used by Bank.initiate() to catch the thrown exception.
   • Repeated three times to provide three login attempts.

5) Scanner
   • Used to take user input from keyboard (account number and password).

-----------------------------------------------------
3. PURPOSE OF EACH CLASS / METHOD / VARIABLE
-----------------------------------------------------

Class: InvalidCustomerException
• A custom checked exception used to signal wrong credentials.

Class: Atm
• Handles credential input and verification.

Variables in Atm:
• acc – correct account number (private)  
• pass – correct password (private)  
• accNo – user-entered account number  
• password – user-entered password  

Method: input()
• Takes user input for account number and password.
• Stores them in accNo and password variables.

Method: verify() throws InvalidCustomerException
• Compares user input with correct credentials.
• If correct → prints “Proceed to withdraw cash”.
• If wrong → throws new InvalidCustomerException.

Class: Bank
Method: initiate()
• Creates an Atm object.
• Uses try–catch blocks to call input() and verify().
• Provides 3 chances:
    1st attempt in outer try
    2nd attempt in first catch block
    3rd attempt in second nested catch block
• If all three fail → prints “U have tried 3 times”.

Class: _16_Exception (main class)
Method: main()
• Creates Bank object.
• Calls initiate() to start the ATM logic.

-----------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP–BY–STEP)
-----------------------------------------------------

1) Program starts in main().  
2) Bank object is created.  
3) initiate() is called.

--- FIRST ATTEMPT ---
4) atm.input() asks user for account number and password.
5) atm.verify() checks credentials.
     • If correct → success message → program ends.
     • If incorrect → InvalidCustomerException is thrown.
6) This exception is caught by the first catch block of initiate().

--- SECOND ATTEMPT ---
7) Inside first catch:
       atm.input() is called again.
       atm.verify() is called again.
     • If correct → program ends.
     • If incorrect → another exception is thrown.
8) This is caught in the nested catch (ice1).

--- THIRD ATTEMPT ---
9) Inside second nested catch:
       atm.input() is called again.
       atm.verify() is called again.
     • If correct → program ends.
     • If incorrect → exception is thrown again.
10) This is caught by deepest catch (ice2).

11) In deepest catch, message printed:
       "U have tried 3 times"
12) Program ends.

-----------------------------------------------------
5. EXACT RUNTIME BEHAVIOR
-----------------------------------------------------
• User is asked for account number and password.
• If correct on ANY attempt → prints:
      "Proceed to withdraw cash"
  and program finishes.

• If wrong 3 consecutive times → prints:
      "U have tried 3 times"

• No further attempts are allowed after 3 failures.

=====================================================
END OF NOTES
=====================================================
*/
