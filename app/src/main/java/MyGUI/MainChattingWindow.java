package MyGUI;

public class MainChattingWindow extends javax.swing.JFrame {

    private static MainChattingWindow mainWindow = null;
    private static GUIColors colors = null;

    private MainChattingWindow(GUIColors colors) {
        this.colors = colors;
        initComponents();
        setResizable(false);
    }

    public static MainChattingWindow getMainWindow(GUIColors colors) {
        if (mainWindow == null) {
            synchronized (MainChattingWindow.class) {
                if (mainWindow == null) {
                    mainWindow = new MainChattingWindow(colors);
                }
            }
        }
        return mainWindow;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        searchContainerPanel = new javax.swing.JPanel();
        searchTextField = new javax.swing.JFormattedTextField();
        searchIconLabel = new javax.swing.JLabel();
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
        searchPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchContainerPanel.setBackground(colors.getSecondaryColor());
        searchContainerPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(39, 40, 49)));
        searchContainerPanel.setMaximumSize(new java.awt.Dimension(310, 40));
        searchContainerPanel.setMinimumSize(new java.awt.Dimension(310, 40));
        searchContainerPanel.setPreferredSize(new java.awt.Dimension(290, 40));
        searchContainerPanel.setLayout(new java.awt.GridBagLayout());

        searchTextField.setBackground(colors.getSecondaryColor());
        searchTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 0, new java.awt.Color(39, 40, 49)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        searchTextField.setForeground(new java.awt.Color(246, 246, 247));
        searchTextField.setText("Search in the contacts");
        searchTextField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        searchTextField.setHighlighter(null);
        searchTextField.setMaximumSize(new java.awt.Dimension(250, 40));
        searchTextField.setMinimumSize(new java.awt.Dimension(250, 40));
        searchTextField.setPreferredSize(new java.awt.Dimension(250, 40));
        searchContainerPanel.add(searchTextField, new java.awt.GridBagConstraints());

        searchIconLabel.setBackground(colors.getSecondaryColor());
        searchIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        searchContainerPanel.add(searchIconLabel, new java.awt.GridBagConstraints());

        searchPanel.add(searchContainerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

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
        otherUserNameLabel.setText("Mostafa Shokry");
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
        otherUserStateLabel.setText("Online");
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
            .addGap(0, 733, Short.MAX_VALUE)
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
    private javax.swing.JPanel MainWindowPanel;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainLogoLabel;
    private javax.swing.JLabel otherUserDeafultIconLabel;
    private javax.swing.JPanel otherUserDeafultIconPanel;
    private javax.swing.JLabel otherUserInfoIconLabel;
    private javax.swing.JPanel otherUserInfoIconPanel;
    private javax.swing.JLabel otherUserNameLabel;
    private javax.swing.JLabel otherUserStateLabel;
    private javax.swing.JPanel searchContainerPanel;
    private javax.swing.JLabel searchIconLabel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JFormattedTextField searchTextField;
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
        searchContainerPanel.setBackground(colors.getSecondaryColor());
        searchTextField.setBackground(colors.getSecondaryColor());
    }
    public void reSizeAfterMessage(int height){
        if(chatMessagesPanel.getHeight() > 530){
            chatMessagesPanel.setPreferredSize(new java.awt.Dimension(600, chatMessagesPanel.getHeight() + height));
        }
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
     * @return the searchContainerPanel
     */
    public javax.swing.JPanel getSearchContainerPanel() {
        return searchContainerPanel;
    }

    /**
     * @return the searchIconLabel
     */
    public javax.swing.JLabel getSearchIconLabel() {
        return searchIconLabel;
    }

    /**
     * @return the searchPanel
     */
    public javax.swing.JPanel getSearchPanel() {
        return searchPanel;
    }

    /**
     * @return the searchTextField
     */
    public javax.swing.JFormattedTextField getSearchTextField() {
        return searchTextField;
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
}
