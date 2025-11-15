

enum Results{
    PASS,FAIL;
    //pulic static final Result PASS = new Result();    behind the scenes
    //pulic static final Result FAIL = new Result();

    // enum Week{
    //     MON,TUE;
    // }   we can define enum inside an enum

    int marks;

    Results() {
        System.out.println("Constructor of Enum");
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }

    
}
public class _2_Enum {
    public static void main(String[] args) {
        Results res = Results.PASS;
        res.setMarks(44);
        System.out.println(res.getMarks());

        System.out.println("---------------------------");

        Results.PASS.setMarks(99);
        int marks = Results.PASS.getMarks();
        System.out.println(marks);

        System.out.println("---------------------------");

        int marks2 = Results.FAIL.getMarks();
        System.out.println(marks2);
    }
}
