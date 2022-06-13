package Dao;

import Models.Server;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServerDao implements Generic<Server>{

    List<Server>servers=new ArrayList<Server>();
    @Override
    public void insert(Server server) {

        servers.add(server);
    }

    @Override
    public List<Server> getall() {
        return servers;
    }

    @Override
    public Optional<Server> getById(long id) {
        return Optional.ofNullable(servers.get((int)id));
    }

    @Override
    public void Update(Server server) {

        servers.get(server.getId()).setId(server.getId());
        servers.get(server.getId()).setEmployeeName(server.getEmployeeName());
        servers.get(server.getId()).setEmployeeSalary(server.getEmployeeSalary());
        servers.get(server.getId()).setOrders(server.getOrders());
        System.out.println("Servers updated");




    }

    @Override
    public void Delete(Server server) {


        servers.remove(server);

        System.out.println("Server Deleted");
    }
}
