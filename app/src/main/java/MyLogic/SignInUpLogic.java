package MyLogic;

import MyGUI.GUIColors;
import MyGUI.SignInUPWindow;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignInUpLogic {

    private static SignInUpLogic signInUpLogic = null;
    private static SignInUPWindow signInUPWindow = null;
    private static GUIColors colors = null;
    private static MainLogic mainLogic = null;
    
    private SignInUpLogic(GUIColors cls, MainLogic ml) {
        colors = cls;
        mainLogic = ml;
    }

    public static SignInUpLogic getSignInUpLogic(GUIColors cls, MainLogic ml) {
        if (signInUpLogic == null) {
            synchronized (SignInUpLogic.class) {
                if (signInUpLogic == null) {
                    signInUpLogic = new SignInUpLogic(cls, ml);
                }
            }
        }
        return signInUpLogic;
    }
    
    public void setup(){
        signInUPWindow = signInUPWindow.getSignInUPWindow(colors);
        
//        signInUPWindow.getButton().addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                signIn(0);
//            }
//        });
    }
    public void start(){
        setup();
        signInUPWindow.setVisible(true);
       
        //signInUPWindow.getControlerPane().moveToFront(signInUPWindow.getSignUpPanel());
    }
    public void end(){
        signInUPWindow.dispose();
    }
    public void signIn(int id){
        end();
        mainLogic.SignUserIn(id);
    }
}
