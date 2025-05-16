package com.pititasCloset.items;

import com.pititasCloset.utils.*;

import java.time.LocalDate;
import java.util.List;

public class Accessory extends ClothingItem {
    private utils.Enums.AccessoryType accessoryType;

    public Accessory(String id, String name, String color, utils.Enums.AccessoryType type,
                     String brand, String pattern, String size) {
        super(id, name);
        this.accessoryType = type;
    }

    public Accessory(String id, String name){
        super(id, name);
    }

    // getters, setters here
}
