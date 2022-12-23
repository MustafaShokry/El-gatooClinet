package MyLogic;

import BackEnd.User;
import MyGUI.GUIColors;
import MyGUI.MainChattingWindow;
import javax.swing.UIManager;

public class MainLogic {

    private static MainLogic mainLogic = null;
    private static GUIColors colors = null;
    private static MainChattingWindow mainWindow = null;
    private static SignInUpLogic signInUpLogic = null;

    private MainLogic() {
        colors = GUIColors.getColors(true);
    }

    public static MainLogic getMainLogic() {
        if (mainLogic == null) {
            synchronized (MainLogic.class) {
                if (mainLogic == null) {
                    mainLogic = new MainLogic();
                }
            }
        }
        return mainLogic;
    }

    public void startApp() {
        try {
            UIManager.setLookAndFeel(colors.getMode() ? new com.formdev.flatlaf.FlatDarkLaf() : new com.formdev.flatlaf.FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        signInUpLogic = SignInUpLogic.getSignInUpLogic(colors, mainLogic);
        signInUpLogic.start();
        //Testing design
//        MainWindowLogic mainWindowLogic = MainWindowLogic.getMainWindowLogic(colors, mainLogic, null);
//        mainWindowLogic.start();
    }

    public void SignUserIn(User user) {
        MainWindowLogic mainWindowLogic = MainWindowLogic.getMainWindowLogic(colors, mainLogic, user);
        mainWindowLogic.start();
    }

    //Changing the mode still requires some modifications
    public void changeMode() {
        colors.changeMode();
        try {
            UIManager.setLookAndFeel(colors.getMode() ? new com.formdev.flatlaf.FlatDarkLaf() : new com.formdev.flatlaf.FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //mainWindow.updateUIColors();
    }

}
