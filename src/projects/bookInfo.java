package projects;

public class bookInfo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("title zz","kien",1994);
        b2.author = "qsdq";
        b1.printDetails();
        b2.printDetails();
    }
}

class Book {
    String title, author;
    int year;

    Book (){
    }

    Book (String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("title : " + title + "\nauthor : " + author + "\nyear : " + year);
    }
}