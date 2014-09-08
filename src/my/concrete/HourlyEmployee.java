/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.concrete;

/**
 *
 * @author Dan
 */
public class HourlyEmployee extends Employee {

    private int hoursWorkedPerWeek;
    private int hourlyRate;
    private static final double OVERTIME_MULTIPLIER = 1.5;

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

   
}
