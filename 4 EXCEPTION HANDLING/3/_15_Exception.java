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
