class Order {
    String itemName;
    double price;
    String status;

    
    public Order(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.status = "Preparing"; // Default starting status
    }

 
    
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
    
    public void printReceipt() {
        System.out.println("Item: " + itemName + " | Price: $" + price + " | Status: " + status);
    }
}

public class DeliveryApp {
    public static void main(String[] args) {
        Order order1 = new Order("Double Cheeseburger", 8.99);
        Order order2 = new Order("Vegan Pizza", 14.50);

        System.out.println("--- Initial Orders Placed ---");
        order1.printReceipt();
        order2.printReceipt();

        // Simulate delivery updates
        System.out.println("\n--- 15 Minutes Later ---");
        order1.updateStatus("Out for Delivery");
        order2.updateStatus("Delivered");

        order1.printReceipt();
        order2.printReceipt();
    }
}

