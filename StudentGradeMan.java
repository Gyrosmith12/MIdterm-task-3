import java.util.Scanner;
public class StudentGradeMan {
    public static double getAverage(double gr1, double gr2, double gr3) 
    {
     double sum = (gr1 + gr2 + gr3) / 3;
        return sum;
    }
    public static String getRemarks(double ave) 
    {
     String remarks = "";
     if (ave >= 60) {
         return "Passed";
     } else {
         return "Failed";
     }
    }
    public static void displayResult(double tempAve)
    { 
        double a = tempAve;
        String remarks = getRemarks(a);
        System.out.println("Average is              "+ a);
        System.out.println("Remarks is              "+ remarks);
        
    }
    public static void studInfo(String number, String name, String course, String year)
    {
        System.out.println("Student Number: " + number);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + year);
    }
    public static void getEquiv(double ave, char display)
    { Scanner sc = new Scanner(System.in);
        System.out.print("Display Letter Grade or Numeric Grade [L/N]?: "); 
        char display = sc.next().charAt(0);

        int grade = (int) ave;

        switch(display) {
        case 'L': case 'l':
            if (grade >= 90 && grade <= 100) {
                System.out.println("Letter Grade: A");
            } else if (grade >= 83 && grade <= 89) {
                System.out.println("Letter Grade: B");
            } else if (grade >= 75 && grade <= 82) {
                System.out.println("Letter Grade: C");
            } else if (grade >= 60 && grade <= 74) {
                System.out.println("Letter Grade: D");
            } else if (grade >= 0 && grade < 60) {
                System.out.println("F");
            } else {
                System.out.println("Invalid grade");
            }
            break;

        case 'N': case 'n':
            if (grade >= 96 && grade <= 100) {
                System.out.println("4.00");
            } else if (grade >= 90 && grade <= 95) {
                System.out.println("3.50");
            } else if (grade >= 84 && grade <= 89) {
                System.out.println("3.00");
            } else if (grade >= 77 && grade <= 83) {
                System.out.println("2.50");
            } else if (grade >= 70 && grade <= 76) {
                System.out.println("2.00");
            } else if (grade >= 0 && grade <= 69) {
                System.out.println("1.00");
            } else {
                System.out.println("Invalid grade");
            }
            break;

        default:
                System.out.println("Invalid input");
                break;
            
    }
}
    public static void main(String args[])
    { Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------------");
        System.out.print("Student Number: ");
        String number = sc.next();
        System.out.print("Student Name: ");
        String name = sc.next();
        System.out.print("Course: ");
        String course = sc.next();
        System.out.print("Year Level: ");
        String year = sc.next();
        studInfo(number, name, course, year);
        System.out.println("----------------------------------------------------");


        System.out.println("Enter Grades:");
        System.out.print("Grade 1              : ");
        double gr1 = sc.nextDouble();
        System.out.print("Grade 2              : ");
        double gr2 = sc.nextDouble();
        System.out.print("Grade 3              : ");
        double gr3 = sc.nextDouble();
        System.out.println("----------------------------------------------------");

        double a = getAverage(gr1, gr2, gr3);
        displayResult(a);
        getEquiv(a);
        System.out.println("----------------------------------------------------");
        
    }}
+

