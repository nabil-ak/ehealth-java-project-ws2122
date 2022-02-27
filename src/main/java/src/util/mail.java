/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.util;

import java.time.LocalDateTime;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;

import src.models.*;

/**
 *
 * Mail API
 */
public class mail {
    
    /**
     * Session Object
     */
    private Session session;
    
    /**
     * Message Object
     */
    private MimeMessage message;
    
    /**
     * Subject of the Mail
     */
    private String subject;
    
    /**
     * The Mail Body
     */
    private String mailbody;
    
    /**
     * Send Reminder Mail
     * @param appointment
     * @param user
     */
    public static void appointmentReminder(appointment appointment, user user){
        Thread thread = new Thread("Reminder Appointment Mail") {
            public void run(){
                mail mail = new mail();
                mail.subject = "Dont forget your Appointment with "+appointment.getDoctor().getName();
                mail.mailbody = mailHTML.setMailBodyReminder(appointment,user);
                mail.setupProperties();
                mail.draftReminderMail(user);
                mail.sendMail();
            }
        };
        thread.start();
    }
    
    /**
     * Send Cancel-Appointment Mail
     * @param appointment
     * @param user
     */
    public static void appointmentCancel(appointment appointment, user user){
        Thread thread = new Thread("Cancel Appointment Mail") {
            public void run(){
                mail mail = new mail();
                mail.subject = "Your Appointment with "+appointment.getDoctor().getName()+" got cancelled";
                mail.mailbody = mailHTML.setMailBodyCancel(appointment,user);
                mail.setupProperties();
                mail.draftReminderMail(user);
                mail.sendMail();
            }
        };
        thread.start();
    }
    
    /**
     * Send Move-Appointment Mail
     * @param appointment
     * @param user
     * @param old old Date and Time
     */
    public static void appointmentMove(appointment appointment, user user, LocalDateTime old){
        Thread thread = new Thread("Move Appointment Mail") {
            public void run(){
                mail mail = new mail();
                mail.subject = "Your Appointment with "+appointment.getDoctor().getName()+" got rescheduled";
                mail.mailbody = mailHTML.setMailBodyMove(appointment,user,old);
                mail.setupProperties();
                mail.draftReminderMail(user);
                mail.sendMail();
            }
        };
        thread.start();
    }
    
    /** 
     * Send Create-Appointment Mail
     * @param appointment
     * @param user
     */
    public static void appointmentCreated(appointment appointment, user user){
        Thread thread = new Thread("New Appointment Mail") {
            public void run(){
                mail mail = new mail();
                mail.subject = "Confirmation of your appointment with "+appointment.getDoctor().getName();
                mail.mailbody = mailHTML.setMailBodyCreated(appointment,user);
                mail.setupProperties();
                mail.draftReminderMail(user);
                mail.sendMail();
            }
        };
        thread.start();
    }

    /**
     * setup Session
     */
    private void setupProperties() {
        //domain, port, authentication, tls 
        Properties properties = System.getProperties();
        properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        session = Session.getDefaultInstance(properties,null);
        
    }

    /**
     * setup Message Object
     * @param user
     */
    private void draftReminderMail(user user) //throws IOException
    {   
        message = new MimeMessage(session);
        try{
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(user.getEmail()));
            message.setSubject(subject);
            message.setText(mailbody,null, "html");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Send the Mail
     */
    private void sendMail() {
        String user = "EMAIL";
        String password = "PASSWORDforTheMAIL";
        String emailHost = "smtp.gmail.com";
        
        try{
            Transport transport = session.getTransport("smtp");
            transport.connect(emailHost, user, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
}
