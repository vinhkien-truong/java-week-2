package classes.exercises;

/**
 * Exercise 4: Abstract, Final, Inner Classes
 * ------------------------------------------
 * TODO:
 * 1. Create an abstract class Animal with abstract method sound().
 * 2. Create a subclass Cat that implements sound().
 * 3. Create a final class MathUtil with method square(int).
 * 4. Create an inner class inside Exercise4_AbstractFinalInner that prints a message.
 */
public class Exercise4
{
    public static void main(String[] args)
    {
        // TODO: Implement all requirements and test them
        Animal a1 = new Cat();
        a1.sound();

        MathUtil mu = new MathUtil();
        System.out.println("Math : " + mu.square(4));

        Exercise4 e1 = new Exercise4();
        Exercise4_AbstractFinalInner eAbs1 = e1.new Exercise4_AbstractFinalInner();
        eAbs1.show();
        
    }
    class Exercise4_AbstractFinalInner {
        void show () {
            System.out.println("abstract inner ");
        }
    }
}

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("cat meow");
    }
}
final class MathUtil {
    public int square (int num) {
        return num * num;
    }
}