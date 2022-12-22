package MyLogic;

import MyGUI.ChatContactPanel;
import MyGUI.ChatMessagePanel;
import MyGUI.GUIColors;
import MyGUI.MainChattingWindow;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainWindowLogic {

    private MainChattingWindow mainWindowGUI = null;
    private static MainWindowLogic mainWindowLogic = null;
    private static MainLogic mainLogic = null;
    GUIColors colors = null;

    private MainWindowLogic(MainChattingWindow mw, MainLogic ml, GUIColors cls) {
        mainLogic = ml;
        mainWindowGUI = mw;
        colors = cls;
    }

    public static MainWindowLogic getMainWindowLogic(MainChattingWindow mw, MainLogic ml, GUIColors cls) {
        if (mainWindowLogic == null) {
            synchronized (MainWindowLogic.class) {
                if (mainWindowLogic == null) {
                    mainWindowLogic = new MainWindowLogic(mw, ml, cls);
                }
            }
        }
        return mainWindowLogic;
    }

    public void setup() {
        //Setting up Layouts
        mainWindowGUI.getChatMessagesPanel().setLayout(new net.miginfocom.swing.MigLayout("fillx"));
        mainWindowGUI.getChatsPanel().setLayout(new net.miginfocom.swing.MigLayout("fillx"));
    }

    public void start() {
        mainWindowGUI.setVisible(true);
    }

    public void renderContact(String name) {
        ChatContactPanel ccp = new ChatContactPanel(colors, name);
        mainWindowGUI.getChatsPanel().add(ccp, "wrap, al center");
        mainWindowGUI.getChatsPanel().repaint();
        mainWindowGUI.getChatsPanel().revalidate();
    }

    public void renderMessage(String text, boolean thisUser) {
        ChatMessagePanel cmp = new ChatMessagePanel(colors, text, thisUser);
        mainWindowGUI.getChatMessagesPanel().add(cmp, thisUser ?  "wrap, al right" : "wrap, al left");
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
