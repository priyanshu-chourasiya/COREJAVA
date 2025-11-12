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
