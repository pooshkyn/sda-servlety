package pl.sda;

import java.util.ArrayList;
import java.util.List;

public class ItemSerivce {

    static List<Item> items = new ArrayList<>();

    static {
        items.add(new Item("1", "piłka"));
        items.add(new Item("2", "kwiatek"));
    }

    public static List<Item> findAll() {
        return items;
    }

    public static void addItem(String id, String name) {
        items.add(new Item(id, name));
    }
}
