package studentDatabase;

import java.util.Scanner;

public class Student {
    private String name;
    private String lastName;
    private String course = null;
    private int tuitionBalance;
    private static int costOfSingleCourse = 600;
    private int gradeYear;
    private static int id = 1000;
    private String studentId;
    private int payment;

    //    constructor to get the students name and year
   public Student(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the First name of the student: ");
       this.name = scanner.next();
       System.out.print("Enter the Last name of the student: ");
       this.lastName = scanner.next();
       System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter the class level: ");
       this.gradeYear = scanner.nextInt();
       setStudentId();
       System.out.println(name + " " + lastName + " Graduation Class: " + gradeYear + " " + "Student ID: " + studentId);
   }


//generating the id
    private void setStudentId(){
       id++;
       this.studentId = gradeYear + "" + id;
    }
//enroll in the courses
    public void enrollCourse(){
       Scanner scanner = new Scanner(System.in);
        do {
           System.out.print("Enter the Course to Enroll (Q to quit): ");
           String enrolledCourse = scanner.nextLine();
           if (!enrolledCourse.equals("Q")){
               course = course + "\n" + enrolledCourse;
               tuitionBalance = tuitionBalance + costOfSingleCourse;
           } else {
               System.out.println("Break!");
               break;
           }
       } while (1 != 0);
        System.out.println("Enrolled course: " + course);
        System.out.println("Total Fees: " + tuitionBalance);
    }
//pay tuition
    public void payFees(){
        System.out.println("==============================");
       Scanner scanner = new Scanner(System.in);
        System.out.print("Pay Fees: ");
        payment = scanner.nextInt();
       tuitionBalance = tuitionBalance - payment;
        System.out.println("Paid: " + payment);
       viewStatus();
    }
//show the status
public void viewStatus(){
    if (payment < tuitionBalance){
        System.out.println("Has due payment...!");
    }else {
        System.out.println("Fully paid......!");
    }
 }
}

