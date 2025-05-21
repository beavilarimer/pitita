package com.pititasCloset.outfit;

import com.pititasCloset.items.*;
import com.pititasCloset.utils.Enums.*;
import com.pititasCloset.utils.IdGenerator;
import java.util.*;

public class Outfit {
    private String id;
    private String name;
    private Top top;
    private Bottom bottom;
    private Footwear footwear;
    private List<Accessory> accessories;
    // private Outerwear outerwear;
    private List<String> occasions;
    private Season season;
    
    // Constructor, getters, setters
    public Outfit(String name, Top top, Bottom bottom, Footwear footwear,
                  List<Accessory> accessories) {
        this.id = IdGenerator.generatePrefixedId(ClothingItemType.valueOf("OUTFIT"));
        this.name = name;
        this.top = top;
        this.bottom = bottom;
        this.footwear = footwear;
        this.accessories = accessories != null ? accessories : new ArrayList<>();
        //this.outerwear = outerwear;
    }

    public double calculateMatchScore() {
        double score = 0.0;

        // Example: Match season
        if (Objects.equals(top.getSeason(), bottom.getSeason())) score += 10;
        if (Objects.equals(footwear.getSeason(), top.getSeason())) score += 5;

        // Example: Simple color check (this can get more advanced later)
        if (top.getColor().equalsIgnoreCase(bottom.getColor())) score += 3;

        // Add more rules: matching tags, favorite items, etc.

        return score;
    }

}

