class Parent extends Child{
    void display(){
        System.out.println("Parent class method");
    }
}
class Child extends Parent{

}
public class _33_Inheritance {   // error cyclic inheritance not allowed
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
