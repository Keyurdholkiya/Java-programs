import java.util.ArrayList;
import java.util.Scanner;

class InventoryItem {
     int itemID;
    String itemName;
     int quantityInStock;
     double pricePerUnit;

    public InventoryItem(int itemID, String itemName, int quantityInStock, double pricePerUnit) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantityInStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class InventoryManagementSystem {
    public static void main(String[] args) {
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Update Quantity");
            System.out.println("3. Display Item Details");
            System.out.println("4. List All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Item
                    System.out.print("Enter item ID: ");
                    int itemID = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter quantity in stock: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price per unit: ");
                    double price = scanner.nextDouble();

                    InventoryItem newItem = new InventoryItem(itemID, itemName, quantity, price);
                    inventory.add(newItem);
                    System.out.println("Item added to inventory.");
                    break;
            }
        }
    }
}
