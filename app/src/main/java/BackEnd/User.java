package BackEnd;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.HashMap;

// Class for creating operations on user
public class User {
    private String name;
    // Contacts ids are concatenated as one string
    private String contacts = "";
    private int id;
    private String phoneNumber;

    public String getPassword() {
        return password;
    }


    private String password;


    // Constructor
    public User(String name, String contacts, int id, String phoneNumber,String password) {
        this.name = name;
        this.contacts = contacts;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.password = password;
    }
    // Name getter
    public String getName() {
        return name;
    }
    public void setPassword(String password) {
        this.password = password;
        Database.startConnection(false);
        Database.setResult("SELECT * FROM `users`");
        Database.insertAndUpdateUsers(id,name,password,null,null);
    }
    // Name setter: in runtime application and database
    public void setName(String name) {
        this.name = name;
        Database.startConnection(false);
        Database.setResult("SELECT * FROM `users`");
        Database.insertAndUpdateUsers(id,name,null,null,null);
        //Database.endConnection();
    }
    // Contacts getter
    public String getContacts() {
        return contacts;
    }
    // Contacts setter: adds new contact to string contacts in runtime and database
    public void addContacts(String contact) {
        // checks if the contact is new
        if (!contacts.contains(contact)){
            if (contacts.length()==0)
            {this.contacts += contact;}
            else{
                this.contacts+= ('-'+contact);
            }
            // update the contacts in the database
            Database.startConnection(false);
            Database.setResult("SELECT * FROM `users`");
            Database.insertAndUpdateUsers(id,null,null,null,contacts);
            //Database.endConnection();
        }
    }
    // Id getter
    public int getId() {
        return id;
    }
    // Id setter
    public void setId(int id){
        this.id = id;
    }
    // phone number getter
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // phone number setter: in runtime application and database
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        Database.startConnection(false);
        Database.setResult("SELECT * FROM `users`");
        Database.insertAndUpdateUsers(id,null,null,phoneNumber,null);
        //Database.endConnection();
    }
    // A function that sends a message to the specified contact id
    public void sendMessage(int contactId, String msg){
        // if the contact exists, send a message to it and load the messages
        if (contacts.contains(Integer.toString(contactId))){
            Database.startConnection(false);
            Database.setResult("SELECT * FROM `private chat`");
            Database.sendMessages(this.id,contactId,Database.idGenerator(),LocalDateTime.now(),msg);
            String[] arr = contacts.split("-");
            for (String cont: arr) Database.loadContact(this.id,cont);
            //Database.endConnection();
        }else {
            System.out.println("Not sent");
        }
    }
    // A function that deletes a contact from the contacts list by specifying its id
    public void deleteContact(int contactId){
        String Id = Integer.toString(contactId);
        String tmp = "";
        // Checks if the contact in the contacts list
        if (contacts.contains(Id)){
            // Creating the new contacts list after removing the specified one
            int index = contacts.indexOf(Id);
            tmp+= contacts.substring(0,index);
            tmp+= contacts.substring(index+1);
        }
        this.contacts = tmp;
        Database.startConnection(false);
        Database.setResult("SELECT * FROM `users`");
        Database.insertAndUpdateUsers(this.id,null,null,null,contacts);
    }
    public HashMap<Integer,String> contactsNames(){
        HashMap<Integer,String > res = new HashMap<Integer,String>();
        if (contacts.length()!=0){
            Database.startConnection(true);
            Database.setResult("SELECT * FROM `users`");
            ResultSet tmp = Database.getResult();
                try {
                    while (tmp.next()){
                        int curId = tmp.getInt(1);
                        if (contacts.contains(Integer.toString(curId))){
                            res.put(curId,tmp.getString(2));
                        }
                    }
                } catch (SQLException e) {
                    return null;
                }
        }
        return res;
    }
}