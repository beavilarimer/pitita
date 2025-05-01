package com.pititasCloset.items;

import com.pititasCloset.utils.ClothingItemType;
import com.pititasCloset.utils.Season;
import com.pititasCloset.utils.Size;

import java.time.LocalDate;
import java.util.List;

public class Footwear extends ClothingItem {
    private Enums.FootwearType footwearType;
    private Enums.FootwearClosureType footwearClosureType;
    private boolean waterproof;

    public Footwear(String id, String name, String color, String brand, String material,
                    Enums.Size size, Enums.Season season, LocalDate purchaseDate, String imageUrl,
                    List<String> tags, boolean favorite, int wearCount, LocalDate lastWorn,
                    Enums.FootwearType shoeType, Enums.FootwearClosureType closureType, Boolean waterproof) {
        super(id, name);
        this.footwearType = shoeType;
        this.footwearClosureType = closureType;
        this.waterproof = waterproof;
    }

    public Footwear(String id, String name){
        super(id, name);
    }
}