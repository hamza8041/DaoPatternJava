package Models;

import java.util.ArrayList;
import java.util.List;

public class Chef extends Employees{

private String speciality;



//Aggregation
private List<Order>orders=new ArrayList<Order>();




    public Chef(int id, String employeeName, long employeeSalary, String speciality, List<Order> orders) {
        super(id, employeeName, employeeSalary);
        this.speciality = speciality;
        this.orders = orders;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
