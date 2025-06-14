package com.pititasCloset.items;

import com.pititasCloset.utils.Enums.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.*;

public abstract class ClothingItem {
    private final String id;
    private String name;
    @Getter
    private String color;
    private String brand;
    private String material;
    private Size size;
    private ClothingItemType itemType;
    private Season season;
    private LocalDate purchaseDate;
    private String imageUrl;
    @Getter
    private List<String> tags;
    private boolean favorite;
    private int wearCount;
    private LocalDate lastWorn;


    // Constructor
    public ClothingItem(String id, String name, String color, String brand, String material,
                        Size size, ClothingItemType itemType,
                        Season season, String imageUrl){
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

    public List<String> getBasicAttributes(){
        return Arrays.asList(itemType.name(), name, color, brand, material,
                size.name());
    }

    public String getSeason(){
        return season.name();
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

