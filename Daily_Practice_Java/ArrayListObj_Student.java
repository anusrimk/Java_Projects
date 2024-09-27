package Daily_Practice_Java;

import java.util.ArrayList;

class Student {

    private int rollno;
    private String name;
    private String course;

    public Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    public int getNumber() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
}

public class ArrayListObj_Student {  
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "John Doe", "Mathematics"));
        students.add(new Student(2, "Jane Smith", "Physics"));
        students.add(new Student(3, "Mike Johnson", "Computer Science"));
        students.add(new Student(4, "Emily Davis", "Biology"));
        students.add(new Student(5, "Sophia Brown", "Chemistry"));

        System.out.println("Student Information:");
        for (Student student : students) {
            System.out.println("Number: " + student.getNumber() + ", Name: " + student.getName() + ", Course: " + student.getCourse());
        }
    }
}

