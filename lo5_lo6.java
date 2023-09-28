package PRO192;

import java.util.Scanner;

public class lo5_lo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person x = new Person(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
        x.Display();
        x.changediachi(sc.nextLine());
        x.changediachi(sc.nextLine());
        x.Display();
    }

}
