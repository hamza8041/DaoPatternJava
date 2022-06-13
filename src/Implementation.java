import Dao.CustomerDao;
import Dao.MenuDao;
import Dao.OrderDao;
import Dao.ServerDao;
import Models.*;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.List;

public class Implementation {

    public static void main(String[] args) {


        MenuDao MD=new MenuDao();
        CustomerDao CD=new CustomerDao();
        OrderDao OD=new OrderDao();
ServerDao SD=new ServerDao();
        Menu M1=new Menu(01,01,"Pasta",01,700);
        Menu M2=new Menu(02,02,"Pizza",01,1100);
        MD.insert(M1);
        MD.insert(M2);

        //Display Menu

        for(Menu M:MD.getall())
        {
            System.out.println("Menu is " + M.getItemName()+" and their amount is" + M.getAmount());

        }


        //Orders

        List<Order>orders=new ArrayList<Order>();
        Customer C=new Customer(01,"Jamil",orders);

        Server S=new Server(01,"Asad",20000,orders);

        orders.add(new Order(01,C,S,M1));
        System.out.println(orders.get(0).getMenu().getItemName());


        Order O1=new Order(02,C,S,M2);
        OD.insert(O1);


        for (Order O:OD.getall())
        {
            System.out.println(O.getMenu().getItemName());

        }

       // Update Menu
        M1.setItemName("Burger");
       MD.Update(M1);

       // Delete a Menu
        MD.Delete(M1);















    }
}
