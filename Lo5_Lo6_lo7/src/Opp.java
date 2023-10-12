import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        List<String> subjectsTaught = new ArrayList<>();
        ArrayList<Lecturer> arr = new ArrayList<>();
        subjectsTaught.add("Math");
        subjectsTaught.add("Physics");


        sc.nextLine();
        List<String> enrolledCourses = new ArrayList<>();
        enrolledCourses.add("Computer Science");
        enrolledCourses.add("Database Management");


        System.out.print("Enter email to search: ");
        String searchKeyword = sc.next();
        lecturer.search(searchKeyword);
        //student.search(searchKeyword);

        lecturer.displayInfo();
        //student.displayInfo();
    }
}
/*
lenhathuy9a6@gmail.com
le nhat huy
28
nam
0569589113
28/12/2004
 */
