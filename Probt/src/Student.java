import java.util.Objects;

public class Student  {

    private String email, monHoc1, monHoc2;
    private int Numbers;

    public Student(String email, String monHoc1, String monHoc2, int numbers) {
        this.email = email;
        this.monHoc1 = monHoc1;
        this.monHoc2 = monHoc2;
        Numbers = numbers;
    }

    public Student(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMonHoc1() {
        return monHoc1;
    }

    public void setMonHoc1(String monHoc1) {
        this.monHoc1 = monHoc1;
    }

    public String getMonHoc2() {
        return monHoc2;
    }

    public void setMonHoc2(String monHoc2) {
        this.monHoc2 = monHoc2;
    }

    public int getNumbers() {
        return Numbers;
    }

    public void setNumbers(int numbers) {
        Numbers = numbers;
    }

    @Override
    public String toString()
    {
        return "Email : "+this.email +
                "\nMon hoc 1 :" + this.monHoc1+
                "\nMon hoc 2 :" +this.monHoc2 +
                "\nNumbers :"+this.Numbers+
                "\n---------------------------";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GiangVien other = (GiangVien) obj;
        return Objects.equals(email, other.getEmail());
    }
}
