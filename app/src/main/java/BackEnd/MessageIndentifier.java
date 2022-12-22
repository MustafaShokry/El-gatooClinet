package BackEnd;
import java.sql.Timestamp;

public class MessageIndentifier {
    String message;
    boolean sent;
    Timestamp time;
    MessageIndentifier(String message, boolean sent, Timestamp time){
        this.message = message;
        this.sent = sent;
        this.time = time;
    }
}
