package com.pititasCloset.items;

import com.pititasCloset.utils.*;
import java.time.LocalDate;
import java.util.List;

public abstract class ClothingItem {
    private final String id;
    private String name;
    private String color;
    private String brand;
    private String material;
    private Enums.Size size;
    private Enums.ClothingItemType itemType;
    private Enums.Season season;
    private LocalDate purchaseDate;
    private String imageUrl;
    private List<String> tags;
    private boolean favorite;
    private int wearCount;
    private LocalDate lastWorn;


    // Constructor
    public ClothingItem(String id, String name, String color, String brand, String material,
                        Enums.Size size, Enums.ClothingItemType itemType,
                        Enums.Season season, String imageUrl){
        this.id = id;
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.itemType = itemType;
        this.season = season;
        this.purchaseDate = LocalDate.now();
        // ideally things would populate from like tags or something like that
        this.imageUrl = imageUrl;
        this.tags = new ArrayList<String>();
        this.favorite = false;
        this.wearCount = 0;
        this.lastWorn = null;
    }

    public ClothingItem(String id, String name){
        this.id = id;
        this.name = name;
    }

    // get
    public String getName(){
        return name;
    }

    public List<String> getBasicAttributes(){
        return Arrays.asList(itemType.name(), name, color, brand, material,
                size.name());
    }

    public String getSeason(){
        return season.name();
    }

    public List<String> getTags(){
        return tags;
    }

    public void wear(){
        this.wearCount ++;
    }

    public Boolean addTag(String tag){
        if (tag != null && !tags.contains(tag)){
            tags.add(tag);
            return true;
        }
        return false;
    }

    public Boolean removeTag(String tag){
        return tags.remove(tag);
    }

    public Boolean hasTag(String tag){
        for (String t : tags){
            if (t.equals(tag)){
                return true;
            }
        }
        return false;
    }



}

// other things stored in your closet shoes, accessories, coats?

