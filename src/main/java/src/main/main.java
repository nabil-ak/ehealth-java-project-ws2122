/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.main;
import java.time.LocalDateTime;
import java.util.ArrayList;
import src.frames.*;
import src.util.*;
import src.models.*;
import java.util.concurrent.TimeUnit;
/**
 *
 * Main class (Entrypoint of the Software)
 */
public class main {

    /**
     * main method
     * @param args
     */
    public static void main(String args[]) {
        /**
         * Start checking reminders every minute in a new thread to not block the main program
         */
        Thread thread = new Thread("Reminder Checker") {
            public void run(){
                while(true){
                    try{
                        ArrayList<appointment> appointments = database.getReminderNotSendAppointments();
                        for(int i = 0;i < appointments.size();i++){
                            if(appointments.get(i).getReminder().isBefore(LocalDateTime.now())){
                                user user = database.getUserofAppointment(appointments.get(i).getId());
                                mail.appointmentReminder(appointments.get(i), user);
                                database.reminderSend(appointments.get(i));
                            }
                        }
                        TimeUnit.MINUTES.sleep(1);
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        
        new Login().setVisible(true);
    }

}
