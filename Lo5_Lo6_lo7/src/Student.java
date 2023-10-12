import java.util.List;

public class Student extends Person{
    protected String major;
    protected List<String> enrolledCourses;

    public Student(String email, String fullName, int birthYear, String gender, String phoneNumber, String address,
                   List<String> enrolledCourses) {
        super(email, fullName, birthYear, gender, phoneNumber, address);
        this.enrolledCourses = enrolledCourses;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Enrolled Courses: " + enrolledCourses);
    }

    @Override
    public void search(String keyword) {
        if (keyword.equals(this.email)) {
            System.out.println("Student Found: " + this.fullName);
        }
    }
}
