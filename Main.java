import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Menu
        List<String> items = new ArrayList<>();
        items.add("Pizza");
        items.add("Burger");
        items.add("Pasta");
        Menu menu = new Menu(items);

        // Initialize Customers
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Alice", "alice123");
        customers.add(customer1);

        // Initialize Database
        Database database = new Database(menu, customers);

        // Initialize ORRS
        ORRS orrs = new ORRS();

        // Simulate User Interaction
        System.out.println("Enter your username:");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        // Find Customer
        Customer currentCustomer = null;
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username)) {
                currentCustomer = customer;
                break;
            }
        }

        if (currentCustomer == null) {
            System.out.println("Customer not found.");
            return;
        }

        // Customer selects option
        currentCustomer.selectOption(orrs);

        // ORRS queries available slots from Database
        orrs.querySlots(database);

        // Customer selects details for reservation
        currentCustomer.selectDetails(orrs);

        // ORRS confirms reservation with Customer
        orrs.confirmReservation(currentCustomer);

        // ORRS updates reservation in Database
        orrs.updateReservation(database);
    }
}
