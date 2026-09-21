class InvalidMarksException extends Exception {

    String studentName;
    int marks;

    InvalidMarksException(String studentName, int marks) {
        super("Marks must be between 0 and 100");
        this.studentName = studentName;
        this.marks = marks;
    }
}

public class InvalidMarksDemo {

    static void checkMarks(String studentName, int marks)
            throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(studentName, marks);
        }

        System.out.println("Marks are valid.");
    }

    public static void main(String[] args) {

        String studentName = "Rahul";
        int marks = 125;

        try {
            checkMarks(studentName, marks);
        } catch (InvalidMarksException e) {

            System.out.println("Student: " + e.studentName);
            System.out.println("Marks entered: " + e.marks);
            System.out.println("Error: " + e.getMessage());
        }
    }
}
