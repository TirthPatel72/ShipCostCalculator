import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        double itemPrice = 0.0;
        final double SHIP_Rate = 0.02; // 2% shipping rate
        final double FREE_SHIP_THRESHOLD = 100.00; // Free shipping for orders over $10
        double shipCost = 0.0;
        double totalCost = 0.0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the item price: $");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the newline character from the buffer

            if (itemPrice >= FREE_SHIP_THRESHOLD) {
                shipCost = 0.0;
                totalCost = itemPrice;
            } else {
                shipCost = itemPrice * SHIP_Rate; // Minimum shipping cost
                totalCost = itemPrice + shipCost;
            }

            totalCost = itemPrice + shipCost;

            System.out.printf("Item Price: $%.2f\n", itemPrice);
            System.out.printf("Shipping Cost: $%.2f\n", shipCost);
            System.out.printf("Total Cost: $%.2f\n", totalCost);
        } else {
            trash = in.nextLine();
            System.out.println("Error: Invalid input: " + trash);
            System.out.println("Exiting...Run the program again");
            System.exit(0);

        }

    }

}