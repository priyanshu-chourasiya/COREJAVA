class Book{
    private int pageNum;

    // setter
    void setPageNum(int pgNo){
        if(pgNo >= 0){
            pageNum = pgNo;
        }
        else{
            System.out.println("Page number cannot be less than 0! ");
        }
    }
    void display(){
        System.out.println("Java and inheritance is present at PageNum : " + pageNum);
    }
    // getter
    int getPageNum(){
        return pageNum;
    }

}
public class _9_Encapuslation {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        b1.setPageNum(-1);
        b1.display();
        System.out.println(b1.getPageNum());
    }
}
