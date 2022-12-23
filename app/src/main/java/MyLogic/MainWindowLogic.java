package MyLogic;

import BackEnd.User;
import MyGUI.ChatContactPanel;
import MyGUI.ChatMessagePanel;
import MyGUI.GUIColors;
import MyGUI.MainChattingWindow;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MainWindowLogic {

    private static MainWindowLogic mainWindowLogic = null;
    private static MainChattingWindow mainWindowGUI = null;
    private static GUIColors colors = null;
    private static MainLogic mainLogic = null;
    private static User user = null;
    private static HashMap<Integer, String> contactsList;

    private MainWindowLogic(GUIColors cls, MainLogic ml, User usr) {
        colors = cls;
        mainLogic = ml;
        user = usr;
    }

    public static MainWindowLogic getMainWindowLogic(GUIColors cls, MainLogic ml, User usr) {
        if (mainWindowLogic == null) {
            synchronized (MainWindowLogic.class) {
                if (mainWindowLogic == null) {
                    mainWindowLogic = new MainWindowLogic(cls, ml, usr);
                }
            }
        }
        return mainWindowLogic;
    }

    public void setup() {
        //Getting the mainWindow object for the main window GUI and passing the color schema to it
        mainWindowGUI = MainChattingWindow.getMainWindow(colors);
        //Setting up Layouts
        mainWindowGUI.getChatMessagesPanel().setLayout(new net.miginfocom.swing.MigLayout("fillx"));
        mainWindowGUI.getChatsPanel().setLayout(new net.miginfocom.swing.MigLayout("fillx"));

        //Loading contacts
        loadContacts();
    }

    public void start() {
        setup();
        testing();
        mainWindowGUI.setVisible(true);

    }

    public void renderContact(String name) {
        ChatContactPanel ccp = new ChatContactPanel(colors, name);
        mainWindowGUI.getChatsPanel().add(ccp, "wrap, al center");
        mainWindowGUI.getChatsPanel().repaint();
        mainWindowGUI.getChatsPanel().revalidate();
    }

    public void loadContacts() {
        if (user.getContacts().length() == 0) {

            return;
        }
        contactsList = user.contactsNames();

        // Iterator
        Iterator<Entry<Integer, String>> new_Iterator = contactsList.entrySet().iterator();

        // Iterating every set of entry in the HashMap
        while (new_Iterator.hasNext()) {
            Map.Entry<Integer, String> new_Map = (Map.Entry<Integer, String>) new_Iterator.next();
            renderContact(new_Map.getValue());

        }

    }

    public void renderMessage(String text, boolean thisUser) {
        ChatMessagePanel cmp = new ChatMessagePanel(colors, text, thisUser);
        mainWindowGUI.getChatMessagesPanel().add(cmp, thisUser ? "wrap, al right" : "wrap, al left");
        mainWindowGUI.reSizeAfterMessage(cmp.getMessageHeight());
        mainWindowGUI.getChatMessagesPanel().repaint();
        mainWindowGUI.getChatMessagesPanel().revalidate();
    }

    public void testing() {

        mainWindowGUI.getChatSendIconLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                renderContact("Mostafa Mohammed");
                renderMessage("Hellow", true);
                renderMessage("hi there", false);
                mainLogic.changeMode();
            }

        });
    }

}

//load contacts from db and put them in an array of contact objects
interface IMessage {

    void renderMessage(javax.swing.JLabel chatPanel);

}

class UserMessage implements IMessage {

    private String messageText;

    UserMessage(String messageText) {
        this.messageText = messageText;
    }

    public void renderMessage(javax.swing.JLabel chatPanel) {
        //TODO
    }
}

class OtheUserMessage implements IMessage {

    private String messageText;

    OtheUserMessage(String messageText) {
        this.messageText = messageText;
    }

    public void renderMessage(javax.swing.JLabel chatPanel) {
        //TODO
    }
}

interface IChat {

    void renderChat(javax.swing.JLabel chatPanel);
}

class OneChat implements IChat {

    private String ID;

    public void renderChat(javax.swing.JLabel chatPanel) {
        chatPanel.setLayout(new net.miginfocom.swing.MigLayout("fillx"));
    }

}

class GroupChat implements IChat {

    private String ID;

    public void renderChat(javax.swing.JLabel chatPanel) {
        chatPanel.setLayout(new net.miginfocom.swing.MigLayout("fillx"));
    }

}
