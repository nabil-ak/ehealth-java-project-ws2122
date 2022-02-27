/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.models;

/**
 *  
 * Doctor Model
 */
public class doctor {

    /**
     * Place_Id provided by Google Maps API
     */
    private String place_id;

    /**
     * Name of the Doctor
     */
    private String name;

    /**
     * Address of the Doctor
     */
    private String address;
    
    /**
     * Constructor to create an doctor
     * @param place_id by google maps api
     * @param name of the doctor
     * @param address of the doctor
     */
    public doctor(String place_id, String name, String address) {
        this.place_id = place_id;
        this.name = name;
        this.address = address;
    }

    /**
     * Get Place_ID
     * @return
     */
    public String getPlace_id() {
        return place_id;
    }

    /**
     * Set Place_ID
     * @param place_id
     */
    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    /**
     * Get Name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set Name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get Address
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set Address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

}
