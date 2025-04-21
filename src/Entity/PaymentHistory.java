/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author j
 */
public class PaymentHistory {
    private double payment;
    private String date;
   private double charges;


  
  
    public PaymentHistory(double payment, String date,  double charges) {
        this.payment = payment;
        this.date = date;
       
        this.charges = charges;
        
    }

    
    public PaymentHistory() {
  this.charges=0;  
    }

    public double getPayment() {
        return payment;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

  
    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
}
