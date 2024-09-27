// Question 19, 20

package Module_2;
// Abstract class Animal
abstract class Animal {
    // Abstract method that must be implemented by subclasses
    abstract void sound();
}

// Concrete class Dog extending Animal
class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

// Concrete class Cat extending Animal
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to test the implementation
public class AbstractClassDemo {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat classes
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calling the sound() method for each object
        myDog.sound();
        myCat.sound();
    }
}
