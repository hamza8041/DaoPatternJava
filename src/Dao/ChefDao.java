package Dao;

import Models.Chef;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChefDao implements Generic<Chef>{


    List<Chef>chefs=new ArrayList<Chef>();

    @Override
    public void insert(Chef chef) {

        chefs.add(chef);

    }

    @Override
    public List<Chef> getall() {
        return chefs;
    }

    @Override
    public Optional<Chef> getById(long id) {
        return Optional.ofNullable(chefs.get((int)id));
    }

    @Override
    public void Update(Chef chef) {

        chefs.get(chef.getId()).setSpeciality(chef.getSpeciality());
        chefs.get(chef.getId()).setOrders(chef.getOrders());
        System.out.println("Chef data updated");
    }

    @Override
    public void Delete(Chef chef) {

        chefs.remove(chef);
        System.out.println("Chef Removed");
    }

}
