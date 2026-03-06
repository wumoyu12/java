public class DisplayMenu {
    private String category;
    private String[] itemNames;
    private double[] itemPrices;

    public DisplayMenu(String category, String[] itemNames, double[] itemPrices) {
        this.category = category;
        this.itemNames = itemNames;
        this.itemPrices = itemPrices;
    }

    public String getCategory() {
        return category;
    }

    public int getSize() {
        return itemNames.length;
    }

    public String getItemName(int index) {
        return itemNames[index];
    }

    public double getItemPrice(int index) {
        return itemPrices[index];
    }

    public void showMenu() {
        System.out.println("\n--- " + category + " Menu ---");
        System.out.printf("%-5s %-22s %8s\n", "ID", "Item", "Price");
        System.out.println("----------------------------------------");

        for (int i = 0; i < itemNames.length; i++) { // FOR loop (not enhanced)
            System.out.printf("%-5d %-22s $%7.2f\n", (i + 1), itemNames[i], itemPrices[i]);
        }
        System.out.println("----------------------------------------");
    }
}








import java.util.ArrayList;

public class OrderMenu {
    private ArrayList<String> cartNames;
    private ArrayList<Double> cartPrices;
    private ArrayList<Integer> cartQty;

    public OrderMenu() {
        cartNames = new ArrayList<String>();
        cartPrices = new ArrayList<Double>();
        cartQty = new ArrayList<Integer>();
    }

    public boolean isEmpty() {
        return cartNames.size() == 0;
    }

    public int getCartSize() {
        return cartNames.size();
    }

    public String getNameAt(int index) {
        return cartNames.get(index);
    }

    public double getPriceAt(int index) {
        return cartPrices.get(index);
    }

    public int getQtyAt(int index) {
        return cartQty.get(index);
    }

    public void addItem(String name, double price, int qty) {
        if (qty <= 0) { // conditional
            System.out.println("Quantity must be at least 1. Item not added.");
            return;
        }

        // If item already exists in cart, just increase quantity
        int existingIndex = findItemIndex(name, price);
        if (existingIndex != -1) {
            int newQty = cartQty.get(existingIndex) + qty;
            cartQty.set(existingIndex, newQty);
        } else {
            cartNames.add(name);
            cartPrices.add(price);
            cartQty.add(qty);
        }

        System.out.println(qty + " x " + name + " added to cart.");
    }

    public void removeItem(int cartNumber) {
        int index = cartNumber - 1;

        if (index < 0 || index >= cartNames.size()) { // if-else
            System.out.println("Invalid cart item number.");
        } else {
            String removed = cartNames.get(index);
            cartNames.remove(index);
            cartPrices.remove(index);
            cartQty.remove(index);
            System.out.println(removed + " removed from cart.");
        }
    }

    public void printCart() {
        if (isEmpty()) {
            System.out.println("\nYour cart is empty.");
            return;
        }

        System.out.println("\n--- Your Cart ---");
        System.out.printf("%-5s %-22s %-6s %10s\n", "No.", "Item", "Qty", "Line Total");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cartNames.size(); i++) { // FOR loop (not enhanced)
            double lineTotal = cartPrices.get(i) * cartQty.get(i);
            System.out.printf("%-5d %-22s %-6d $%9.2f\n",
                    (i + 1), cartNames.get(i), cartQty.get(i), lineTotal);
        }
        System.out.println("--------------------------------------------------");
    }

    private int findItemIndex(String name, double price) {
        for (int i = 0; i < cartNames.size(); i++) { // FOR loop
            if (cartNames.get(i).equals(name) && cartPrices.get(i).doubleValue() == price) {
                return i;
            }
        }
        return -1;
    }
}





public class Reciept {
    private double taxRate;

    public Reciept(double taxRate) {
        this.taxRate = taxRate;
    }

    public double calculateSubtotal(OrderMenu order) {
        double subtotal = 0.0;

        for (int i = 0; i < order.getCartSize(); i++) { // FOR loop (not enhanced)
            subtotal = subtotal + (order.getPriceAt(i) * order.getQtyAt(i));
        }

        return subtotal;
    }

    public double calculateTax(double subtotal) {
        return subtotal * taxRate;
    }

