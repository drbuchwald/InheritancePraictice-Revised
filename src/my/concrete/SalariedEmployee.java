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
public class SalariedEmployee extends Employee {
    
    private double yearlySalary;
    
    @Override
    public double getAnnualWages(){         
               
        return yearlySalary;
    }
    
}
