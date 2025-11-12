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
