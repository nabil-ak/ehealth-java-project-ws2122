package src.frames.components.headButton;

import src.frames.components.background;
import src.frames.Home;
import src.frames.Login;
import src.frames.Register;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * Custom WinButtons (Panel with Buttons to close, minimize and maximize the program)
 */
public class WinButton extends javax.swing.JPanel {
  
    /**
     * Constructor to create a new WinButton
     */
    public WinButton() {
        initComponents();
        setOpaque(false);
    }
    
    /**
     * init the frame, panel and if the frame can be maximized 
     * we cant init the values in the constructor because the netbeans gui builder doesent allow custom parameters
     * @param fram
     * @param panel
     * @param canMax
     */
    public void init(JFrame fram, background panel, boolean canMax) {
        cmdClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(fram instanceof Home || fram instanceof Login || fram instanceof Register){
                    System.exit(0);
                }
                fram.setVisible(false);
                fram.dispose();
            }
        });
        cmdMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                fram.setState(JFrame.ICONIFIED);
            }
        });
        cmdRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(canMax){
                    if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                        panel.setRound(20);
                        fram.setExtendedState(JFrame.NORMAL);
                    } else {
                        panel.setRound(0);
                        fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    }
                }
            }
        });
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        cmdClose = new Button();
        cmdMi = new Button();
        cmdRe = new Button();

        cmdClose.setBackground(new java.awt.Color(240, 61, 61));

        cmdMi.setBackground(new java.awt.Color(227, 226, 68));

        cmdRe.setBackground(new java.awt.Color(67, 199, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>

    // Variables declaration - do not modify

    /**
     * Button to close the Frame
     */
    private Button cmdClose;

    /**
     * Button to minimize the Frame
     */
    private Button cmdMi;

    /**
     * Button to resize the Frame
     */
    private Button cmdRe;
    // End of variables declaration
}
