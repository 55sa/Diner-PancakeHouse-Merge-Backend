package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Menu extends MenuComponent {
    Iterator<MenuComponent> iterator=null;
    ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public MenuItem[] getItems() {
        ArrayList<MenuItem> itemsList = new ArrayList<>();

        Iterator<MenuComponent> iterator = createIterator();
        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();

            if (component instanceof MenuItem) {
                itemsList.add((MenuItem) component);
            }

            else if (component instanceof Menu) {
                Collections.addAll(itemsList, component.getItems());
            }
        }

        return itemsList.toArray(new MenuItem[0]);
    }




    public Iterator<MenuComponent> createIterator(){
        if(iterator==null){
            iterator=new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}

