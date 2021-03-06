/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package src.frames.tabs.DashboardComponents;
import java.awt.Font;
import src.frames.Frame;
import src.frames.Alert;
import src.frames.moveAppointment;
import src.frames.tabs.Dashboard;
import src.models.appointment;
import src.models.user;
/**
 *
 * Appointment-Element for the Appointment-Panel
 */
public class viewAppointment extends javax.swing.JPanel {

    /**
     * Create a new Frame to use the font function
     */
    Frame Frame = new Frame();

    /**
     * the appointment to display
     */
    appointment appointment;

    /**
     * the user of the appointment
     */
    user user;

    /**
     * the dashboard tab that contains the Appointment
     */
    Dashboard dashboard;
    /**
     * Constructor to create a new Appointment-Element
     * @param dashboard
     * @param appointment
     * @param user
     */
    public viewAppointment(Dashboard dashboard,appointment appointment,user user) {
        this.dashboard = dashboard;
        this.appointment = appointment;
        this.user = user;
        initComponents();
        background.setRound(0);
        Frame.dispose();
        lblName.setText(appointment.getDoctor().getName());
        lblAddress.setText(appointment.getDoctor().getAddress());
        int minuteINT = appointment.getDateandtime().getMinute();
        String minute = String.valueOf(minuteINT);
        if(minuteINT < 10){
            minute = "0"+minute;
        }
        lblDate.setText(appointment.getDateandtime().getDayOfMonth()+"/"+appointment.getDateandtime().getMonthValue()+"/"+appointment.getDateandtime().getYear()+" "+appointment.getDateandtime().getHour()+":"+minute);
    }
    
    /**
     * font function used to init the Componenets with a modern Font
     * @param size of the font
     * @return
     */
    public Font fnt(float size){
        return Frame.fnt(size);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        background = new src.frames.components.background();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnDelete = new src.frames.components.button();
        btnEdit = new src.frames.components.button();
        headerPanel = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        background.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setFont(fnt(16f));
        lblName.setText("Name");

        lblAddress.setFont(fnt(13f));
        lblAddress.setText("Adress");

        lblDate.setFont(fnt(12f));
        lblDate.setText("Date");

        btnDelete.setBackground(new java.awt.Color(205, 61, 100));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons/icons8-entfernen-24.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDeleteMousePressed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(69, 125, 88));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/icons/icons8-bearbeiten-24.png"))); // NOI18N
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditMousePressed(evt);
            }
        });

        headerPanel.setBackground(new java.awt.Color(15, 95, 83));

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblName)
                    .addComponent(lblAddress))
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddress)
                .addGap(68, 68, 68)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * MousePressedListener to create a new deleteAppointment Alert Frame
     * @param evt 
     */
    private void btnDeleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMousePressed
        new Alert(dashboard, appointment, user).setVisible(true);
    }//GEN-LAST:event_btnDeleteMousePressed
    /**
     * MousePressedListener to create a new moveAppointment Alert Frame
     * @param evt 
     */
    private void btnEditMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMousePressed
        new moveAppointment(dashboard, appointment, user).setVisible(true);
    }//GEN-LAST:event_btnEditMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private src.frames.components.background background;
    private src.frames.components.button btnDelete;
    private src.frames.components.button btnEdit;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables
}
