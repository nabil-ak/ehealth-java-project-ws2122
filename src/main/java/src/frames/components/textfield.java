/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.frames.components;

import javax.swing.JTextField;


/**
 *
 * Custom Textfield 
 */
public class textfield extends JTextField{
    
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
     * Set Reset
     * @param reset
     */
    public void setReset(boolean reset) {
        this.reset = reset;
    }
    
    /**
     * Constructor for new textfield
     */
    public textfield(){
        setBorder(null);
        setOpaque(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                if(!reset){
                    setText("");
                    reset = true;
                }
            }
        });
    }
}
