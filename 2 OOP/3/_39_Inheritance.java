class Parent{
    int i = 10;
    void display(){
        System.out.println("Display of parent");
    }
}
class Child extends Parent{
    int i = 100;
    void display2(){

        System.out.println("Display of child");
        System.out.println(i);

        System.out.println(super.i);
        super.display();
    }
    void display(){
        System.out.println("Display of child");
    }
    
}
public class _39_Inheritance {
    public static void main(String[] args) {
        new Child().display2();
    }
}
