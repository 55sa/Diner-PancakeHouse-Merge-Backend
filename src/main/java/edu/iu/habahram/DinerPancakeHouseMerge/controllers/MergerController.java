package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.CafeRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merge")
public class MergerController {
    @Autowired
    DinerRepository dinerRepository;
    @Autowired
    PancakeHouseRepository pancakeHouseRepository;
    @Autowired
    CafeRepository cafeRepository;
    @Autowired
    MergerRepository mergerRepository;

    @GetMapping
    public List<MenuItem> get() {

        List<MenuItem> menuItems = new ArrayList<>();


//        List<Menu> menus=mergerRepository.getTheMenus();
//        for (Menu menu:menus){
//            Iterator<MenuItem> Ites=menu.createIterator();
//            while (menu.createIterator().hasNext()){
//                menuItems.add(Ites.next());
//            }
//        }

//        Iterator<MenuItem> lunchItems = dinerRepository.getTheMenuIterator();
//        while (lunchItems.hasNext()) {
//            menuItems.add(lunchItems.next());
//        }
//
//        Iterator<MenuItem> breakfastItems = pancakeHouseRepository.getTheMenuIterator();
//        while (breakfastItems.hasNext()) {
//            menuItems.add(breakfastItems.next());
//        }
//
//        Iterator<MenuItem> dinnerItems = cafeRepository.getTheMenuIterator();
//        while (dinnerItems.hasNext()) {
//            menuItems.add(dinnerItems.next());
//        }

        return menuItems;
    }

}
