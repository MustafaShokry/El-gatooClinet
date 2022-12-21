package MyLogic;

import MyGUI.GUIColors;
import MyGUI.MainChattingWindow;
import javax.swing.UIManager;

public class MainLogic {

    private static MainLogic mainLogic = null;
    private static GUIColors colors = null;
    private static MainChattingWindow mainWindow = null;

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

    public void changeMode() {
        colors.changeMode();
        mainWindow.updateUIColors();
    }

    public void TBR() {
        try {
            UIManager.setLookAndFeel(colors.getMode() ? new com.formdev.flatlaf.FlatDarkLaf() : new com.formdev.flatlaf.FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //Getting the mainWindow object for the main window GUI and passing the color schema to it
        mainWindow = MainChattingWindow.getMainWindow(colors);
        //Passing the mainWindow GUI for logic handler for main chatting window
        MainWindowLogic mainWindowLogic = MainWindowLogic.getMainWindowLogic(mainWindow, mainLogic, colors);
        //Setting up the Logic for main chating window
        mainWindowLogic.setupLogic();

        mainWindowLogic.testing();
        //Showing the GUI
        mainWindowLogic.start();
    }

}
