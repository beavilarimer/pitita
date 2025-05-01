package com.pititasCloset.closet;

import com.pititasCloset.items.ClothingItem;
import com.pititasCloset.items.Top;
import com.pititasCloset.items.Bottom;
import com.pititasCloset.items.Shoe;
import com.pititasCloset.items.Accessory;

import com.pititasCloset.utils.ClothingItemType;
import com.pititasCloset.utils.Season;
import com.pititasCloset.utils.Size;
import com.pititasCloset.utils.IdGenerator;
import com.pititasCloset.utils.DateUtils;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

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
