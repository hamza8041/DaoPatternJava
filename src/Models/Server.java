package Models;

import java.util.ArrayList;
import java.util.List;

public class Server extends Employees {


    private List<Order> orders = new ArrayList<Order>();



    public Server(int id, String employeeName, long employeeSalary, List<Order> orders) {
        super(id, employeeName, employeeSalary);
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}

