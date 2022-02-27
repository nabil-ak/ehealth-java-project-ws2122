/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.frames.tabs.DashboardComponents;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * Appointmentpanel who contains all Appointments
 */
public class appointmentsPanel extends JPanel{

    /**
     *  Constructor to create new Appointment-Panel
     *  Uses the WarpLayout(updated FlowLayout to automatically put elements on a new row)
     */
    public appointmentsPanel(){
        setOpaque(false);
        setBackground(new Color(248, 249, 254));
        setLayout(new WrapLayout(WrapLayout.LEFT, 25, 25));
    }
}
