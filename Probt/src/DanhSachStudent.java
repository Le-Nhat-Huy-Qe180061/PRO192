import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachStudent {

    private ArrayList<Student> DanhSachStudent;

    public DanhSachStudent() {
        DanhSachStudent = new ArrayList<Student>();
    }

    public DanhSachStudent(ArrayList<Student> DanhSachStudent) {
        this.DanhSachStudent = DanhSachStudent;
    }


    public void addStudent(Student sv) {
        DanhSachStudent.add(sv);
    }

    public void inDanhSach() {
        if (DanhSachStudent.isEmpty()) {
            System.out.println("Danh sách ko có ai");
        } else {
            for (Student sv : DanhSachStudent) {
                System.out.println(sv);
            }
        }
    }

    public void remove(Student sv) {
        DanhSachStudent.remove(sv);
    }

    Scanner sc = new Scanner(System.in);

    public void suaNumbers()
    {
        int choice;
        do {
            System.out.println("1--->Sửa sdt theo gmail");
            System.out.println("2--->Nhập số đt cần sửa");
            System.out.println("3--->Exit");
            choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();
                System.out.println("Nhập email của Sinh viên cần sửa: ");
                String emailStudent = sc.nextLine();
                //sc.nextLine();
                for (Student gv : DanhSachStudent) {
                    if (gv.getEmail().equals(emailStudent))
                    {
                        System.out.println("Nhập số điện thoại mới");
                        gv.setNumbers(sc.nextInt());
                        System.out.println("Đã sửa sdt thành công");
                        break;
                    } else {
                        System.out.println("ko tìm thấy gmail cần sửa");
                    }
                }

            } else if (choice == 2) {
                System.out.println("Nhập số điện thoại cần sửa: ");
                int std = sc.nextInt();
                sc.nextLine();
                for (Student gv : DanhSachStudent) {
                    if (gv.getNumbers() == (std)) {
                        System.out.println("Nhập numbers mới: ");
                        gv.setNumbers(sc.nextInt());
                        System.out.println("Đã sửa sdt thành công");
                        break;
                    } else {
                        System.out.println("Không tồn tại số điện thoại cần sửa này");
                    }
                }

            }
        } while (choice < 2);
    }

    public void suaMonHoc() {

        System.out.println("Nhập email của Sinh viên cần sửa: ");
        String emailStudent = sc.nextLine();

        for (Student gv : DanhSachStudent) {
            if (gv.getEmail().equals(emailStudent)) {
                int choice;
                do {
                    System.out.println("Chọn môn học để sửa:");
                    System.out.println("1-->môn học 1");
                    System.out.println("2-->môn học 2");
                    System.out.println("0-->Quay lại menu chính");
                    choice = sc.nextInt();
                    sc.nextLine();
                    if (choice == 1) {
                        System.out.println("Nhập môn học mới: ");
                        String newMonHoc1 = sc.nextLine();
                        gv.setMonHoc1(newMonHoc1);
                        System.out.println("Đã sửa môn học 1 thành công");
                    } else if (choice == 2) {
                        System.out.println("Nhập môn học mới: ");
                        String newMonHoc2 = sc.nextLine();
                        gv.setMonHoc2(newMonHoc2);
                        System.out.println("Đã sửa môn học 2 thành công");
                    } else if (choice != 3) {
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    }
                } while (choice != 3);
                break;
            } else {
                System.out.println("Không tìm thấy sinh viên với email: " + emailStudent);
            }
        }
    }


    public void removeStudent(Student sv)
    {
        DanhSachStudent.remove(sv);
    }


    public void find(String email)
    {
        boolean found = false;
        for (Student sv : DanhSachStudent)
        {
            if (sv.getEmail().equals(email))
            {
                found = true;
                DanhSachStudent.remove(sv);
                System.out.println("Tìm thấy và đã xóa thành công: " + email);
                break;
            }
        }
        if (!found)
        {
            System.out.println("Ko tìm t thấy gmail : " + email);
        }
    }


    public void suaEmails()
    {
        int choice;
        do
        {
            System.out.println("1--->Sửa email theo số điện thoại");
            System.out.println("2--->Nhập email cần sửa");
            System.out.println("3--->Exit");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            if (choice == 1) {
                System.out.println("Nhập email cần sửa: ");
                String oldEmail = sc.nextLine();
                System.out.println("Nhập email mới: ");
                String newEmail = sc.nextLine();
                for (Student sv : DanhSachStudent) {
                    if (sv.getEmail().equals(oldEmail)) {
                        sv.setEmail(newEmail);
                        System.out.println("Đã sửa email thành công");
                        break;
                    }
                }
            } else if (choice == 2)
            {
                System.out.println("Nhập số điện thoại của Sinh viên cần sửa email: ");
                int phoneNumber = sc.nextInt();
                sc.nextLine();

                for (Student sv : DanhSachStudent)
                {
                    if (sv.getNumbers() == phoneNumber)
                    {
                        System.out.println("Nhập email mới: ");
                        String newEmail = sc.nextLine();
                        sv.setEmail(newEmail);
                        System.out.println("Đã sửa email thành công");
                        break;
                    }
                }
            }
        } while(choice < 3) ;
    }
}



