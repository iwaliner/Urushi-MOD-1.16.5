package com.iwaliner.urushi;

import com.iwaliner.urushi.Item.*;
import com.iwaliner.urushi.Json.GeneratedItemJsonMaker;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsRegister {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModCore_Urushi.MOD_ID);
    public static final RegistryObject<Item> ItemBlockSikkui = ITEMS.register("plaster", () -> {
        return new BlockItem((Block) BlocksRegister.Sikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSikkuiSlab = ITEMS.register("plaster_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SikkuiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSikkuiStairs = ITEMS.register("plaster_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SikkuiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> sikkui_bars= registerBlockItem("plaster_bars",BlocksRegister.sikkui_bars);
    public static final RegistryObject<Item> OakFramedSikkui = ITEMS.register("oak_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.OakFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> SpruceFramedSikkui = ITEMS.register("spruce_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.SpruceFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> BirchFramedSikkui = ITEMS.register("birch_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.BirchFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> JungleFramedSikkui = ITEMS.register("jungle_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.JungleFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> AcaciaFramedSikkui = ITEMS.register("acacia_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.AcaciaFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> DarkOakFramedSikkui = ITEMS.register("dark_oak_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.DarkOakFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> JapaneseApricotFramedSikkui = ITEMS.register("japanese_apricot_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.JapaneseApricotFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> SakuraFramedSikkui = ITEMS.register("sakura_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.SakuraFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> CypressFramedSikkui = ITEMS.register("cypress_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.CypressFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> RedUrushiFramedSikkui = ITEMS.register("red_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.RedUrushiFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> BlackUrushiFramedSikkui = ITEMS.register("black_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.BlackUrushiFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockNamako = ITEMS.register("namako", () -> {
        return new BlockItem((Block) BlocksRegister.Namako.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockWattleAndDaub = ITEMS.register("wattle_and_daub", () -> {
        return new BlockItem((Block) BlocksRegister.WattleAndDaub.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockWattleAndDaubSlab = ITEMS.register("wattle_and_daub_slab", () -> {
        return new BlockItem((Block) BlocksRegister.WattleAndDaubSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockWattleAndDaubStairs = ITEMS.register("wattle_and_daub_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.WattleAndDaubStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSandCoast = ITEMS.register("sand_coast", () -> {return new BlockItem((Block) BlocksRegister.SandCoast.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockThatchedBlock = ITEMS.register("thatched_block", () -> {return new BlockItem((Block) BlocksRegister.ThatchedBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockThatchedSlab = ITEMS.register("thatched_slab", () -> {return new BlockItem((Block) BlocksRegister.ThatchedSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockThatchedStairs = ITEMS.register("thatched_stairs", () -> {return new BlockItem((Block) BlocksRegister.ThatchedStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockThatchedRoof45 = ITEMS.register("thatched_roof_45", () -> {return new BlockItem((Block) BlocksRegister.ThatchedRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockThatchedRoof225 = ITEMS.register("thatched_roof_225", () -> {return new BlockItem((Block) BlocksRegister.ThatchedRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> HiwadabukiBlock = ITEMS.register("hiwadabuki_block", () -> {return new BlockItem((Block) BlocksRegister.HiwadabukiBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> HiwadabukiSLab = ITEMS.register("hiwadabuki_slab", () -> {return new BlockItem((Block) BlocksRegister.HiwadabukiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> HiwadabukiStairs = ITEMS.register("hiwadabuki_stairs", () -> {return new BlockItem((Block) BlocksRegister.HiwadabukiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> HiwadabukiRoof45= ITEMS.register("hiwadabuki_roof_45", () -> {return new BlockItem((Block) BlocksRegister.HiwadabukiRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> HiwadabukiRoof225= ITEMS.register("hiwadabuki_roof_225", () -> {return new BlockItem((Block) BlocksRegister.HiwadabukiRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockGreenTatami = ITEMS.register("green_tatami", () -> {
        return new BlockItem((Block) BlocksRegister.GreenTatami.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockGreenTatamiCarpet = ITEMS.register("green_tatami_carpet", () -> {return new BlockItem((Block) BlocksRegister.GreenTatamiCarpet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});

    public static final RegistryObject<Item> ItemBlockBrownTatami = ITEMS.register("brown_tatami", () -> {
        return new BlockItem((Block) BlocksRegister.BrownTatami.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBrownTatamiCarpet = ITEMS.register("brown_tatami_carpet", () -> {return new BlockItem((Block) BlocksRegister.BrownTatamiCarpet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> UnfiredIbushiKawara = ITEMS.register("raw_ibushi_kawara", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> IbushiKawara = ITEMS.register("ibushi_kawara", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockIbushiKawaraBlock = ITEMS.register("ibushi_kawara_block", () -> {
        return new BlockItem((Block) BlocksRegister.IbushiKawaraBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockIbushiKawaraSlab = ITEMS.register("ibushi_kawara_slab", () -> {
        return new BlockItem((Block) BlocksRegister.IbushiKawaraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockIbushiKawaraStairs = ITEMS.register("ibushi_kawara_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.IbushiKawaraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ibushi_kawara_wall= registerBlockItem("ibushi_kawara_wall",BlocksRegister.ibushi_kawara_wall);
    public static final RegistryObject<Item> ItemBlockIbushiKawaraRoof45 = ITEMS.register("ibushi_kawara_roof_45", () -> {return new BlockItem((Block) BlocksRegister.IbushiKawaraRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockIbushiKawaraRoof225 = ITEMS.register("ibushi_kawara_roof_225", () -> {return new BlockItem((Block) BlocksRegister.IbushiKawaraRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> CopperKawara = ITEMS.register("copper_kawara", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCopperKawaraBlock = ITEMS.register("copper_kawara_block", () -> {
        return new BlockItem((Block) BlocksRegister.CopperKawaraBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCopperKawaraSlab = ITEMS.register("copper_kawara_slab", () -> {
        return new BlockItem((Block) BlocksRegister.CopperKawaraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockCopperKawaraStairs = ITEMS.register("copper_kawara_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.CopperKawaraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> copper_kawara_wall= registerBlockItem("copper_kawara_wall",BlocksRegister.copper_kawara_wall);
    public static final RegistryObject<Item> ItemBlockCopperKawaraRoof45 = ITEMS.register("copper_kawara_roof_45", () -> {return new BlockItem((Block) BlocksRegister.CopperKawaraRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockCopperKawaraRoof225 = ITEMS.register("copper_kawara_roof_225", () -> {return new BlockItem((Block) BlocksRegister.CopperKawaraRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> OxCopperKawara = ITEMS.register("cupric_oxide_kawara", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraBlock = ITEMS.register("cupric_oxide_kawara_block", () -> {
        return new BlockItem((Block) BlocksRegister.CupricOxideKawaraBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraSlab = ITEMS.register("cupric_oxide_kawara_slab", () -> {
        return new BlockItem((Block) BlocksRegister.CupricOxideKawaraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraStairs = ITEMS.register("cupric_oxide_kawara_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.CupricOxideKawaraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> cupric_oxide_kawara_wall= registerBlockItem("cupric_oxide_kawara_wall",BlocksRegister.cupric_oxide_kawara_wall);
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraRoof45 = ITEMS.register("cupric_oxide_kawara_roof_45", () -> {return new BlockItem((Block) BlocksRegister.CupricOxideKawaraRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraRoof225 = ITEMS.register("cupric_oxide_kawara_roof_225", () -> {return new BlockItem((Block) BlocksRegister.CupricOxideKawaraRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> RoughStone = ITEMS.register("rough_stone", () -> {return new BlockItem((Block) BlocksRegister.RoughStone.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> RoughStoneSlab = ITEMS.register("rough_stone_slab", () -> {return new BlockItem((Block) BlocksRegister.RoughStoneSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> RoughStoneStairs = ITEMS.register("rough_stone_stairs", () -> {return new BlockItem((Block) BlocksRegister.RoughStoneStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> RoughStoneWall = ITEMS.register("rough_stone_wall", () -> {return new BlockItem((Block) BlocksRegister.RoughStoneWall.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockConcrete = ITEMS.register("concrete", () -> {return new BlockItem((Block) BlocksRegister.Concrete.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockConcreteSlab = ITEMS.register("concrete_slab", () -> {return new BlockItem((Block) BlocksRegister.ConcreteSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockConcreteStairs = ITEMS.register("concrete_stairs", () -> {return new BlockItem((Block) BlocksRegister.ConcreteStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockDirtyConcrete = ITEMS.register("dirty_concrete", () -> {return new BlockItem((Block) BlocksRegister.DirtyConcrete.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockDirtyConcreteSlab = ITEMS.register("dirty_concrete_slab", () -> {return new BlockItem((Block) BlocksRegister.DirtyConcreteSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockDirtyConcreteStairs = ITEMS.register("dirty_concrete_stairs", () -> {return new BlockItem((Block) BlocksRegister.DirtyConcreteStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockLidlessGroove = ITEMS.register("lidless_groove", () -> {return new BlockItem((Block) BlocksRegister.LidlessGroove.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockGroove = ITEMS.register("groove", () -> {return new BlockItem((Block) BlocksRegister.Groove.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockMeshGroove = ITEMS.register("mesh_groove", () -> {return new BlockItem((Block) BlocksRegister.MeshGroove.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ConnectableGlass = ITEMS.register("connectable_glass", () -> {return new BlockItem((Block) BlocksRegister.ConnectableGlass.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ConnectableGlassPane = ITEMS.register("connectable_glass_pane", () -> {return new BlockItem((Block) BlocksRegister.ConnectableGlassPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> MetalFramedGlass = ITEMS.register("metal_framed_glass", () -> {return new BlockItem((Block) BlocksRegister.MetalFramedGlass.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> MetalFramedGlassPane = ITEMS.register("metal_framed_glass_pane", () -> {return new BlockItem((Block) BlocksRegister.MetalFramedGlassPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockSmoothOakPlanks = ITEMS.register("smooth_oak_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothOakPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSmoothOakSlab = ITEMS.register("smooth_oak_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothOakSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSmoothOakStairs = ITEMS.register("smooth_oak_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothOakStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockOakParapet = ITEMS.register("oak_parapet", () -> {
        return new BlockItem((Block) BlocksRegister.OakParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> oak_bars= registerBlockItem("oak_bars",BlocksRegister.oak_bars);
    public static final RegistryObject<Item> ItemBlockSmoothSprucePlanks = ITEMS.register("smooth_spruce_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothSprucePlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothSpruceSlab = ITEMS.register("smooth_spruce_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothSpruceSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothSpruceStairs = ITEMS.register("smooth_spruce_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothSpruceStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSpruceParapet = ITEMS.register("spruce_parapet", () -> {
        return new BlockItem((Block) BlocksRegister.SpruceParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> spruce_bars= registerBlockItem("spruce_bars",BlocksRegister.spruce_bars);
    public static final RegistryObject<Item>  ItemBlockSmoothBirchPlanks = ITEMS.register("smooth_birch_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothBirchPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothBirchSlab = ITEMS.register("smooth_birch_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothBirchSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothBirchStairs = ITEMS.register("smooth_birch_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothBirchStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBirchParapet = ITEMS.register("birch_parapet", () -> {return new BlockItem((Block) BlocksRegister.BirchParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> birch_bars= registerBlockItem("birch_bars",BlocksRegister.birch_bars);
    public static final RegistryObject<Item> ItemBlockSmoothJunglePlanks = ITEMS.register("smooth_jungle_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothJunglePlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothJungleSlab = ITEMS.register("smooth_jungle_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothJungleSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothJungleStairs = ITEMS.register("smooth_jungle_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothJungleStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJungleParapet = ITEMS.register("jungle_parapet", () -> {return new BlockItem((Block) BlocksRegister.JungleParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> jungle_bars= registerBlockItem("jungle_bars",BlocksRegister.jungle_bars);
    public static final RegistryObject<Item> ItemBlockSmoothAcaciaPlanks = ITEMS.register("smooth_acacia_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothAcaciaPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothAcaciaSlab = ITEMS.register("smooth_acacia_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothAcaciaSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothAcaciaStairs = ITEMS.register("smooth_acacia_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothAcaciaStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockAcaciaParapet = ITEMS.register("acacia_parapet", () -> {return new BlockItem((Block) BlocksRegister.AcaciaParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> acacia_bars= registerBlockItem("acacia_bars",BlocksRegister.acacia_bars);
    public static final RegistryObject<Item> ItemBlockSmoothDarkOakPlanks = ITEMS.register("smooth_dark_oak_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothDarkOakPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothDarkOakSlab = ITEMS.register("smooth_dark_oak_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothDarkOakSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSmoothDarkOakStairs = ITEMS.register("smooth_dark_oak_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothDarkOakStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockDarkOakParapet = ITEMS.register("dark_oak_parapet", () -> {return new BlockItem((Block) BlocksRegister.DarkOakParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> dark_oak_bars= registerBlockItem("dark_oak_bars",BlocksRegister.dark_oak_bars);
    public static final RegistryObject<Item> green_bars= registerBlockItem("green_bars",BlocksRegister.green_bars);
    public static final RegistryObject<Item> ItemBlockJapaneseApricotSapling = ITEMS.register("japanese_apricot_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotLeaves = ITEMS.register("japanese_apricot_leaves", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotGlowingSapling = ITEMS.register("glowing_japanese_apricot_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotGlowingSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockJapaneseApricotGlowingLeaves = ITEMS.register("glowing_japanese_apricot_leaves", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotGlowingLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotLog = ITEMS.register("japanese_apricot_log", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotStrippedLog = ITEMS.register("stripped_japanese_apricot_log", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotWood = ITEMS.register("japanese_apricot_wood", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotStrippedWood = ITEMS.register("stripped_japanese_apricot_wood", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotPlanks = ITEMS.register("japanese_apricot_planks", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotSlab = ITEMS.register("japanese_apricot_slab", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotStairs = ITEMS.register("japanese_apricot_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotFence = ITEMS.register("japanese_apricot_fence", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotFenceGate = ITEMS.register("japanese_apricot_fence_gate", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotDoor = ITEMS.register("japanese_apricot_door", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotTrapdoor = ITEMS.register("japanese_apricot_trapdoor", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotPressurePlate = ITEMS.register("japanese_apricot_pressure_plate", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotButton = ITEMS.register("japanese_apricot_button", () -> {
        return new BlockItem((Block) BlocksRegister.JapaneseApricotButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothJapaneseApricotPlanks = ITEMS.register("smooth_japanese_apricot_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothJapaneseApricotPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothJapaneseApricotSlab = ITEMS.register("smooth_japanese_apricot_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothJapaneseApricotSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothJapaneseApricotStairs= ITEMS.register("smooth_japanese_apricot_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothJapaneseApricotStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> JapaneseApricotBark = ITEMS.register("japanese_apricot_bark", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockJapaneseApricotParapet = ITEMS.register("japanese_apricot_parapet", () -> {return new BlockItem((Block) BlocksRegister.JapaneseApricotParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});

    public static final RegistryObject<Item> ItemBlockSakuraSapling = ITEMS.register("sakura_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraBigSapling = ITEMS.register("big_sakura_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraBigSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraLeaves = ITEMS.register("sakura_leaves", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraGlowingSapling = ITEMS.register("glowing_sakura_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraGlowingSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraGlowingBigSapling = ITEMS.register("glowing_big_sakura_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraGlowingBigSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraGlowingLeaves = ITEMS.register("glowing_sakura_leaves", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraGlowingLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraLog = ITEMS.register("sakura_log", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraStrippedLog = ITEMS.register("stripped_sakura_log", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraWood = ITEMS.register("sakura_wood", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraStrippedWood = ITEMS.register("stripped_sakura_wood", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraPlanks = ITEMS.register("sakura_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraSlab = ITEMS.register("sakura_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraStairs = ITEMS.register("sakura_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraFence = ITEMS.register("sakura_fence", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraFenceGate = ITEMS.register("sakura_fence_gate", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraDoor = ITEMS.register("sakura_door", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraTrapdoor = ITEMS.register("sakura_trapdoor", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraPressurePlate = ITEMS.register("sakura_pressure_plate", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSakuraButton = ITEMS.register("sakura_button", () -> {
        return new BlockItem((Block) BlocksRegister.SakuraButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothSakuraPlanks = ITEMS.register("smooth_sakura_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothSakuraPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothSakuraSlab = ITEMS.register("smooth_sakura_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothSakuraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothSakuraStairs= ITEMS.register("smooth_sakura_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothSakuraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> SakuraBark = ITEMS.register("sakura_bark", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSakuraParapet = ITEMS.register("sakura_parapet", () -> {return new BlockItem((Block) BlocksRegister.SakuraParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockCypressSapling = ITEMS.register("cypress_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.CypressSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressLeaves = ITEMS.register("cypress_leaves", () -> {
        return new BlockItem((Block) BlocksRegister.CypressLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressLog = ITEMS.register("cypress_log", () -> {
        return new BlockItem((Block) BlocksRegister.CypressLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressStrippedLog = ITEMS.register("stripped_cypress_log", () -> {
        return new BlockItem((Block) BlocksRegister.CypressStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressWood = ITEMS.register("cypress_wood", () -> {
        return new BlockItem((Block) BlocksRegister.CypressWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockCypressStrippedWood = ITEMS.register("stripped_cypress_wood", () -> {
        return new BlockItem((Block) BlocksRegister.CypressStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressPlanks = ITEMS.register("cypress_planks", () -> {
        return new BlockItem((Block) BlocksRegister.CypressPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressSlab = ITEMS.register("cypress_slab", () -> {
        return new BlockItem((Block) BlocksRegister.CypressSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressStairs = ITEMS.register("cypress_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.CypressStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockCypressFence = ITEMS.register("cypress_fence", () -> {
        return new BlockItem((Block) BlocksRegister.CypressFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressFenceGate = ITEMS.register("cypress_fence_gate", () -> {
        return new BlockItem((Block) BlocksRegister.CypressFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressDoor = ITEMS.register("cypress_door", () -> {
        return new BlockItem((Block) BlocksRegister.CypressDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressTrapdoor = ITEMS.register("cypress_trapdoor", () -> {
        return new BlockItem((Block) BlocksRegister.CypressTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressPressurePlate = ITEMS.register("cypress_pressure_plate", () -> {
        return new BlockItem((Block) BlocksRegister.CypressPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockCypressButton = ITEMS.register("cypress_button", () -> {
        return new BlockItem((Block) BlocksRegister.CypressButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothCypressPlanks = ITEMS.register("smooth_cypress_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothCypressPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSmoothCypressSlab = ITEMS.register("smooth_cypress_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothCypressSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothCypressStairs= ITEMS.register("smooth_cypress_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothCypressStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  CypressBark = ITEMS.register("cypress_bark", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockCypressParapet = ITEMS.register("cypress_parapet", () -> {return new BlockItem((Block) BlocksRegister.CypressParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockLacquerSapling = ITEMS.register("lacquer_sapling", () -> {
        return new BlockItem((Block) BlocksRegister.LacquerSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>   ItemBlockLacquerLeaves = ITEMS.register("lacquer_leaves", () -> {
        return new BlockItem((Block) BlocksRegister.LacquerLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockLacquerLog = ITEMS.register("lacquer_log", () -> {
        return new BlockItem((Block) BlocksRegister.LacquerLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockChiseledLacquerLog = ITEMS.register("chiseled_lacquer_log", () -> {
        return new BlockItem((Block) BlocksRegister.ChiseledLacquerLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRawUrushiLayer = ITEMS.register("raw_urushi_layer", () -> {
        return new BlockItem((Block) BlocksRegister.RawUrushiLayer.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  RawUrushiBall = ITEMS.register("raw_urushi_ball", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> RedUrushiBall = ITEMS.register("red_urushi_ball", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> BlackUrushiBall = ITEMS.register("black_urushi_ball", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiPlanks = ITEMS.register("red_urushi_planks", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiSlab = ITEMS.register("red_urushi_slab", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockRedUrushiStairs = ITEMS.register("red_urushi_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiFence = ITEMS.register("red_urushi_fence", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiFenceGate = ITEMS.register("red_urushi_fence_gate", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockRedUrushiDoor = ITEMS.register("red_urushi_door", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiTrapdoor = ITEMS.register("red_urushi_trapdoor", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiPressurePlate = ITEMS.register("red_urushi_pressure_plate", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiButton = ITEMS.register("red_urushi_button", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothRedUrushiPlanks = ITEMS.register("smooth_red_urushi_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothRedUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothRedUrushiSlab = ITEMS.register("smooth_red_urushi_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothRedUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockSmoothRedUrushiStairs= ITEMS.register("smooth_red_urushi_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothRedUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockRedUrushiParapet = ITEMS.register("red_urushi_parapet", () -> {return new BlockItem((Block) BlocksRegister.RedUrushiParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBlackUrushiPlanks = ITEMS.register("black_urushi_planks", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBlackUrushiSlab = ITEMS.register("black_urushi_slab", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBlackUrushiStairs = ITEMS.register("black_urushi_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockBlackUrushiFence = ITEMS.register("black_urushi_fence", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockBlackUrushiFenceGate = ITEMS.register("black_urushi_fence_gate", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBlackUrushiDoor = ITEMS.register("black_urushi_door", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBlackUrushiTrapdoor = ITEMS.register("black_urushi_trapdoor", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBlackUrushiPressurePlate = ITEMS.register("black_urushi_pressure_plate", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>     ItemBlockBlackUrushiButton = ITEMS.register("black_urushi_button", () -> {
        return new BlockItem((Block) BlocksRegister.BlackUrushiButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSmoothBlackUrushiPlanks = ITEMS.register("smooth_black_urushi_planks", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothBlackUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSmoothBlackUrushiSlab = ITEMS.register("smooth_black_urushi_slab", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothBlackUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockSmoothBlackUrushiStairs= ITEMS.register("smooth_black_urushi_stairs", () -> {
        return new BlockItem((Block) BlocksRegister.SmoothBlackUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBlackUrushiParapet = ITEMS.register("black_urushi_parapet", () -> {return new BlockItem((Block) BlocksRegister.BlackUrushiParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> DoubledWoodenCabinetry = ITEMS.register("doubled_wooden_cabinetry", () -> {
        return new BlockItem((Block) BlocksRegister.DoubledWoodenCabinetry.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  ItemBlockWoodenCabinetry = ITEMS.register("wooden_cabinetry", () -> {
        return new BlockItem((Block) BlocksRegister.WoodenCabinetry.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockWoodenCabinetrySlab = ITEMS.register("wooden_cabinetry_slab", () -> {
        return new BlockItem((Block) BlocksRegister.WoodenCabinetrySlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> DoubledRedUrushiWoodenCabinetry = ITEMS.register("doubled_red_urushi_wooden_cabinetry", () -> {
        return new BlockItem((Block) BlocksRegister.DoubledRedUrushiWoodenCabinetry.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> RedUrushiWoodenCabinetry = ITEMS.register("red_urushi_wooden_cabinetry", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiWoodenCabinetry.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> RedUrushiWoodenCabinetrySlab = ITEMS.register("red_urushi_wooden_cabinetry_slab", () -> {
        return new BlockItem((Block) BlocksRegister.RedUrushiWoodenCabinetrySlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockFoxHopper = ITEMS.register("fox_hopper", () -> {return new BlockItem((Block) BlocksRegister.FoxHopper.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> dirt_furnace= registerBlockItem("dirt_furnace",BlocksRegister.dirt_furnace);
    public static final RegistryObject<Item> rice_cauldron= registerBlockItem("rice_cauldron",BlocksRegister.rice_cauldron);
    public static final RegistryObject<Item> OilExtractor = ITEMS.register("oil_extractor", () -> {return new BlockItem((Block) BlocksRegister.OilExtractor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
   public static final RegistryObject<Item> Fryer = ITEMS.register("fryer", () -> {return new BlockItem((Block) BlocksRegister.Fryer.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> VegetableOil = ITEMS.register("vegetable_oil", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> Kitsunebi = ITEMS.register("kitsunebi", () -> {return new KitsunebiItem((new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockAndon = ITEMS.register("andon", () -> {
        return new BlockItem((Block) BlocksRegister.Andon.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockAriakeAndon = ITEMS.register("ariake_andon", () -> {
        return new BlockItem((Block) BlocksRegister.AriakeAndon.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> kasuga_lantern= registerBlockItem("kasuga_lantern",BlocksRegister.kasuga_lantern);
    public static final RegistryObject<Item> ItemBlockIronGiboshi = ITEMS.register("iron_giboshi", () -> {
        return new BlockItem((Block) BlocksRegister.IronGiboshi.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockGoldenGiboshi = ITEMS.register("gold_giboshi", () -> {
        return new BlockItem((Block) BlocksRegister.GoldenGiboshi.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item>  DeepBlueNoren = ITEMS.register("deep_blue_noren", () -> {return new BlockItem((Block) BlocksRegister.DeepBlueNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> RedNoren = ITEMS.register("red_noren", () -> {return new BlockItem((Block) BlocksRegister.RedNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> CyanNoren = ITEMS.register("cyan_noren", () -> {return new BlockItem((Block) BlocksRegister.CyanNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> MagentaNoren = ITEMS.register("magenta_noren", () -> {return new BlockItem((Block) BlocksRegister.MagentaNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> MenOnsenNoren = ITEMS.register("men_onsen_noren", () -> {return new BlockItem((Block) BlocksRegister.MenOnsenNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> WomenOnsenNoren = ITEMS.register("women_onsen_noren", () -> {return new BlockItem((Block) BlocksRegister.WomenOnsenNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> SushiNoren = ITEMS.register("sushi_noren", () -> {return new BlockItem((Block) BlocksRegister.SushiNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> kakejiku_1= registerBlockItem("kakejiku_1",BlocksRegister.kakejiku_1);
    public static final RegistryObject<Item> kakejiku_2= registerBlockItem("kakejiku_2",BlocksRegister.kakejiku_2);
    public static final RegistryObject<Item> kakejiku_3= registerBlockItem("kakejiku_3",BlocksRegister.kakejiku_3);
    public static final RegistryObject<Item> kakejiku_4= registerBlockItem("kakejiku_4",BlocksRegister.kakejiku_4);
    public static final RegistryObject<Item> kakejiku_5= registerBlockItem("kakejiku_5",BlocksRegister.kakejiku_5);
    public static final RegistryObject<Item> kakejiku_6= registerBlockItem("kakejiku_6",BlocksRegister.kakejiku_6);
    public static final RegistryObject<Item> kakejiku_7= registerBlockItem("kakejiku_7",BlocksRegister.kakejiku_7);
    public static final RegistryObject<Item> kakejiku_8= registerBlockItem("kakejiku_8",BlocksRegister.kakejiku_8);
    public static final RegistryObject<Item> kakejiku_9= registerBlockItem("kakejiku_9",BlocksRegister.kakejiku_9);
    public static final RegistryObject<Item> kakejiku_10= registerBlockItem("kakejiku_10",BlocksRegister.kakejiku_10);
    public static final RegistryObject<Item> kakejiku_11= registerBlockItem("kakejiku_11",BlocksRegister.kakejiku_11);
    public static final RegistryObject<Item> kakejiku_12= registerBlockItem("kakejiku_12",BlocksRegister.kakejiku_12);
    public static final RegistryObject<Item> kakejiku_13= registerBlockItem("kakejiku_13",BlocksRegister.kakejiku_13);
    public static final RegistryObject<Item> kakejiku_14= registerBlockItem("kakejiku_14",BlocksRegister.kakejiku_14);
    public static final RegistryObject<Item> white_futon= registerBlockItem("white_futon",BlocksRegister.white_futon);
    public static final RegistryObject<Item> orange_futon= registerBlockItem("orange_futon",BlocksRegister.orange_futon);
    public static final RegistryObject<Item> magenta_futon= registerBlockItem("magenta_futon",BlocksRegister.magenta_futon);
    public static final RegistryObject<Item> light_blue_futon= registerBlockItem("light_blue_futon",BlocksRegister.light_blue_futon);
    public static final RegistryObject<Item> yellow_futon= registerBlockItem("yellow_futon",BlocksRegister.yellow_futon);
    public static final RegistryObject<Item> lime_futon= registerBlockItem("lime_futon",BlocksRegister.lime_futon);
    public static final RegistryObject<Item> pink_futon= registerBlockItem("pink_futon",BlocksRegister.pink_futon);
    public static final RegistryObject<Item> gray_futon= registerBlockItem("gray_futon",BlocksRegister.gray_futon);
    public static final RegistryObject<Item> light_gray_futon= registerBlockItem("light_gray_futon",BlocksRegister.light_gray_futon);
    public static final RegistryObject<Item> cyan_futon= registerBlockItem("cyan_futon",BlocksRegister.cyan_futon);
    public static final RegistryObject<Item> purple_futon= registerBlockItem("purple_futon",BlocksRegister.purple_futon);
    public static final RegistryObject<Item> blue_futon= registerBlockItem("blue_futon",BlocksRegister.blue_futon);
    public static final RegistryObject<Item> brown_futon= registerBlockItem("brown_futon",BlocksRegister.brown_futon);
    public static final RegistryObject<Item> green_futon= registerBlockItem("green_futon",BlocksRegister.green_futon);
    public static final RegistryObject<Item> red_futon= registerBlockItem("red_futon",BlocksRegister.red_futon);
    public static final RegistryObject<Item> black_futon= registerBlockItem("black_futon",BlocksRegister.black_futon);
    public static final RegistryObject<Item> white_cushion = ITEMS.register("white_cushion", () -> {return new CushionItem(DyeColor.WHITE,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> orange_cushion = ITEMS.register("orange_cushion", () -> {return new CushionItem(DyeColor.ORANGE,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> magenta_cushion = ITEMS.register("magenta_cushion", () -> {return new CushionItem(DyeColor.MAGENTA,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> light_blue_cushion = ITEMS.register("light_blue_cushion", () -> {return new CushionItem(DyeColor.LIGHT_BLUE,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> yellow_cushion = ITEMS.register("yellow_cushion", () -> {return new CushionItem(DyeColor.YELLOW,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> lime_cushion = ITEMS.register("lime_cushion", () -> {return new CushionItem(DyeColor.LIME,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> pink_cushion = ITEMS.register("pink_cushion", () -> {return new CushionItem(DyeColor.PINK,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> gray_cushion = ITEMS.register("gray_cushion", () -> {return new CushionItem(DyeColor.GRAY,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> light_gray_cushion = ITEMS.register("light_gray_cushion", () -> {return new CushionItem(DyeColor.LIGHT_GRAY,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> cyan_cushion = ITEMS.register("cyan_cushion", () -> {return new CushionItem(DyeColor.CYAN,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> purple_cushion = ITEMS.register("purple_cushion", () -> {return new CushionItem(DyeColor.PURPLE,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> blue_cushion = ITEMS.register("blue_cushion", () -> {return new CushionItem(DyeColor.BLUE,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> brown_cushion = ITEMS.register("brown_cushion", () -> {return new CushionItem(DyeColor.BROWN,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> green_cushion = ITEMS.register("green_cushion", () -> {return new CushionItem(DyeColor.GREEN,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> red_cushion = ITEMS.register("red_cushion", () -> {return new CushionItem(DyeColor.RED,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> black_cushion = ITEMS.register("black_cushion", () -> {return new CushionItem(DyeColor.BLACK,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBlankFusuma = ITEMS.register("blank_fusuma", () -> {return new BlockItem((Block) BlocksRegister.BlankFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBlueSeigaihaFusuma = ITEMS.register("blue_seigaiha_fusuma", () -> {return new BlockItem((Block) BlocksRegister.BlueSeigaihaFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBlueSayagataFusuma = ITEMS.register("blue_sayagata_fusuma", () -> {return new BlockItem((Block) BlocksRegister.BlueSayagataFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBlankAntiqueFusuma = ITEMS.register("blank_antique_fusuma", () -> {return new BlockItem((Block) BlocksRegister.BlankAntiqueFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockSlidingGlassDoor = ITEMS.register("sliding_glass_door", () -> {return new BlockItem((Block) BlocksRegister.SlidingGlassDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockOakShojiPane = ITEMS.register("oak_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.OakShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockSpruceShojiPane = ITEMS.register("spruce_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.SpruceShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBirchShojiPane = ITEMS.register("birch_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.BirchShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockJungleShojiPane = ITEMS.register("jungle_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.JungleShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockAcaciaShojiPane = ITEMS.register("acacia_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.AcaciaShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockDarkOakShojiPane = ITEMS.register("dark_oak_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.DarkOakShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockJapaneseApricotShojiPane= ITEMS.register("japanese_apricot_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.JapaneseApricotShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockSakuraShojiPane = ITEMS.register("sakura_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.SakuraShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockCypressShojiPane = ITEMS.register("cypress_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.CypressShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockRedUrushiShojiPane = ITEMS.register("red_urushi_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.RedUrushiShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBlackUrushiShojiPane = ITEMS.register("black_urushi_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.BlackUrushiShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockOakShoji = ITEMS.register("oak_shoji", () -> {return new BlockItem((Block) BlocksRegister.OakShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockSpruceShoji = ITEMS.register("spruce_shoji", () -> {return new BlockItem((Block) BlocksRegister.SpruceShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBirchShoji = ITEMS.register("birch_shoji", () -> {return new BlockItem((Block) BlocksRegister.BirchShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockJungleShoji = ITEMS.register("jungle_shoji", () -> {return new BlockItem((Block) BlocksRegister.JungleShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockAcaciaShoji = ITEMS.register("acacia_shoji", () -> {return new BlockItem((Block) BlocksRegister.AcaciaShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockDarkOakShoji = ITEMS.register("dark_oak_shoji", () -> {return new BlockItem((Block) BlocksRegister.DarkOakShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockJapaneseApricotShoji = ITEMS.register("japanese_apricot_shoji", () -> {return new BlockItem((Block) BlocksRegister.JapaneseApricotShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockSakuraShoji = ITEMS.register("sakura_shoji", () -> {return new BlockItem((Block) BlocksRegister.SakuraShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockCypressShoji = ITEMS.register("cypress_shoji", () -> {return new BlockItem((Block) BlocksRegister.CypressShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockRedUrushiShoji = ITEMS.register("red_urushi_shoji", () -> {return new BlockItem((Block) BlocksRegister.RedUrushiShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBlackUrushiShoji = ITEMS.register("black_urushi_shoji", () -> {return new BlockItem((Block) BlocksRegister.BlackUrushiShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockCopperOre = ITEMS.register("copper_ore", () -> {
        return new BlockItem((Block) BlocksRegister.CopperOre.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> CopperIngot = ITEMS.register("copper_ingot", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> JapaneseTimberBamboo = ITEMS.register("japanese_timber_bamboo", () -> {
        return new BlockItem(BlocksRegister.JapaneseTimberBamboo.get(),(new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockBambooBlock = ITEMS.register("bamboo_block", () -> {return new BlockItem((Block) BlocksRegister.BambooBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBambooSlab = ITEMS.register("bamboo_slab", () -> {return new BlockItem((Block) BlocksRegister.BambooSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockBambooStairs = ITEMS.register("bamboo_stairs", () -> {return new BlockItem((Block) BlocksRegister.BambooStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});

    public static final RegistryObject<Item> ItemBlockBambooWall = ITEMS.register("bamboo_wall", () -> {
        return new BlockItem((Block) BlocksRegister.BambooWall.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> BambooCharcoal = ITEMS.register("bamboo_charcoal", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> BambooCharcoalBlock = ITEMS.register("bamboo_charcoal_block", () -> {return new BlockItem((Block) BlocksRegister.BambooCharcoalBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> ItemBlockTawara = ITEMS.register("tawara", () -> {
        return new BlockItem((Block) BlocksRegister.Tawara.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> ItemBlockPaddyField= ITEMS.register("paddy_field", () -> {
        return new BlockItem((Block) BlocksRegister.PaddyField.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> RiceCrop = ITEMS.register("rice_crop", () -> {
        return new BlockItem((Block) BlocksRegister.RiceCrop.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> AzukiCrop = ITEMS.register("azuki_crop", () -> {
        return new BlockItem((Block) BlocksRegister.AzukiCrop.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> SoyCrop = ITEMS.register("soy_crop", () -> {return new BlockItem((Block) BlocksRegister.SoyCrop.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});

    public static final RegistryObject<Item> RawRice = ITEMS.register("raw_rice", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> Rice = ITEMS.register("rice", () -> {
        return new PlaceableFoodItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Rice));
    });
    public static final RegistryObject<Item> RiceMalt = ITEMS.register("rice_malt", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> RiceBall = ITEMS.register("rice_ball", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.RiceBall));
    });
    public static final RegistryObject<Item> RiceCake = ITEMS.register("rice_cake", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.RiceCake));
    });
    public static final RegistryObject<Item> RoastedRiceCake = ITEMS.register("roasted_rice_cake", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.RoastedRiceCake));
    });
    public static final RegistryObject<Item> Gyudon = ITEMS.register("gyudon", () -> {
        return new PlaceableFoodItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Gyudon));
    });
    public static final RegistryObject<Item> Butadon = ITEMS.register("butadon", () -> {
        return new PlaceableFoodItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Butadon));
    });
    public static final RegistryObject<Item> TKG = ITEMS.register("tkg", () -> {return new PlaceableFoodItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.TKG));});
    public static final RegistryObject<Item> sekihan = ITEMS.register("sekihan", () -> {return new PlaceableFoodItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Sekihan));});
    public static final RegistryObject<Item> SakuraMochi = ITEMS.register("sakura_mochi", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.SakuraMochi));
    });
    public static final RegistryObject<Item> Ohagi = ITEMS.register("ohagi", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Ohagi));
    });
    public static final RegistryObject<Item> KusaMochi = ITEMS.register("kusa_mochi", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.KusaMochi));});

    public static final RegistryObject<Item> ColorDango = ITEMS.register("color_dango", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.ColorDango));
    });
    public static final RegistryObject<Item> MitarashiDango = ITEMS.register("mitarashi_dango", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.MitarashiDango));
    });
    public static final RegistryObject<Item> KusaDango = ITEMS.register("kusa_dango", () -> {
        return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.KusaDango));
    });
    public static final RegistryObject<Item> yokan= ITEMS.register("yokan", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Yokan));});
    public static final RegistryObject<Item> sakura_yokan= ITEMS.register("sakura_yokan", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.SakuraYokan));});
    public static final RegistryObject<Item> Karaage = ITEMS.register("karaage", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Karaage));});
    public static final RegistryObject<Item> Tofu = ITEMS.register("tofu", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Tofu));});
    public static final RegistryObject<Item> AburaAge = ITEMS.register("abura_age", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.AburaAge));});
    public static final RegistryObject<Item> noodle_knife = ITEMS.register("noodle_knife", () -> {return new NoodleKnifeItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).durability(1024));});
    public static final RegistryObject<Item> dough= registerBlockItem("dough",BlocksRegister.dough);
    public static final RegistryObject<Item> udon= registerBlockItem("udon",BlocksRegister.udon);
    public static final RegistryObject<Item> kitsune_udon= ITEMS.register("kitsune_udon", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.KitsuneUdon));});
    public static final RegistryObject<Item> CarpBucket = ITEMS.register("carp_bucket", () -> {return new CarpBucketItem( Fluids.WATER,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> Carp = ITEMS.register("carp", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Carp));});
    public static final RegistryObject<Item> SweetfishBucket = ITEMS.register("sweetfish_bucket", () -> {return new SweetfishBucketItem( Fluids.WATER,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> Sweetfish = ITEMS.register("sweetfish", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Sweetfish));});
    public static final RegistryObject<Item> GoldfishBucket = ITEMS.register("goldfish_bucket", () -> {return new GoldfishBucketItem( Fluids.WATER,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> Goldfish = ITEMS.register("goldfish", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Goldfish));});
    public static final RegistryObject<Item> ItemBlockGoldfishBowl = ITEMS.register("goldfish_bowl", () -> {
        return new BlockItem((Block) BlocksRegister.GoldfishBowl.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
    });
    public static final RegistryObject<Item> salt_and_sand= registerBlockItem("salt_and_sand",BlocksRegister.salt_and_sand);
    public static final RegistryObject<Item> salt= ITEMS.register("salt", () -> {return new SaltItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> kanten_powder= ITEMS.register("kanten_powder", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> WoodChip = ITEMS.register("wood_chip", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> IronsandBlock = ITEMS.register("ironsand_ore", () -> {return new BlockItem((Block) BlocksRegister.Ironsand.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> Ironsand = ITEMS.register("ironsand", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> Hammer = ITEMS.register("hammer", () -> {return new HammerItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).durability(1024));});
    public static final RegistryObject<Item> NormalIronIngot0 = ITEMS.register("normal_iron_ingot_0", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot0.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot1 = ITEMS.register("normal_iron_ingot_1", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot1.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot2 = ITEMS.register("normal_iron_ingot_2", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot2.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot3 = ITEMS.register("normal_iron_ingot_3", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot3.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot4 = ITEMS.register("normal_iron_ingot_4", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot4.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot5 = ITEMS.register("normal_iron_ingot_5", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot5.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot6 = ITEMS.register("normal_iron_ingot_6", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot6.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot7 = ITEMS.register("normal_iron_ingot_7", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot7.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot8 = ITEMS.register("normal_iron_ingot_8", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot8.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalIronIngot9 = ITEMS.register("normal_iron_ingot_9", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot9.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier1 = ITEMS.register("normal_katana_blade_tier_1", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier2 = ITEMS.register("normal_katana_blade_tier_2", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier3 = ITEMS.register("normal_katana_blade_tier_3", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier4 = ITEMS.register("normal_katana_blade_tier_4", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier5 = ITEMS.register("normal_katana_blade_tier_5", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier6 = ITEMS.register("normal_katana_blade_tier_6", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier7 = ITEMS.register("normal_katana_blade_tier_7", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier8 = ITEMS.register("normal_katana_blade_tier_8", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier9 = ITEMS.register("normal_katana_blade_tier_9", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaBladeTier10 = ITEMS.register("normal_katana_blade_tier_10", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier1 = ITEMS.register("normal_hot_katana_blade_tier_1", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier1.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier2 = ITEMS.register("normal_hot_katana_blade_tier_2", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier2.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier3 = ITEMS.register("normal_hot_katana_blade_tier_3", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier3.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier4 = ITEMS.register("normal_hot_katana_blade_tier_4", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier4.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier5 = ITEMS.register("normal_hot_katana_blade_tier_5", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier5.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier6 = ITEMS.register("normal_hot_katana_blade_tier_6", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier6.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier7 = ITEMS.register("normal_hot_katana_blade_tier_7", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier7.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier8 = ITEMS.register("normal_hot_katana_blade_tier_8", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier8.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier9 = ITEMS.register("normal_hot_katana_blade_tier_9", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier9.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalHotKatanaBladeTier10 = ITEMS.register("normal_hot_katana_blade_tier_10", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier10.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier1 = ITEMS.register("normal_katana_tier_1", () -> {return new NormalKatanaItem(ItemTier.IRON, 0, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier2 = ITEMS.register("normal_katana_tier_2", () -> {return new NormalKatanaItem(ItemTier.IRON, 2, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier3 = ITEMS.register("normal_katana_tier_3", () -> {return new NormalKatanaItem(ItemTier.IRON, 4, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier4 = ITEMS.register("normal_katana_tier_4", () -> {return new NormalKatanaItem(ItemTier.IRON, 6, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier5 = ITEMS.register("normal_katana_tier_5", () -> {return new NormalKatanaItem(ItemTier.IRON, 8, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier6 = ITEMS.register("normal_katana_tier_6", () -> {return new NormalKatanaItem(ItemTier.IRON, 10, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier7 = ITEMS.register("normal_katana_tier_7", () -> {return new NormalKatanaItem(ItemTier.IRON, 12, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier8 = ITEMS.register("normal_katana_tier_8", () -> {return new NormalKatanaItem(ItemTier.IRON, 14, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier9 = ITEMS.register("normal_katana_tier_9", () -> {return new NormalKatanaItem(ItemTier.IRON, 16, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    public static final RegistryObject<Item> NormalKatanaTier10 = ITEMS.register("normal_katana_tier_10", () -> {return new NormalKatanaItem(ItemTier.IRON, 18, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    //public static final RegistryObject<Item> rice_hokora= registerBlockItem("rice_hokora",BlocksRegister.rice_hokora);
   // public static final RegistryObject<Item> reiryoku_tank_tier1= registerBlockItem("reiryoku_tank",BlocksRegister.reiryoku_tank_tier1);
    //public static final RegistryObject<Item> reiryoku_pipe= registerBlockItem("reiryoku_pipe",BlocksRegister.reiryoku_pipe);
    //public static final RegistryObject<Item> reiryoku_altar= registerBlockItem("reiryoku_altar",BlocksRegister.reiryoku_altar);
   // public static final RegistryObject<Item> blank_charm= ITEMS.register("blank_charm", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
   // public static final RegistryObject<Item> quartz_magatama= ITEMS.register("quartz_magatama", () -> {return new QuartzMagatamaItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).durability(8000));});




    public ItemsRegister() {
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static RegistryObject<Item> registerBlockItem(String name,RegistryObject<Block> block) {
     return    ITEMS.register(name, () -> {return new BlockItem( (Block) block.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
    }

}
