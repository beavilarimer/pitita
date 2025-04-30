package closet;
import items.ClothingItem;

import java.util.*;

public class Closet {
    private Set<ClothingItem> items;
    private Set<String> ids;
    private Map<String, List<ClothingItem>> collections;

    public Closet() {
        items = new HashSet<>();
        ids = new HashSet<>();
        collections = new HashMap<>();
    }

    public String generateId(){
        String id;
        do {
            id = UUID.randomUUID().toString();
        } while (ids.contains(id));

        ids.add(id);
        return id;
    }

    public void createTop(String name){
        String id = generateId();
        ids.add(id);
        ClothingItem newTop = new Top(id, name);
        items.add(newTop);
    }

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
