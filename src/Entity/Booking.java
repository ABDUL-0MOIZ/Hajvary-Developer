/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 *
 * @author j
 */
public class Booking {
    private int booking_id;
    private Appartment aprt;
    private Customer customer;
    private ArrayList<PaymentHistory> payment;
    private double downPayment;
    private double pay;//instalment pay at a time;
    private double remaning;
    private double  totalpay;
    private int noIns;
    private int noinsleft; 
            
            
            
            
    private String  startingdate;   
    private ArrayList<Instalment> instalment;

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getNoinsleft() {
        return noinsleft;
    }

    public void setNoinsleft(int noinsleft) {
        this.noinsleft = noinsleft;
    }

    public Booking() {
        instalment=new ArrayList();
        payment=new ArrayList();
        aprt=new Appartment();
        customer=new Customer();
        noinsleft=0;
    }

    
    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public Appartment getAprt() {
        return aprt;
    }
    
 
    public void setAprt(Appartment aprt) {
        this.aprt = aprt;
        
       remaning= aprt.getPrice() - downPayment;
         pay=   remaning/noIns;
         this.totalpay = downPayment;
         
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate dateObject = LocalDate.parse(startingdate, formatter); 
       
       for(int i=0 ; i <= noIns; i++){
           
          


        dateObject = dateObject.plusMonths(1);

      
       String instalmentdate  = dateObject.format(formatter);

           
         Instalment ins   = new Instalment(pay,instalmentdate);
    
             instalment.add(ins);
       
          
          
       }
    
       
    }
public void addPayments(PaymentHistory payment1){
        int i=0;
    if(noinsleft!=0){ 
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate dateObject = LocalDate.parse(payment1.getDate(), formatter);
  LocalDate dateObject2 = LocalDate.parse(instalment.get(i).getDate(), formatter);
    
  if(dateObject.isAfter(dateObject2)){
  payment1.setCharges(1000);
  totalpay += payment1.getPayment();
   remaning -=payment1.getPayment();
        payment.add(payment1);
         noinsleft--;
         manger.error("Paymet added Succefully with 1000 charges ");
         i++;
    }
    else{
      
        payment.add(payment1);
       noinsleft--;
       i++;
  manger.error("Paymet added Succefully"); 
    }
    }
    else{
        manger.error("ALL the Payment is Cleared");
    }
  
  
}
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<PaymentHistory> getPayment() {
        return payment;
    }

    public void setPayment(ArrayList<PaymentHistory> payment) {
        this.payment = payment;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getRemaning() {
        return remaning;
    }

    public void setRemaning(double remaning) {
        this.remaning = remaning;
    }

    public double getTotalpay() {
        return totalpay;
    }

    public void setTotalpay(double totalpay) {
        this.totalpay = totalpay;
    }

    public int getNoinstalments() {
        return noIns;
    }

    public void setNoinstalments(int noinstalments) {
        this.noIns = noinstalments;
        this.noinsleft=noIns;
       
        
    }

    public String getStartingdate() {
        return startingdate;
    }

    public void setStartingdate(String startingdate) {
        this.startingdate = startingdate;
    }

    public ArrayList<Instalment> getInstalment() {
        return instalment;
    }

    public void setInstalment(ArrayList<Instalment> instalment) {
        this.instalment = instalment;
    }
    
    
    
            
           
}
