package classes.exercises;

/**
 * Exercise 3: Inheritance
 * ------------------------
 * TODO:
 * 1. Create a superclass Vehicle with method start().
 * 2. Create a subclass Bike that adds method ride().
 * 3. In main(), create a Bike object and call both methods.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        // TODO: Create Bike object and test methods
        Vehicle v1 = new Vehicle();
        Bike b1 = new Bike();
        v1.start();
        b1.start();
        b1.ride();
    }
}


class Vehicle {
    void start() {
        System.out.println("start vehicle");
    }
}

class Bike extends Vehicle {
    void ride () {
        System.out.println("ride bike");
    }
}