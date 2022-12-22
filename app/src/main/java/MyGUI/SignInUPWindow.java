package MyGUI;

import java.awt.CardLayout;

public class SignInUPWindow extends javax.swing.JFrame {

    GUIColors colors = null;
    private static SignInUPWindow signInUPWindow = null;

    private SignInUPWindow(GUIColors cls) {
        colors = cls;
        initComponents();
    }

    public static SignInUPWindow getSignInUPWindow(GUIColors cls) {
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

        SignInPanel = new javax.swing.JPanel();
        SILogoLabel = new javax.swing.JLabel();
        SIPhoneNumberLabel = new javax.swing.JLabel();
        SIPhoneNumberField = new javax.swing.JTextField();
        SIPhoneELabel1 = new javax.swing.JLabel();
        SIPasswordLabel = new javax.swing.JLabel();
        SIPasswordField = new javax.swing.JPasswordField();
        SISignInBtn = new javax.swing.JButton();
        SISignUpBtn = new javax.swing.JButton();
        SIPasswordELabel = new javax.swing.JLabel();
        SIPasswordELabel1 = new javax.swing.JLabel();
        SignUpPanel = new javax.swing.JPanel();
        SULogoLabel = new javax.swing.JLabel();
        SUPhoneNumberLabel = new javax.swing.JLabel();
        SUPhoneNumberField = new javax.swing.JTextField();
        SUPhoneNumberELabel = new javax.swing.JLabel();
        SUConfirmPhoneNumberLabel = new javax.swing.JLabel();
        SUConfirmPhoneNumberField = new javax.swing.JTextField();
        SUConfirmPhoneNumberELabel = new javax.swing.JLabel();
        SUPasswordLabel = new javax.swing.JLabel();
        SUPasswordELabel = new javax.swing.JLabel();
        SUPasswordField = new javax.swing.JPasswordField();
        SUConfirmPasswordLabel = new javax.swing.JLabel();
        SUConfirmPasswordField2 = new javax.swing.JPasswordField();
        SUFirstNameLabel = new javax.swing.JLabel();
        SUFirstNameField = new javax.swing.JTextField();
        SULastNameLabel = new javax.swing.JLabel();
        SULastNameField = new javax.swing.JTextField();
        SUSignUpBtn = new javax.swing.JButton();
        SUSignInBtn = new javax.swing.JButton();
        SUConfirmPasswordELabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(970, 732));
        setMinimumSize(new java.awt.Dimension(970, 732));
        setPreferredSize(new java.awt.Dimension(970, 732));
        getContentPane().setLayout(new java.awt.CardLayout());

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

