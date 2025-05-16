package com.pititasCloset.outfit;


import com.pititasCloset.closet.Closet;
import com.pititasCloset.items.ClothingItem;

import java.util.List;

public class OutfitGenerator {
    private Closet closet;

    public OutfitGenerator(Closet closet) {
        this.closet = closet;
    }

    public List<Outfit> generateOutfits(OutfitCriteria criteria) {
        // Use algorithms to generate outfits based on criteria
        return List.of();
    }

    public Outfit generateRandomOutfit() {
        // Generate a random but matching outfit
        return null;
    }

    public Outfit generateOutfitAroundItem(ClothingItem item) {
        // Build outfit with a specific item as focal point
        return null;
    }

    // filtering logic for outfit generator
    //    List<Top> tops = closet.getTops().stream()
    //            .filter(item -> item.getSeason() == criteria.getSeason())
    //            .collect(Collectors.toList());

}