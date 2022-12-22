package MyGUI;

import java.awt.Color;

public class GUIColors {

    private static GUIColors colors = null;
    private boolean mode = true;
    private Color mainColor;
    private Color secondaryColor;
    private Color smallTouchesColor;
    private Color mainFontColor;
    private Color buttonsFontColor;
    private Color userMessageColor;
    private Color userMessageFontColor;
    private Color otherUserMessageColor;
    private Color otherUserMessageFontColor;

    private GUIColors(boolean mode) {
        //True for dark mode
        this.mode = mode;
        setUpColors();
    }

    public static GUIColors getColors(boolean mode) {
        if (colors == null) {
            synchronized (GUIColors.class) {
                if (colors == null) {
                    colors = new GUIColors(mode);
                }
            }
        }
        return colors;
    }
    private void setUpColors(){
        mainColor = mode ? new java.awt.Color(31, 32, 41) : new java.awt.Color(252,252,253);
        secondaryColor = mode ? new java.awt.Color(23,24,31) : new java.awt.Color(252, 252, 253);
        setSmallTouchesColor(mode ? new java.awt.Color(0xffde59) : new java.awt.Color(0xffde59));
        mainFontColor = mode ? new java.awt.Color(0xF6F6F7) : new java.awt.Color(0x000000);
        setButtonsFontColor(mode ? new java.awt.Color(0x000000): new java.awt.Color(0x000000));
        userMessageColor = mode ? new java.awt.Color(0xBBA0CA): new java.awt.Color(0xBBA0CA);
        userMessageFontColor = mode ? new java.awt.Color(0x000000): new java.awt.Color(0x000000);
        otherUserMessageColor = mode ? new java.awt.Color(0x89B6A5): new java.awt.Color(0x89B6A5);
        otherUserMessageFontColor = mode ? new java.awt.Color(0x000000): new java.awt.Color(0x000000);
    }
    
    public boolean getMode() {
        return mode;
    }
    public void changeMode(){
        mode = !mode;
        setUpColors();
    }
    /**
     * @return the mainColor
     */
    public Color getMainColor() {
        return mainColor;
    }

    /**
     * @return the secondaryColor
     */
    public Color getSecondaryColor() {
        return secondaryColor;
    }

    /**
     * @return the smallTouchesColor
     */
    public Color getSmallTouchesColor() {
        return smallTouchesColor;
    }

    /**
     * @param smallTouchesColor the smallTouchesColor to set
     */
    public void setSmallTouchesColor(Color smallTouchesColor) {
        this.smallTouchesColor = smallTouchesColor;
    }

    /**
     * @return the mainFontColor
     */
    public Color getMainFontColor() {
        return mainFontColor;
    }

    /**
     * @return the buttonsFontColor
     */
    public Color getButtonsFontColor() {
        return buttonsFontColor;
    }

    /**
     * @param buttonsFontColor the buttonsFontColor to set
     */
    public void setButtonsFontColor(Color buttonsFontColor) {
        this.buttonsFontColor = buttonsFontColor;
    }

    /**
     * @return the userMessageColor
     */
    public Color getUserMessageColor() {
        return userMessageColor;
    }

    /**
     * @return the userMessageFontColor
     */
    public Color getUserMessageFontColor() {
        return userMessageFontColor;
    }

    /**
     * @return the otherUserMessageColor
     */
    public Color getOtherUserMessageColor() {
        return otherUserMessageColor;
    }

    /**
     * @return the otherUserMessageFontColor
     */
    public Color getOtherUserMessageFontColor() {
        return otherUserMessageFontColor;
    }


}
