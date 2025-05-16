package com.pititasCloset.items;

import com.pititasCloset.utils.*;

import java.time.LocalDate;
import java.util.List;

public class Top extends ClothingItem {
    private utils.Enums.TopType type;
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
