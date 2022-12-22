package MyGUI;


public class SignInUPWindow extends javax.swing.JFrame {
    
    GUIColors colors = null;
    private static SignInUPWindow signInUPWindow = null;
    
     private SignInUPWindow(GUIColors cls) {
         colors = cls;
        initComponents();
    }

    public static SignInUPWindow getsignInUPWindow(GUIColors cls) {
        if (signInUPWindow == null) {
            synchronized (SignInUPWindow.class) {
                if (signInUPWindow == null) {
                    signInUPWindow = new SignInUPWindow(cls);
                }
            }
        }
        return signInUPWindow;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignUpPanel = new javax.swing.JPanel();
        SULogoLabel = new javax.swing.JLabel();
        SUPhoneNumberLabel = new javax.swing.JLabel();
        SUPhoneNumberField = new javax.swing.JTextField();
        SUConfirmPhoneNumberLabel = new javax.swing.JLabel();
        SUConfirmPhoneNumberField = new javax.swing.JTextField();
        SUPasswordLabel = new javax.swing.JLabel();
        SUPasswordField = new javax.swing.JPasswordField();
        SUConfirmPasswordLabel = new javax.swing.JLabel();
        SUConfirmPasswordField2 = new javax.swing.JPasswordField();
        SUFirstNameLabel = new javax.swing.JLabel();
        SUFirstNameField = new javax.swing.JTextField();
        SULastNameLabel = new javax.swing.JLabel();
        SULastNameField = new javax.swing.JTextField();
        SUSignUpBtn = new javax.swing.JButton();
        SUSignInBtn = new javax.swing.JButton();
        SignInPanel = new javax.swing.JPanel();
        SILogoLabel = new javax.swing.JLabel();
        SIPhoneNumberLabel = new javax.swing.JLabel();
        SIPhoneNumberField = new javax.swing.JTextField();
        SIPasswordLabel = new javax.swing.JLabel();
        SIPasswordField = new javax.swing.JPasswordField();
        SISignInBtn = new javax.swing.JButton();
        SISignUpBtn = new javax.swing.JButton();

        SignUpPanel.setBackground(colors.getMainColor());
        SignUpPanel.setMaximumSize(new java.awt.Dimension(970, 732));
        SignUpPanel.setMinimumSize(new java.awt.Dimension(970, 732));
        SignUpPanel.setPreferredSize(new java.awt.Dimension(970, 732));
        SignUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SULogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SILogo.png"))); // NOI18N
        SignUpPanel.add(SULogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 0, -1, -1));

