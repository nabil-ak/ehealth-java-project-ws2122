/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.frames.components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * Custom Background-Panel
 * Used as the background of every frame and also on many tabs
 */
public class background extends JPanel{
    
    
    /**
     * round(diameter ) of the corners
     */
    private int round = 20;

    /**
     * Constructor to create a new Background
     */
    public background(){
        setOpaque(false);
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
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
        g2.dispose();
        super.paint(g); 
    }
}
