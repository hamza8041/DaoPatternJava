package Dao;

import Models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderDao implements Generic<Order>{

    List<Order>orders=new ArrayList<>();

    @Override
    public void insert(Order order) {
        orders.add(order);
    }

    @Override
    public List<Order> getall() {
        return orders;
    }

    @Override
    public Optional<Order> getById(long id) {
        return Optional.ofNullable(orders.get((int)id));

    }

    @Override
    public void Update(Order order) {
orders.get(order.getId()).setCustomer(order.getCustomer());
orders.get(order.getId()).setServer(order.getServer());
orders.get(order.getId()).setMenu(order.getMenu());
        System.out.println("Orders Updated");


    }

    @Override
    public void Delete(Order order) {

        orders.remove(order);
        System.out.println("Orders removed");
    }
}
