import java.util.Scanner;

public class Test
{
    public static void menuGv()
    {
        System.out.println("MENU");
        System.out.println("---------------------------");
        System.out.println("Vui lòng chọn chức năng: ");
        System.out.println("1. Thêm giảng viên.");
        System.out.println("2. In danh sách giảng viên.");
        System.out.println("3. Sửa Số điện thoại.");
        System.out.println("4. Sửa môn học đang dạy hoặc thêm");
        System.out.println("5. Xóa giảng viên.");
        System.out.println("6. Sửa email của giảng viên.");
        System.out.println("0. Thoát khỏi chương trình.");
        System.out.println("-----------------------------");
    }
    public static void menuSv()
    {
        System.out.println("MENU");
        System.out.println("------------------------------");
        System.out.println("Vui lòng chọn chức năng: ");
        System.out.println("1. Thêm sinh viên.");
        System.out.println("2. In danh sách sinh viên.");
        System.out.println("3. Sửa Số điện thoại.");
        System.out.println("4. Sửa môn học.");
        System.out.println("6. Xóa sinh viên.");
        System.out.println("7. Sửa email của sinh viên.");
        System.out.println("0. Thoát khỏi chương trình.");
        System.out.println("------------------------------");
    }
    public static void menu2()
    {
        System.out.println("MENU");
        System.out.println("--------");
        System.out.println("1-->Giảng Viên");
        System.out.println("2-->Sinh viên");
        System.out.println("3-->exit");
    }
    public static void main(String[] args)
    {
        DanhSachGiangVien dssv = new DanhSachGiangVien();
        DanhSachStudent dssv2=new DanhSachStudent();
        Scanner sc = new Scanner(System.in);
        int choicmenu;
        do {
            menu2();
            choicmenu=sc.nextInt();
               if(choicmenu == 1)
                {
                    int choice, flag = 1;
                    while (flag == 1)
                    {
                        menuGv();
                        choice = sc.nextInt();
                        sc.nextLine();
                        if (choice == 1) {
                            System.out.println("Nhập email giảng viên: ");
                            String email = sc.nextLine();
                            System.out.println("Nhập môn học 1: ");
                            String monHoc1 = sc.nextLine();
                            System.out.println("Nhập môn học 2: ");
                            String monHoc2 = sc.nextLine();
                            System.out.println("Nhập số điện thoại: ");
                            String Numbers;
                           do {
                               Numbers=sc.nextLine();
                               if(Numbers.length() <= 9)
                               {
                                   System.out.println("Number ko hợp lệ !");
                               }
                           }while (Numbers.length() <= 9);
                            GiangVien gv = new GiangVien(email, monHoc1, monHoc2, Integer.parseInt(Numbers));
                            dssv.themGiangVien(gv);
                        } else if (choice == 2)
                        {
                            dssv.inDanhSach();
                        } else if (choice == 3)
                        {
                            dssv.suaNumbers();
                        } else if (choice ==4)
                        {
                            dssv.suaMonHocSeDay();
                        }
                        else if (choice == 5)
                        {
                            System.out.println("Nhập email của giảng viên cần xóa: ");
                            String email = sc.nextLine();
                            GiangVien gv = new GiangVien(email);
                            System.out.println("Xóa giảng viên khỏi danh sách.");
                            dssv.xoaGiangVien(gv);
                        } else if (choice == 6) {
                            dssv.suaEmail();
                        }
                        else
                        {
                            System.out.println("BYE");
                            flag = 0;
                        }
                    }
                }
                else if (choicmenu == 2)
                {
                    int choicesv,flag=1;
                    while (flag==1)
                    {
                        menuSv();
                        System.out.println("Nhập option:");
                        choicesv=sc.nextInt();
                        sc.nextLine();
                        if(choicesv==1)
                        {
                            System.out.println("Nhập email Sinh viên: ");
                            String email = sc.nextLine();
                            System.out.println("Nhập môn học 1: ");
                            String monHoc1 = sc.nextLine();
                            System.out.println("Nhập môn học 2: ");
                            String monHoc2 = sc.nextLine();
                            System.out.println("Nhập số điện thoại: ");
                            String Numbers;
                            do {
                                Numbers=sc.nextLine();
                                if(Numbers.length() <= 9)
                                {
                                    System.out.println("Number ko hợp lệ !");
                                }
                            }while (Numbers.length() <= 9);
                            Student sv= new Student(email,monHoc1,monHoc2,Integer.parseInt(Numbers));
                            dssv2.addStudent(sv);
                        } else if (choicesv==2)
                        {
                           dssv2.inDanhSach();
                        }
                        else if(choicesv==3)
                        {
                            dssv2.suaNumbers();
                        } else if (choicesv == 4)
                        {
                            dssv2.suaMonHoc();

                        } else if (choicesv==5)
                        {

                            System.out.println("Nhập email của giảng viên cần xóa: ");
                            String email2 = sc.nextLine();
                            //Student sv =new Student(email2);
                            System.out.println("Xóa sinh viên khỏi danh sách");
                            dssv2.find(email2);
                        }
                        else if(choicesv == 6)
                        {
                            dssv2.suaEmails();
                        }
                        else
                        {
                            System.out.println("EXIT");
                            flag=0;
                        }
                    }
                }
        }while (choicmenu < 5);
    }
}