        SUPhoneNumberLabel.setBackground(colors.getMainColor());
        SUPhoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUPhoneNumberLabel.setForeground(colors.getMainFontColor());
        SUPhoneNumberLabel.setText("Phone number");
        SUPhoneNumberLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUPhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        SUPhoneNumberField.setBackground(colors.getMainColor());
        SUPhoneNumberField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUPhoneNumberField.setForeground(colors.getMainFontColor());
        SUPhoneNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SUPhoneNumberField.setMaximumSize(new java.awt.Dimension(300, 40));
        SUPhoneNumberField.setMinimumSize(new java.awt.Dimension(300, 40));
        SUPhoneNumberField.setPreferredSize(new java.awt.Dimension(300, 40));
        SignUpPanel.add(SUPhoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        SUConfirmPhoneNumberLabel.setBackground(colors.getMainColor());
        SUConfirmPhoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUConfirmPhoneNumberLabel.setForeground(colors.getMainFontColor());
        SUConfirmPhoneNumberLabel.setText("Confirm phone number");
        SUConfirmPhoneNumberLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUConfirmPhoneNumberLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUConfirmPhoneNumberLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUConfirmPhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        SUConfirmPhoneNumberField.setBackground(colors.getMainColor());
        SUConfirmPhoneNumberField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUConfirmPhoneNumberField.setForeground(colors.getMainFontColor());
        SUConfirmPhoneNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SUConfirmPhoneNumberField.setMaximumSize(new java.awt.Dimension(300, 40));
        SUConfirmPhoneNumberField.setMinimumSize(new java.awt.Dimension(300, 40));
        SUConfirmPhoneNumberField.setPreferredSize(new java.awt.Dimension(300, 40));
        SignUpPanel.add(SUConfirmPhoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        SUPasswordLabel.setBackground(colors.getMainColor());
        SUPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUPasswordLabel.setForeground(colors.getMainFontColor());
        SUPasswordLabel.setText("Password");
        SUPasswordLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPasswordLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPasswordLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        SUPasswordField.setBackground(colors.getMainColor());
        SUPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUPasswordField.setForeground(colors.getMainFontColor());
        SUPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SUPasswordField.setMaximumSize(new java.awt.Dimension(300, 40));
        SUPasswordField.setMinimumSize(new java.awt.Dimension(300, 40));
        SUPasswordField.setPreferredSize(new java.awt.Dimension(300, 40));
        SignUpPanel.add(SUPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        SUConfirmPasswordLabel.setBackground(colors.getMainColor());
        SUConfirmPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUConfirmPasswordLabel.setForeground(colors.getMainFontColor());
        SUConfirmPasswordLabel.setText("Confirm password");
        SUConfirmPasswordLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUConfirmPasswordLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUConfirmPasswordLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUConfirmPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        SUConfirmPasswordField2.setBackground(colors.getMainColor());
        SUConfirmPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUConfirmPasswordField2.setForeground(colors.getMainFontColor());
        SUConfirmPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SUConfirmPasswordField2.setMaximumSize(new java.awt.Dimension(300, 40));
        SUConfirmPasswordField2.setMinimumSize(new java.awt.Dimension(300, 40));
        SUConfirmPasswordField2.setPreferredSize(new java.awt.Dimension(300, 40));
        SignUpPanel.add(SUConfirmPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        SUFirstNameLabel.setBackground(colors.getMainColor());
        SUFirstNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUFirstNameLabel.setForeground(colors.getMainFontColor());
        SUFirstNameLabel.setText("First Name");
        SUFirstNameLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUFirstNameLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUFirstNameLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUFirstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        SUFirstNameField.setBackground(colors.getMainColor());
        SUFirstNameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUFirstNameField.setForeground(colors.getMainFontColor());
        SUFirstNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SUFirstNameField.setMaximumSize(new java.awt.Dimension(300, 40));
        SUFirstNameField.setMinimumSize(new java.awt.Dimension(300, 40));
        SUFirstNameField.setPreferredSize(new java.awt.Dimension(300, 40));
        SignUpPanel.add(SUFirstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, -1, -1));

        SULastNameLabel.setBackground(colors.getMainColor());
        SULastNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SULastNameLabel.setForeground(colors.getMainFontColor());
        SULastNameLabel.setText("Last Name");
        SULastNameLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SULastNameLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SULastNameLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SULastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        SULastNameField.setBackground(colors.getMainColor());
        SULastNameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SULastNameField.setForeground(colors.getMainFontColor());
        SULastNameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SULastNameField.setMaximumSize(new java.awt.Dimension(300, 40));
        SULastNameField.setMinimumSize(new java.awt.Dimension(300, 40));
        SULastNameField.setPreferredSize(new java.awt.Dimension(300, 40));
        SignUpPanel.add(SULastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        SUSignUpBtn.setBackground(colors.getSmallTouchesColor());
        SUSignUpBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUSignUpBtn.setForeground(colors.getButtonsFontColor());
        SUSignUpBtn.setText("Sign up");
        SUSignUpBtn.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        SUSignUpBtn.setMaximumSize(new java.awt.Dimension(300, 35));
        SUSignUpBtn.setMinimumSize(new java.awt.Dimension(300, 35));
        SUSignUpBtn.setPreferredSize(new java.awt.Dimension(300, 35));
        SignUpPanel.add(SUSignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

        SUSignInBtn.setBackground(colors.getSmallTouchesColor());
        SUSignInBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUSignInBtn.setForeground(colors.getButtonsFontColor());
        SUSignInBtn.setText("Sign in");
        SUSignInBtn.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        SUSignInBtn.setMaximumSize(new java.awt.Dimension(300, 35));
        SUSignInBtn.setMinimumSize(new java.awt.Dimension(300, 35));
        SUSignInBtn.setPreferredSize(new java.awt.Dimension(300, 35));
        SignUpPanel.add(SUSignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 675, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(970, 732));
        setMinimumSize(new java.awt.Dimension(970, 732));
        setPreferredSize(new java.awt.Dimension(970, 732));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        SignInPanel.setBackground(colors.getMainColor());
        SignInPanel.setMaximumSize(new java.awt.Dimension(970, 732));
        SignInPanel.setMinimumSize(new java.awt.Dimension(970, 732));
        SignInPanel.setPreferredSize(new java.awt.Dimension(970, 732));
        SignInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SILogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SILogo.png"))); // NOI18N
        SignInPanel.add(SILogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 0, -1, -1));

        SIPhoneNumberLabel.setBackground(colors.getMainColor());
        SIPhoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SIPhoneNumberLabel.setForeground(colors.getMainFontColor());
        SIPhoneNumberLabel.setText("Phone number");
        SIPhoneNumberLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SIPhoneNumberLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SIPhoneNumberLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignInPanel.add(SIPhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 300, -1, -1));

        SIPhoneNumberField.setBackground(colors.getMainColor());
        SIPhoneNumberField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SIPhoneNumberField.setForeground(colors.getMainFontColor());
        SIPhoneNumberField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SIPhoneNumberField.setMaximumSize(new java.awt.Dimension(300, 40));
        SIPhoneNumberField.setMinimumSize(new java.awt.Dimension(300, 40));
        SIPhoneNumberField.setPreferredSize(new java.awt.Dimension(300, 40));
        SignInPanel.add(SIPhoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 330, -1, -1));

        SIPasswordLabel.setBackground(colors.getMainColor());
        SIPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SIPasswordLabel.setForeground(colors.getMainFontColor());
        SIPasswordLabel.setText("Password");
        SIPasswordLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SIPasswordLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SIPasswordLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignInPanel.add(SIPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 400, -1, -1));

        SIPasswordField.setBackground(colors.getMainColor());
        SIPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SIPasswordField.setForeground(colors.getMainFontColor());
        SIPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SIPasswordField.setMaximumSize(new java.awt.Dimension(300, 40));
        SIPasswordField.setMinimumSize(new java.awt.Dimension(300, 40));
        SIPasswordField.setPreferredSize(new java.awt.Dimension(300, 40));
        SignInPanel.add(SIPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 430, -1, -1));

