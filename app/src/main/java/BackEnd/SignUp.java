package BackEnd;
import java.sql.ResultSet;
// Class for Singing up
public class SignUp extends Logging {
    // No Objects are allowed to be created outside the class
    private SignUp(){}
    // A factory function used for Signing up a user using phoneNumber and name
    public static Object createUser(String name, String phoneNumber, String password){
        // if the user created before, returns it
        if (user!=null)return user;
        // Opening new connection session
        current = Database.startConnection(false);
        // If connection failed return null
        if (current == null)return null;
        // Selecting users table
        Database.setResult("SELECT * FROM `users`");
        ResultSet result = Database.getResult();
        try {
            // looping over the table, if the phone is registered before return null as an indication for failure
            while (result.next()){
                if (result.getString(3)==phoneNumber){
                    return -1;
                }
                if (result.getString(6)==password){
                    return -2;
                }
            }
            // If phone is new, generate new id to the user and create it
            int newId = Database.idGenerator();
            Database.endConnection();
            user = new User(name,"",newId,phoneNumber,password);
            // update the users table with new account
            addAccount();
            return user;
        }catch (Exception e){
            // if creation failed, return null
            System.out.println(e);
            return null;
        }
    }
    // A function used to add new account to users table
    private static void addAccount(){
        Database.startConnection(false);
        Database.setResult("SELECT * FROM `users`");
        Database.insertAndUpdateUsers(user.getId(),user.getName(),user.getPassword(),user.getPhoneNumber(),user.getContacts());
        //Database.endConnection();
    }
}
