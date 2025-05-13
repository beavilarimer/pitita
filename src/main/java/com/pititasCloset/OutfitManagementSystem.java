import closet.Closet;
import com.pititasCloset.items.*;
import items.*;
import utils.*;
import java.util.*;

public class Outfit {
    private String id;
    private String name;
    private Top top;
    private Bottom bottom;
    private Footwear footwear;
    private List<Accessory> accessories;
    private Outerwear outerwear;
    private List<String> occasions;
    private utils.Enums.Season season;
    
    // Constructor, getters, setters
    public Outfit(String name, Top top, Bottom bottom, Footwear footwear,
                  List<Accessory> accessories, Outerwear outerwear) {
        this.id = IdGenerator.generatePrefixedId("OUTFIT");
        this.name = name;
        this.top = top;
        this.bottom = bottom;
        this.footwear = footwear;
        this.accessories = accessories != null ? accessories : new ArrayList<>();
        this.outerwear = outerwear;
    }

    public double calculateMatchScore() {
        double score = 0.0;

        // Example: Match season
        if (top.getSeason() == bottom.getSeason()) score += 10;
        if (footwear.getSeason() == top.getSeason()) score += 5;

        // Example: Simple color check (this can get more advanced later)
        if (top.getColor().equalsIgnoreCase(bottom.getColor())) score += 3;

        // Add more rules: matching tags, favorite items, etc.

        return score;
    }

}

public class OutfitGenerator {
    private Closet closet;
    
    public OutfitGenerator(Closet closet) {
        this.closet = closet;
    }
    
    public List<Outfit> generateOutfits(OutfitCriteria criteria) {
        // Use algorithms to generate outfits based on criteria
    }
    
    public Outfit generateRandomOutfit() {
        // Generate a random but matching outfit
    }
    
    public Outfit generateOutfitAroundItem(ClothingItem item) {
        // Build outfit with a specific item as focal point
    }

    // filtering logic for outfit generator
    //    List<Top> tops = closet.getTops().stream()
    //            .filter(item -> item.getSeason() == criteria.getSeason())
    //            .collect(Collectors.toList());

}

public class OutfitCriteria {
    private Enums.Season season;
    private List<String> occasions;
    private String colorScheme;
    private ClothingItem requiredItem;
    
    // Constructor, getters, setters
}