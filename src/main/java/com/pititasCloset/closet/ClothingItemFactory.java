package com.pititasCloset.closet;

import com.pititasCloset.items.*;
import com.pititasCloset.utils.*;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.pititasCloset.utils.Enums.*;

public class ClothingItemFactory {
    public static ClothingItem createItem(String name, ClothingItemType type,
                                          Map<String, Object> attributes) {
        String id = IdGenerator.generatePrefixedId(type);
        return switch (type) {
            case TOP -> {
                Size size = (Size) attributes.get("size");
                yield new Top(id, name);
            }
            case BOTTOM -> new Bottom(id, name);
            case ACCESSORY -> new Accessory(id, name);
            case FOOTWEAR -> new Footwear(id, name);
            default -> throw new IllegalArgumentException("Unsupported type: " + type);
        };
    }
}
