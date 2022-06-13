package Dao;

import Models.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MenuDao implements Generic<Menu>{

    List<Menu>menus=new ArrayList<Menu>();
    @Override
    public void insert(Menu menu) {
        menus.add(menu);

    }

    @Override
    public List<Menu> getall() {
        return menus;
    }

    @Override
    public Optional<Menu> getById(long id) {
        return Optional.ofNullable(menus.get((int)id));
    }

    @Override
    public void Update(Menu menu) {


        menus.get(menu.getId()).setItemId(menu.getItemId());
        menus.get(menu.getId()).setItemName(menu.getItemName());
        menus.get(menu.getId()).setQuantity(menu.getQuantity());
        menus.get(menu.getId()).setAmount(menu.getAmount());
        System.out.println("Menu updated");



    }

    @Override
    public void Delete(Menu menu) {
        menus.remove(menu);
        System.out.println("Menu Deleted");


    }

}
