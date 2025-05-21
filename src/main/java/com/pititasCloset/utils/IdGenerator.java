package com.pititasCloset.utils;
import com.pititasCloset.items.ClothingItem;
import com.pititasCloset.utils.Enums.*;

import java.util.*;

public class IdGenerator {

    static Set<String> ids;

    // Generate a unique ID (8 characters)
    public static String generateShortId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    // Generate a unique ID including prefix for ClothingType
    public static String generatePrefixedId(Enums.ClothingItemType prefix) {
        String id;
        do {
            id = prefix.toString() + "-" + UUID.randomUUID().toString().substring(0, 8);
        } while (ids.contains(id));
        ids.add(id);
        return id;
    }
}
