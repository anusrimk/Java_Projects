//WAP to print the grade using switch case

import java.util.Scanner;

public class grade_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the marks:");
        int marks = sc.nextInt();
        char grade;
        sc.close();

        if (marks > 75) {
            grade = 'A';
        } else if (marks >= 60 && marks <= 75) {
            grade = 'B';
        } else if (marks >= 40 && marks < 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        switch (grade) {
            case 'A':
                System.out.println("Grade A: above 75");
                break;
            case 'B':
                System.out.println("Grade B: 60 > marks <= 75");
                break;
            case 'C':
                System.out.println("Grade C: 40 > marks < 60");
                break;
            case 'F':
                System.out.println("Grade F: less than 40");
                break;
        }
    }
}