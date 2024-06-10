public class ORRS {
    public void presentOptions() {
        System.out.println("Welcome to the Online Restaurant Reservation System (ORRS)");
        System.out.println("1. Make a Reservation");
        System.out.println("2. Place an Order");
        System.out.println("3. Leave Feedback");
        System.out.println("4. Exit");
    }

    public void confirmDetails() {
        System.out.println("Your details have been confirmed.");
    }

    public void querySlots(Database database) {
        System.out.println("Querying available slots from Database...");
        database.returnSlots();
    }

    public void confirmReservation(Customer customer) {
        System.out.println("Confirming reservation...");
        customer.sendConfirmation();
    }

    public void updateReservation(Database database) {
        System.out.println("Updating reservation in Database...");
        database.confirmUpdate();
    }
}

