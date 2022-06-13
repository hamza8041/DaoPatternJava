package Dao;


import Models.Customer;

import java.io.Flushable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDao implements Generic<Customer>{

    List<Customer>customers=new ArrayList<Customer>();
    @Override
    public void insert(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> getall() {
        return customers;
    }

    @Override
    public Optional<Customer> getById(long id) {
        return Optional.ofNullable(customers.get((int)id));
    }

    @Override
    public void Update(Customer customer) {

        customers.get(customer.getId()).setCustomerName(customer.getCustomerName());
        customers.get(customer.getId()).setOrders(customer.getOrders());
    }

    @Override
    public void Delete(Customer customer) {
customers.remove(customer);
    }
}