        SIPhoneELabel1.setBackground(colors.getMainColor());
        SIPhoneELabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SIPhoneELabel1.setForeground(new java.awt.Color(255, 0, 0));
        SIPhoneELabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SIPhoneELabel1.setText("Error");
        SIPhoneELabel1.setMaximumSize(new java.awt.Dimension(300, 30));
        SIPhoneELabel1.setMinimumSize(new java.awt.Dimension(300, 30));
        SIPhoneELabel1.setPreferredSize(new java.awt.Dimension(300, 30));
        SignInPanel.add(SIPhoneELabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

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

        SIPasswordELabel.setBackground(colors.getMainColor());
        SIPasswordELabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SIPasswordELabel.setForeground(new java.awt.Color(255, 0, 0));
        SIPasswordELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SIPasswordELabel.setText("Error");
        SIPasswordELabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SIPasswordELabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SIPasswordELabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignInPanel.add(SIPasswordELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        SIPasswordELabel1.setBackground(colors.getMainColor());
        SIPasswordELabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SIPasswordELabel1.setForeground(new java.awt.Color(255, 0, 0));
        SIPasswordELabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SIPasswordELabel1.setText("Error");
        SIPasswordELabel1.setMaximumSize(new java.awt.Dimension(300, 30));
        SIPasswordELabel1.setMinimumSize(new java.awt.Dimension(300, 30));
        SIPasswordELabel1.setPreferredSize(new java.awt.Dimension(300, 30));
        SignInPanel.add(SIPasswordELabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        getContentPane().add(SignInPanel, "card2");

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

        SUPhoneNumberELabel.setBackground(colors.getMainColor());
        SUPhoneNumberELabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SUPhoneNumberELabel.setForeground(new java.awt.Color(255, 0, 0));
        SUPhoneNumberELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SUPhoneNumberELabel.setText("Error");
        SUPhoneNumberELabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberELabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberELabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUPhoneNumberELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 370, -1, -1));

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

        SUConfirmPhoneNumberELabel.setBackground(colors.getMainColor());
        SUConfirmPhoneNumberELabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SUConfirmPhoneNumberELabel.setForeground(new java.awt.Color(255, 0, 0));
        SUConfirmPhoneNumberELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SUConfirmPhoneNumberELabel.setText("Error");
        SUConfirmPhoneNumberELabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUConfirmPhoneNumberELabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUConfirmPhoneNumberELabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUConfirmPhoneNumberELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 370, -1, -1));

        SUPasswordLabel.setBackground(colors.getMainColor());
        SUPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUPasswordLabel.setForeground(colors.getMainFontColor());
        SUPasswordLabel.setText("Password");
        SUPasswordLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPasswordLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPasswordLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        SUPasswordELabel.setBackground(colors.getMainColor());
        SUPasswordELabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SUPasswordELabel.setForeground(new java.awt.Color(255, 0, 0));
        SUPasswordELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SUPasswordELabel.setText("Error");
        SUPasswordELabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPasswordELabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPasswordELabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUPasswordELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 470, -1, -1));

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
        SignUpPanel.add(SUSignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 595, -1, -1));

        SUSignInBtn.setBackground(colors.getSmallTouchesColor());
        SUSignInBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUSignInBtn.setForeground(colors.getButtonsFontColor());
        SUSignInBtn.setText("Sign in");
        SUSignInBtn.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        SUSignInBtn.setMaximumSize(new java.awt.Dimension(300, 35));
        SUSignInBtn.setMinimumSize(new java.awt.Dimension(300, 35));
        SUSignInBtn.setPreferredSize(new java.awt.Dimension(300, 35));
        SignUpPanel.add(SUSignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 645, -1, -1));

        SUConfirmPasswordELabel.setBackground(colors.getMainColor());
        SUConfirmPasswordELabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SUConfirmPasswordELabel.setForeground(new java.awt.Color(255, 0, 0));
        SUConfirmPasswordELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SUConfirmPasswordELabel.setText("Error");
        SUConfirmPasswordELabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUConfirmPasswordELabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUConfirmPasswordELabel.setPreferredSize(new java.awt.Dimension(300, 30));
        SignUpPanel.add(SUConfirmPasswordELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 470, -1, -1));

        getContentPane().add(SignUpPanel, "card3");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void toggleSISU() {
        ((CardLayout) this.getContentPane().getLayout()).next(this.getContentPane());
    }
    public void showError(javax.swing.JLabel errorlbl, String text){
        errorlbl.setText(text);
    }
    public void removeError(javax.swing.JLabel errorlbl){
        errorlbl.setVisible(false);
    }
    public void removeAllErrors(){
        removeError(SIPhoneELabel1);
        removeError(SIPasswordELabel);
        removeError(SUPhoneNumberELabel);
        removeError(SUConfirmPhoneNumberELabel);
        removeError(SUPasswordELabel);
        removeError(SUConfirmPasswordELabel);
    }
    /**
     * @return the SILogoLabel
     */
    public javax.swing.JLabel getSILogoLabel() {
        return SILogoLabel;
    }

    /**
     * @return the SIPasswordELabel
     */
    public javax.swing.JLabel getSIPasswordELabel() {
        return SIPasswordELabel;
    }

    /**
     * @return the SIPasswordField
     */
    public javax.swing.JPasswordField getSIPasswordField() {
        return SIPasswordField;
    }

    /**
     * @return the SIPasswordLabel
     */
    public javax.swing.JLabel getSIPasswordLabel() {
        return SIPasswordLabel;
    }

    /**
     * @return the SIPhoneELabel1
     */
    public javax.swing.JLabel getSIPhoneELabel1() {
        return SIPhoneELabel1;
    }

    /**
     * @return the SIPhoneNumberField
     */
    public javax.swing.JTextField getSIPhoneNumberField() {
        return SIPhoneNumberField;
    }

    /**
     * @return the SIPhoneNumberLabel
     */
    public javax.swing.JLabel getSIPhoneNumberLabel() {
        return SIPhoneNumberLabel;
    }

    /**
     * @return the SISignInBtn
     */
    public javax.swing.JButton getSISignInBtn() {
        return SISignInBtn;
    }

    /**
     * @return the SISignUpBtn
     */
    public javax.swing.JButton getSISignUpBtn() {
        return SISignUpBtn;
    }

    /**
     * @return the SUConfirmPasswordELabel
     */
    public javax.swing.JLabel getSUConfirmPasswordELabel() {
        return SUConfirmPasswordELabel;
    }

    /**
     * @return the SUConfirmPasswordField2
     */
    public javax.swing.JPasswordField getSUConfirmPasswordField2() {
        return SUConfirmPasswordField2;
    }

    /**
     * @return the SUConfirmPasswordLabel
     */
    public javax.swing.JLabel getSUConfirmPasswordLabel() {
        return SUConfirmPasswordLabel;
    }

    /**
     * @return the SUConfirmPhoneNumberELabel
     */
    public javax.swing.JLabel getSUConfirmPhoneNumberELabel() {
        return SUConfirmPhoneNumberELabel;
    }

    /**
     * @return the SUConfirmPhoneNumberField
     */
    public javax.swing.JTextField getSUConfirmPhoneNumberField() {
        return SUConfirmPhoneNumberField;
    }

    /**
     * @return the SUConfirmPhoneNumberLabel
     */
    public javax.swing.JLabel getSUConfirmPhoneNumberLabel() {
        return SUConfirmPhoneNumberLabel;
    }

    /**
     * @return the SUFirstNameField
     */
    public javax.swing.JTextField getSUFirstNameField() {
        return SUFirstNameField;
    }

    /**
     * @return the SUFirstNameLabel
     */
    public javax.swing.JLabel getSUFirstNameLabel() {
        return SUFirstNameLabel;
    }

    /**
     * @return the SULastNameField
     */
    public javax.swing.JTextField getSULastNameField() {
        return SULastNameField;
    }

    /**
     * @return the SULastNameLabel
     */
    public javax.swing.JLabel getSULastNameLabel() {
        return SULastNameLabel;
    }

    /**
     * @return the SULogoLabel
     */
    public javax.swing.JLabel getSULogoLabel() {
        return SULogoLabel;
    }

    /**
     * @return the SUPasswordELabel
     */
    public javax.swing.JLabel getSUPasswordELabel() {
        return SUPasswordELabel;
    }

    /**
     * @return the SUPasswordField
     */
    public javax.swing.JPasswordField getSUPasswordField() {
        return SUPasswordField;
    }

    /**
     * @return the SUPasswordLabel
     */
    public javax.swing.JLabel getSUPasswordLabel() {
        return SUPasswordLabel;
    }

    /**
     * @return the SUPhoneNumberELabel
     */
    public javax.swing.JLabel getSUPhoneNumberELabel() {
        return SUPhoneNumberELabel;
    }

    /**
     * @return the SUPhoneNumberField
     */
    public javax.swing.JTextField getSUPhoneNumberField() {
        return SUPhoneNumberField;
    }

    /**
     * @return the SUPhoneNumberLabel
     */
    public javax.swing.JLabel getSUPhoneNumberLabel() {
        return SUPhoneNumberLabel;
    }

    /**
     * @return the SUSignInBtn
     */
    public javax.swing.JButton getSUSignInBtn() {
        return SUSignInBtn;
    }

    /**
     * @return the SUSignUpBtn
     */
    public javax.swing.JButton getSUSignUpBtn() {
        return SUSignUpBtn;
    }

    /**
     * @return the SignInPanel
     */
    public javax.swing.JPanel getSignInPanel() {
        return SignInPanel;
    }

    /**
     * @return the SignUpPanel
     */
    public javax.swing.JPanel getSignUpPanel() {
        return SignUpPanel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SILogoLabel;
    private javax.swing.JLabel SIPasswordELabel;
    private javax.swing.JLabel SIPasswordELabel1;
    private javax.swing.JPasswordField SIPasswordField;
    private javax.swing.JLabel SIPasswordLabel;
    private javax.swing.JLabel SIPhoneELabel1;
    private javax.swing.JTextField SIPhoneNumberField;
    private javax.swing.JLabel SIPhoneNumberLabel;
    private javax.swing.JButton SISignInBtn;
    private javax.swing.JButton SISignUpBtn;
    private javax.swing.JLabel SUConfirmPasswordELabel;
    private javax.swing.JPasswordField SUConfirmPasswordField2;
    private javax.swing.JLabel SUConfirmPasswordLabel;
    private javax.swing.JLabel SUConfirmPhoneNumberELabel;
    private javax.swing.JTextField SUConfirmPhoneNumberField;
    private javax.swing.JLabel SUConfirmPhoneNumberLabel;
    private javax.swing.JTextField SUFirstNameField;
    private javax.swing.JLabel SUFirstNameLabel;
    private javax.swing.JTextField SULastNameField;
    private javax.swing.JLabel SULastNameLabel;
    private javax.swing.JLabel SULogoLabel;
    private javax.swing.JLabel SUPasswordELabel;
    private javax.swing.JPasswordField SUPasswordField;
    private javax.swing.JLabel SUPasswordLabel;
    private javax.swing.JLabel SUPhoneNumberELabel;
    private javax.swing.JTextField SUPhoneNumberField;
    private javax.swing.JLabel SUPhoneNumberLabel;
    private javax.swing.JButton SUSignInBtn;
    private javax.swing.JButton SUSignUpBtn;
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JPanel SignUpPanel;
    // End of variables declaration//GEN-END:variables
}
