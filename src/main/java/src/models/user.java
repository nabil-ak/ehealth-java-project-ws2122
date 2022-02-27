/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.models;

import java.time.LocalDate;
import java.util.ArrayList;
import src.util.database;
/**
 *
 * User Model
 */
public class user {

    /**
     * id in the database
     */
    private int id;

    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

    /**
     * email
     */
    private String email;

    /**
     * firstname
     */
    private String firstname;

    /**
     * lastname
     */
    private String lastname;

    /**
     * gender
     */
    private String gender;

    /**
     * dateofbirth
     */
    private LocalDate dateofbirth;

    /**
     * street
     */
    private String street;

    /**
     * housenumber
     */
    private String housenumber;

    /**
     * city
     */
    private String city;

    /**
     * zipcode
     */
    private String zipcode;

    /**
     * lat (coordinates)
     */
    private double lat;

    /**
     * lng (coordinates)
     */
    private double lng;

    /**
     * healthinformation
     */
    private String healthinformation;

    /**
     * insurancename
     */
    private String insurancename;

    /**
     * insurancetype
     */
    private String insurancetype;

    /**
     * if the user is a admin
     */
    private boolean admin;
    
    /**
     * a list of appointments of the user
     */
    private ArrayList<appointment> appointments;
    
    /**
     * Constructor to create an empty user
     */
    public user(){
        admin = false;
        appointments = new ArrayList<appointment>();
    }

    /**
     * Constructor to create an user
     * @param id
     * @param username
     * @param password
     * @param email
     * @param firstname
     * @param lastname
     * @param gender
     * @param dateofbirth
     * @param street
     * @param housenumber
     * @param city
     * @param zipcode
     * @param lat
     * @param lng
     * @param healthinformation
     * @param insurancename
     * @param insurancetype
     * @param admin
     */
    public user(int id,String username, String password, String email, String firstname, String lastname, String gender, LocalDate dateofbirth, String street, String housenumber, String city, String zipcode, double lat, double lng, String healthinformation, String insurancename, String insurancetype, boolean admin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.street = street;
        this.housenumber = housenumber;
        this.city = city;
        this.zipcode = zipcode;
        this.lat = lat;
        this.lng = lng;
        this.healthinformation = healthinformation;
        this.insurancename = insurancename;
        this.insurancetype = insurancetype;
        this.admin = admin;
        
        appointments = null;
    }

    /**
     *
     * Getter and Setter Methods
     */
    
    
    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

    
    public String getUsername() {
        return username;
    }

    
    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getFirstname() {
        return firstname;
    }

    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    public String getLastname() {
        return lastname;
    }

    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

   
    public String getGender() {
        return gender;
    }

    
    public void setGender(String gender) {
        this.gender = gender;
    }

   
    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    
    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    
    public String getStreet() {
        return street;
    }

   
    public void setStreet(String street) {
        this.street = street;
    }

    
    public String getHousenumber() {
        return housenumber;
    }

    
    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    
    public String getCity() {
        return city;
    }

    
    public void setCity(String city) {
        this.city = city;
    }

    
    public String getZipcode() {
        return zipcode;
    }

   
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    
    public double getLat() {
        return lat;
    }

    
    public void setLat(double lat) {
        this.lat = lat;
    }

   
    public double getLng() {
        return lng;
    }

    
    public void setLng(double lng) {
        this.lng = lng;
    }
    
    
    public String getHealthinformation() {
        return healthinformation;
    }

    
    public void setHealthinformation(String healthinformation) {
        this.healthinformation = healthinformation;
    }

    
    public String getInsurancename() {
        return insurancename;
    }

    
    public void setInsurancename(String insurancename) {
        this.insurancename = insurancename;
    }

    
    public String getInsurancetype() {
        return insurancetype;
    }

    
    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
    }

    
    public boolean isAdmin() {
        return admin;
    }

    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

   
    public ArrayList<appointment> getAppointments() {
        return appointments;
    }

    
    public void setAppointments(ArrayList<appointment> appointments) {
        this.appointments = appointments;
    }
    
    /**
     * add an appointment at the right position(the appointments are orderd by date and time)
     * @param appointment
     */
    public void addAppointment(appointment appointment){
        for(int i = 0; i < appointments.size(); i++){
            if(appointments.get(i).getDateandtime().isBefore(appointment.getDateandtime())){
                appointments.add(i, appointment);
                return;
            }
        }
        appointments.add(appointment);
    }
    
    /**
     * remove an appointment
     * @param appointment
     */
    public void removeAppointment(appointment appointment){
        appointments.remove(appointment);
    }
    
}
