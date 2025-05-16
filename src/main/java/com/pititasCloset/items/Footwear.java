package com.pititasCloset.items;

import com.pititasCloset.utils.*;

import java.time.LocalDate;
import java.util.List;

public class Footwear extends ClothingItem {
    private utils.Enums.FootwearType footwearType;
    private utils.Enums.FootwearClosureType footwearClosureType;
    private boolean waterproof;

    public Footwear(String id, String name, String color, String brand, String material,
                    utils.Enums.Size size, utils.Enums.Season season, LocalDate purchaseDate, String imageUrl,
                    List<String> tags, boolean favorite, int wearCount, LocalDate lastWorn,
                    utils.Enums.FootwearType shoeType, utils.Enums.FootwearClosureType closureType, Boolean waterproof) {
        super(id, name);
        this.footwearType = shoeType;
        this.footwearClosureType = closureType;
        this.waterproof = waterproof;
    }

    public Footwear(String id, String name){
        super(id, name);
    }
}