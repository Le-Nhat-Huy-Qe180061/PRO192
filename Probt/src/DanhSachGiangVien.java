import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachGiangVien {
    private ArrayList<GiangVien> danhSachGiangVien;

    public DanhSachGiangVien() {
        danhSachGiangVien = new ArrayList<GiangVien>();
    }

    public DanhSachGiangVien(ArrayList<GiangVien> danhSachGiangVien) {
        this.danhSachGiangVien = danhSachGiangVien;
    }


    // 1. Add teacher in list
    public void themGiangVien(GiangVien gv)
    {
        danhSachGiangVien.add(gv);
    }

    // 2. Print out monitor
    public void inDanhSach() {

        if(danhSachGiangVien.isEmpty())
        {
            System.out.println("Danh sách ko có ai");
        }
        else
        {
            for(GiangVien gv : danhSachGiangVien)
            {
                System.out.println(gv);
            }
        }
    }

    // 3. Delete teacher
    public void xoaGiangVien(GiangVien gv)
    {
        danhSachGiangVien.remove(gv);
    }
    public void addNumbers(GiangVien number){danhSachGiangVien.add(number);}

    // 4. Repair email of teacher
    Scanner sc = new Scanner(System.in);
    public void suaEmail() {
        System.out.println("Nhập email của giảng viên cần sửa: ");
        String emailGiangVien = sc.nextLine();
        sc.nextLine();

        for(GiangVien gv : danhSachGiangVien) {
            if(gv.getEmail().equals(emailGiangVien)) {
                System.out.println("Nhập email mới: ");
                gv.setEmail(sc.nextLine());
                break;
            }
        }
    }

    public void suaNumbers() {

       int choice;
        do {
            System.out.println("1--->Sửa sdt theo gmail");
            System.out.println("2--->Nhập số đt cần sửa");
            System.out.println("3--->Exit");
             choice =sc.nextInt();
            if(choice == 1)
            {
                sc.nextLine();
                System.out.println("Nhập email của giảng viên cần sửa: ");
                String emailGiangVien = sc.nextLine();
                //sc.nextLine();
                for(GiangVien gv : danhSachGiangVien) {
                    if(gv.getEmail().equals(emailGiangVien))
                    {
                        System.out.println("Nhập số điện thoại mới");
                        gv.setNumbers(sc.nextInt());
                        System.out.println("Đã sửa sdt thành công");
                        break;
                    }
                    else
                    {
                        System.out.println("ko tìm thấy gmail cần sửa");
                    }
                }

            }
            else if(choice==2)
            {
                System.out.println("Nhập số điện thoại cần sửa: ");
                int std = sc.nextInt();
                sc.nextLine();
                for(GiangVien gv : danhSachGiangVien)
                {
                    if(gv.getNumbers()==(std)) {
                        System.out.println("Nhập numbers mới: ");
                        gv.setNumbers(sc.nextInt());
                        System.out.println("Đã sửa sdt thành công");
                        break;
                    }
                    else
                    {
                        System.out.println("Không tồn tại số điện thoại cần sửa này");
                    }
                }

            }
        }while (choice < 2);

    }

    public void suaMonHocSeDay() {

        System.out.println("Nhập email của Giảng viên cần sửa: ");
        String emailGiangVien = sc.nextLine();
        for (GiangVien gv : danhSachGiangVien)
        {
            if (gv.getEmail().equals(emailGiangVien))
            {
                int choice;
                do {
                    System.out.println("Chọn môn học đang dạy để sửa:");
                    System.out.println("1-->môn học 1");
                    System.out.println("2-->môn học 2");
                    System.out.println("0-->Quay lại menu chính");
                    choice = sc.nextInt();
                    sc.nextLine();
                    if (choice == 1) {
                        System.out.println("Nhập môn học dạy mới: ");
                        String newMonHoc1 = sc.nextLine();
                        gv.setMonHoc1(newMonHoc1);
                        System.out.println("Đã sửa môn học 1 thành công");
                    } else if (choice == 2) {
                        System.out.println("Nhập môn học dạy mới: ");
                        String newMonHoc2 = sc.nextLine();
                        gv.setMonHoc2(newMonHoc2);
                        System.out.println("Đã sửa môn học 2 thành công");
                    } else if (choice != 3) {
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    }
                } while (choice != 3);
                break;
            } else {
                System.out.println("Không tìm thấy Giảng viên với email: " + emailGiangVien);
            }
        }
    }


}
