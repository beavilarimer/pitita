package com.pititasCloset.utils;
import java.util.*;

public class IdGenerator {

    Set<String> ids;

    // Generate a unique ID (8 characters)
    public static String generateShortId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

    // Generate a unique ID including prefix for ClothingType
    public static String generatePrefixedId(String prefix) {
        do {
            id = prefix + "-" + UUID.randomUUID().toString().substring(0, 8);
        } while (this.ids.contains(id))
        ids.add(id)
        return id;
    }
}
