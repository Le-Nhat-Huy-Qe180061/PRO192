import java.util.List;

public class Lecturer extends Person
{
    protected List<String> subjectsTaught;
    public Lecturer(String email, String fullName, int birthYear, String gender, String phoneNumber, String address,
                    List<String> subjectsTaught) {
        super(email, fullName, birthYear, gender, phoneNumber, address);
        this.subjectsTaught = subjectsTaught;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Information:");
        System.out.println("Email: " + email);
        System.out.println("Full Name: " + fullName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Subjects Taught: " + subjectsTaught);
    }

    @Override
    public void search(String keyword) {
        if (keyword.equals(this.email)) {
            System.out.println("Lecturer Found: " + this.fullName);
        }
    }

}
