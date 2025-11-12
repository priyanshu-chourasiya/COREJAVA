abstract class P{
    abstract void show(); 
}
// class R extends P{
//     public void show(){
//         System.out.println("Hello");
//     }
// }
interface X{
    void show2();
}
public class _10_Lambda {
    public static void main(String[] args) {
        P obj = new P(){
            public void show(){
                System.out.println("Show");
            }
        };
        obj.show();

        X obj2 = new X() {
            public void show2(){
                System.out.println("SHOW2");
            }
        };
        obj2.show2();
    }
}
