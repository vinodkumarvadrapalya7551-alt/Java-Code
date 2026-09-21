class Student {
    String name;
    int age;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Rahul";
        s1.age = 20;
        s1.marks = 85.5;

        s2.name = "Priya";
        s2.age = 21;
        s2.marks = 91.0;

        s3.name = "Amit";
        s3.age = 19;
        s3.marks = 78.5;

        s1.display();
        s2.display();
        s3.display();
    }
}
