package com.pititasCloset.items;

import com.pititasCloset.utils.Enums.*;

import java.time.LocalDate;
import java.util.List;

public class Footwear extends ClothingItem {
    private FootwearType footwearType;
    private FootwearClosureType footwearClosureType;
    private boolean waterproof;

    public Footwear(String id, String name, String color, String brand, String material,
                    Size size, Season season, LocalDate purchaseDate, String imageUrl,
                    List<String> tags, boolean favorite, int wearCount, LocalDate lastWorn,
                    FootwearType shoeType, FootwearClosureType closureType, Boolean waterproof) {
        super(id, name);
        this.footwearType = shoeType;
        this.footwearClosureType = closureType;
        this.waterproof = waterproof;
    }

    public Footwear(String id, String name){
        super(id, name);
    }
}