public abstract class Person {

    protected String email;
    protected String fullName;
    protected int birthYear;
    protected String gender;
    protected String phoneNumber;
    protected String address;

    public Person(String email, String fullName, int birthYear, String gender, String phoneNumber, String address) {
        this.email = email;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public abstract void displayInfo();
    public abstract void search(String keyword);

}
