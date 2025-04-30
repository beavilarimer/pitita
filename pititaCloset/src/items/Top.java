package items;

import utils.Enums;

public class Top extends ClothingItem {
    private Enums.TopType type;
    private boolean isLayerable;
    private boolean buttoned;
    private String sleeveLength;
    private String neckline;


    public Top(String id, String name, Boolean isLayerable) {
        super(id, name);
        this.isLayerable = isLayerable;
    }

    public Top(String id, String name) {
        super(id, name);
    }

    // get

    // set
}
