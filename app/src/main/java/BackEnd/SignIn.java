package BackEnd;
import java.sql.ResultSet;
// Class for Signing in
public class SignIn extends Logging {
    // No Objects are allowed to be created outside the class
    private SignIn(){}
    // A factory function used for Signing in a user using a phoneNumber
    public static Object createUser(String phoneNumber, String password){
        // If the user is created before return it
        if (user!=null)return user;
        // Opening new connection session and selecting users table
        current = Database.startConnection(false);
        Database.setResult("SELECT * FROM `users`");
        // If connection failed return null
        if (current == null || Database.getResult() == null){
            //System.out.println("First condition");
            return null;
        }
        ResultSet result = Database.getResult();
        try {
            // looping over the users table
            while (result.next()){
                // if the phone number matches the one entered then it is the current user, return it
                if (result.getString(3)==phoneNumber && result.getString(6)==password){
                    if (result.getInt(5)==1){
                        System.out.println("Second condition");
                        // Already on
                        return -1;
                    }
                    int id = result.getInt(1);
                    String name = result.getString(2);
                    String PhoneNumber = result.getString(3);
                    String Contacts = result.getString(4);
                    String pass = result.getString(6);
                        user = new User(name,Contacts,id,PhoneNumber,pass);
                        Database.startConnection(false);
                        Database.setResult("SELECT * FROM `users` WHERE `UserId` = "+id);
                        ResultSet cur = Database.getResult();
                        System.out.println("AAAAAAAAAAAAAAAa");
                        cur.next();
                        cur.updateInt(5,1);
                        cur.updateRow();
                        return user;
                }
            }
            //if (!Database.endConnection())return null;
        }catch (Exception e){
            // if creating failed, return null
            //System.out.println("Third condition");
            System.out.println(e);
            return null;
        }
        // if no such user, return null
        //System.out.println("Fourth condition");
        return -2;
    }
}
