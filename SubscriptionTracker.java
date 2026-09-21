public class SubscriptionTracker {
    public static void main(String[] args) {
        double monthlyFee = 15.00;
        int totalMonths = 6;
        double cumulativeTotal = 0;

        System.out.println("Month | Monthly Fee | Total Paid So Far");
        System.out.println("---------------------------------------");

        // Logic: Use a loop to calculate and display the rolling total
        for (int month = 1; month <= totalMonths; month++) {
            cumulativeTotal += monthlyFee;
            System.out.printf("  %d   |    $%.2f   |    $%.2f\n", month, monthlyFee, cumulativeTotal);
        }
    }
}
