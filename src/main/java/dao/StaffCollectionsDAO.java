/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.Collection;
import java.util.HashSet;
import domain.Staff;

/**
 *
 * @author Andrew John
 */
public class StaffCollectionsDAO {
    
    /**
     * private data fields for StaffCollectionDAO
     */
    private static Collection<Staff> staffs = new HashSet<>();
    private static Collection<String> staffIds = new HashSet<>();
    private static boolean testDataAdded = true;
    private static final boolean DEBUGGING = true;
    
    /**
     * Default constructor for StaffCollectionDAO object
     */
    public StaffCollectionsDAO() {
        if(DEBUGGING) {
            Staff staff1 = new Staff("0001", "Johnathan", "Lake");
            Staff staff2 = new Staff("0002", "Mikey", "Ninaj");
            Staff staff3 = new Staff("0003", "Donald", "Mclovin");
            
            if(testDataAdded) {
                
                saveStaff(staff1);
                saveStaff(staff2);
                saveStaff(staff3);
                
                System.out.println("StaffCollectionsDAO: Test Data successfully added.");
                testDataAdded = false;
            }
        } 
    }
    
    public void saveStaff(Staff staff) {
        staffs.add(staff);
        staffIds.add(staff.getStaffId());
        if(DEBUGGING) {
            System.out.println("StaffCollectionsDAO: " + staffs.toString());
        }
    }
    
    public void removeStaff(Staff staff) {
        if(staffs.remove(staff)) {
            staffIds.remove(staff.getStaffId());
            
            System.out.println("StaffCollectionsDAO: Staff removed successfully.");
        } else {
            System.out.println("StaffCollectionsDAO: Staff not found in the collection.");
        }
    }
    
    public Staff searchStaffById(String searchStaffId) {
        Staff returnedStaff = null;
        if(searchStaffId.equals("")) {
            System.out.println("StaffCollectionsDAO: There is nothing in searchStaffId.");
        } else {
            for(Staff s : staffs) {
                if(s.getStaffId().equals(searchStaffId)) {
                    returnedStaff = s;
                }
            }
        }
        return returnedStaff;
    }
    
    public Collection<Staff> getStaffs() {
        return staffs;
    }

    public Collection<String> getStaffIds() {
        return staffIds;
    }
    
}
