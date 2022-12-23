package MyLogic;

import BackEnd.Database;
import BackEnd.MessageIndentifier;
import BackEnd.User;
import MyGUI.ChatContactPanel;
import MyGUI.ChatMessagePanel;
import MyGUI.GUIColors;
import MyGUI.MainChattingWindow;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class MainWindowLogic {

    private static MainWindowLogic mainWindowLogic = null;
    private static MainChattingWindow mainWindowGUI = null;
    private static GUIColors colors = null;
    private static MainLogic mainLogic = null;
    private static User user = null;
    private int activeContactId = -200;
    private int newActiveContactId = -100;
    private String activeContactName;
    HashMap<Integer, String> contactsList = new HashMap<Integer, String>();
    Vector<MessageIndentifier> oldvms = new Vector<MessageIndentifier>();

    private MainWindowLogic(GUIColors cls, MainLogic ml, User usr) {
        colors = cls;
        mainLogic = ml;
        user = usr;
        //contactsList.put(1, "Akshay");
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
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (activeContactId == -200) {
                    return;
                }
                mainWindowGUI.getOtherUserStateLabel().setText(Database.getContactState(activeContactId) == 1 ? "Online" : "Offline");
                AutoLoader(activeContactId);
            }
        };
        timer.schedule(task, 2000, 3000);
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
        mainWindowGUI.getChatsPanel().removeAll();
        if (user.getContacts().length() == 0) {

            return;
        }
        HashMap<Integer, String> newcontactsList = user.contactsNames();

        if (!contactsList.equals(newcontactsList)) {
            contactsList = (HashMap<Integer, String>) newcontactsList.clone();
            Iterator<Entry<Integer, String>> new_Iterator;
            new_Iterator = contactsList.entrySet().iterator();
            while (new_Iterator.hasNext()) {
                Map.Entry<Integer, String> new_Map = (Map.Entry<Integer, String>) new_Iterator.next();
                renderContact(new_Map.getValue(), new_Map.getKey());
                System.out.println(new_Map.getValue() + " " + new_Map.getValue() + "     From load contacts");
            }
        }

    }

    public void renderMessage(String text, boolean thisUser) {
        ChatMessagePanel cmp = new ChatMessagePanel(colors, text, thisUser);
        mainWindowGUI.getChatMessagesPanel().add(cmp, thisUser ? "wrap, al right" : "wrap, al left");
        //mainWindowGUI.reSizeAfterMessage(mainWindowGUI.getChatMessagesPanel().getHeight() + cmp.getMessageHeight());
        mainWindowGUI.getChatMessagesPanel().repaint();
        mainWindowGUI.getChatMessagesPanel().revalidate();
    }

    public void AutoLoader(int contactId) {
        Vector<MessageIndentifier> vms = Database.loadContact(user.getId(), contactId);
        if (vms != null) {
            if (newActiveContactId != activeContactId) {
                mainWindowGUI.getChatMessagesPanel().removeAll();
                mainWindowGUI.getChatMessagesPanel().setSize(600, 535);
                newActiveContactId = activeContactId;
            }

            if (oldvms.size() != vms.size()) {
                mainWindowGUI.getChatMessagesPanel().removeAll();
                mainWindowGUI.getChatMessagesPanel().setSize(600, 535);
                for (Integer i = 0; i < vms.size(); i++) {
                    renderMessage(vms.get(i).getMessage(), vms.get(i).isSent());
                    System.out.println(oldvms);
                    System.out.println(vms);
                    oldvms = vms;
                }
            }

        }

    }

    public void loadMessages(int contactId) {
        Vector<MessageIndentifier> vms = Database.loadContact(user.getId(), contactId);
        if (vms != null) {
            mainWindowGUI.getChatMessagesPanel().removeAll();
            mainWindowGUI.getChatMessagesPanel().setSize(600, 535);
            for (Integer i = 0; i < vms.size(); i++) {
                renderMessage(vms.get(i).getMessage(), vms.get(i).isSent());
                System.out.println(oldvms);
                System.out.println(vms);
                oldvms = vms;
            }

        }

    }

    public void testing() {

    }

    public void addLiseners() {

        //sendinig messages
        mainWindowGUI.getChatSendIconLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (activeContactId == -200) {
                    return;
                }
                String messageTxt = mainWindowGUI.getChatSendTextField().getText();
                if ("".equals(messageTxt)) {
                    return;
                }
                user.sendMessage(activeContactId, messageTxt);
                renderMessage(messageTxt, true);
                mainWindowGUI.getChatSendTextField().setText("");
            }
        });

        //on Closnig the window change the staste in the database
        mainWindowGUI.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                Database.startConnection(false);
                Database.setResult("SELECT * FROM `users`");
                Database.insertAndUpdateUsers(user.getId(), null, null, null, null, 0);
            }
        });

        //User profile
        mainWindowGUI.getUserProfileIconLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainWindowGUI.getUserProfileName().setText(user.getName());
                mainWindowGUI.getUserProfilePhone().setText(user.getPhoneNumber());
                mainWindowGUI.getUserProfilePassword().setText(user.getPassword());
                mainWindowGUI.getUserProfileDialog().show();
            }
        });

        //Contact profile
        mainWindowGUI.getOtherUserInfoIconLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainWindowGUI.getContactInfoName().setText(activeContactName);
                mainWindowGUI.getContactInfoPhone().setText(Database.getContactPhone(activeContactId));
                mainWindowGUI.getContactInfoDialog().show();
                mainWindowGUI.getContactInfoDeleteBtn()
                        .addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                user.deleteContact(activeContactId);
                                loadContacts();
                                mainWindowGUI.getContactInfoDialog().dispose();
                            }
                        });

            }
        });

        //Adding contact
        mainWindowGUI.getAddContactIconLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainWindowGUI.removeError(mainWindowGUI.getAddContactELabel());
                mainWindowGUI.getAddContactDialog().show();
            }
        });
        mainWindowGUI.getAddContactBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String contactPhone = mainWindowGUI.getAddContactFied().getText();
                if (!Validator.getValidator().isPhoneValid(contactPhone)) {
                    mainWindowGUI.showError(mainWindowGUI.getAddContactELabel(), "Invalid Phone number");
                    mainWindowGUI.getAddContactFied().setText("");
                    return;
                }
                if (contactPhone.equals(user.getPhoneNumber())) {
                    mainWindowGUI.showError(mainWindowGUI.getAddContactELabel(), "هتكلم نفسك يا ابن الهبله ؟!!");
                    mainWindowGUI.getAddContactFied().setText("");
                    return;
                }
                int contactID = Database.getContactId(contactPhone);
                if (contactID == -1) {
                    mainWindowGUI.showError(mainWindowGUI.getAddContactELabel(), "Phone number doesn't exist");
                    mainWindowGUI.getAddContactFied().setText("");
                    return;
                }
                user.addContacts(Integer.toString(contactID));
                loadContacts();
                mainWindowGUI.getAddContactFied().setText("");
                mainWindowGUI.getAddContactDialog().dispose();
            }
        });

    }

    public void addListenerToContact(ChatContactPanel ccp) {
        ccp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                activeContactId = ccp.getContactId();
                activeContactName = ccp.getContactName();
                mainWindowGUI.getOtherUserNameLabel().setText(activeContactName);
                mainWindowGUI.getOtherUserStateLabel().setText(Database.getContactState(activeContactId) == 1 ? "Online" : "Offline");
                loadMessages(ccp.getContactId());
            }

        });
    }

}
