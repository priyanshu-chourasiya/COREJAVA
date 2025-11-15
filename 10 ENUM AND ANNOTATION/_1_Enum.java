
enum Week{
    // Recommended to make final and constant variables capital
    MON,TUE,WED,THURS,FRI,SAT; // all of them are constants and belong to category of Week

}
public class _1_Enum {
    public static void main(String[] args) {
        Week week = Week.MON;
        System.out.println(week);
        System.out.println(Week.THURS.ordinal()); // index

        Week[] ar = Week.values();
        for(Week or : ar){
            System.out.print(or.ordinal() + " : " + or + " ");
        }
        System.out.println();

    }
}
