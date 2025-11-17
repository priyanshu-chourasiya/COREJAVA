import java.util.Scanner;

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

    public void verify(){
        if(acc == accNo && pass == password){
            System.out.println("Proceed to withdraw cash");
        }
        else{
            System.out.println("Wrong account no or password");
            input();
            verify();
        }
    }
}

class Bank{
    public void initiate(){
        Atm atm = new Atm();
        atm.input();;
        atm.verify();
    }
}
public class _15_Exception {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.initiate();
    }
}
/*
=====================================================
REVISION NOTES – ATM VERIFICATION PROGRAM
=====================================================

-----------------------------------------------------
1. WHAT THE PROGRAM DOES
-----------------------------------------------------
This program simulates a simple ATM login system.
• The user is asked to enter an account number and password.
• If the entered values match the stored correct values,
  the user is allowed to “withdraw cash”.
• If the values do not match, the program recursively asks again
  until correct credentials are entered.

-----------------------------------------------------
2. IMPORTANT CONCEPTS USED (ONLY PROGRAM-SPECIFIC)
-----------------------------------------------------

1) Scanner  
   • Used to take user input from keyboard.

2) Instance Variables (acc, pass, accNo, password)  
   • Variables stored at object level, accessible within class methods.

3) Private Access Modifier  
   • acc and pass are private → accessible only inside Atm class.

4) if–else Condition  
   • Used to check whether entered details match stored details.

5) Recursion  
   • verify() calls input(), then calls verify() AGAIN when wrong values are entered.

6) Object Creation (new Atm(), new Bank())  
   • Used to access non-static methods.

-----------------------------------------------------
3. PURPOSE OF EACH CLASS / METHOD / VARIABLE
-----------------------------------------------------

Class: Atm  
• Handles user input and credential verification.

Variables inside Atm:
• acc – correct account number (private)  
• pass – correct password (private)  
• accNo – stores user-entered account number  
• password – stores user-entered password

Method: input()  
• Reads account number and password from the user using Scanner  
• Stores values into accNo and password variables.

Method: verify()  
• Compares user-entered values with correct values.  
• If both match → prints success message.  
• If incorrect → prints error message and calls:
      input();   // ask user again  
      verify();  // re-check again  
  (This forms recursion.)

Class: Bank  
Method: initiate()  
• Creates Atm object.  
• Calls its input() and verify() methods to start the ATM process.

Class: _15_Exception (main class)  
Method: main()  
• Creates Bank object.  
• Calls initiate() to start the whole ATM operation.

-----------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP–BY–STEP)
-----------------------------------------------------

1) main() starts.  
2) A Bank object is created.  
3) initiate() is called on Bank object.  
4) Inside initiate():  
       → A new Atm object is created.  
       → atm.input() is called.  
5) input():  
       → Asks user to enter account number → stores in accNo  
       → Asks user to enter password → stores in password  
       → Returns to initiate()

6) initiate() then calls atm.verify()  
7) verify():  
       → Compares accNo with acc, and password with pass  
       → If both correct:  
             Prints “Proceed to withdraw cash”  
             Method ends → program ends  
       → If incorrect:  
             Prints “Wrong account no or password”  
             Calls input() again  
             Then calls verify() again (recursive call)

8) This cycle continues until correct values are entered.

-----------------------------------------------------
5. EXACT RUNTIME BEHAVIOR
-----------------------------------------------------
• User is prompted for account number and password.  
• If user enters 4545 and 1234 → prints:  
      “Proceed to withdraw cash”  
  and program finishes.

• If user enters anything incorrect → prints:  
      “Wrong account no or password”  
  and repeats the login process by calling input() and verify() again.

=====================================================
END OF NOTES
=====================================================
*/
