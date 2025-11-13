class Demo{
    int num1,num2;

    Demo(){ // in first statement of any constructor there is always a super method call behind the scenes
        // if u write or even dont write
        // only not if there is a this method in constructor
        super();
        System.out.println("Zero paramertized constructor");
    }
    Demo(int num1,int num2){
        this(num1);
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("Two para construtor");
    }
    Demo(int num1){
        this(); // will call constructor of same class
        this.num1 = num1;
        num2 = 34;
        System.out.println("One para construtor");
    }

    void display(){
        System.out.println("num1 : "+num1);
        System.out.println("num2 : "+ num2);
    }
}
public class _18_Construtor {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        d1.display();

        System.out.println("______________________________");

        Demo d2 = new Demo(8,9);
        d2.display();
    }   
}
// super method is used to call parent class constructor