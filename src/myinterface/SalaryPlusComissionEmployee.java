/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;





/**
 *
 * @author Dan
 */
public class SalaryPlusComissionEmployee extends SalariedEmployee {

    private double yearlySalary;
    private double commission;
    private double yearlySalaryPlusComission;
    private String firstName;
    private String lastName;
    private String idNumber;

    @Override
    public double getAnnualWages() {
        if (commission > 0) {
            yearlySalaryPlusComission = yearlySalary + commission;
        }
        return yearlySalaryPlusComission;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
 
      
    
}
