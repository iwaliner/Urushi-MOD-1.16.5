package com.iwaliner.urushi.Block;
public class FramedBlock extends AbstractFramedBlock {



    public FramedBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
       this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, Boolean.valueOf(false)).setValue(EAST, Boolean.valueOf(false)).setValue(SOUTH, Boolean.valueOf(false)).setValue(WEST, Boolean.valueOf(false)).setValue(UP, Boolean.valueOf(false)).setValue(DOWN, Boolean.valueOf(false)).setValue(VARIANT, Boolean.valueOf(false)));
    }



}
