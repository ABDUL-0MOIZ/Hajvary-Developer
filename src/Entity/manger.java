/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author j
 */
public class manger {
    
  public static ArrayList<Appartment> aprt;
  public static ArrayList<Booking> book;
  public static ArrayList<Customer>  customer;
  
  static{
      aprt=new ArrayList();
      book=new ArrayList();
      customer=new ArrayList();
  }
  public static void udateAppartment(int id,Appartment aprt){
      for(int i=0;i<manger.aprt.size();i++)
     {
         if(id==manger.aprt.get(i).getUnit_Id()){
            manger.aprt.set(i, aprt);
            manger.error("Appartment is Updated Succesfully");
         }
              
     } 
  }

    public static ArrayList<Customer> getCustomer() {
        return customer;
    }

    public static void setCustomer(ArrayList<Customer> customer) {
        manger.customer = customer;
    }
  
  public void addAppartment(Appartment aprt){
     if(aprt!=null){
      manger.aprt.add(aprt);
      manger.error("succefully added");
              }
     else{
         manger.error("somting went rong");
     }
         
  }
 public static Appartment seacrh(int id){
    
     for(int i=0;i<aprt.size();i++)
     {
         if(id==aprt.get(i).getUnit_Id()){
             return aprt.get(i);
         }
              
     }
     return null;
      
  }
  public static void addBooking(Booking book){
   
        if(!book.getAprt().isStatus())
        {  
            book.getAprt().setStatus(true);
            manger.udateAppartment(book.getAprt().getUnit_Id(), book.getAprt());
         
    manger.book.add(book);
    }
        else{
            manger.error("appartment is already Booked");
        
    }
    
    
  }
  public static Customer customerSearch(String name){
       for(int i=0;i<customer.size();i++){
          if(name.equals(customer.get(i).getName())){
              return customer.get(i);
          }
         
      }
       return null;
  }
  public Booking Search(int id){
      for(int i=0;i<book.size();i++){
          if(id==book.get(i).getBooking_id()){
              return book.get(i);
          }
      }
      return null;
  }
public static void updateBooking(int id,Booking book){
    if(book!=null){
   for(int i=0;i<manger.book.size();i++){
          if(id==manger.book.get(i).getBooking_id()){
              manger.book.set(i, book);
          }
      }
    
    }
        
}
public static Booking search(int id){
    
   for(int i=0;i<manger.book.size();i++){
          if(id==manger.book.get(i).getBooking_id()){
              return manger.book.get(i);
          }
      
    
    }
   return null;
        
}
    public static ArrayList<Appartment> getAprt() {
        return aprt;
    }

    public static void setAprt(ArrayList<Appartment> aprt) {
        manger.aprt = aprt;
    }

    public static ArrayList<Booking> getBook() {
        return book;
    }

    public static void setBook(ArrayList<Booking> book) {
        manger.book = book;
    }
    
    public static void DeleteAppartment(int i){
        aprt.remove(i);
    }

    
    
   public static void error(String msg){
       JOptionPane.showMessageDialog(null, msg);
   }
}
