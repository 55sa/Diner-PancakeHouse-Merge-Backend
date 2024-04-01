package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.CafeMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class CafeRepository {
    public Iterator<MenuItem> getTheMenuIterator() {
        CafeMenu cafeMenu=new CafeMenu();
        return cafeMenu.createIterator();
    }
}
