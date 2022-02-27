/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.frames.components;

import javax.swing.JPasswordField;

/**
 *
 * Custom passwordfield 
 */
public class passwordfield extends JPasswordField{
    
    /**
     * true if the user clicked the Texfield, otherwise false
     */
    private boolean reset = false;

    /**
     * Get Reset
     * @return reset
     */
    public boolean getReset(){
        return reset;
    }

    /**
     * Constructor for new passwordfield
     */
    public passwordfield(){
        setBorder(null);
        setOpaque(false);
        setText("Enter Password");
        setEchoChar((char)0);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if(!reset){
                    setText("");
                    setEchoChar('●');
                    reset = true;
                }
            }
        });
    }
}
