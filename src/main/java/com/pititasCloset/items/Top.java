package com.pititasCloset.items;

import com.pititasCloset.utils.ClothingItemType;
import com.pititasCloset.utils.Season;
import com.pititasCloset.utils.Size;

import java.time.LocalDate;
import java.util.List;

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
