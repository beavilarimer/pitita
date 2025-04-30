package closet;
import items.*;
import utils.*;
import java.util.*;

public class ClothingItemFactory {
    public static ClothingItem createItem(String id, String name, Enums.ClothingItemType type, Map<String, Object> attributes) {
        return switch (type) {
            case TOP -> {
                Enums.Size size = (Enums.Size) attributes.get("size");
                yield new Top(id, name);
            }
            case BOTTOM -> new Bottom(id, name);
            case ACCESSORY -> new Accessory(id, name);
            case FOOTWEAR -> new Footwear(id, name);
            default -> throw new IllegalArgumentException("Unsupported type: " + type);
        };
    }
}
