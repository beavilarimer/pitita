import java.util.*;

public class Accessory extends ClothingItem {
    private Enums.AccessoryType accessoryType;
    private String pattern;
    private String size; // optional for things like hats or rings

    public Accessory(String id, String name, String color, Enums.AccessoryType type, String brand, String pattern, String size) {
        super(id, name);
        this.accessoryType = type;
        this.pattern = pattern;
        this.size = size;
    }

    @Override
    public String getCategory() {
        return "Accessory";
    }

    // getters, setters here
}
