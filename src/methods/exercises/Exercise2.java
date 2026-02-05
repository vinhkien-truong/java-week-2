package methods.exercises;

/**
 * Exercise 2: Modifiers
 * ----------------------
 * TODO:
 * 1. Create one method with each access modifier:
 *    - public, protected, default, private
 * 2. Create one static method and one final method.
 * 3. Try calling them inside main().
 */

public class Exercise2
{
    public static void main(String[] args)
    {
        Exercise2 obj = new Exercise2();

        // Example usage
        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.privateMethod();
        staticMethod();
        obj.finaltMethod();

        // TODO: Call other methods here
    }
    // Example: public method
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    // TODO: Add protectedMethod()
    protected void protectedMethod() {
        System.out.println("protected method called");
    }

    // TODO: Add defaultMethod()
    void defaultMethod(){
        System.out.println("default method called");
    }

    // TODO: Add privateMethod()
    private void privateMethod(){
        System.out.println("private method called");
    }

    // TODO: Add staticMethod()
    public static void staticMethod(){
        System.out.println("static method called");
    }

    // TODO: Add finalMethod()
    public final void finaltMethod(){
        System.out.println("final method called");
    }
}
