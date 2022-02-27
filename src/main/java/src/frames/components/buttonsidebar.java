/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.frames.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * Custom Button of the Navbar
 */
public class buttonsidebar extends JPanel{

    /**
     *  Standard Color if button is not selected
     */
    private Color normalColor = null;

    /**
     *  true if the button is activated, otherwise false
     */
    private boolean activated = false;
    
    
    /**
     * round(diameter ) of the corners
     */
    private int round = 20;

    /**
     * Constructor to create an new button
     */
    public buttonsidebar(){
        setOpaque(false);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBackground(normalColor.darker());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(!activated){
                    setBackground(normalColor);
                }else{
                    setBackground(normalColor.brighter());
                }
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                if(!activated){
                    activated = true;
                    setBackground(normalColor.brighter());
                }
            }
        });
    }
    
    /**
     * method gets called when we press another button on the navbar
     * sets the button to default color
     */
    public void deactivate(){
        activated = false;
        setBackground(normalColor);
    }

    /**
     * Get NormalColor
     * @return
     */
    public Color getNormalColor() {
        return normalColor;
    }

    /**
     * Set NormalColor
     * @param normalColor
     */
    public void setNormalColor(Color normalColor) {
        this.normalColor = normalColor;
    }
    
    /**
     * Get activated
     * @return
     */
    public boolean getActivated(){
        return activated;
    }

    /**
     * Set activated
     * @param activated
     */
    public void setActivated(boolean activated){
        this.activated = activated;
    }
    
    /**
     * Get round
     * @return
     */
    public int getRound(){
        return round;
    }

    /**
     * Set round
     * @param round
     */
    public void setRound(int round){
        this.round = round;
    }

    /**
     * Override the paint method of the panel to create round corners
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        if(normalColor == null){
            normalColor = getBackground();
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
        g2.dispose();
        super.paint(g); 
    }
}
