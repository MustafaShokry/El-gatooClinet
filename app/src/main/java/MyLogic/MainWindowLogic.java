package MyLogic;

import BackEnd.Database;
import BackEnd.MessageIndentifier;
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
import java.util.Vector;

public class MainWindowLogic {

    private static MainWindowLogic mainWindowLogic = null;
    private static MainChattingWindow mainWindowGUI = null;
    private static GUIColors colors = null;
    private static MainLogic mainLogic = null;
    private static User user = null;
    private static HashMap<Integer, String> contactsList;
    private int activeContactId;

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
        mainWindowGUI = MainChattingWindow.getMainWindow(colors, user.getName());
        //Setting up Layouts
        mainWindowGUI.getChatMessagesPanel().setLayout(new net.miginfocom.swing.MigLayout("fillx"));
        mainWindowGUI.getChatsPanel().setLayout(new net.miginfocom.swing.MigLayout("fillx"));
        addLiseners();
        //Loading contacts
        loadContacts();
    }

    public void start() {
        setup();
        testing();
        mainWindowGUI.setVisible(true);

    }

    public void renderContact(String name, int contactid) {
        ChatContactPanel ccp = new ChatContactPanel(colors, name, contactid);
        addListenerToContact(ccp);
        mainWindowGUI.getChatsPanel().add(ccp, "wrap, al center");
        mainWindowGUI.getChatsPanel().repaint();
        mainWindowGUI.getChatsPanel().revalidate();
    }

    public void loadContacts() {
        if (user.getContacts().length() == 0) {

            return;
        }
        contactsList = user.contactsNames();

        Iterator<Entry<Integer, String>> new_Iterator = contactsList.entrySet().iterator();
        while (new_Iterator.hasNext()) {
            Map.Entry<Integer, String> new_Map = (Map.Entry<Integer, String>) new_Iterator.next();
            renderContact(new_Map.getValue(), new_Map.getKey());
            System.out.println(new_Map.getValue() + " " + new_Map.getValue() + "     From load contacts");
        }

    }

    public void renderMessage(String text, boolean thisUser) {
        ChatMessagePanel cmp = new ChatMessagePanel(colors, text, thisUser);
        mainWindowGUI.getChatMessagesPanel().add(cmp, thisUser ? "wrap, al right" : "wrap, al left");
        mainWindowGUI.reSizeAfterMessage(mainWindowGUI.getChatMessagesPanel().getHeight() + cmp.getMessageHeight());
        mainWindowGUI.getChatMessagesPanel().repaint();
        mainWindowGUI.getChatMessagesPanel().revalidate();
    }

    public void loadMessages(int contactId) {
        Vector<MessageIndentifier> vms = Database.loadContact(user.getId(), contactId);
        for (Integer i = 0; i < vms.size(); i++) {
            renderMessage(vms.get(i).getMessage(), vms.get(i).isSent());
        }
    }

    public void testing() {

    }

    public void addLiseners() {

        mainWindowGUI.getChatSendIconLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String messageTxt = mainWindowGUI.getChatSendTextField().getText();
                user.sendMessage(activeContactId, messageTxt);
                renderMessage(messageTxt, true);
                mainWindowGUI.getChatSendTextField().setText("");
            }
        });

        mainWindowGUI.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                Database.startConnection(false);
                Database.setResult("SELECT * FROM `users`");
                Database.insertAndUpdateUsers(user.getId(), null, null, null, null, 0);
            }
        });
    }

    public void addListenerToContact(ChatContactPanel ccp) {
        ccp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainWindowGUI.getChatMessagesPanel().removeAll();
                mainWindowGUI.getChatMessagesPanel().setSize(600, 535);
                activeContactId = ccp.getContactId();
                mainWindowGUI.getOtherUserNameLabel().setText(ccp.getContactName());
                loadMessages(ccp.getContactId());
            }

        });
    }

}
