import java.util.Date;

public class Client {
    private String clientName;
    private Date rejectDate;
    private RejectReason rejectReason;

    public Client(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        if (clientName == null) {
            clientName = "";
        }
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getRejectDate() {
        if (rejectDate == null) {
            rejectDate = new Date();
        }
        return rejectDate;
    }

    public void setRejectDate(Date rejectDate) {
        this.rejectDate = rejectDate;
    }

    public RejectReason getRejectReason() {
        if (rejectReason == null) {
            setRejectReason(RejectReason.Undefined);
        }
        return rejectReason;
    }

    public void setRejectReason(RejectReason rejectReason) {
        this.rejectReason = rejectReason;
    }
}