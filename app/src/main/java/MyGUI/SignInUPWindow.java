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
        java.awt.GridBagConstraints gridBagConstraints;

        ControlerPane = new javax.swing.JLayeredPane();
        SignInPanel = new javax.swing.JPanel();
        SignUpPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(970, 732));
        setMinimumSize(new java.awt.Dimension(970, 732));
        setPreferredSize(new java.awt.Dimension(970, 732));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        ControlerPane.setMaximumSize(new java.awt.Dimension(970, 732));
        ControlerPane.setMinimumSize(new java.awt.Dimension(970, 732));
        ControlerPane.setPreferredSize(new java.awt.Dimension(970, 732));
        ControlerPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignInPanel.setBackground(new java.awt.Color(0, 204, 0));
        SignInPanel.setMaximumSize(new java.awt.Dimension(970, 732));
        SignInPanel.setMinimumSize(new java.awt.Dimension(970, 732));
        SignInPanel.setPreferredSize(new java.awt.Dimension(970, 732));

        javax.swing.GroupLayout SignInPanelLayout = new javax.swing.GroupLayout(SignInPanel);
        SignInPanel.setLayout(SignInPanelLayout);
        SignInPanelLayout.setHorizontalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        SignInPanelLayout.setVerticalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        ControlerPane.add(SignInPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SignUpPanel.setBackground(new java.awt.Color(255, 0, 0));
        SignUpPanel.setMaximumSize(new java.awt.Dimension(970, 732));
        SignUpPanel.setMinimumSize(new java.awt.Dimension(970, 732));
        SignUpPanel.setPreferredSize(new java.awt.Dimension(970, 732));

        javax.swing.GroupLayout SignUpPanelLayout = new javax.swing.GroupLayout(SignUpPanel);
        SignUpPanel.setLayout(SignUpPanelLayout);
        SignUpPanelLayout.setHorizontalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        SignUpPanelLayout.setVerticalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        ControlerPane.add(SignUpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("jButton1");
        ControlerPane.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(ControlerPane, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @return the ControlerPane
     */
    public javax.swing.JLayeredPane getControlerPane() {
        return ControlerPane;
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
    
    public javax.swing.JButton getButton() {
        return jButton1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ControlerPane;
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
