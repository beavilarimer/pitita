package com.pititasCloset.closet;

import com.pititasCloset.items.*;
import java.util.*;
import java.util.stream.Collectors;

public class Closet {
    private Set<ClothingItem> items;
    private Map<String, List<ClothingItem>> collections;

    public Closet() {
        this.items = new HashSet<>();
        this.collections = new HashMap<>();
    }

    public void addItem(ClothingItem item) {
        items.add(item);
    }

    // Generic getter
    public <T extends ClothingItem> List<T> getItemsByType(Class<T> clazz) {
        return items.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .collect(Collectors.toList());
    }

    //    public String generateId(){
//        String id;
//        do {
//            id = UUID.randomUUID().toString();
//        } while (ids.contains(id));
//
//        ids.add(id);
//        return id;
//    }

    public void removeItem(ClothingItem item){
        this.items.remove(item);
        // something so that it auto flags any collection that had that item
    }

    public Set<ClothingItem> findByTag(String tag){
        Set <ClothingItem> taggedItems = new HashSet<>();
        for (ClothingItem item : items){
            if(item.containsTag(tag)){
                taggedItems.add(item);
            }
        }
        return taggedItems;
    }

    // think this design through a bit more
    public void createCollection(String name, List<ClothingItem> items){
        collections.put(name, items);
    }
}

