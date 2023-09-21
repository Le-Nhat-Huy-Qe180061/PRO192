import java.util.ArrayList;
import java.util.Scanner;

public class hocoop
{
    public static void nhap(int n,String[]m)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            System.out.print(String.format("%d: Họ tên:",i+1));
            m[i]=sc.nextLine();
        }
    }
    public static void menu()
    {
        System.out.println("-----------Menu-----------");
        System.out.println("1-->Nhap 2 so tinh cong tru nhan chia");
        System.out.println("2-->In họ tên");
        System.out.println("3-->Tính điểm học phần");
        System.out.println("4-->Kiểm tra họ tên có tồn tại trong danh sách hay ko");
        System.out.print("Option: ");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            menu();
            choice= sc.nextInt();
            switch (choice)
            {
                case 1:
                {
                    System.out.print("Nhập a và b: ");
                    int a = sc.nextInt(), b = sc.nextInt();
                    System.out.println(a + b);
                    System.out.println(a - b);
                    System.out.println(a * b);
                    System.out.println((double) a / b);
                    break;
                }
                case 2:
                {
                    System.out.print("Nhập tên:");
                    String s = sc.nextLine();
                    System.out.println(s);
                    break;
                }
                case 3:
                {
                    System.out.print("Điểm chuyên cần: ");
                    double a = sc.nextDouble();
                    System.out.print("Điểm giữa kỳ: ");
                    double b = sc.nextDouble();
                    System.out.print("Điểm cuối kỳ: ");
                    double c = sc.nextDouble();
                    System.out.print("Điểm học phần: " + (a * 0.1 + b * 0.2 + c * 0.7));
                    System.out.println(" ");
                    break;
                }
                case 4:
                {
                    System.out.print("Nhập danh sách cần khởi tạo bao nhiêu người: ");
                    int n = sc.nextInt();
                    String[] m = new String[n];
                    nhap(n, m);
                    ArrayList<String> name=new ArrayList<>();
                    for(int i=0;i<n;i++)
                    {
                        name.add(m[i]);
                    }
                    System.out.print("Nhập tên kiểm tra có tồn tại hay ko:");
                    boolean check=false;
                    //nhâp tên để kiểm tra thử có tồn tại hay ko
                    sc.nextLine();
                    String timkiem= sc.nextLine();
                    for(String hoten : name)
                    {
                        if(hoten.equalsIgnoreCase(timkiem))
                        {
                            check=true;
                            break;
                        }
                        else
                        {
                            check=false;
                        }
                    }
                    if(check==true)
                    {
                        System.out.println("YES");
                    }
                    else {
                        System.out.println("NO");
                    }
                }
            }
        }while (choice!=5);
    }
}