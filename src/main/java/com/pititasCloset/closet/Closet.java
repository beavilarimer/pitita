package com.pititasCloset.closet;

import com.pititasCloset.items.*;
import java.util.*;
import java.util.stream.Collectors;

public class Closet {
    private Set<ClothingItem> items;
    private Map<String, List<ClothingItem>> collections;
    private Set<String> tags;
    private Set<Outfit> Outfits;

    public Closet() {
        this.items = new HashSet<>();
        this.collections = new HashMap<>();
        this.tags = new HashSet<>();
        this.outfits = new HashSet();
    }

    public void addItem(ClothingItem item) {
        items.add(item);
    }

    public void removeItem(ClothingItem item) {
        items.remove(item);
        // something so that it auto flags any collection that had that item
        // similar for outfit
    }

    /* Generic Clothing item getter */
    public <T extends ClothingItem> List<T> getItemsByType(Class<T> clazz) {
        return items.stream()
                .filter(clazz::isInstance)
                .map(clazz::cast)
                .collect(Collectors.toList());
    }

    /* Generic random Clothing item getter */
    public <T> T getRandomItemByType(Class<T> clazz) {
        if (items == null || items.isEmpty()){
            return null;
        }
        return getItemsByType(clazz).get(random.nextInt(items.size()));
    }

    public Set<ClothingItem> findByTag(String tag){
        Set <ClothingItem> taggedItems = new HashSet<>();
        for (ClothingItem item : items){
            if(item.hasTag(tag)){
                taggedItems.add(item);
            }
        }
        return taggedItems;
    }

    public Set<ClothingItem> findByTagAndType(String tag, Class<T> clazz){
        Set <ClothingItem> taggedItems = new HashSet<>();
        List<T> typeItems = getItemsByType(clazz);
        for (<T> item : typeItems){
            if(item.hasTag(tag)){
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

