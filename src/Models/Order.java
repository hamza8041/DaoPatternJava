package Models;

import java.util.ArrayList;
import java.util.List;

public class Order extends Base {


private Customer customer;
private Server server;


//Composition
private Menu menu;

    public Order(int id, Customer customer, Server server, Menu menu) {
        super(id);
        this.customer = customer;
        this.server = server;
        this.menu = menu;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
