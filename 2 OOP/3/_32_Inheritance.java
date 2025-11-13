class Telesco1{
    private String name = "Priyanshu";
    void display(){
        System.out.println("Name is " + name);
    }
}
class Alien extends Telesco1{
    void display2(){
        name = "alien";
    }
}
public class _32_Inheritance {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.display();
        a.display2();
    }
    
}
/*
 * private members of a class will not get inherited. this is to ensure encapsulation does not get affected
 * 
 * multi level inheritance is allowed 1 child -> parent -> parent
 * 
 * 
 */