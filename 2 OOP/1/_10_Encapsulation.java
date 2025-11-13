
class  Employee1{
    private int id;
    private String name;

    // setter
    void setId(int i){
        id = i;
    }
    void setName(String n){
        name = n;
    }

    // getter
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}
public class _10_Encapsulation {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.setId(34);
        e1.setName("Priyanshu");
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
    
}
