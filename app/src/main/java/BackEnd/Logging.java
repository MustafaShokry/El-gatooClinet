package BackEnd;
import java.sql.Connection;
// Class contains the shared components between sign in and sing up
abstract public class Logging {
    // Connection opened when logging
    static Connection current;
    // The current application user
    static User user;
    // A function that checks whether the user created or not
    public static boolean userCreated() {
        return user!=null;
    }
}
