/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;

/**
 *
 * @author Andrew John
 */
public class Staff {

    /**
     * Private data fields
     */
    private Integer staffId;
    private String surname;
    private String lastName;

    /**
     * Default constructor
     */
    public Staff() {
    }

    /**
     * Constructor for Staff
     *
     * @param staffId
     * @param surname
     * @param lastName
     */
    public Staff(Integer staffId, String surname, String lastName) {
        this.staffId = staffId;
        this.surname = surname;
        this.lastName = lastName;
    }

    /**
     * Gets the staff ID.
     *
     * @return the staff ID as an Integer.
     */
    public Integer getStaffId() {
        return staffId;
    }

    /**
     * Gets the surname.
     *
     * @return the surname as a String.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Gets the last name.
     *
     * @return the last name as a String.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the staff ID.
     *
     * @param staffId the staff ID to set as an Integer.
     */
    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    /**
     * Sets the surname.
     *
     * @param surname the surname to set as a String.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the last name to set as a String.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
