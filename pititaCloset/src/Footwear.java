import java.time.LocalDate;
import java.util.List;
import enums

public class Footwear extends ClothingItem {
    private ShoeType FootwearType;
    private ClosureType FootwearclosureType;
    private double heelHeight; // optional, 0.0 if flat
    private boolean waterproof;
    private String soleMaterial;

    public Footwear(
            String id,
            String name,
            String color,
            String brand,
            String material,
            Enums.Size size,
            Enums.Season season,
            LocalDate purchaseDate,
            String imageUrl,
            List<String> tags,
            boolean favorite,
            int wearCount,
            LocalDate lastWorn,
            ShoeType shoeType,
            ClosureType closureType,
            double heelHeight,
            boolean waterproof,
            String soleMaterial
    ) {
        super(id, name, color, brand, material, size, Enums.ClothingItemType.SHOES, season,
                purchaseDate, imageUrl, tags, favorite, wearCount, lastWorn);
        this.shoeType = shoeType;
        this.closureType = closureType;
        this.heelHeight = heelHeight;
        this.waterproof = waterproof;
        this.soleMaterial = soleMaterial;
    }