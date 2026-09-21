class Time {
    int seconds;

    Time(int seconds) {
        this.seconds = seconds;
    }

    Time(int minutes, int seconds) {
        this.seconds = minutes * 60 + seconds;
    }

    Time(int hours, int minutes, int seconds) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    void display() {
        System.out.println("Total seconds: " + seconds);
        System.out.println("Total minutes: " + (seconds / 60.0));
        System.out.println("Total hours: " + (seconds / 3600.0));
    }
}

public class TimeConstructorDemo {
    public static void main(String[] args) {
        Time t1 = new Time(90);
        Time t2 = new Time(2, 30);
        Time t3 = new Time(1, 20, 30);

        System.out.println("Constructor 1:");
        t1.display();

        System.out.println("\nConstructor 2:");
        t2.display();

        System.out.println("\nConstructor 3:");
        t3.display();
    }
}
