package com.iwaliner.urushi;

import net.minecraftforge.common.ForgeConfigSpec;

public final class ConfigUrushi {
    public static final ForgeConfigSpec.Builder builder=new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec spec;
    public static final ForgeConfigSpec.ConfigValue<Boolean> genCopperOre;
    public static final ForgeConfigSpec.ConfigValue<Integer> maxHightBamboo;

    static {
        builder.push("world generation");
        genCopperOre=builder.comment("generate Copper Ore").define("true/false",true);
        builder.pop();
        builder.push("block settings");
        maxHightBamboo=builder.comment("max height of Japanese Timber Bamboo").define("integer",10);
        builder.pop();
        spec=builder.build();
    }
}
