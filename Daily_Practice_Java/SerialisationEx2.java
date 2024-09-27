package Daily_Practice_Java;
import java.io.*;

class Dog implements Serializable{
    String dogName;
    String breed;
    public Dog(String dogName, String breed){
        this.dogName=dogName;
    }
    public String toString(){
        return "Dog's Name: "+ dogName + "Dog's Breed: "+ breed;
    }
}

public class SerialisationEx2 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Enzo", "German Shepard");
        try (ObjectOutputStream os = new ObjectOutputStream(
                new FileOutputStream("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/SerialisedStudent.ser"))) {
            os.writeObject(d1);
        } catch (IOException e) {
            System.out.println("IO Exception in serialisation");
        }

        try (ObjectInputStream is = new ObjectInputStream(
                new FileInputStream("/Users/anusrikarmokar/Desktop/Java/Daily_Practice_Java/SerialisedStudent.ser\""))) {
            Dog d2 = (Dog) is.readObject();
            System.out.println(d2);
        } catch (IOException e) {
            System.out.println("IO Exception in deserialisation");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception in deserialisation");
        }
    }
    
}
