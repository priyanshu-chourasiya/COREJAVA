class Dog{
    private int cost;
    private String name;
    private String color;

    public Dog(int cost, String name, String color){
        this.cost = cost;
        this.name = name;
        this.color = color;
    }

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
public class _14_Constructor {
    public static void main(String[] args) {
        Dog d1 = new Dog(4,"Sheru","Black"); // call to constructor
        System.out.println(d1.getCost());
        System.out.println(d1.getName());
        System.out.println(d1.getColor());

        //Dog d2 = new Dog(); error
    }
}
// java will include a default construtor only if we dont initialize any constructor
// non parametrized constructor