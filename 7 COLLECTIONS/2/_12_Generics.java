
import java.util.ArrayList;

 class _12_Generics {
    public static void main(String[] args) {
        // supports type safety
        int arr[] = new int[3];
        arr[0] = 14;
        arr[1] = 24;
        arr[2] = 34;

        int data = arr[0];

        String []str = new String[3];
        str[0] = "abc";
        str[1] = "def";
        str[2] = "java";

        String ans = str[1];

        // no typesafety
        ArrayList al = new ArrayList<>();
        al.add("abc");
        al.add("java");
        al.add("alien");
        al.add(44);

        String s1 = (String) al.get(0);
        s1 = s1.toLowerCase();
        System.out.println(s1);

        String s2 = (String) al.get(1);
        s2 = s2.toLowerCase();
        System.out.println(s2);

        String s3 = (String) al.get(2);
        s3 = s3.toLowerCase();
        System.out.println(s3);

        String s4 = (String) al.get(3);
        s4 = s4.toLowerCase();
        System.out.println(s4);

        ArrayList<Integer> list = new ArrayList<>();
        
    }
}
