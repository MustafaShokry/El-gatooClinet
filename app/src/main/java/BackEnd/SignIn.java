package BackEnd;

import java.sql.ResultSet;
// Class for Signing in

public class SignIn extends Logging {

    // No Objects are allowed to be created outside the class
    private SignIn() {
    }

    // A factory function used for Signing in a user using a phoneNumber
    public static Object createUser(String phoneNumber, String password) {
        // If the user is created before return it
        if (user != null) {
            return user;
        }
        // Opening new connection session and selecting users table
        current = Database.startConnection(false);
        Database.setResult("SELECT * FROM `users`");
        // If connection failed return null
        if (current == null || Database.getResult() == null) {
            return null;
        }
        ResultSet result = Database.getResult();
        System.out.println(result);
        try {
            // looping over the users table
            while (result.next()) {
                // if the phone number matches the one entered then it is the current user, return it
                if (result.getString(3).equals(phoneNumber) && result.getString(6).equals(password)) {
                    //If the user is already logged in on onther device, return code -1
                    if (result.getInt(5) == 1) {
                        System.out.println("Second condition");
                        return -1;
                    }
                    int id = result.getInt(1);
                    String name = result.getString(2);
                    String PhoneNumber = result.getString(3);
                    String Contacts = result.getString(4);
                    String pass = result.getString(6);
                    user = new User(name, Contacts, id, PhoneNumber, pass);
                    Database.startConnection(false);
                    Database.setResult("SELECT * FROM `users` WHERE `UserId` = " + id);
                    ResultSet cur = Database.getResult();
                    cur.next();
                    cur.updateInt(5, 1);
                    cur.updateRow();
                    return user;
                }
            }
        } catch (Exception e) {
            // if creating failed, return null
            System.out.println(e);
            return null;
        }
        // if no such user, return code -2
        return -2;
    }
}
