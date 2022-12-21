package MyLogic;

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

    public void setupLogic() {
        
    }

    public void start() {
        mainWindowGUI.setVisible(true);
    }

    public void testing() {
        mainWindowGUI.getChatMessagesPanel().setLayout(new net.miginfocom.swing.MigLayout("fillx"));
        mainWindowGUI.getChatSendIconLabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                ChatMessagePanel cmp = new ChatMessagePanel("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa", new java.awt.Color(0xBBA0CA), new Color(0, 0, 0));
                mainWindowGUI.getChatMessagesPanel().add(cmp, "wrap, al left");
                mainWindowGUI.reSizeAfterMessage(cmp.getMessageHeight());
                mainWindowGUI.getChatMessagesPanel().repaint();
                mainWindowGUI.getChatMessagesPanel().revalidate();

                ChatMessagePanel cmp2 = new ChatMessagePanel("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa", new Color(0x89B6A5), new Color(0, 0, 0));
                mainWindowGUI.getChatMessagesPanel().add(cmp2, "wrap, al right");
                mainWindowGUI.reSizeAfterMessage(cmp2.getMessageHeight());
                mainWindowGUI.getChatMessagesPanel().repaint();
                mainWindowGUI.getChatMessagesPanel().revalidate();

                ChatMessagePanel cmp3 = new ChatMessagePanel("hellow", new Color(0x89B6A5), new Color(0, 0, 0));
                mainWindowGUI.reSizeAfterMessage(cmp3.getMessageHeight());
                mainWindowGUI.getChatMessagesPanel().add(cmp3, "wrap, al right");

                mainWindowGUI.getChatMessagesPanel().repaint();
                mainWindowGUI.getChatMessagesPanel().revalidate();
                mainLogic.changeMode();
            }

        });
    }

}

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
