package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MergerRepository {
    public ArrayList<Menu> getTheMenus() {
        CafeMenu cafeMenu=new CafeMenu();
        DinerMenu dinerMenu=new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        ArrayList<Menu> menus = new ArrayList<>();

     Menu cafe=new Menu("CafeMenu","cafe");
     Menu pancake=new Menu("PancakeMenu","pancake");
     Menu dinner=new Menu("DinnerMenu","Dinner");

     for (MenuItem m: dinerMenu.getMenuItems()){
         dinner.add(m);
     }
     menus.add(dinner);

     for (MenuItem m: pancakeHouseMenu.getMenuItems()){
         pancake.add(m);

     }
     menus.add(pancake);




//     for (MenuItem m: cafeMenu.getItems()){
//         cafe.add(m);
//     }
//     menus.add(cafe);


        return menus;
    }

}
