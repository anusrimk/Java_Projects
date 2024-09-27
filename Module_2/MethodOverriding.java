// Question 13, 14
package Module_2;

// Superclass: Animal
class Animal {
    String name = "Animal";

    public void Speak() {
        System.out.println("Animal is speaking");
    }
}

// Subclass
class Dog extends Animal {
    String name = "Dog";

    @Override
    public void Speak() {
        super.Speak();
        System.out.println("Dog is barking");
    }

    public void printNames() {
        System.out.println("Name from Dog class: " + name);       
        System.out.println("Name from Animal class: " + super.name); // Animal's instance variable
    }
}

// Subclass: Cat
class Cat extends Animal {
    String name = "Cat";

    @Override
    public void Speak() {
        super.Speak();
        System.out.println("Cat is meowing");
    }

    public void printNames() {
        System.out.println("Name from Cat class: " + name);         // Cat's instance variable
        System.out.println("Name from Animal class: " + super.name); // Animal's instance variable
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Speak();        
        dog.printNames();   

        System.out.println();

        Cat cat = new Cat();
        cat.Speak();       
        cat.printNames();   
    }
}
