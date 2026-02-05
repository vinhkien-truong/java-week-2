package classes.exercises;

/**
 * Exercise 1: Basic Class
 * ------------------------
 * TODO:
 * 1. Create a class `Book` with fields: title, author.
 * 2. Add a method `displayInfo()` to print book details.
 * 3. Create objects in main() and call the method.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        // TODO: Create Book objects and test methods
        Book b = new Book();
        b.author = "Kien";
        b.title = "Chinese";
        b.displayInfo();
    }
}

class Book
{
    String title;
    String author;

    void displayInfo() 
    {
        System.out.println("title :" + title + "\nauthor : "+ author);
    }
}