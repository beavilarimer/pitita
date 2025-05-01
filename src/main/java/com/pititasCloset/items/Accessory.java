package com.pititasCloset.items;

import com.pititasCloset.enums.ClothingItemType;
import com.pititasCloset.enums.Season;
import com.pititasCloset.enums.Size;

import java.time.LocalDate;
import java.util.List;

public class Accessory extends ClothingItem {
    private Enums.AccessoryType accessoryType;

    public Accessory(String id, String name, String color, Enums.AccessoryType type,
                     String brand, String pattern, String size) {
        super(id, name);
        this.accessoryType = type;
    }

    public Accessory(String id, String name){
        super(id, name);
    }

    // getters, setters here
}
