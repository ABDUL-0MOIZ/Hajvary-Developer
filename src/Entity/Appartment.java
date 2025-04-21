/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author j
 */
public class Appartment {
   private String aprtname;
   private String building;
   private int unit_Id;
   private  double price;
   private boolean status;

    public Appartment() {
    status=false;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Appartment{" + "aprtname=" + aprtname + ", building=" + building + ", unit_Id=" + unit_Id + ", price=" + price + '}';
    }
    

    public Appartment(String aprtname, String building, int unit_Id, double price) {
        this.aprtname = aprtname;
        this.building = building;
        this.unit_Id = unit_Id;
        this.price = price;
    }

    public String getAprtname() {
        return aprtname;
    }

    public void setAprtname(String aprtname) {
        this.aprtname = aprtname;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getUnit_Id() {
        return unit_Id;
    }

    public void setUnit_Id(int unit_Id) {
        this.unit_Id = unit_Id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
   
}
