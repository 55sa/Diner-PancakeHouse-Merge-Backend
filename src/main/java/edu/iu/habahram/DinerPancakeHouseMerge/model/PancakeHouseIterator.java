package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.*;

public class PancakeHouseIterator implements Iterator{
    int position = 0;
    List<MenuItem> Items;

    PancakeHouseIterator(List<MenuItem> Items){
        this.Items=Items;
    }
    @Override
    public boolean hasNext() {
        if (position >= Items.size() || Items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = Items.get(position);
        position = position + 1;
        return menuItem;
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (Items.get(position-1) != null) {

            Items.remove(position-1);
        }
    }
}
