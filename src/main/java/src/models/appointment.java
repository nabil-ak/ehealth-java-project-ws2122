/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.models;
import java.time.LocalDateTime;
/**
 *
 * Appointment Model
 */
public class appointment {

    /**
     * id in the database
     */
    private int id;

    /**
     * the doctor of the appointment
     */
    private doctor doctor;

    /**
     * the date and time of the appointment
     */
    private LocalDateTime dateandtime;

    /**
     * the data and time when the reminder mail should be send
     */
    private LocalDateTime reminder;

    /**
     * the healthproblem of the user
     */
    private String healthproblem;

    /**
     * true if the reminder-mail was send, otherwise false
     */
    private boolean remindercheck;
        
    /**
     * Constructor to create an appointment
     * @param id
     * @param doctor
     * @param dateandtime
     * @param reminder
     * @param healthproblem
     * @param remindercheck
     */
    public appointment(int id, doctor doctor, LocalDateTime dateandtime, LocalDateTime reminder, String healthproblem, boolean remindercheck) {
        this.id = id;
        this.doctor = doctor;
        this.dateandtime = dateandtime;
        this.reminder = reminder;
        this.healthproblem = healthproblem;
        this.remindercheck = remindercheck;
    }
    
    /**
     * Constructor to create an empty appointment
     */
    public appointment(){}

    /**
     * Get ID
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set ID
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get Doctor 
     * @return doctor
     */
    public doctor getDoctor() {
        return doctor;
    }

    /**
     * Set Doctor
     * @param doctor
     */
    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Get Date an Time
     * @return dateandtime
     */
    public LocalDateTime getDateandtime() {
        return dateandtime;
    }

    /**
     * Set Date and Time
     * @param dateandtime
     */
    public void setDateandtime(LocalDateTime dateandtime) {
        this.dateandtime = dateandtime;
    }

    /**
     * Get Reminder
     * @return reminder
     */
    public LocalDateTime getReminder() {
        return reminder;
    }

    /**
     * Set Reminder
     * @param reminder
     */
    public void setReminder(LocalDateTime reminder) {
        this.reminder = reminder;
    }

    /**
     * Get Healthproblem
     * @return healthproblem
     */
    public String getHealthproblem() {
        return healthproblem;
    }

    /**
     * Set Healthproblem
     * @param healthproblem
     */
    public void setHealthproblem(String healthproblem) {
        this.healthproblem = healthproblem;
    }

    /**
     * is Reminder checked
     * @return remindercheck
     */
    public boolean isRemindercheck() {
        return remindercheck;
    }

    /**
     * set Reminder
     * @param remindercheck
     */
    public void setRemindercheck(boolean remindercheck) {
        this.remindercheck = remindercheck;
    }
        
    
        
}
