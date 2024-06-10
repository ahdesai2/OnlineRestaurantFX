import java.util.Scanner;

public class Customer {
    @SuppressWarnings("unused")
    private String name;
    private String username;

    public Customer(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void selectOption(ORRS orrs) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            orrs.presentOptions();
            System.out.print("Please select an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected: Make a Reservation");
                    orrs.confirmDetails();
                    orrs.confirmReservation(this);
                    break;
                case 2:
                    System.out.println("You selected: Place an Order");
                    orrs.confirmDetails();
                    break;
                case 3:
                    System.out.println("You selected: Leave Feedback");
                    orrs.confirmDetails();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 4);
    }

    public void sendConfirmation() {
        System.out.println("Sending reservation confirmation to Customer...");
    }

    public void selectDetails(ORRS orrs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'selectDetails'");
    }
}
