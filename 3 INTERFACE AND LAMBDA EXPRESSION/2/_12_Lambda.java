@FunctionalInterface  // if we add more than one undeclared method in interface this will throw an error 
interface X{
    void show2();
    default void abs(){
        System.out.println("Aada"); // but we can have default 
    }
    String toString(); // already declared in Object class
}

@FunctionalInterface
interface Person{
    int add(int a,int b);
}

// class imple implements Person{
//     public int add(int a,int b){
//         return a+b;
//     }
// }
public class _12_Lambda {
    public static void main(String[] args) {
        X obj2 = () -> System.out.println("HEEEEEE");
        obj2.show2();

        // Person p1 = new Person(){
        //     public int add(int x,int y){
        //         return x+y;
        //     }
        // };

        // Person p1 = (int x,int y) -> {
        //     return x+y;
        // }; 

        Person p1 = (x,y) -> x+y; // replacement of anounmous inner class
    

        int result = p1.add(12, 11);
        System.out.println(result);
    }
}
