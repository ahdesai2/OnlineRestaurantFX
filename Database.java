import java.util.List;

public class Database {
    @SuppressWarnings("unused")
    private Menu currentMenu;
    @SuppressWarnings("unused")
    private List<Customer> customers;

    public Database(Menu currentMenu, List<Customer> customers) {
        this.currentMenu = currentMenu;
        this.customers = customers;
    }

    public void returnSlots() {
        System.out.println("Returning available slots from Database...");
    }

    public void confirmUpdate() {
        System.out.println("Reservation update confirmed by Database.");
    }
}
