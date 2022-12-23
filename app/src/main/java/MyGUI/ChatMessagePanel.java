package MyGUI;

import java.awt.Color;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class ChatMessagePanel extends javax.swing.JPanel {

    private static GUIColors colors = null;
    private static Color fontColor = null;
    private int messageHeight;

    public ChatMessagePanel(GUIColors colors, String text, boolean thisUser) {
        ChatMessagePanel.colors = colors;
        initComponents();
        setBackground(thisUser ? ChatMessagePanel.colors.getUserMessageColor() : ChatMessagePanel.colors.getOtherUserMessageColor());
        fontColor = thisUser ? ChatMessagePanel.colors.getUserMessageFontColor() : ChatMessagePanel.colors.getOtherUserMessageFontColor();
        textShrinker(text);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        setBackground(new java.awt.Color(0, 255, 204));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(15, 33));
        setLayout(new java.awt.GridBagLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private void textShrinker(String text) {
        List<String> rowsList = split(text, 80);
        for (int i = 0; i < rowsList.size(); ++i) {
            javax.swing.JLabel label = new javax.swing.JLabel();
            textRender(rowsList.get(i), i * 2, label);
        }
        messageHeight = rowsList.size() * 40;
    }

    void textRender(String text, int gridy, javax.swing.JLabel jLabel) {
        java.awt.GridBagConstraints gridBagConstraints;
        jLabel.setText(text);
        jLabel.setForeground(fontColor);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        this.add(jLabel, gridBagConstraints);
    }

    List<String> split(String s, int chunkSize) {
        return IntStream.iterate(0, i -> i < s.length(), i -> i + chunkSize).mapToObj(i -> s.substring(i, Math.min(s.length(), i + chunkSize))).collect(Collectors.toList());
    }

    public int getMessageHeight() {
        return this.getHeight();
    }

}
