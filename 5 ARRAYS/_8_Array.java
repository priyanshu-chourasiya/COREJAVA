class Tel {
   private String courseName;
   private int courseCost;
   private String city;

    public Tel(String city, int courseCost, String courseName) {
        this.city = city;
        this.courseCost = courseCost;
        this.courseName = courseName;
    }
   public String getCourseName() {
    return courseName;
   }
   public void setCourseName(String courseName) {
    this.courseName = courseName;
   }
   public int getCourseCost() {
    return courseCost;
   }
   public void setCourseCost(int courseCost) {
    this.courseCost = courseCost;
   }
   public String getCity() {
    return city;
   }
   public void setCity(String city) {
    this.city = city;
   }

   public Tel(){
    super();
   }
   @Override
   public String toString() {
    return "Tel [courseName=" + courseName + ", courseCost=" + courseCost + ", city=" + city + "]";
   }
}

public class _8_Array {
    public static void main(String[] args) {
        Tel t = new Tel("Banglore",3000,"Sprint boot");
        // System.out.println(t.getCourseCost());
        // System.out.println(t.getCity());
        // System.out.println(t.getCourseName());

        System.out.println(t);
    }
}
