public enum RejectReason {

    StangeClient("Странный клиент"),
    NonPayingClient("Клиент не платит"),
    FuglyClient("Клиент нам не нравится"),
    Undefined("Не определён");

    private String reason;

    private RejectReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return reason;
    }

    public static RejectReason getReasonByName(String rejectReason) {
        for (RejectReason reason : RejectReason.values()) {
            if (reason.toString().equals(rejectReason)) {
                return reason;
            }
        }
        return Undefined;
    }
}