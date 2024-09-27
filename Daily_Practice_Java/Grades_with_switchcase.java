package Daily_Practice_Java;
import java.util.Scanner;

public class Grades_with_switchcase {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();
        String grade;

        switch (marks / 10) {
            case 10:
            case 9:
            case 8:
            case 7:
                grade = "A";
                break;
            case 6:
                grade = "B";
                break;
            case 5:
            case 4:
                grade = "C";
                break;
            default:
                grade = "F";
                break;
        }

        System.out.println("Your grade is: " + grade);

    
    sc.close();
    }
    
}
