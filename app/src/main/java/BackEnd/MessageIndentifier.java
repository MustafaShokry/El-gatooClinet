package BackEnd;
import java.sql.Timestamp;

public class MessageIndentifier {
    private String message;
    private boolean sent;
    private Timestamp time;
    MessageIndentifier(String message, boolean sent, Timestamp time){
        this.message = message;
        this.sent = sent;
        this.time = time;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the sent
     */
    public boolean isSent() {
        return sent;
    }

    /**
     * @return the time
     */
    public Timestamp getTime() {
        return time;
    }
}