        SISignInBtn.setBackground(colors.getSmallTouchesColor());
        SISignInBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SISignInBtn.setForeground(colors.getButtonsFontColor());
        SISignInBtn.setText("Sign in");
        SISignInBtn.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        SISignInBtn.setMaximumSize(new java.awt.Dimension(125, 35));
        SISignInBtn.setMinimumSize(new java.awt.Dimension(125, 35));
        SISignInBtn.setPreferredSize(new java.awt.Dimension(125, 35));
        SignInPanel.add(SISignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 530, -1, -1));

        SISignUpBtn.setBackground(colors.getSmallTouchesColor());
        SISignUpBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SISignUpBtn.setForeground(colors.getButtonsFontColor());
        SISignUpBtn.setText("Sign up");
        SISignUpBtn.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        SISignUpBtn.setMaximumSize(new java.awt.Dimension(125, 35));
        SISignUpBtn.setMinimumSize(new java.awt.Dimension(125, 35));
        SISignUpBtn.setPreferredSize(new java.awt.Dimension(125, 35));
        SignInPanel.add(SISignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 530, -1, -1));

        getContentPane().add(SignInPanel, new java.awt.GridBagConstraints());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SILogoLabel;
    private javax.swing.JPasswordField SIPasswordField;
    private javax.swing.JLabel SIPasswordLabel;
    private javax.swing.JTextField SIPhoneNumberField;
    private javax.swing.JLabel SIPhoneNumberLabel;
    private javax.swing.JButton SISignInBtn;
    private javax.swing.JButton SISignUpBtn;
    private javax.swing.JPasswordField SUConfirmPasswordField2;
    private javax.swing.JLabel SUConfirmPasswordLabel;
    private javax.swing.JTextField SUConfirmPhoneNumberField;
    private javax.swing.JLabel SUConfirmPhoneNumberLabel;
    private javax.swing.JTextField SUFirstNameField;
    private javax.swing.JLabel SUFirstNameLabel;
    private javax.swing.JTextField SULastNameField;
    private javax.swing.JLabel SULastNameLabel;
    private javax.swing.JLabel SULogoLabel;
    private javax.swing.JPasswordField SUPasswordField;
    private javax.swing.JLabel SUPasswordLabel;
    private javax.swing.JTextField SUPhoneNumberField;
    private javax.swing.JLabel SUPhoneNumberLabel;
    private javax.swing.JButton SUSignInBtn;
    private javax.swing.JButton SUSignUpBtn;
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JPanel SignUpPanel;
    // End of variables declaration//GEN-END:variables
}
