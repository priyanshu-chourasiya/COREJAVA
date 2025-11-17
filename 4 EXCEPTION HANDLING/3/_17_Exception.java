import java.util.Scanner;

class InvalidCustomerException extends Exception{ // it must extend any of the predefined exception
    public InvalidCustomerException(String msg){
        super(msg);
    }
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
            InvalidCustomerException ice = new InvalidCustomerException("Invalid Credentials");
            System.out.println(ice.getMessage());
            throw ice;                  //both are same

            //throw new InvalidCustomerException("Invalid Credentials");
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
            System.out.println("Try again");
            //System.out.println("ICE");
            try{
            atm.input();
            atm.verify();
            }
            catch(InvalidCustomerException ice1){
                System.out.println("Try again last chance");
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
public class _17_Exception {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();
    }
}
/*
=====================================================
REVISION NOTES – CUSTOM EXCEPTION WITH MESSAGE & 3 ATTEMPTS
=====================================================

-----------------------------------------------------
1. WHAT THE PROGRAM DOES
-----------------------------------------------------
This program simulates an ATM login system with:
• A custom exception that carries a message ("Invalid Credentials")
• Credential verification
• Three login attempts
• Messages guiding the user for 1st, 2nd, and 3rd attempts

If credentials are correct → user proceeds.  
If wrong for all 3 attempts → account is blocked (final message shown).

-----------------------------------------------------
2. IMPORTANT PROGRAM-SPECIFIC CONCEPTS
-----------------------------------------------------

1) Custom Exception with Constructor  
   class InvalidCustomerException extends Exception  
   • Includes a constructor that accepts a message (String msg).  
   • Uses super(msg) to pass the message to Exception class.  
   • Makes the exception a checked exception.

2) getMessage()  
   • Method of Throwable used to retrieve the exception’s message  
     passed during construction ("Invalid Credentials").

3) throw and throws  
   • throw → actually throws the exception inside verify().  
   • throws → declares that verify() may throw this exception.

4) Nested try–catch  
   • Used in Bank.initiate() to manage 3 login attempts.

5) Scanner  
   • Used to read account number and password input from the user.

-----------------------------------------------------
3. PURPOSE OF EACH CLASS / METHOD / VARIABLE
-----------------------------------------------------

Class: InvalidCustomerException  
• Custom checked exception for authentication failures.  
• Constructor stores a message which can be printed using getMessage().

Class: Atm  
• Handles user input and credential verification.

Variables:
• acc – correct account number (private)  
• pass – correct password (private)  
• accNo – user-entered account number  
• password – user-entered password  

Method: input()  
• Reads account number and password using Scanner.  
• Stores values in accNo and password.

Method: verify() throws InvalidCustomerException  
• Checks if entered credentials match stored credentials.  
• If correct → prints success message.  
• If incorrect →  
    - Creates InvalidCustomerException with message "Invalid Credentials"  
    - Prints the message using getMessage()  
    - Throws the exception

Class: Bank  
Method: initiate()  
• Creates Atm object  
• Handles 3 login attempts using nested try–catch blocks  
• Prints appropriate attempt messages:  
    1st failure → "Try again"  
    2nd failure → "Try again last chance"  
    3rd failure → "U have tried 3 times"

Class: _17_Exception (main class)  
Method: main()  
• Creates Bank object and starts process by calling initiate().

-----------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP–BY–STEP)
-----------------------------------------------------

1) Program starts → main()  
2) Bank object created  
3) initiate() called

----------- FIRST ATTEMPT -----------
4) atm.input() asks for account number + password  
5) atm.verify():  
      • If correct → program ends  
      • If wrong →  
           - Prints "Invalid Credentials"  
           - Throws exception  
6) Caught by first catch → prints "Try again"

----------- SECOND ATTEMPT -----------
7) Inside first catch:  
      atm.input()  
      atm.verify()  
      • If correct → program ends  
      • If wrong →  
            - Prints "Invalid Credentials"  
            - Throws exception  
8) Caught by nested catch → prints "Try again last chance"

----------- THIRD ATTEMPT -----------
9) Inside second nested catch:  
      atm.input()  
      atm.verify()  
      • If correct → program ends  
      • If wrong → exception thrown  
10) Caught by final catch → prints "U have tried 3 times"

11) Program ends.

-----------------------------------------------------
5. EXACT RUNTIME BEHAVIOR
-----------------------------------------------------
• User is prompted for account number and password.  
• If correct on any attempt →  
      "Proceed to withdraw cash"  
  and the program terminates.

• If incorrect:  
     1st wrong →  
          "Invalid Credentials"  
          "Try again"  

     2nd wrong →  
          "Invalid Credentials"  
          "Try again last chance"  

     3rd wrong →  
          "Invalid Credentials"  
          "U have tried 3 times"

=====================================================
END OF NOTES
=====================================================
*/
