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
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * Custom Button
 */
public class button extends JButton{

    /**
     * Standard Color if button is not selected
     */
    private Color normalColor = null;

    /**
     * Constructor to create a new Button
     * Set the color darker when the user enter the button and reset it if the user exit or press the button
     */
    public button(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(6, 6, 6, 6));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBackground(normalColor.darker());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setBackground(normalColor);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                setBackground(normalColor);
            }
        });
    }
    
    /**
     * Override the paint method of the button to create round corners with diameter of 20
     * @param grphcs
     */
    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        if(normalColor == null){
            normalColor = getBackground();
        }
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        g2.dispose();
        super.paint(grphcs);
    }
    
}
