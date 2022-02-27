/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.frames;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
/**
 *
 * Frame Master Class
 * Every Frame extends this Class
 */
public class Frame extends javax.swing.JFrame{

    /**
     *  Standard Color of every Textfield
     */
    public static final Color textInput = new Color(102,102,102); 
    
    /**
     * Constructor to create a new Frame
     */
    public Frame(){
        super();
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/assets/img/appicon.png")).getImage());
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * font function used to init the Componenets with a modern Font
     * @param size of the font
     * @return
     */
    public Font fnt(float size){
        Font font = new Font(Font.SANS_SERIF,  Font.BOLD, (int)size);
        try {
           font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/assets/font/CircularStd-Bold.otf")).deriveFont(size);
        }catch(Exception e){
            e.printStackTrace();
        }
        return font;
    }
}
