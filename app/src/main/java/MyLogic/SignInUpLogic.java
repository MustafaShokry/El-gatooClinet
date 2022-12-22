package MyLogic;

import MyGUI.GUIColors;
import MyGUI.SignInUPWindow;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void setup() {
        signInUPWindow = SignInUPWindow.getSignInUPWindow(colors);
        addListeners();
        signInUPWindow.removeAllErrors();
    }

    public void start() {
        setup();
        signInUPWindow.setVisible(true);
    }

    public void end() {
        signInUPWindow.dispose();
    }

    public void signInHandler() {
        signInUPWindow.removeAllErrors();
        
        String phone = signInUPWindow.getSIPhoneNumberField().getText();
        String pass = signInUPWindow.getSIPasswordField().getText();

//        Object response = MagicFunction(phone, pass);
//        
//        if (response instanceof User) {
//            mainLogic.SignUserIn(User.getid());
//            end();
//        } else if (response instanceof Integer) {
//            switch (response) {
//                case val:
//                    signInUPWindow.showError(signInUPWindow.getSIPhoneELabel1(), "Wrong Phone Number");
//                    break;
//                case val:
//                    signInUPWindow.showError(signInUPWindow.getSIPasswordELabel(), "Wrong Password");
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        } else {
//            signInUPWindow.showError(signInUPWindow.getSIPhoneELabel1(), "Database Error");
//        }
    }

    public void signUphandler() {
        signInUPWindow.removeAllErrors();
        
        String phone = signInUPWindow.getSUPhoneNumberField().getText();
        String cPhone = signInUPWindow.getSUConfirmPhoneNumberField().getText();
        String pass = signInUPWindow.getSUPasswordField().getText();
        String cPass= signInUPWindow.getSUConfirmPasswordField2().getText();
        String fName = signInUPWindow.getSUFirstNameField().getText();
        String lName = signInUPWindow.getSULastNameField().getText();
        
        signInUPWindow.showError(signInUPWindow.getSUPhoneNumberELabel(), "Invalid Phone number");
        signInUPWindow.showError(signInUPWindow.getSUConfirmPhoneNumberELabel(), "Phone numbers do not match");
        signInUPWindow.showError(signInUPWindow.getSUConfirmPasswordELabel(), "Passwords do not match");
        signInUPWindow.showError(signInUPWindow.getSIPasswordELabel(), "Wrong Password");
        signInUPWindow.showError(signInUPWindow.getSIPasswordELabel(), "Wrong Password");
        
    }
    public boolean isValid(String s){
        Pattern p = Pattern.compile("^\\d{11}$");
        Matcher m = p.matcher(s);
        return (m.matches());
    }

    public void addListeners() {

        signInUPWindow.getSISignUpBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                signInUPWindow.toggleSISU();
            }
        });
        signInUPWindow.getSUSignInBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                signInUPWindow.toggleSISU();
            }
        });
        signInUPWindow.getSISignInBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                signInHandler();
            }
        });
        signInUPWindow.getSUSignUpBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                signUphandler();
            }
        });
    }
}
