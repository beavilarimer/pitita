package com.pititasCloset.items;

import com.pititasCloset.utils.ClothingItemType;
import com.pititasCloset.utils.Season;
import com.pititasCloset.utils.Size;

import java.time.LocalDate;
import java.util.List;

public class Bottom extends ClothingItem {
    private Enums.BottomType type; // E.g., JEANS, SKIRT, SHORTS
    private String length;
    private String fit;

    public Bottom(String name, String color) {
        super(name, color);
    }

    // Constructor, getters, setters

}
