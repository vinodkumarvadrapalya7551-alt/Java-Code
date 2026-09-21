class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidMarksException extends Exception {
    private String studentName;
    private int marks;

    public InvalidMarksException(String studentName, int marks) {
        super("Marks must be between 0 and 100");
        this.studentName = studentName;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarks() {
        return marks;
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class CustomExceptionsDemo {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    static void checkMarks(String studentName, int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException(studentName, marks);
        }
    }

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
    }

    static void checkSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative");
        }
    }

    static void checkPassword(String password) throws InvalidPasswordException {
        if (password == null || password.length() < 8) {
            throw new InvalidPasswordException(
                "Password must contain at least 8 characters"
            );
        }
    }

    public static void main(String[] args) {
        String studentName = "Rahul";
        int marks = 125;

        try {
            checkMarks(studentName, marks);
            System.out.println("Marks are valid.");
        } catch (InvalidMarksException e) {
            System.out.println("Student: " + e.getStudentName());
            System.out.println("Marks entered: " + e.getMarks());
            System.out.println("Error: " + e.getMessage());
        }
    }
}
