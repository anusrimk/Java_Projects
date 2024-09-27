import java.io.*;

// Cat class with serialization
class Cat implements Serializable {
    // Instance variables
    private static final long serialVersionUID = 1L;
    String color;
    String breed;
    int age;
    
    // transient prevents serialization
    transient String country;  
    
    // static variables are not serialized
    static String species = "Feline";

    // Constructor
    public Cat(String color, String breed, int age, String country) {
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Cat [color=" + color + ", breed=" + breed + ", age=" + age + ", country=" + country + ", species=" + species + "]";
    }
}

public class Q12_CatSerializationDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("White", "Siamese", 5, "UK");

        // Serialize the cat object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat.ser"))) {
            oos.writeObject(cat);
            System.out.println("Cat object serialized: " + cat);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the cat object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cat.ser"))) {
            Cat deserializedCat = (Cat) ois.readObject();
            System.out.println("Cat object deserialized: " + deserializedCat);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
