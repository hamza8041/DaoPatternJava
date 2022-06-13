package Models;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Base {

    private String customerName;

    private List<Order>orders=new ArrayList<Order>();

    public Customer(int id, String customerName, List<Order> orders) {
        super(id);


        this.customerName = customerName;
        this.orders = orders;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
