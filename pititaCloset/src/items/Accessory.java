package items;
import utils.*;

public class Accessory extends ClothingItem {
    private Enums.AccessoryType accessoryType;

    public Accessory(String id, String name, String color, Enums.AccessoryType type,
                     String brand, String pattern, String size) {
        super(id, name);
        this.accessoryType = type;
    }

    public Accessory(String id, String name){
        super(id, name);
    }

    // getters, setters here
}
