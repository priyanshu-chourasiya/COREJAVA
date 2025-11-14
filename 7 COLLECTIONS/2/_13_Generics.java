
class Generics<T>{
    private T ref;
    public Generics(T ref){
        this.ref = ref; 
    }
    public void display(){
        System.out.println("Type of t is : " + ref.getClass().getName());
    }
    public T getRef() {
        return ref;
    }
}
public class _13_Generics {
    public static void main(String[] args) {
        Generics<Integer> g = new Generics(44);
        g.display();
        System.out.println(g.getRef());

        Generics<String> g1 = new Generics("Java");
        g1.display();
        System.out.println(g1.getRef());

    }
}
