import java.util.Date;

public class Reservation {
    @SuppressWarnings("unused")
    private String reservationId;
    @SuppressWarnings("unused")
    private String customerId;
    @SuppressWarnings("unused")
    private Date date;
    @SuppressWarnings("unused")
    private String time;

    public Reservation(String reservationId, String customerId, Date date, String time) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.date = date;
        this.time = time;
    }
}
