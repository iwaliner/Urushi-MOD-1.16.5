package com.iwaliner.urushi.Block;

import com.google.common.collect.Maps;
import com.iwaliner.urushi.Json.IJsnonModel;
import net.minecraft.block.Block;

import java.util.Map;

public class CubeAllBlock extends Block implements IJsnonModel {
    private String textureName;
    public CubeAllBlock(String textureName,Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.textureName=textureName;
    }

    @Override
    public String getParent() {
        return "block/cube_all";
    }

    @Override
    public String getTexName() {
        return textureName;
    }
}
