package com.iwaliner.urushi.Item;

import com.google.common.collect.Maps;
import com.iwaliner.urushi.ItemsRegister;
import com.iwaliner.urushi.Json.GeneratedItemJsonMaker;
import com.iwaliner.urushi.Json.IJsnonModel;
import com.iwaliner.urushi.ModCore_Urushi;
import net.minecraft.item.Item;

import java.util.Map;

public class GeneratedItem extends Item implements IJsnonModel {
    private String textureName;
    public GeneratedItem(String textureName,Properties p_i48487_1_) {
        super(p_i48487_1_);
        this.textureName=textureName;

    }

    @Override
    public String getParent() {
        return "item/generated";
    }

    @Override
    public String getTexName() {
        return textureName;
    }
}
