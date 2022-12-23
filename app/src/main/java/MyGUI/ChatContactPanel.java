package MyGUI;

import MyLogic.MainLogic;
import MyLogic.MainWindowLogic;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChatContactPanel extends javax.swing.JPanel {

    private static GUIColors colors = null;
    private static String name = "";
    private int contactId;

    public ChatContactPanel(GUIColors cls, String name, int contactid) {
        
        colors = cls;
        this.name = name;
        contactId = contactid;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        otherUserIconLabel = new javax.swing.JLabel();
        otherUserNameLabel = new javax.swing.JLabel();

        setBackground(colors.getMainColor());
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(300, 80));
        setMinimumSize(new java.awt.Dimension(300, 80));
        setPreferredSize(new java.awt.Dimension(300, 80));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 10, 0};
        layout.rowHeights = new int[] {0};
        setLayout(layout);

        otherUserIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/otherUserDeafult.png"))); // NOI18N
        otherUserIconLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        add(otherUserIconLabel, gridBagConstraints);

        otherUserNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        otherUserNameLabel.setForeground(colors.getMainFontColor());
        otherUserNameLabel.setText(name);
        otherUserNameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        otherUserNameLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 15, 0, 0));
        otherUserNameLabel.setIconTextGap(10);
        otherUserNameLabel.setMaximumSize(new java.awt.Dimension(233, 22));
        otherUserNameLabel.setMinimumSize(new java.awt.Dimension(233, 22));
        otherUserNameLabel.setPreferredSize(new java.awt.Dimension(233, 22));
        otherUserNameLabel.setRequestFocusEnabled(false);
        otherUserNameLabel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(otherUserNameLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        //MainWindowLogic.getMainWindowLogicT().loadMessages(getContactId());
        //System.out.println(contactId);
    }//GEN-LAST:event_formMouseClicked
   
    /**
     * @return the contactId
     */
    public int getContactId() {
        return contactId;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel otherUserIconLabel;
    private javax.swing.JLabel otherUserNameLabel;
    // End of variables declaration//GEN-END:variables
}
