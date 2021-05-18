package People;

public class Person {
//   default: without an access modifier specified, they are accessible only within the same package
// private can only be accessed within the class it is declared
//  protected accessible within the same package or sub classes in different packages
//    public can be accessed from everywhere  in the program
    //   Constant
//    Cannot be marked static, because they'd become class variables
//   private static final String DATA_TYPE = "Whatever";

//    instance variables
   private  String firstName;
   private String lastName;
   private String location;
   private int age;
   private double height;
   private boolean hasJob;

//   The first step of crating an object
    public Person (String firstName, String lastName, String location, int age, double height, boolean hasJob){
//        local variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.height = height;
        this.hasJob = hasJob;

    }
//    public Person(String firstName){
public Person(String firstName){

}
//    }
// Empty constructor / default constructor
public Person() {
    }
    public  void  sayHello(){
        System.out.println("Hello" + firstName);
    }

    public int birthDay(){
        return (age + 1);
    }
    public int birthYear(int currentYear){
        int yearOfBirth = currentYear - age;

        return yearOfBirth;
//    }
//        over writing it
//        public int birthday (String month){
//        return ( age + 1);
        }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }
//two string method and here we are over ridding it.
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hasJob=" + hasJob +
                '}';
    }
}
