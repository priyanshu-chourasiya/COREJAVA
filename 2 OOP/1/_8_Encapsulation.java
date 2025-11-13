class Book{
    int pageNum;
    void display(){
        System.out.println("Java and inheritance is present at PageNum : " + pageNum);
    }
}
public class _8_Encapsulation {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        b1.pageNum = -5; // no security
        System.out.println(b1.pageNum);
        b1.display();
    }
}
