class Parent{

    Parent() {
        System.out.println("Parent zero para constructor");
    }
    
}
class Alien extends Parent{
    Alien(){
        // super()
    }
}
public class _34_Inheritance {
    public static void main(String[] args) {
        Alien a = new Alien();
        
    }
    
}
/*
 * constructor never participate in inheritance
 * in the backend alien constructor is called and by default it is calling the super which
 * refers to parent constructor
 * 
 * they do get executed when we create instance of child class because of super method call present in child class 
 * constructor
 * 
 * inherited method : methods from parent which child uses without modification as it is
 * overridden method : methods from parent which child uses after modifiying them
 * specialized method : methods in child which are not inherited
 */