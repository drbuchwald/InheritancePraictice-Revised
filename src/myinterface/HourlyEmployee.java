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
public class HourlyEmployee implements Employee {

    private int hoursWorkedPerWeek;
    private int hourlyRate;
    private final static double OVERTIME_MULTIPLIER = 1.5;

    private String firstName;
    private String lastName;
    private String idNumber;
    
    
  @Override
    public double getAnnualWages() {
        double wagesEarned = 0;
        if (hoursWorkedPerWeek > 40) {
            wagesEarned = ((hoursWorkedPerWeek - 40) * OVERTIME_MULTIPLIER);
        }else{
                wagesEarned = hoursWorkedPerWeek * hourlyRate;
        }
        return wagesEarned;
    }

    public int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
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
    
    
    
    
    
  