    public double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public void printFinalReceipt(OrderMenu order) {
        if (order.isEmpty()) {
            System.out.println("\nNo items ordered. Receipt not available.");
            return;
        }

        System.out.println("\n=========== FINAL RECEIPT ===========");
        System.out.printf("%-22s %-6s %10s\n", "Item", "Qty", "Line Total");
        System.out.println("-------------------------------------");

        for (int i = 0; i < order.getCartSize(); i++) {
            double lineTotal = order.getPriceAt(i) * order.getQtyAt(i);
            System.out.printf("%-22s %-6d $%9.2f\n",
                    order.getNameAt(i), order.getQtyAt(i), lineTotal);
        }

        System.out.println("-------------------------------------");

        double subtotal = calculateSubtotal(order);
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);

        System.out.printf("%-20s $%9.2f\n", "Subtotal:", subtotal);
        System.out.printf("%-20s $%9.2f\n", "Tax:", tax);
        System.out.printf("%-20s $%9.2f\n", "Total:", total);
        System.out.println("=====================================");
        System.out.println("Thank you! Come again!");
    }
}














import java.util.Scanner;

public class MainRestaurant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Arrays for menu items (Requirement: Arrays)
        String[] breakfastNames = {"Pancakes", "Egg Sandwich", "Oatmeal", "Coffee"};
        double[] breakfastPrices = {7.99, 6.49, 4.25, 2.50};

        String[] lunchNames = {"Cheeseburger", "Chicken Salad", "Fries", "Soda"};
        double[] lunchPrices = {10.99, 9.25, 3.75, 2.25};

        String[] dinnerNames = {"Steak", "Salmon", "Pasta", "Iced Tea"};
        double[] dinnerPrices = {19.99, 17.50, 14.25, 2.75};

        // DisplayMenu objects (Requirement: Constructors and Classes)
        DisplayMenu breakfastMenu = new DisplayMenu("Breakfast", breakfastNames, breakfastPrices);
        DisplayMenu lunchMenu = new DisplayMenu("Lunch", lunchNames, lunchPrices);
        DisplayMenu dinnerMenu = new DisplayMenu("Dinner", dinnerNames, dinnerPrices);

        // Order/cart handler
        OrderMenu order = new OrderMenu();

        // Receipt calculator (8.875% NYC-ish sales tax example)
        Reciept reciept = new Reciept(0.08875);

        boolean running = true;

        while (running) { // WHILE loop requirement
            System.out.println("\n=== Welcome to MainRestaurant ===");
            System.out.println("1) Browse Breakfast");
            System.out.println("2) Browse Lunch");
            System.out.println("3) Browse Dinner");
            System.out.println("4) View Cart");
            System.out.println("5) Remove Item From Cart");
            System.out.println("6) Checkout (Print Receipt)");
            System.out.println("7) Exit");
            System.out.print("Choose an option: ");

            int choice = readInt(input);

            if (choice == 1) {
                handleCategory(input, breakfastMenu, order);
            } else if (choice == 2) {
                handleCategory(input, lunchMenu, order);
            } else if (choice == 3) {
                handleCategory(input, dinnerMenu, order);
            } else if (choice == 4) {
                order.printCart();
            } else if (choice == 5) {
                order.printCart();
                if (!order.isEmpty()) {
                    System.out.print("Enter the cart item number to remove: ");
                    int removeNum = readInt(input);
                    order.removeItem(removeNum);
                }
            } else if (choice == 6) {
                reciept.printFinalReceipt(order);
                running = false; // end after checkout
            } else if (choice == 7) {
                System.out.println("Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        input.close();
    }

    private static void handleCategory(Scanner input, DisplayMenu menu, OrderMenu order) {
        menu.showMenu();

        System.out.print("Enter item ID to add (0 to go back): ");
        int itemId = readInt(input);

        if (itemId == 0) {
            return;
        }

        int index = itemId - 1;

        if (index < 0 || index >= menu.getSize()) {
            System.out.println("Invalid item ID.");
            return;
        }

        System.out.print("Enter quantity: ");
        int qty = readInt(input);

        String name = menu.getItemName(index);
        double price = menu.getItemPrice(index);
        order.addItem(name, price, qty);
    }

    // Helper method: safely reads integers (still uses if/else + while)
    private static int readInt(Scanner input) {
        while (!input.hasNextInt()) {
            input.next(); // throw away invalid token
            System.out.print("Please enter a valid integer: ");
        }
        return input.nextInt();
    }
}
