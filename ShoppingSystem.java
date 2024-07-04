package miniprojecttwo;
import java.util.*;


public class ShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> shoppingList = new ArrayList<>();

        System.out.println("Welcome to DeMart Shopping System!");

        while (true) {
            System.out.print("Enter product name (or 'done' to finish shopping): ");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter price per unit: ");
            double price = scanner.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            scanner.nextLine(); // Consume newline left by nextInt()

            shoppingList.add(new Product(productName, price, quantity));
        }

        System.out.println("\nYour Shopping List:");
        double totalCost = 0.0;
        for (Product product : shoppingList) {
            double productCost = product.calculateTotalCost();
            totalCost += productCost;
            System.out.println(product.getName() + " - Price: " + product.getPrice() +
                    " /- || Quantity: " + product.getQuantity() + " - Cost: " + productCost+"/-");
        }

        System.out.println("\nTotal Cost: " + totalCost+"/-");

        scanner.close();
    }
}