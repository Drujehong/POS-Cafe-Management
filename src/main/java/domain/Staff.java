/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


/**
 *
 * @author Andrew John
 */
public class Staff {

    /**
     * Private data fields
     */
    private String staffId;
    private String firstName;
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
     * @param firstName
     * @param lastName
     */
    public Staff(String staffId, String firstName, String lastName) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets the staff ID.
     *
     * @return the staff ID as an Integer.
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * Gets the surname.
     *
     * @return the first name as a String.
     */
    public String getFirstName() {
        return firstName;
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
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    /**
     * Sets the surname.
     *
     * @param firstName the surname to set as a String.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the last name to set as a String.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
        return "Staff ID: " + staffId + ", Last Name: " + lastName;
    }

}
