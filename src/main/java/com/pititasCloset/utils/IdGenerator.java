package utils;
import java.util.*;

public class IdGenerator {

    Set<String> ids;

    // Generates a unique ID using UUID (universally unique)
    public static String generateId() {
        return UUID.randomUUID().toString();
    }

    // Optional: Generate a shorter ID (8 characters)
    public static String generateShortId() {
        return UUID.randomUUID().toString().substring(0, 8);
    }

//    String id;
//        do {
//        id = UUID.randomUUID().toString();
//    } while (ids.contains(id));
//
//        ids.add(id);
//        return id;
}
