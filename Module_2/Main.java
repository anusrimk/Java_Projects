// Question 10
package Module_2;

// Superclass: Vehicle
class Vehicle {
    // Superclass method
    void startEngine() {
        System.out.println("Vehicle engine starts.");
    }
}

// Subclass: Car
class Car extends Vehicle {
    // Subclass-specific method
    void honk() {
        System.out.println("Car honks.");
    }

    // Overriding superclass method
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a roar.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Superclass reference pointing to a subclass object
        Vehicle vehicle = new Car();  // Upcasting

        // Call superclass method (this will call the overridden method in the subclass)
        vehicle.startEngine();  // Calls the overridden method in Car

        // vehicle.honk(); // This would cause a compile-time error because the superclass reference can't access subclass-specific methods

        // Downcasting to access the subclass-specific method
        Car car = (Car) vehicle;  // Downcasting
        car.honk();  // Now we can access the Car-specific method
    }
}
