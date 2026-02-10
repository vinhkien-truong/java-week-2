package projects;

public class studentReport {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[5];
        arrStudent[0] = new Student("test",21,71);
        arrStudent[1] = new Student("kien",25,31);
        arrStudent[2] = new Student("truong",13,67);
        arrStudent[3] = new Student("vinh",18,24);
        arrStudent[4] = new Student("Dat",25,90);
        for (Student stud : arrStudent) {
            stud.isPassed();
        }
    }
}

class Student {
    String name;
    int age;
    int mark;
    Student() {

    }

    Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
    public void isPassed() {
        if (this.mark >= 40) {
            System.out.println(this.name + " has passed the test with : "+ this.mark );
        } else {
            System.out.println(this.name + " didn't pass the test with : "+ this.mark );
        }
    }
}