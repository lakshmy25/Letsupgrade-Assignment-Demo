
import java.util.Scanner;

class StudentDetails{
    int rollno;
    String name;
    float marks;
    void studentInp(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Student Rollno : ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name   : ");
        name = sc.nextLine();
        System.out.print("Enter Student Marks2 : ");
        marks = sc.nextFloat();
            }
    void studentdisp(){
        System.out.println(" ----------------------");
        System.out.println("   Student Details");
        System.out.println(" ----------------------");
        System.out.println("Student Roll no : " +rollno);
        System.out.println("Studnet Name    : " +name);
        System.out.println("Studnet Marks   : " +marks);
    }
}

class StudentDemo{
    public static void main(String[] args) {
     StudentDetails I1 = new StudentDetails();
     I1.studentInp();
     I1.studentdisp();
    }
}