public class _7_Loops {
    public static void main(String[] args) {
        for(int i = 0;i < 6;i++){
            System.out.println(i + " : *");
        }
        System.out.println("====================");
        int i = 0;
        while(i <= 4){
            System.out.println(i + " : *");
            i++;
        }
        System.out.println("====================");
        int j = 0;
        do{
            System.out.println(j + " : *");
            j++;
        }while(j <= 6);
    }
}
