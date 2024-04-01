package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.ArrayList;
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

    public MenuItem[] getItems() {
        ArrayList<MenuItem> itemsList = new ArrayList<>();
        for (MenuComponent component : menuComponents) {


                MenuItem[] items =  component.getItems();
                for (MenuItem item : items) {
                    itemsList.add(item);
                }



        }

        MenuItem[] res = new MenuItem[itemsList.size()];
        return itemsList.toArray(res);
    }



    public Iterator<MenuComponent> createIterator(){
        if(iterator==null){
            iterator=new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}

