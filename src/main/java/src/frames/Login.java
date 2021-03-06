/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package src.frames;

import src.util.database;
import src.models.*;


/**
 *
 * Login Frame
 */
public class Login extends Frame{

    /**
     * Constructor to create a new Login
     */
    public Login() {
        initComponents();
        winButton.init(this, background,false);
        dragPanel.init(this, background);
        lblError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new src.frames.components.background();
        winButton = new src.frames.components.headButton.WinButton();
        dragPanel = new src.frames.components.dragPanel();
        sidePicture = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPasswort = new javax.swing.JLabel();
        sepUser = new javax.swing.JSeparator();
        sepPasswort = new javax.swing.JSeparator();
        btnLogin = new src.frames.components.button();
        txtUsername = new src.frames.components.textfield();
        txtPassword = new src.frames.components.passwordfield();
        lblNotRegisteredYet = new javax.swing.JLabel();
        lblCreateAccount = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));

        dragPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dragPanelLayout = new javax.swing.GroupLayout(dragPanel);
        dragPanel.setLayout(dragPanelLayout);
        dragPanelLayout.setHorizontalGroup(
            dragPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 743, Short.MAX_VALUE)
        );
        dragPanelLayout.setVerticalGroup(
            dragPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        sidePicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/loginsidepanel.png"))); // NOI18N

        lblUsername.setBackground(new java.awt.Color(255, 255, 255));
        lblUsername.setFont(fnt(20f));
        lblUsername.setText("Username");

        lblPasswort.setBackground(new java.awt.Color(255, 255, 255));
        lblPasswort.setFont(fnt(20f));
        lblPasswort.setText("Password");

        sepUser.setForeground(Frame.textInput);

        sepPasswort.setForeground(Frame.textInput);

        btnLogin.setBackground(new java.awt.Color(69, 125, 88));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setFont(fnt(15f));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        txtUsername.setForeground(Frame.textInput);
        txtUsername.setText("Enter Username");
        txtUsername.setFont(fnt(15f));

        txtPassword.setForeground(Frame.textInput);
        txtPassword.setFont(fnt(15f));

        lblNotRegisteredYet.setFont(fnt(14f));
        lblNotRegisteredYet.setText("Not registered yet?");

        lblCreateAccount.setFont(fnt(14f));
        lblCreateAccount.setForeground(new java.awt.Color(69, 125, 88));
        lblCreateAccount.setText("Create an Account");
        lblCreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCreateAccountMousePressed(evt);
            }
        });

        lblError.setFont(fnt(14f));
        lblError.setForeground(new java.awt.Color(205, 61, 100));
        lblError.setText("Wrong Username or Password");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(dragPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(sidePicture)
                        .addGap(43, 43, 43)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(lblPasswort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sepUser)
                            .addComponent(sepPasswort, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(lblNotRegisteredYet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCreateAccount))
                            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dragPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(winButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sidePicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(sepUser, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lblPasswort)
                        .addGap(12, 12, 12)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sepPasswort, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(lblError)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNotRegisteredYet)
                            .addComponent(lblCreateAccount))
                        .addContainerGap())))
        );

        lblUsername.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Login user
     * @param evt 
     */
    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        lblError.setVisible(false);
        if(txtUsername.getText().length() == 0 || !txtUsername.getReset() || txtPassword.getPassword().length == 0 || !txtPassword.getReset()){
            lblError.setText("Missing Username or Password");
            lblError.setVisible(true);
            return;
        }
        btnLogin.setEnabled(false);
        btnLogin.setText("Login ....");
        user user = database.login(txtUsername.getText(), new String(txtPassword.getPassword()));
        if(user == null){
            btnLogin.setText("Login");
            btnLogin.setEnabled(true);
            lblError.setText("Wrong Username or Password");
            lblError.setVisible(true);
            return;
        }
        
        setVisible(false);
        new Home(user).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginMousePressed
    /**
     * Open Register Frame
     * @param evt 
     */
    private void lblCreateAccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccountMousePressed
        setVisible(false);
        new Register().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCreateAccountMousePressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private src.frames.components.background background;
    private src.frames.components.button btnLogin;
    private src.frames.components.dragPanel dragPanel;
    private javax.swing.JLabel lblCreateAccount;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblNotRegisteredYet;
    private javax.swing.JLabel lblPasswort;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator sepPasswort;
    private javax.swing.JSeparator sepUser;
    private javax.swing.JLabel sidePicture;
    private src.frames.components.passwordfield txtPassword;
    private src.frames.components.textfield txtUsername;
    private src.frames.components.headButton.WinButton winButton;
    // End of variables declaration//GEN-END:variables
}
