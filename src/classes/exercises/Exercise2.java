package classes.exercises;

/**
 * Exercise 2: Constructors
 * -------------------------
 * TODO:
 * 1. Create a class `Person` with fields: name, age.
 * 2. Write a default constructor (assign default values).
 * 3. Write a parameterized constructor.
 * 4. Create objects using both constructors and display results.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Create Person objects using both constructors
        Person p1 = new Person();
        Person p2 = new Person("Vinh", 24);
        p1.display();
        p2.display();

    }
}

class Person {
    String name;
    int age;

    Person() 
    {
        name = "Kien";
        age = 31;
    }
    Person( String newName,int newAge)
    {
        name = newName;
        age = newAge;
    }
    void display () {
        System.out.println("name : " + name + " age : " + age);
    }
}