package El.gatoo;


import MyLogic.MainLogic;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainLogic mainLogic = MainLogic.getMainLogic();
                mainLogic.startApp();
            }
        });
    }
}
