package Daily_Practice_Java;
import java.io.*;
class Student implements Serializable{
    int rollno;
    String name;
    public Student(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }
    public String toString(){
        return "Roll no: "+ rollno + "Name: "+ name;
    }
}

public class SerialisationEx1 {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Anusri");
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/SerialisedStudent.ser"))) {
            os.writeObject(s1);
        } catch (IOException e) {
            System.out.println("IO Exception in serialisation");
        }

        try (ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/SerialisedStudent.ser\""))) {
            Student s2 = (Student) is.readObject();
            System.out.println(s2);
        } catch (IOException e) {
            System.out.println("IO Exception in deserialisation");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception in deserialisation");
        }
    }
}
