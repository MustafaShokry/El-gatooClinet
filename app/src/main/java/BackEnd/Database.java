package BackEnd;
import com.mysql.cj.conf.ConnectionUrlParser;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Vector;

// Database driver class
public class Database implements IDatabaseInfo {
    // Interface that provides a connection session with a database
    private static Connection road;
    // Interface that holds the result of executing query on a database
    private static ResultSet result;
    // Interface responsible for handling and executing queries
    private static Statement handler;
    // A function that starts new connection - readOnly specifies whether the database will be updated or not
    public static Connection startConnection(boolean readOnly){
        try {
            // Opening new connection
            road = DriverManager.getConnection(url,user,password);
            // state is a variable holds the number representing update or readonly constants
            int state = (readOnly)?ResultSet.CONCUR_READ_ONLY:ResultSet.CONCUR_UPDATABLE;
            // creating a statement that with the specified state
            handler = road.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,state);
        }catch (Exception e){
            // If connection failed, it returns null
            return null;
        }
        return road;
    }
    // A function that ends connection session
    public static boolean endConnection(){
        try {
            // Closing current connection, statement, and resultset
            road.close();
            handler.close();
            result.close();
        }catch (Exception e){
            // if closing failed, it returns false
            return false;
        }
        return true;
    }
    // Getter for Resultset
    public static ResultSet getResult(){
        return result;
    }
    // Setter for Resultset: accepts a query to be implemented as an argument
    public static boolean setResult(String query){
        try {
            // Executing the query on database in saving the result in result
            result = handler.executeQuery(query);
        } catch (SQLException e) {
            // operation failed, return false
            return false;
        }
        return true;
    }
    // A function used for loading messages from all contacts - accepts id of current user and its contacts
   /* public static boolean load(int id, String contacts){
        try {
            // Selecting the users table and saving it in users
            setResult("SELECT * FROM `users`");
            ResultSet users = getResult();
            // Making a map between every contact and its id
            HashMap<Integer,String> contactName = new HashMap<Integer,String>();
            // looping over users table
            while (users.next()){
                // getting the current row id
                int current = users.getInt(1);
                // if it is the current user of one of its contacts, add it to the map
                if (contacts.contains(Integer.toString(current)) || current==id){
                    contactName.put(current,users.getString(2));
                }
            }
            // A statement for new query
            Statement tmp = road.createStatement();
            // Selecting the message from private chat table that are received or sent by the user and storing it in privateChat Resultset
            ResultSet privateChat = tmp.executeQuery("SELECT * FROM `private chat` WHERE `FromId`= "+id+" OR `ToId` = "+id+"");
            // looping over messages
            while (privateChat.next()){
                // Getting and printing the sender, receiver, and the message
                String from = contactName.get(privateChat.getInt(2));
                String to = contactName.get(privateChat.getInt(3));
                String msg = privateChat.getString(5);
                Timestamp date = privateChat.getTimestamp(4);
                System.out.println(from+" "+to+" "+msg+" "+date);
            }

        }catch (Exception e){
            // If loading failed, it returns false
            return false;
        }
        return true;
    }*/
    // A function that generates id for users and messages
    public static Integer idGenerator(){
        try {
            // result now points to position before the first row
            result.beforeFirst();
            // if the result contains rows, get the last id and return the next one
            if (result.next()){
                result.last();
                //System.out.println(result.getInt(1)+1);
                return result.getInt(1)+1;

            }
            // else, it is the first one so returns one
            else {
                return 1;
            }
        } catch (Exception e) {
            // if an error occurred in generating return null
            return null;
        }

    }
    // A function used for inserting a complete row or update a specific field in users table
    public static boolean insertAndUpdateUsers(int id, String name, String password, String phoneNumber, String contacts, int state){
        try {
            // Moving the result pointer to the position before the first row
            result.beforeFirst();
            //updating: if some field is null, so we don't specify a complete row. We only specify some fields to be updated
            if (name==null || phoneNumber==null || contacts == null || password==null){
                // looping till finding the needed row
                while (result.next()){
                    // if it is the right, update the required values
                    if (result.getInt(1)==id){
                        if (name!=null)result.updateString(2,name);
                        if (phoneNumber!=null)result.updateString(3,phoneNumber);
                        if (contacts!=null)result.updateString(4,contacts);
                        if (password!=null)result.updateString(6,password);
                        if (state == 0)result.updateInt(5,0);
                        result.updateRow();
                        break;
                    }
                }
            }
            //inserting: move to insert a new row with the required parameters
            else {
                result.moveToInsertRow();
                result.updateInt(1,id);
                result.updateString(2,name);
                result.updateString(3,phoneNumber);
                result.updateString(4,contacts);
                result.updateInt(5, 1);
                result.updateString(6,password);
                result.insertRow();
            }
        } catch (Exception e) {
            // if the function doesn't work, return false
            return false;
        }
        return true;
    }
    // A function used for sending messages from specific user to another with specified time
    public static boolean sendMessages(int fromId, int ToId, int msgId, LocalDateTime dt, String msg){
        try {
            // Moving to insert new row in the messages table
            result.moveToInsertRow();
            result.updateInt(1,msgId);
            result.updateInt(2,fromId);
            result.updateInt(3,ToId);
            result.updateTimestamp(4,Timestamp.valueOf(dt));
            result.updateString(5,msg);
            result.insertRow();
        } catch (SQLException e) {
            // if the function doesn't work, returns false
            return false;
        }
        return true;
    }
    public static Vector<MessageIndentifier> loadContact(int id, int contactId){
        setResult("SELECT * FROM `private chat` WHERE (`FromId`= "+id+" OR `ToId` = "+id+") AND ( `ToId` = "+contactId+" OR `FromId` = "+contactId+")");
        Vector<MessageIndentifier> messages = new Vector<MessageIndentifier>();
            try {
                while (result.next()){
                    int fromId = result.getInt(2);
                    boolean sent = (fromId==id);
                    String message = result.getString(5);
                    Timestamp time = result.getTimestamp(4);
                    messages.add(new MessageIndentifier(message,sent,time));
                }
                return messages;
            } catch (SQLException e) {
                return null;
            }
    }
    public static int getContactState(int contactId){
        setResult("SELECT * FROM `users`");
            try {
                result.beforeFirst();
                while (result.next()){
                    if (result.getInt(1)==contactId){return result.getInt(5);}
                }
            } catch (SQLException e) {
                return -2;
            }
            return -1;
    }
     public static int getContactId(String phone){
        setResult("SELECT * FROM `users`");
            try {
                result.beforeFirst();
                while (result.next()){
                    if (result.getString(3).equals(phone)){return result.getInt(1);}
                }
            } catch (SQLException e) {
                return -2;
            }
            return -1;
    }
     public static String getContactPhone(int contactId){
        setResult("SELECT * FROM `users`");
            try {
                result.beforeFirst();
                while (result.next()){
                    if (result.getInt(1)==contactId){return result.getString(3);}
                }
            } catch (SQLException e) {
                return null;
            }
            return null;
    }
}
