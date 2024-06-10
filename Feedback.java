public class Feedback {
    @SuppressWarnings("unused")
    private String feedbackId;
    @SuppressWarnings("unused")
    private String orderId;
    @SuppressWarnings("unused")
    private String customerId;
    @SuppressWarnings("unused")
    private String comments;

    public Feedback(String feedbackId, String orderId, String customerId, String comments) {
        this.feedbackId = feedbackId;
        this.orderId = orderId;
        this.customerId = customerId;
        this.comments = comments;
    }
}
