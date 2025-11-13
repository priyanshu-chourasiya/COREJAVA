class Dog{
    private int cost;
    private String name;
    private String color;

    // public Dog(int cost, String name, String color){
    //     this.cost = cost;
    //     this.name = name;
    //     this.color = color;
    // }

    // Dog(){ // construtor overloading
    //     System.out.println("Zero parametrized constructor");
    //     cost = 455;
    //     name = "Rahul";
    //     color = "Pink";
    // }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
public class _16_Constructor {
    public static void main(String[] args) {
        Dog d1 = new Dog(4,"Sheru","Black"); // call to parametrized constructor but it is not present 
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());
        System.out.println("**************************************");
        Dog d2 = new Dog();
        System.out.println(d2.getCost());
        System.out.println(d2.getName());
        System.out.println(d2.getColor());
    }
} 
    
// Encapsulation : process of giving controlled access to data members (instance variable) of a class by making them
/* private and using getters and setters 
 * process of binding data members and member functions as a unit.
 * process of providing security to most important component of object(data member) by making it private and giving controlled
 * access through stters and getters
 * it can be acheived using private keyword, getters and setters
 * 
 * Constructor:
 * it is a specialized setter whose name is same as that of class name and doesnt have any explicit return type
 * it is envoked during object creation/instantion
 * if there is a call to constructor and java developer has not included any construtor in a class
 * then java compiler default zero parametrized constructor 
 * if there is a cons. is coded then java compiler will not include default cons.
 * we can have multiple cons. in a class. cons overloading
 * 
 * this keyword will have address of currently running instance/object i.e., currently whichever object is getting
 * executed it will refer to that object instance
 * it will be used inside setter and construtor to differentiate local and instance variable and to assign 
 * data to instance variale to local(solution of shadowing problem)
 */ 
