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
    private Enums.Season season;
    
    // Constructor, getters, setters
    
    public double calculateMatchScore() {
        // Algorithm to determine how well items go together
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
}

public class OutfitCriteria {
    private Enums.Season season;
    private List<String> occasions;
    private String colorScheme;
    private ClothingItem requiredItem;
    
    // Constructor, getters, setters
}