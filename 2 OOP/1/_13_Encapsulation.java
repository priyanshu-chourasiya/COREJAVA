class Learner{
    private int id;
    private String name;
    private String city;

    void setId(int id){  // this is used to differentiate between local instance variable inside a setter
        this.id = id;        
    }
    void setName(String name){ // this is used to access or modify currently running objects
        this.name = name;
    }
    void setCity(String city){ 
        this.city = city;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getCity(){
        return city;
    }
}
public class _13_Encapsulation {
    public static void main(String[] args) {
        Learner l1 = new Learner();
        l1.setId(1);
        l1.setCity("Bhopal");
        l1.setName("Priyanshu");

        //int id = l1.getId();
        System.out.println(l1.getId()); 
        System.out.println(l1.getCity()); 
        System.out.println(l1.getName()); 

        System.out.println("***********************************");

        Learner l2 = new Learner();
        l2.setId(2);
        l2.setCity("Delhi");
        l2.setName("Tejas");

        //int id = l1.getId();
        System.out.println(l2.getId()); 
        System.out.println(l2.getCity()); 
        System.out.println(l2.getName()); 
    }
}
