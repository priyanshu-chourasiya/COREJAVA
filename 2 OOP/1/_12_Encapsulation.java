class Learner{
    private int id;
    private String name;
    private String city;

    void setId(int i){
        id = i;
    }
    void setName(String n){
        name = n;
    }
    void setCity(String c){ 
        city = c;
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
public class _12_Encapsulation {
    public static void main(String[] args) {
        Learner l1 = new Learner();
        l1.setId(1);
        l1.setCity("Bhopal");
        l1.setName("Priyanshu");

        //int id = l1.getId();
        System.out.println(l1.getId()); // 0
        System.out.println(l1.getCity()); // null
        System.out.println(l1.getName()); // null
    }
}
 