/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.models;

/**
 *
 * Symptom Model
 */
public class symptom {

    /**
     *  name of the symptom
     */
    private String name;

    /**
     *  doctortype in german for the google maps api
     */
    private String doctortype;

    /**
     * Constructor to create an symptom
     * @param name of the symptom
     * @param doctortype of the symptom
     */
    public symptom(String name, String doctortype) {
        this.name = name;
        this.doctortype = doctortype;
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
     * Get Doctortype
     * @return doctortype
     */
    public String getDoctortype() {
        return doctortype;
    }

    /**
     * Set Doctortype
     * @param doctortype
     */
    public void setDoctortype(String doctortype) {
        this.doctortype = doctortype;
    }
       
       
}
