public class _7_Strings {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity());

        System.out.println("STRING BUILDER");
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.capacity());
        sb2.append("Sachin");
        sb2.append("India Tendulkar");
        System.out.println(sb2.capacity()); // (old capacity * 2) + 2
        System.out.println("---------");
        StringBuilder s3 = new StringBuilder();
        s3.append("Sachin");
        System.out.println(s3.capacity());
        s3.trimToSize();
        System.out.println(s3.capacity()); // will remove extra spaces
    }
}
