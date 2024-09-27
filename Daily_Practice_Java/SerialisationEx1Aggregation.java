package Daily_Practice_Java;
// import java.io.*;

// class Address implements Serializable{
//     String flatNo;
//     String Society;
//     Address (String f,String s){
//         flatNo=f;
//         Society = s;
//     }
//     public String toString(){
//         return "Flat No : "+flatNo+" Society : "+Society;
//     }
// }

// class Person implements Serializable{
//     int id;
//     String name;
//     Person(int id, String name){
//         this.id=id;
//         this.name=name;
//     }
//     public String toString(){
//         return "ID : "+id+" Name : "+name;
//     }
// }

// class Student extends Person{
//     int rollno;
//     String course;
//     Address addr;
//     public Student (int id, String name, int rollno, String course, Address ad){
//         super(id,name);
//         this.rollno=rollno;
//         this.course=course;
//         this.addr=ad;
//     }
//     public String toString(){
//         // return super.toString()+" Roll No : "+rollno+" Course : "+course+" Address : "+
//         System.out.println(super.toString());
//         return "RollNo : " + this.rollno + ", Course : " + this.course + ", Address : " + this.addr;
//     }
// }


// public class SerializationEx1Aggregation {
//     public static void main(String[] args) {
//         // Address addr = new Address("101", "ABC");
//         Student s1 = new Student(1, "Prem", 45, "BTech CSE",
//                 new Address("101A", "EliteSociety", 400025));
//         System.out.println(s1);

//         try (ObjectOutputStream stream = new ObjectOutputStream(
//                 new FileOutputStream("CheckFiles/SerializationWithInheritanceEx1.ser"))) {
//             stream.writeObject(s1);
//         } catch (Exception e) {
//             System.out.println("Exception");
//         }
//         try (ObjectInputStream stream = new ObjectInputStream(
//                 new FileInputStream("CheckFiles/SerializationWithInheritanceEx1.ser"))) {
//             Student s2 = (Student) stream.readObject();
//         } catch (Exception e) {
//             System.out.println("Exception");
//         }

//     }
// }
import java.io.*;

class Address implements Serializable {
    String flat;
    String society;

    Address(String flat, String society, int pincode) {
        this.flat = flat;
        this.society = society;
    }

    public String toString() {
        return "FlatNo: " + flat + " Society: " + society;
    }
}

class Person implements Serializable {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Id: " + id + "Name: " + name;
    }
}

class Student extends Person {
    int rollNo;
    String course;
    Address address;

    Student(int id, String name, int rollNo, String course, Address address) {
        super(id, name);
        this.rollNo = rollNo;
        this.course = course;
        this.address = address;
    }

    public String toString() {
        System.out.println(super.toString());
        return "RollNo : " + this.rollNo + ", Course : " + this.course + ", Address : " + this.address;
    }
}

public class SerialisationEx1Aggregation {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Prem", 45, "BTech CSE",
                new Address("101A", "EliteSociety", 400025));
        System.out.println(s1);

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/SerializationWithInheritanceEx1.ser"))) {
            stream.writeObject(s1);
        } catch (Exception e) {
            System.out.println("Exception");
        }
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/SerializationWithInheritanceEx1.ser"))) {
            Student s2 = (Student) stream.readObject();
            System.out.println(s2);
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }
}