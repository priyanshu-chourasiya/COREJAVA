import java.util.Scanner;
class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String msg){
        super(msg);
    }
}
class Applicant{
    int age;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter your age : ");
        age = sc.nextInt();

    }
    public void verify() throws UnderAgeException,OverAgeException{
        if(age >= 18 && age <= 60){
            System.out.println("Proceed with application");
        }
        else if(age < 18){
            UnderAgeException uae = new UnderAgeException("Under age");
            System.out.println(uae.getMessage());
            throw uae;
        }
        else{
            OverAgeException oae = new OverAgeException("Over age");
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
}
class RTO{
    public void initiate(){
        Applicant app = new Applicant();
         try {
            app.input();
       
            app.verify();
        } 
        // catch (UnderAgeException e) {

        // }
        // catch(OverAgeException e1){
        //     e1.printStackTrace();
        // }
        
        catch(UnderAgeException | OverAgeException e){
            // e.printStackTrace();
            System.out.println("Try again");
            try{
                app.input();
                app.verify();
        }
            catch(UnderAgeException | OverAgeException e1){
            // e.printStackTrace();
            System.out.println("Done");
            
        }
        }
    }
}
public class _18_Exception {
    public static void main(String[] args) {
        System.out.println("Licence application");
        RTO rto = new RTO();
        rto.initiate();
    }   
}
/*
=====================================================
REVISION NOTES – UNDERAGE & OVERAGE CUSTOM EXCEPTIONS
=====================================================

-----------------------------------------------------
1. WHAT THE PROGRAM DOES
-----------------------------------------------------
This program simulates an RTO age verification system for a driving licence.
• User enters their age.
• If age is between 18 and 60 → application proceeds.
• If age < 18 → UnderAgeException is thrown.
• If age > 60 → OverAgeException is thrown.
• The user gets 2 total attempts (initial + one retry).
• If the second attempt also fails → application is stopped.

-----------------------------------------------------
2. IMPORTANT PROGRAM-SPECIFIC CONCEPTS
-----------------------------------------------------

1) Custom Exceptions (UnderAgeException, OverAgeException)
   • Both extend Exception → checked exceptions.
   • Each has a constructor accepting a message passed to super.

2) Multi-catch (catch(UnderAgeException | OverAgeException e))
   • A single catch block used to handle multiple exception types.
   • Both exceptions share the same handling logic.

3) throw Keyword
   • Used inside verify() to throw either UnderAgeException or OverAgeException.

4) throws Keyword
   • verify() declares that it may throw both exceptions.

5) Scanner
   • Used in input() to take age from the user.

6) Nested try–catch
   • Used in RTO.initiate() to allow one retry attempt after a failure.

-----------------------------------------------------
3. PURPOSE OF EACH CLASS / METHOD / VARIABLE
-----------------------------------------------------

Class: UnderAgeException  
• Custom exception for ages below 18.

Class: OverAgeException  
• Custom exception for ages above 60.

Class: Applicant  
Variable:
• age – stores user-entered age.

Method: input()  
• Uses Scanner to read the age into the age variable.

Method: verify() throws UnderAgeException, OverAgeException  
• Checks if age is valid:  
      age between 18–60 → success  
      age < 18 → prints "Under age", throws UnderAgeException  
      age > 60 → prints "Over age", throws OverAgeException

Class: RTO  
Method: initiate()  
• Creates an Applicant object.  
• First attempt wrapped in try:  
      - app.input()  
      - app.verify()  

If an exception occurs (either underage or overage):  
• Prints "Try again".  
• Starts a second attempt inside a nested try–catch:  
      - app.input()  
      - app.verify()  
If second attempt also throws exception → prints "Done".

Class: _18_Exception (main class)  
Method: main()  
• Prints "Licence application".  
• Creates RTO object and calls initiate() to start process.

-----------------------------------------------------
4. COMPLETE CONTROL FLOW (STEP–BY–STEP)
-----------------------------------------------------

1) Program starts → prints "Licence application".
2) RTO object created → initiate() called.

--------- FIRST ATTEMPT ---------
3) app.input() → user enters age.
4) app.verify() checks age:
      • If valid → prints "Proceed with application" → program ends.
      • If underage → prints "Under age", throws UnderAgeException.
      • If overage → prints "Over age", throws OverAgeException.
5) Exception caught → prints "Try again".

--------- SECOND ATTEMPT ---------
6) Inside nested try:  
      app.input() → user enters age again.  
      app.verify() → performs same checks.
      • If valid → "Proceed with application" → ends program.
      • If underage/overage again → exception thrown.
7) Exception caught → prints "Done".

8) Program ends.

-----------------------------------------------------
5. EXACT RUNTIME BEHAVIOR
-----------------------------------------------------

Case 1: User enters valid age (18–60):  
   Output:  
      Licence application  
      Kindly enter your age :  
      Proceed with application  

Case 2: User enters underage (<18) first attempt and valid second attempt:  
   Output:  
      Under age  
      Try again  
      Kindly enter your age :  
      Proceed with application  

Case 3: User enters invalid age twice:  
   Output:  
      Invalid (Under age / Over age message)  
      Try again  
      Invalid again  
      Done  

=====================================================
END OF NOTES
=====================================================
*/
