//Create a class Animal with instance variables:• boolean vegetarian• String food• int numOflegs• Create a no-argument constructor and parameterized constructor. (Use "this")• Create getters and setters• Create a toString method for animal class• Create a subclass Cat with instance variable:• String color• Create a no-argument constructor and parameterized constructor which has all four parameters (Use this and super)• Create a to String method for Cat class• Create a subclass Cow with instance variable:• String breed• Create a no-argument constructor and parameterized constructor which has all four parameters. (Use this and super)• Create a toString method for Cow class

// Superclass animal
class animal {
    private boolean vegetarian;
    private String food;
    private int numOfLegs;

    // No-argument constructor
    public animal() {
    }

    // Parameterized constructor
    public animal(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }

    // Getters and Setters
    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    // toString method
    @Override
    public String toString() {
        return "Animal [Vegetarian=" + vegetarian + ", Food=" + food + ", Number of Legs=" + numOfLegs + "]";
    }
}

// Subclass Cat
class Cat extends animal {
    private String color;

    // No-argument constructor
    public Cat() {
        super();
    }

    // Parameterized constructor
    public Cat(boolean vegetarian, String food, int numOfLegs, String color) {
        super(vegetarian, food, numOfLegs);
        this.color = color;
    }

    // Getters and Setters for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Cat [Color=" + color + ", " + super.toString() + "]";
    }
}

// Subclass Cow
class Cow extends animal {
    private String breed;

    // No-argument constructor
    public Cow() {
        super();
    }

    // Parameterized constructor
    public Cow(boolean vegetarian, String food, int numOfLegs, String breed) {
        super(vegetarian, food, numOfLegs);
        this.breed = breed;
    }

    // Getters and Setters for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString method
    @Override
    public String toString() {
        return "Cow [Breed=" + breed + ", " + super.toString() + "]";
    }
}

// Main class to test the code
public class MainClass {  // Renamed to "MainClass" to avoid conflict with "animal"
    public static void main(String[] args) {
        // Testing animal class
        animal a = new animal(true, "Grass", 4);
        System.out.println(a);

        // Testing Cat class
        Cat cat = new Cat(false, "Fish", 4, "Black");
        System.out.println(cat);

        // Testing Cow class
        Cow cow = new Cow(true, "Hay", 4, "Jersey");
        System.out.println(cow);
    }
}
