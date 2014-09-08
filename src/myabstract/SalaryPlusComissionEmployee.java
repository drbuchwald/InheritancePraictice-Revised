/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;







/**
 *
 * @author Dan
 */
public class SalaryPlusComissionEmployee extends SalariedEmployee {

    private double yearlySalary;
    private double commission;
    private double yearlySalaryPlusComission;

    @Override
    public double getAnnualWages() {
        if (commission > 0) {
            yearlySalaryPlusComission = yearlySalary + commission;
        }
        return yearlySalaryPlusComission;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getYearlySalaryPlusComission() {
        return yearlySalaryPlusComission;
    }

    public void setYearlySalaryPlusComission(double yearlySalaryPlusComission) {
        this.yearlySalaryPlusComission = yearlySalaryPlusComission;
    }

    
}
