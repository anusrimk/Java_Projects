package Daily_Practice_Java;
import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    float marks;

    void add_info(String n, int roll, float m){
        this.name = n;
        this.roll_no = roll;
        this.marks = m;
    }

    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Roll no : " + this.roll_no);
        System.out.println("Marks : " + this.marks);
    }

    
}

public class Student_Class{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your Roll no. :");
        int roll_no = sc.nextInt();

        System.out.println("Enter your marks :");
        float marks = sc.nextFloat();

        Student s1 = new Student();
        s1.add_info(name,roll_no,marks);
        s1.display();
    
    sc.close();
    }
}