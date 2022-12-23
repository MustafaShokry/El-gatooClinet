package MyGUI;

import java.awt.event.WindowEvent;

public class MainChattingWindow extends javax.swing.JFrame {

    private static MainChattingWindow mainWindow = null;
    private static GUIColors colors = null;
    private static String name;

    private MainChattingWindow(GUIColors colors, String nm) {
        this.colors = colors;
        this.name = nm;
        initComponents();
        setResizable(false);
        
    }

    public static MainChattingWindow getMainWindow(GUIColors colors,  String nm) {
        if (mainWindow == null) {
            synchronized (MainChattingWindow.class) {
                if (mainWindow == null) {
                    mainWindow = new MainChattingWindow(colors, nm);
                }
            }
        }
        return mainWindow;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddContactDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        AddContactBtn = new javax.swing.JButton();
        SUPhoneNumberLabel = new javax.swing.JLabel();
        AddContactFied = new javax.swing.JTextField();
        AddContactELabel = new javax.swing.JLabel();
        ChangePasswordDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        SUSignUpBtn1 = new javax.swing.JButton();
        SUPhoneNumberLabel1 = new javax.swing.JLabel();
        SUPhoneNumberField1 = new javax.swing.JTextField();
        SUPhoneNumberELabel1 = new javax.swing.JLabel();
        UserProfileDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        UserProfileIcon = new javax.swing.JLabel();
        UserProfileName = new javax.swing.JLabel();
        UserProfilePhone = new javax.swing.JLabel();
        UserProfilePassword = new javax.swing.JLabel();
        UserProfileName1 = new javax.swing.JLabel();
        UserProfilePassword1 = new javax.swing.JLabel();
        UserProfilePhone1 = new javax.swing.JLabel();
        ContactInfoDialog = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        ContactInfoDeleteBtn = new javax.swing.JButton();
        UserProfileIcon1 = new javax.swing.JLabel();
        UserProfileName2 = new javax.swing.JLabel();
        ContactInfoName = new javax.swing.JLabel();
        UserProfilePhone2 = new javax.swing.JLabel();
        ContactInfoPhone = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        MainWindowPanel = new javax.swing.JPanel();
        sideBarPanel = new javax.swing.JPanel();
        mainLogoLabel = new javax.swing.JLabel();
        chattingIconPanel = new javax.swing.JPanel();
        chattingIconLabel = new javax.swing.JLabel();
        settingsIconPanel = new javax.swing.JPanel();
        settingsIconLabel = new javax.swing.JLabel();
        userProfileIconPanel = new javax.swing.JPanel();
        userProfileIconLabel = new javax.swing.JLabel();
        addContactIconPanel = new javax.swing.JPanel();
        addContactIconLabel = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chatsPanel = new javax.swing.JPanel();
        chatHeaderPanel = new javax.swing.JPanel();
        otherUserDeafultIconPanel = new javax.swing.JPanel();
        otherUserDeafultIconLabel = new javax.swing.JLabel();
        otherUserNameLabel = new javax.swing.JLabel();
        otherUserStateLabel = new javax.swing.JLabel();
        otherUserInfoIconPanel = new javax.swing.JPanel();
        otherUserInfoIconLabel = new javax.swing.JLabel();
        chatMessagesContainerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatMessagesPanel = new javax.swing.JPanel();
        chatSendPanel = new javax.swing.JPanel();
        chatSendTextField = new javax.swing.JFormattedTextField();
        chatSendIconLabel = new javax.swing.JLabel();

        AddContactDialog.setAlwaysOnTop(true);
        AddContactDialog.setBackground(colors.getMainColor());
        AddContactDialog.setLocation(new java.awt.Point(200, 300));
        AddContactDialog.setMaximumSize(new java.awt.Dimension(400, 220));
        AddContactDialog.setMinimumSize(new java.awt.Dimension(400, 220));
        AddContactDialog.setPreferredSize(new java.awt.Dimension(400, 220));
        AddContactDialog.setResizable(false);
        AddContactDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(colors.getMainColor());
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 220));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 220));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 220));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddContactBtn.setBackground(colors.getSmallTouchesColor());
        AddContactBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddContactBtn.setForeground(colors.getButtonsFontColor());
        AddContactBtn.setText("Add contact");
        AddContactBtn.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        AddContactBtn.setMaximumSize(new java.awt.Dimension(300, 35));
        AddContactBtn.setMinimumSize(new java.awt.Dimension(300, 35));
        AddContactBtn.setPreferredSize(new java.awt.Dimension(300, 35));
        jPanel1.add(AddContactBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        SUPhoneNumberLabel.setBackground(colors.getMainColor());
        SUPhoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUPhoneNumberLabel.setForeground(colors.getMainFontColor());
        SUPhoneNumberLabel.setText("Enter contact's phone number");
        SUPhoneNumberLabel.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberLabel.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberLabel.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(SUPhoneNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        AddContactFied.setBackground(colors.getMainColor());
        AddContactFied.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AddContactFied.setForeground(colors.getMainFontColor());
        AddContactFied.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        AddContactFied.setMaximumSize(new java.awt.Dimension(300, 40));
        AddContactFied.setMinimumSize(new java.awt.Dimension(300, 40));
        AddContactFied.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel1.add(AddContactFied, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        AddContactELabel.setBackground(colors.getMainColor());
        AddContactELabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        AddContactELabel.setForeground(new java.awt.Color(255, 0, 0));
        AddContactELabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        AddContactELabel.setText("Error");
        AddContactELabel.setMaximumSize(new java.awt.Dimension(300, 30));
        AddContactELabel.setMinimumSize(new java.awt.Dimension(300, 30));
        AddContactELabel.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel1.add(AddContactELabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 90, -1, -1));

        AddContactDialog.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ChangePasswordDialog.setAlwaysOnTop(true);
        ChangePasswordDialog.setBackground(colors.getMainColor());
        ChangePasswordDialog.setLocation(new java.awt.Point(200, 300));
        ChangePasswordDialog.setMaximumSize(new java.awt.Dimension(400, 220));
        ChangePasswordDialog.setResizable(false);
        ChangePasswordDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(colors.getMainColor());
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 220));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 220));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 220));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SUSignUpBtn1.setBackground(colors.getSmallTouchesColor());
        SUSignUpBtn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUSignUpBtn1.setForeground(colors.getButtonsFontColor());
        SUSignUpBtn1.setText("Add contact");
        SUSignUpBtn1.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        SUSignUpBtn1.setMaximumSize(new java.awt.Dimension(300, 35));
        SUSignUpBtn1.setMinimumSize(new java.awt.Dimension(300, 35));
        SUSignUpBtn1.setPreferredSize(new java.awt.Dimension(300, 35));
        jPanel2.add(SUSignUpBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        SUPhoneNumberLabel1.setBackground(colors.getMainColor());
        SUPhoneNumberLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        SUPhoneNumberLabel1.setForeground(colors.getMainFontColor());
        SUPhoneNumberLabel1.setText("Enter contact's phone number");
        SUPhoneNumberLabel1.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberLabel1.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberLabel1.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel2.add(SUPhoneNumberLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        SUPhoneNumberField1.setBackground(colors.getMainColor());
        SUPhoneNumberField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SUPhoneNumberField1.setForeground(colors.getMainFontColor());
        SUPhoneNumberField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, colors.getSmallTouchesColor()));
        SUPhoneNumberField1.setMaximumSize(new java.awt.Dimension(300, 40));
        SUPhoneNumberField1.setMinimumSize(new java.awt.Dimension(300, 40));
        SUPhoneNumberField1.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel2.add(SUPhoneNumberField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        SUPhoneNumberELabel1.setBackground(colors.getMainColor());
        SUPhoneNumberELabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SUPhoneNumberELabel1.setForeground(new java.awt.Color(255, 0, 0));
        SUPhoneNumberELabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrong2.png"))); // NOI18N
        SUPhoneNumberELabel1.setText("Error");
        SUPhoneNumberELabel1.setMaximumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberELabel1.setMinimumSize(new java.awt.Dimension(300, 30));
        SUPhoneNumberELabel1.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel2.add(SUPhoneNumberELabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 90, -1, -1));

        ChangePasswordDialog.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        UserProfileDialog.setAlwaysOnTop(true);
        UserProfileDialog.setBackground(colors.getMainColor());
        UserProfileDialog.setLocation(new java.awt.Point(200, 300));
        UserProfileDialog.setMaximumSize(new java.awt.Dimension(550, 220));
        UserProfileDialog.setResizable(false);
        UserProfileDialog.setSize(new java.awt.Dimension(550, 220));
        UserProfileDialog.setType(java.awt.Window.Type.UTILITY);
        UserProfileDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(colors.getMainColor());
        jPanel3.setMaximumSize(new java.awt.Dimension(550, 220));
        jPanel3.setMinimumSize(new java.awt.Dimension(550, 220));
        jPanel3.setPreferredSize(new java.awt.Dimension(550, 220));
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setBackground(colors.getMainColor());
        label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label.setForeground(colors.getMainFontColor());
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Your Information");
        label.setMaximumSize(new java.awt.Dimension(300, 30));
        label.setMinimumSize(new java.awt.Dimension(300, 30));
        label.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel3.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 10, -1, -1));

        UserProfileIcon.setBackground(new java.awt.Color(31, 32, 41));
        UserProfileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/otherUserDeafult.png"))); // NOI18N
        jPanel3.add(UserProfileIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        UserProfileName.setBackground(colors.getMainColor());
        UserProfileName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfileName.setForeground(colors.getMainFontColor());
        UserProfileName.setText("Name");
        UserProfileName.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfileName.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfileName.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(UserProfileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        UserProfilePhone.setBackground(colors.getMainColor());
        UserProfilePhone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfilePhone.setForeground(colors.getMainFontColor());
        UserProfilePhone.setText("Phone number");
        UserProfilePhone.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfilePhone.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfilePhone.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(UserProfilePhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        UserProfilePassword.setBackground(colors.getMainColor());
        UserProfilePassword.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfilePassword.setForeground(colors.getMainFontColor());
        UserProfilePassword.setText("Password");
        UserProfilePassword.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfilePassword.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfilePassword.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(UserProfilePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        UserProfileName1.setBackground(colors.getMainColor());
        UserProfileName1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfileName1.setForeground(colors.getMainFontColor());
        UserProfileName1.setText("Name");
        UserProfileName1.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfileName1.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfileName1.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(UserProfileName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        UserProfilePassword1.setBackground(colors.getMainColor());
        UserProfilePassword1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfilePassword1.setForeground(colors.getMainFontColor());
        UserProfilePassword1.setText("Password");
        UserProfilePassword1.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfilePassword1.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfilePassword1.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(UserProfilePassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        UserProfilePhone1.setBackground(colors.getMainColor());
        UserProfilePhone1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfilePhone1.setForeground(colors.getMainFontColor());
        UserProfilePhone1.setText("Phone number");
        UserProfilePhone1.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfilePhone1.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfilePhone1.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(UserProfilePhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        UserProfileDialog.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ContactInfoDialog.setAlwaysOnTop(true);
        ContactInfoDialog.setBackground(colors.getMainColor());
        ContactInfoDialog.setLocation(new java.awt.Point(200, 300));
        ContactInfoDialog.setMaximumSize(new java.awt.Dimension(550, 220));
        ContactInfoDialog.setMinimumSize(new java.awt.Dimension(550, 220));
        ContactInfoDialog.setPreferredSize(new java.awt.Dimension(550, 220));
        ContactInfoDialog.setResizable(false);
        ContactInfoDialog.setSize(new java.awt.Dimension(550, 220));
        ContactInfoDialog.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(colors.getMainColor());
        jPanel4.setMaximumSize(new java.awt.Dimension(400, 220));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 220));
        jPanel4.setPreferredSize(new java.awt.Dimension(550, 220));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContactInfoDeleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        ContactInfoDeleteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ContactInfoDeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        ContactInfoDeleteBtn.setText("Delete");
        ContactInfoDeleteBtn.setBorder(new com.formdev.flatlaf.ui.FlatButtonBorder());
        ContactInfoDeleteBtn.setMaximumSize(new java.awt.Dimension(300, 35));
        ContactInfoDeleteBtn.setMinimumSize(new java.awt.Dimension(300, 35));
        ContactInfoDeleteBtn.setPreferredSize(new java.awt.Dimension(300, 35));
        jPanel4.add(ContactInfoDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        UserProfileIcon1.setBackground(new java.awt.Color(31, 32, 41));
        UserProfileIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/otherUserDeafult.png"))); // NOI18N
        jPanel4.add(UserProfileIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        UserProfileName2.setBackground(colors.getMainColor());
        UserProfileName2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfileName2.setForeground(colors.getMainFontColor());
        UserProfileName2.setText("Name");
        UserProfileName2.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfileName2.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfileName2.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(UserProfileName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        ContactInfoName.setBackground(colors.getMainColor());
        ContactInfoName.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ContactInfoName.setForeground(colors.getMainFontColor());
        ContactInfoName.setText("Name");
        ContactInfoName.setMaximumSize(new java.awt.Dimension(300, 30));
        ContactInfoName.setMinimumSize(new java.awt.Dimension(300, 30));
        ContactInfoName.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(ContactInfoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        UserProfilePhone2.setBackground(colors.getMainColor());
        UserProfilePhone2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        UserProfilePhone2.setForeground(colors.getMainFontColor());
        UserProfilePhone2.setText("Phone number");
        UserProfilePhone2.setMaximumSize(new java.awt.Dimension(300, 30));
        UserProfilePhone2.setMinimumSize(new java.awt.Dimension(300, 30));
        UserProfilePhone2.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(UserProfilePhone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        ContactInfoPhone.setBackground(colors.getMainColor());
        ContactInfoPhone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        ContactInfoPhone.setForeground(colors.getMainFontColor());
        ContactInfoPhone.setText("Phone number");
        ContactInfoPhone.setMaximumSize(new java.awt.Dimension(300, 30));
        ContactInfoPhone.setMinimumSize(new java.awt.Dimension(300, 30));
        ContactInfoPhone.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(ContactInfoPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        label1.setBackground(colors.getMainColor());
        label1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label1.setForeground(colors.getMainFontColor());
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("Contact Information");
        label1.setMaximumSize(new java.awt.Dimension(300, 30));
        label1.setMinimumSize(new java.awt.Dimension(300, 30));
        label1.setPreferredSize(new java.awt.Dimension(300, 30));
        jPanel4.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        ContactInfoDialog.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(985, 732));
        setMinimumSize(new java.awt.Dimension(985, 732));
        setPreferredSize(new java.awt.Dimension(985, 732));

        MainWindowPanel.setMaximumSize(new java.awt.Dimension(985, 732));
        MainWindowPanel.setMinimumSize(new java.awt.Dimension(985, 732));
        MainWindowPanel.setPreferredSize(new java.awt.Dimension(985, 732));
        MainWindowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBarPanel.setBackground(colors.getMainColor());
        sideBarPanel.setMaximumSize(new java.awt.Dimension(60, 695));
        sideBarPanel.setMinimumSize(new java.awt.Dimension(60, 695));
        sideBarPanel.setPreferredSize(new java.awt.Dimension(60, 695));
        sideBarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/mainLogo.png"))); // NOI18N
        sideBarPanel.add(mainLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        chattingIconPanel.setBackground(new java.awt.Color(39, 40, 49));
        chattingIconPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 0, 0, new java.awt.Color(253, 245, 211)));
        chattingIconPanel.setMaximumSize(new java.awt.Dimension(60, 40));
        chattingIconPanel.setMinimumSize(new java.awt.Dimension(60, 40));
        chattingIconPanel.setPreferredSize(new java.awt.Dimension(60, 40));
        chattingIconPanel.setLayout(new java.awt.GridBagLayout());

        chattingIconLabel.setBackground(new java.awt.Color(39, 40, 49));
        chattingIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/chat.png"))); // NOI18N
        chattingIconPanel.add(chattingIconLabel, new java.awt.GridBagConstraints());

        sideBarPanel.add(chattingIconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        settingsIconPanel.setBackground(colors.getMainColor());
        settingsIconPanel.setMaximumSize(new java.awt.Dimension(60, 40));
        settingsIconPanel.setMinimumSize(new java.awt.Dimension(60, 40));
        settingsIconPanel.setPreferredSize(new java.awt.Dimension(60, 40));
        settingsIconPanel.setLayout(new java.awt.GridBagLayout());

        settingsIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/settings.png"))); // NOI18N
        settingsIconPanel.add(settingsIconLabel, new java.awt.GridBagConstraints());

        sideBarPanel.add(settingsIconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        userProfileIconPanel.setBackground(colors.getMainColor());
        userProfileIconPanel.setMaximumSize(new java.awt.Dimension(60, 40));
        userProfileIconPanel.setMinimumSize(new java.awt.Dimension(60, 40));
        userProfileIconPanel.setPreferredSize(new java.awt.Dimension(60, 40));
        userProfileIconPanel.setLayout(new java.awt.GridBagLayout());

        userProfileIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/userProfile.png"))); // NOI18N
        userProfileIconPanel.add(userProfileIconLabel, new java.awt.GridBagConstraints());

        sideBarPanel.add(userProfileIconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, -1, -1));

        addContactIconPanel.setBackground(colors.getMainColor());
        addContactIconPanel.setMaximumSize(new java.awt.Dimension(60, 40));
        addContactIconPanel.setMinimumSize(new java.awt.Dimension(60, 40));
        addContactIconPanel.setPreferredSize(new java.awt.Dimension(60, 40));
        addContactIconPanel.setLayout(new java.awt.GridBagLayout());

        addContactIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/addContactForDark.png"))); // NOI18N
        addContactIconPanel.add(addContactIconLabel, new java.awt.GridBagConstraints());

        sideBarPanel.add(addContactIconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, -1, -1));

        MainWindowPanel.add(sideBarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        searchPanel.setBackground(colors.getMainColor());
        searchPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(39, 40, 49)));
        searchPanel.setMaximumSize(new java.awt.Dimension(310, 80));
        searchPanel.setMinimumSize(new java.awt.Dimension(310, 80));
        searchPanel.setPreferredSize(new java.awt.Dimension(310, 80));
        searchPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(colors.getMainFontColor());
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome, " + name);
        searchPanel.add(jLabel1, new java.awt.GridBagConstraints());

        MainWindowPanel.add(searchPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        chatsPanel.setBackground(colors.getMainColor());
        chatsPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(39, 40, 49)));
        chatsPanel.setMaximumSize(new java.awt.Dimension(60, 695));
        chatsPanel.setMinimumSize(new java.awt.Dimension(60, 695));
        chatsPanel.setPreferredSize(new java.awt.Dimension(310, 615));
        chatsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainWindowPanel.add(chatsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        chatHeaderPanel.setBackground(colors.getMainColor());
        chatHeaderPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(39, 40, 49)));
        chatHeaderPanel.setMaximumSize(new java.awt.Dimension(600, 80));
        chatHeaderPanel.setMinimumSize(new java.awt.Dimension(600, 80));
        chatHeaderPanel.setPreferredSize(new java.awt.Dimension(600, 80));
        chatHeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        otherUserDeafultIconPanel.setBackground(colors.getMainColor());
        otherUserDeafultIconPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(39, 40, 49)));
        otherUserDeafultIconPanel.setMaximumSize(new java.awt.Dimension(80, 80));
        otherUserDeafultIconPanel.setMinimumSize(new java.awt.Dimension(80, 80));
        otherUserDeafultIconPanel.setPreferredSize(new java.awt.Dimension(80, 80));
        otherUserDeafultIconPanel.setLayout(new java.awt.GridBagLayout());

        otherUserDeafultIconLabel.setBackground(new java.awt.Color(31, 32, 41));
        otherUserDeafultIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/otherUserDeafult.png"))); // NOI18N
        otherUserDeafultIconPanel.add(otherUserDeafultIconLabel, new java.awt.GridBagConstraints());

        chatHeaderPanel.add(otherUserDeafultIconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        otherUserNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        otherUserNameLabel.setForeground(new java.awt.Color(246, 246, 247));
        otherUserNameLabel.setText("User");
        otherUserNameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        otherUserNameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        otherUserNameLabel.setIconTextGap(10);
        otherUserNameLabel.setMaximumSize(new java.awt.Dimension(480, 40));
        otherUserNameLabel.setMinimumSize(new java.awt.Dimension(480, 40));
        otherUserNameLabel.setPreferredSize(new java.awt.Dimension(480, 40));
        otherUserNameLabel.setRequestFocusEnabled(false);
        otherUserNameLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        chatHeaderPanel.add(otherUserNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        otherUserStateLabel.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        otherUserStateLabel.setForeground(new java.awt.Color(153, 153, 163));
        otherUserStateLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        otherUserStateLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        otherUserStateLabel.setMaximumSize(new java.awt.Dimension(520, 40));
        otherUserStateLabel.setMinimumSize(new java.awt.Dimension(520, 40));
        otherUserStateLabel.setPreferredSize(new java.awt.Dimension(480, 40));
        otherUserStateLabel.setVerifyInputWhenFocusTarget(false);
        otherUserStateLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        chatHeaderPanel.add(otherUserStateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        otherUserInfoIconPanel.setBackground(colors.getMainColor());
        otherUserInfoIconPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(39, 40, 49)));
        otherUserInfoIconPanel.setMaximumSize(new java.awt.Dimension(40, 80));
        otherUserInfoIconPanel.setMinimumSize(new java.awt.Dimension(40, 80));
        otherUserInfoIconPanel.setPreferredSize(new java.awt.Dimension(40, 80));
        otherUserInfoIconPanel.setLayout(new java.awt.GridBagLayout());

        otherUserInfoIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/info.png"))); // NOI18N
        otherUserInfoIconPanel.add(otherUserInfoIconLabel, new java.awt.GridBagConstraints());

        chatHeaderPanel.add(otherUserInfoIconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        MainWindowPanel.add(chatHeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        chatMessagesContainerPanel.setBackground(new java.awt.Color(31, 32, 41));
        chatMessagesContainerPanel.setMaximumSize(new java.awt.Dimension(600, 535));
        chatMessagesContainerPanel.setMinimumSize(new java.awt.Dimension(600, 535));
        chatMessagesContainerPanel.setPreferredSize(new java.awt.Dimension(600, 535));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(600, 535));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(600, 535));
        jScrollPane1.setNextFocusableComponent(chatMessagesPanel);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 535));
        jScrollPane1.setViewportView(chatMessagesPanel);

        chatMessagesPanel.setBackground(colors.getSecondaryColor());
        chatMessagesPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 12));
        chatMessagesPanel.setAutoscrolls(true);
        chatMessagesPanel.setMaximumSize(new java.awt.Dimension(600, 535));
        chatMessagesPanel.setMinimumSize(new java.awt.Dimension(600, 535));
        chatMessagesPanel.setPreferredSize(new java.awt.Dimension(600, 535));

        javax.swing.GroupLayout chatMessagesPanelLayout = new javax.swing.GroupLayout(chatMessagesPanel);
        chatMessagesPanel.setLayout(chatMessagesPanelLayout);
        chatMessagesPanelLayout.setHorizontalGroup(
            chatMessagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        chatMessagesPanelLayout.setVerticalGroup(
            chatMessagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(chatMessagesPanel);

        javax.swing.GroupLayout chatMessagesContainerPanelLayout = new javax.swing.GroupLayout(chatMessagesContainerPanel);
        chatMessagesContainerPanel.setLayout(chatMessagesContainerPanelLayout);
        chatMessagesContainerPanelLayout.setHorizontalGroup(
            chatMessagesContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chatMessagesContainerPanelLayout.setVerticalGroup(
            chatMessagesContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainWindowPanel.add(chatMessagesContainerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        chatSendPanel.setBackground(colors.getMainColor());
        chatSendPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(39, 40, 49)));
        chatSendPanel.setMaximumSize(new java.awt.Dimension(600, 80));
        chatSendPanel.setMinimumSize(new java.awt.Dimension(600, 80));
        chatSendPanel.setPreferredSize(new java.awt.Dimension(600, 80));
        chatSendPanel.setLayout(new java.awt.GridBagLayout());

        chatSendTextField.setBackground(colors.getMainColor());
        chatSendTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        chatSendTextField.setForeground(new java.awt.Color(246, 246, 247));
        chatSendTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        chatSendTextField.setText("Type a message");
        chatSendTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        chatSendTextField.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        chatSendTextField.setHighlighter(null);
        chatSendTextField.setMaximumSize(new java.awt.Dimension(600, 40));
        chatSendTextField.setMinimumSize(new java.awt.Dimension(600, 40));
        chatSendTextField.setName(""); // NOI18N
        chatSendTextField.setPreferredSize(new java.awt.Dimension(550, 40));
        chatSendTextField.setSelectionEnd(0);
        chatSendTextField.setSelectionStart(0);
        chatSendPanel.add(chatSendTextField, new java.awt.GridBagConstraints());

        chatSendIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/send.png"))); // NOI18N
        chatSendPanel.add(chatSendIconLabel, new java.awt.GridBagConstraints());

        MainWindowPanel.add(chatSendPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 615, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(MainWindowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddContactBtn;
    private javax.swing.JDialog AddContactDialog;
    private javax.swing.JLabel AddContactELabel;
    private javax.swing.JTextField AddContactFied;
    private javax.swing.JDialog ChangePasswordDialog;
    private javax.swing.JButton ContactInfoDeleteBtn;
    private javax.swing.JDialog ContactInfoDialog;
    private javax.swing.JLabel ContactInfoName;
    private javax.swing.JLabel ContactInfoPhone;
    private javax.swing.JPanel MainWindowPanel;
    private javax.swing.JLabel SUPhoneNumberELabel1;
    private javax.swing.JTextField SUPhoneNumberField1;
    private javax.swing.JLabel SUPhoneNumberLabel;
    private javax.swing.JLabel SUPhoneNumberLabel1;
    private javax.swing.JButton SUSignUpBtn1;
    private javax.swing.JDialog UserProfileDialog;
    private javax.swing.JLabel UserProfileIcon;
    private javax.swing.JLabel UserProfileIcon1;
    private javax.swing.JLabel UserProfileName;
    private javax.swing.JLabel UserProfileName1;
    private javax.swing.JLabel UserProfileName2;
    private javax.swing.JLabel UserProfilePassword;
    private javax.swing.JLabel UserProfilePassword1;
    private javax.swing.JLabel UserProfilePhone;
    private javax.swing.JLabel UserProfilePhone1;
    private javax.swing.JLabel UserProfilePhone2;
    private javax.swing.JLabel addContactIconLabel;
    private javax.swing.JPanel addContactIconPanel;
    private javax.swing.JPanel chatHeaderPanel;
    private javax.swing.JPanel chatMessagesContainerPanel;
    private javax.swing.JPanel chatMessagesPanel;
    private javax.swing.JLabel chatSendIconLabel;
    private javax.swing.JPanel chatSendPanel;
    private javax.swing.JFormattedTextField chatSendTextField;
    private javax.swing.JPanel chatsPanel;
    private javax.swing.JLabel chattingIconLabel;
    private javax.swing.JPanel chattingIconPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel mainLogoLabel;
    private javax.swing.JLabel otherUserDeafultIconLabel;
    private javax.swing.JPanel otherUserDeafultIconPanel;
    private javax.swing.JLabel otherUserInfoIconLabel;
    private javax.swing.JPanel otherUserInfoIconPanel;
    private javax.swing.JLabel otherUserNameLabel;
    private javax.swing.JLabel otherUserStateLabel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JLabel settingsIconLabel;
    private javax.swing.JPanel settingsIconPanel;
    private javax.swing.JPanel sideBarPanel;
    private javax.swing.JLabel userProfileIconLabel;
    private javax.swing.JPanel userProfileIconPanel;
    // End of variables declaration//GEN-END:variables
   
    public void updateUIColors(){
        sideBarPanel.setBackground(colors.getMainColor());
        chattingIconPanel.setBackground(colors.getMainColor());
       
        settingsIconPanel.setBackground(colors.getMainColor());
        userProfileIconPanel.setBackground(colors.getMainColor());
        addContactIconPanel.setBackground(colors.getMainColor());
        searchPanel.setBackground(colors.getMainColor());
        chatsPanel.setBackground(colors.getMainColor());
        chatHeaderPanel.setBackground(colors.getMainColor());
        otherUserDeafultIconPanel.setBackground(colors.getMainColor());
        otherUserInfoIconPanel.setBackground(colors.getMainColor());
        chatSendPanel.setBackground(colors.getMainColor());
        chatSendTextField.setBackground(colors.getMainColor());
        chatMessagesPanel.setBackground(colors.getSecondaryColor());
    }
    public void reSizeAfterMessage(int height){
        if(chatMessagesPanel.getHeight() > 530){
            chatMessagesPanel.setPreferredSize(new java.awt.Dimension(600, chatMessagesPanel.getHeight() + height));
        }
    }
    
    public void showError(javax.swing.JLabel errorlbl, String text){
        errorlbl.setText(text);
        errorlbl.setVisible(true);
    }
    public void removeError(javax.swing.JLabel errorlbl){
        errorlbl.setVisible(false);
    }
    public void showDialog(){
        getAddContactDialog().show();
    }
    /**
     * @return the MainWindowPanel
     */
    public javax.swing.JPanel getMainWindowPanel() {
        return MainWindowPanel;
    }
    //..
    /**
     * @return the MainWindowPanel
     */
    public javax.swing.JPanel getChatMessagesContainerPanel() {
        return chatMessagesContainerPanel;
    }

    /**
     * @return the addContactIconLabel
     */
    public javax.swing.JLabel getAddContactIconLabel() {
        return addContactIconLabel;
    }

    /**
     * @return the addContactIconPanel
     */
    public javax.swing.JPanel getAddContactIconPanel() {
        return addContactIconPanel;
    }

    /**
     * @return the chatHeaderPanel
     */
    public javax.swing.JPanel getChatHeaderPanel() {
        return chatHeaderPanel;
    }

    /**
     * @return the chatMessagesPanel
     */
    public javax.swing.JPanel getChatMessagesPanel() {
        return chatMessagesPanel;
    }

    /**
     * @return the chatSendIconLabel
     */
    public javax.swing.JLabel getChatSendIconLabel() {
        return chatSendIconLabel;
    }

    /**
     * @return the chatSendPanel
     */
    public javax.swing.JPanel getChatSendPanel() {
        return chatSendPanel;
    }

    /**
     * @return the chatSendTextField
     */
    public javax.swing.JFormattedTextField getChatSendTextField() {
        return chatSendTextField;
    }

    /**
     * @return the chatsPanel
     */
    public javax.swing.JPanel getChatsPanel() {
        return chatsPanel;
    }

    /**
     * @return the chattingIconLabel
     */
    public javax.swing.JLabel getChattingIconLabel() {
        return chattingIconLabel;
    }

    /**
     * @return the chattingIconPanel
     */
    public javax.swing.JPanel getChattingIconPanel() {
        return chattingIconPanel;
    }

    /**
     * @return the mainLogoLabel
     */
    public javax.swing.JLabel getMainLogoLabel() {
        return mainLogoLabel;
    }

    /**
     * @return the otherUserDeafultIconLabel
     */
    public javax.swing.JLabel getOtherUserDeafultIconLabel() {
        return otherUserDeafultIconLabel;
    }

    /**
     * @return the otherUserDeafultIconPanel
     */
    public javax.swing.JPanel getOtherUserDeafultIconPanel() {
        return otherUserDeafultIconPanel;
    }

    /**
     * @return the otherUserInfoIconLabel
     */
    public javax.swing.JLabel getOtherUserInfoIconLabel() {
        return otherUserInfoIconLabel;
    }

    /**
     * @return the otherUserInfoIconPanel
     */
    public javax.swing.JPanel getOtherUserInfoIconPanel() {
        return otherUserInfoIconPanel;
    }

    /**
     * @return the otherUserNameLabel
     */
    public javax.swing.JLabel getOtherUserNameLabel() {
        return otherUserNameLabel;
    }

    /**
     * @return the otherUserStateLabel
     */
    public javax.swing.JLabel getOtherUserStateLabel() {
        return otherUserStateLabel;
    }



    /**
     * @return the searchPanel
     */
    public javax.swing.JPanel getSearchPanel() {
        return searchPanel;
    }

    

    /**
     * @return the settingsIconLabel
     */
    public javax.swing.JLabel getSettingsIconLabel() {
        return settingsIconLabel;
    }

    /**
     * @return the settingsIconPanel
     */
    public javax.swing.JPanel getSettingsIconPanel() {
        return settingsIconPanel;
    }

    /**
     * @return the sideBarPanel
     */
    public javax.swing.JPanel getSideBarPanel() {
        return sideBarPanel;
    }

    /**
     * @return the userProfileIconLabel
     */
    public javax.swing.JLabel getUserProfileIconLabel() {
        return userProfileIconLabel;
    }

    /**
     * @return the userProfileIconPanel
     */
    public javax.swing.JPanel getUserProfileIconPanel() {
        return userProfileIconPanel;
    }

    /**
     * @return the AddContactBtn
     */
    public javax.swing.JButton getAddContactBtn() {
        return AddContactBtn;
    }

    /**
     * @return the AddContactDialog
     */
    public javax.swing.JDialog getAddContactDialog() {
        return AddContactDialog;
    }

    /**
     * @return the AddContactELabel
     */
    public javax.swing.JLabel getAddContactELabel() {
        return AddContactELabel;
    }

    /**
     * @return the AddContactFied
     */
    public javax.swing.JTextField getAddContactFied() {
        return AddContactFied;
    }

    /**
     * @return the ChangePasswordDialog
     */
    public javax.swing.JDialog getChangePasswordDialog() {
        return ChangePasswordDialog;
    }

    /**
     * @return the UserProfileDialog
     */
    public javax.swing.JDialog getUserProfileDialog() {
        return UserProfileDialog;
    }

    /**
     * @return the UserProfileName
     */
    public javax.swing.JLabel getUserProfileName() {
        return UserProfileName;
    }

    /**
     * @return the UserProfilePassword
     */
    public javax.swing.JLabel getUserProfilePassword() {
        return UserProfilePassword;
    }

    /**
     * @return the UserProfilePhone
     */
    public javax.swing.JLabel getUserProfilePhone() {
        return UserProfilePhone;
    }

    /**
     * @return the ContactInfoDeleteBtn
     */
    public javax.swing.JButton getContactInfoDeleteBtn() {
        return ContactInfoDeleteBtn;
    }

    /**
     * @return the ContactInfoDialog
     */
    public javax.swing.JDialog getContactInfoDialog() {
        return ContactInfoDialog;
    }

    /**
     * @return the ContactInfoName
     */
    public javax.swing.JLabel getContactInfoName() {
        return ContactInfoName;
    }

    /**
     * @return the ContactInfoPhone
     */
    public javax.swing.JLabel getContactInfoPhone() {
        return ContactInfoPhone;
    }
}
