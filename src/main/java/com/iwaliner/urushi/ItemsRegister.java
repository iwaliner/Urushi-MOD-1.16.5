package com.iwaliner.urushi;

import com.iwaliner.urushi.Item.*;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemsRegister {
    private static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> JapaneseTimberBamboo;
    public static final RegistryObject<Item> CopperIngot;
    public static final RegistryObject<Item> ItemBlockCopperOre;
    public static final RegistryObject<Item> ItemBlockSikkui;
    public static final RegistryObject<Item> ItemBlockSikkuiSlab;
    public static final RegistryObject<Item> ItemBlockSikkuiStairs;
    public static final RegistryObject<Item> ItemBlockWattleAndDaub;
    public static final RegistryObject<Item> ItemBlockWattleAndDaubSlab;
    public static final RegistryObject<Item> ItemBlockWattleAndDaubStairs;
    public static final RegistryObject<Item> ItemBlockSmoothOakPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothOakSlab;
    public static final RegistryObject<Item> ItemBlockSmoothOakStairs;
    public static final RegistryObject<Item> ItemBlockSmoothSprucePlanks;
    public static final RegistryObject<Item> ItemBlockSmoothSpruceSlab;
    public static final RegistryObject<Item> ItemBlockSmoothSpruceStairs;
    public static final RegistryObject<Item> ItemBlockSmoothBirchPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothBirchSlab;
    public static final RegistryObject<Item> ItemBlockSmoothBirchStairs;
    public static final RegistryObject<Item> ItemBlockSmoothJunglePlanks;
    public static final RegistryObject<Item> ItemBlockSmoothJungleSlab;
    public static final RegistryObject<Item> ItemBlockSmoothJungleStairs;
    public static final RegistryObject<Item> ItemBlockSmoothAcaciaPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothAcaciaSlab;
    public static final RegistryObject<Item> ItemBlockSmoothAcaciaStairs;
    public static final RegistryObject<Item> ItemBlockSmoothDarkOakPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothDarkOakSlab;
    public static final RegistryObject<Item> ItemBlockSmoothDarkOakStairs;
    public static final RegistryObject<Item> ItemBlockNamako;
    public static final RegistryObject<Item> ItemBlockGreenTatami;
    public static final RegistryObject<Item> ItemBlockBrownTatami;
    public static final RegistryObject<Item> ItemBlockBambooWall;
    public static final RegistryObject<Item> ItemBlockGoldfishBowl;
    public static final RegistryObject<Item> ItemBlockAndon;
    public static final RegistryObject<Item> UnfiredIbushiKawara;
    public static final RegistryObject<Item> IbushiKawara;
    public static final RegistryObject<Item> CopperKawara;
    public static final RegistryObject<Item> OxCopperKawara;
    public static final RegistryObject<Item> ItemBlockAriakeAndon;
    public static final RegistryObject<Item> ItemBlockIbushiKawaraBlock;
    public static final RegistryObject<Item> ItemBlockIbushiKawaraSlab;
    public static final RegistryObject<Item> ItemBlockIbushiKawaraStairs;
    public static final RegistryObject<Item> ItemBlockCopperKawaraBlock;
    public static final RegistryObject<Item> ItemBlockCopperKawaraSlab;
    public static final RegistryObject<Item> ItemBlockCopperKawaraStairs;
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraBlock;
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraSlab;
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraStairs;
    public static final RegistryObject<Item> ItemBlockIronGiboshi;
    public static final RegistryObject<Item> ItemBlockGoldenGiboshi;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotSapling;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotLeaves;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotGlowingSapling;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotGlowingLeaves;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotLog;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotStrippedLog;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotWood;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotStrippedWood;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotPlanks;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotSlab;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotStairs;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotFence;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotFenceGate;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotDoor;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotTrapdoor;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotPressurePlate;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotButton;
    public static final RegistryObject<Item> ItemBlockSmoothJapaneseApricotPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothJapaneseApricotSlab;
    public static final RegistryObject<Item> ItemBlockSmoothJapaneseApricotStairs;
    public static final RegistryObject<Item> JapaneseApricotBark;
    public static final RegistryObject<Item> ItemBlockSakuraSapling;
    public static final RegistryObject<Item> ItemBlockSakuraBigSapling;
    public static final RegistryObject<Item> ItemBlockSakuraLeaves;
    public static final RegistryObject<Item> ItemBlockSakuraGlowingSapling;
    public static final RegistryObject<Item> ItemBlockSakuraGlowingBigSapling;
    public static final RegistryObject<Item> ItemBlockSakuraGlowingLeaves;
    public static final RegistryObject<Item> ItemBlockSakuraLog;
    public static final RegistryObject<Item> ItemBlockSakuraStrippedLog;
    public static final RegistryObject<Item> ItemBlockSakuraWood;
    public static final RegistryObject<Item> ItemBlockSakuraStrippedWood;
    public static final RegistryObject<Item> ItemBlockSakuraPlanks;
    public static final RegistryObject<Item> ItemBlockSakuraSlab;
    public static final RegistryObject<Item> ItemBlockSakuraStairs;
    public static final RegistryObject<Item> ItemBlockSakuraFence;
    public static final RegistryObject<Item> ItemBlockSakuraFenceGate;
    public static final RegistryObject<Item> ItemBlockSakuraDoor;
    public static final RegistryObject<Item> ItemBlockSakuraTrapdoor;
    public static final RegistryObject<Item> ItemBlockSakuraPressurePlate;
    public static final RegistryObject<Item> ItemBlockSakuraButton;
    public static final RegistryObject<Item> ItemBlockSmoothSakuraPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothSakuraSlab;
    public static final RegistryObject<Item> ItemBlockSmoothSakuraStairs;
    public static final RegistryObject<Item> SakuraBark;

    public static final RegistryObject<Item> ItemBlockCypressSapling;
    public static final RegistryObject<Item> ItemBlockCypressLeaves;
    public static final RegistryObject<Item> ItemBlockCypressLog;
    public static final RegistryObject<Item> ItemBlockCypressStrippedLog;
    public static final RegistryObject<Item> ItemBlockCypressWood;
    public static final RegistryObject<Item> ItemBlockCypressStrippedWood;
    public static final RegistryObject<Item> ItemBlockCypressPlanks;
    public static final RegistryObject<Item> ItemBlockCypressSlab;
    public static final RegistryObject<Item> ItemBlockCypressStairs;
    public static final RegistryObject<Item> ItemBlockCypressFence;
    public static final RegistryObject<Item> ItemBlockCypressFenceGate;
    public static final RegistryObject<Item> ItemBlockCypressDoor;
    public static final RegistryObject<Item> ItemBlockCypressTrapdoor;
    public static final RegistryObject<Item> ItemBlockCypressPressurePlate;
    public static final RegistryObject<Item> ItemBlockCypressButton;
    public static final RegistryObject<Item> ItemBlockSmoothCypressPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothCypressSlab;
    public static final RegistryObject<Item> ItemBlockSmoothCypressStairs;
    public static final RegistryObject<Item> CypressBark;
    public static final RegistryObject<Item> ItemBlockLacquerSapling;
    public static final RegistryObject<Item> ItemBlockLacquerLeaves;
    public static final RegistryObject<Item> ItemBlockLacquerLog;
    public static final RegistryObject<Item> ItemBlockChiseledLacquerLog;
    public static final RegistryObject<Item> ItemBlockWoodenCabinetry;
    public static final RegistryObject<Item> ItemBlockWoodenCabinetrySlab;
    public static final RegistryObject<Item> ItemBlockRawUrushiLayer;
    public static final RegistryObject<Item> RawUrushiBall;
    public static final RegistryObject<Item> RedUrushiBall;
    public static final RegistryObject<Item> BlackUrushiBall;
   // public static final RegistryObject<Item> ItemBlockRedUrushiStrippedLog;
   // public static final RegistryObject<Item> ItemBlockRedUrushiStrippedWood;
    public static final RegistryObject<Item> ItemBlockRedUrushiPlanks;
    public static final RegistryObject<Item> ItemBlockRedUrushiSlab;
    public static final RegistryObject<Item> ItemBlockRedUrushiStairs;
    public static final RegistryObject<Item> ItemBlockRedUrushiFence;
    public static final RegistryObject<Item> ItemBlockRedUrushiFenceGate;
    public static final RegistryObject<Item> ItemBlockRedUrushiDoor;
    public static final RegistryObject<Item> ItemBlockRedUrushiTrapdoor;
    public static final RegistryObject<Item> ItemBlockRedUrushiPressurePlate;
    public static final RegistryObject<Item> ItemBlockRedUrushiButton;
    public static final RegistryObject<Item> ItemBlockSmoothRedUrushiPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothRedUrushiSlab;
    public static final RegistryObject<Item> ItemBlockSmoothRedUrushiStairs;
   // public static final RegistryObject<Item> ItemBlockBlackUrushiStrippedLog;
   // public static final RegistryObject<Item> ItemBlockBlackUrushiStrippedWood;
    public static final RegistryObject<Item> ItemBlockBlackUrushiPlanks;
    public static final RegistryObject<Item> ItemBlockBlackUrushiSlab;
    public static final RegistryObject<Item> ItemBlockBlackUrushiStairs;
    public static final RegistryObject<Item> ItemBlockBlackUrushiFence;
    public static final RegistryObject<Item> ItemBlockBlackUrushiFenceGate;
    public static final RegistryObject<Item> ItemBlockBlackUrushiDoor;
    public static final RegistryObject<Item> ItemBlockBlackUrushiTrapdoor;
    public static final RegistryObject<Item> ItemBlockBlackUrushiPressurePlate;
    public static final RegistryObject<Item> ItemBlockBlackUrushiButton;
    public static final RegistryObject<Item> ItemBlockSmoothBlackUrushiPlanks;
    public static final RegistryObject<Item> ItemBlockSmoothBlackUrushiSlab;
    public static final RegistryObject<Item> ItemBlockSmoothBlackUrushiStairs;
    public static final RegistryObject<Item> RiceCrop;
    public static final RegistryObject<Item> ItemBlockPaddyField;
    public static final RegistryObject<Item> AzukiCrop;
    public static final RegistryObject<Item> RawRice;
    public static final RegistryObject<Item> Rice;
    public static final RegistryObject<Item> RiceMalt;
    public static final RegistryObject<Item> ItemBlockTawara;
    public static final RegistryObject<Item> RiceBall;
    public static final RegistryObject<Item> RiceCake;
    public static final RegistryObject<Item> RoastedRiceCake;
    public static final RegistryObject<Item> Gyudon;
    public static final RegistryObject<Item> Butadon;
    public static final RegistryObject<Item> SakuraMochi;
    public static final RegistryObject<Item> Ohagi;
    public static final RegistryObject<Item> ColorDango;
    public static final RegistryObject<Item> MitarashiDango;
    public static final RegistryObject<Item> KusaDango;
    public static final RegistryObject<Item> ItemBlockOakParapet;
    public static final RegistryObject<Item> ItemBlockSpruceParapet;
    public static final RegistryObject<Item> ItemBlockBirchParapet;
    public static final RegistryObject<Item> ItemBlockJungleParapet;
    public static final RegistryObject<Item> ItemBlockAcaciaParapet;
    public static final RegistryObject<Item> ItemBlockDarkOakParapet;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotParapet;
    public static final RegistryObject<Item> ItemBlockSakuraParapet;
    public static final RegistryObject<Item> ItemBlockCypressParapet;
    public static final RegistryObject<Item> ItemBlockRedUrushiParapet;
    public static final RegistryObject<Item> ItemBlockBlackUrushiParapet;
    public static final RegistryObject<Item> BambooCharcoal;
    public static final RegistryObject<Item> ItemBlockBambooBlock;
    public static final RegistryObject<Item> ItemBlockBambooSlab;
    public static final RegistryObject<Item> ItemBlockBambooStairs;
    public static final RegistryObject<Item> ItemBlockBlankFusuma;
    public static final RegistryObject<Item> ItemBlockBlueSeigaihaFusuma;
    public static final RegistryObject<Item> ItemBlockBlueSayagataFusuma;
    public static final RegistryObject<Item> ItemBlockSlidingGlassDoor;
    public static final RegistryObject<Item> ItemBlockOakShojiPane;
    public static final RegistryObject<Item> ItemBlockSpruceShojiPane;
    public static final RegistryObject<Item> ItemBlockBirchShojiPane;
    public static final RegistryObject<Item> ItemBlockJungleShojiPane;
    public static final RegistryObject<Item> ItemBlockAcaciaShojiPane;
    public static final RegistryObject<Item> ItemBlockDarkOakShojiPane;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotShojiPane;
    public static final RegistryObject<Item> ItemBlockSakuraShojiPane;
    public static final RegistryObject<Item> ItemBlockCypressShojiPane;
    public static final RegistryObject<Item> ItemBlockRedUrushiShojiPane;
    public static final RegistryObject<Item> ItemBlockBlackUrushiShojiPane;
    public static final RegistryObject<Item> ItemBlockOakShoji;
    public static final RegistryObject<Item> ItemBlockSpruceShoji;
    public static final RegistryObject<Item> ItemBlockBirchShoji;
    public static final RegistryObject<Item> ItemBlockJungleShoji;
    public static final RegistryObject<Item> ItemBlockAcaciaShoji;
    public static final RegistryObject<Item> ItemBlockDarkOakShoji;
    public static final RegistryObject<Item> ItemBlockJapaneseApricotShoji;
    public static final RegistryObject<Item> ItemBlockSakuraShoji;
    public static final RegistryObject<Item> ItemBlockCypressShoji;
    public static final RegistryObject<Item> ItemBlockRedUrushiShoji;
    public static final RegistryObject<Item> ItemBlockBlackUrushiShoji;
    public static final RegistryObject<Item> SoyCrop;
    public static final RegistryObject<Item> Tofu;
    public static final RegistryObject<Item> AburaAge;
    public static final RegistryObject<Item> Kitsunebi;
    public static final RegistryObject<Item> ItemBlockFoxHopper;
    public static final RegistryObject<Item> ItemBlockGreenTatamiCarpet;
    public static final RegistryObject<Item> ItemBlockBrownTatamiCarpet;
    public static final RegistryObject<Item> ItemBlockSandCoast;
    public static final RegistryObject<Item> ItemBlockThatchedBlock;
    public static final RegistryObject<Item> ItemBlockBlankAntiqueFusuma;
    public static final RegistryObject<Item> ItemBlockThatchedSlab;
    public static final RegistryObject<Item> ItemBlockThatchedStairs;
    //public static final RegistryObject<Item> SpawnEggCarp;
    public static final RegistryObject<Item> CarpBucket;
    public static final RegistryObject<Item> Carp;
    public static final RegistryObject<Item> SweetfishBucket;
    public static final RegistryObject<Item> Sweetfish;
    public static final RegistryObject<Item> GoldfishBucket;
    public static final RegistryObject<Item> Goldfish;
    public static final RegistryObject<Item> ItemBlockConcrete;
    public static final RegistryObject<Item> ItemBlockConcreteSlab;
    public static final RegistryObject<Item> ItemBlockConcreteStairs;
    public static final RegistryObject<Item> ItemBlockDirtyConcrete;
    public static final RegistryObject<Item> ItemBlockDirtyConcreteSlab;
    public static final RegistryObject<Item> ItemBlockDirtyConcreteStairs;
    public static final RegistryObject<Item> ItemBlockLidlessGroove;
    public static final RegistryObject<Item> ItemBlockGroove;
    public static final RegistryObject<Item> ItemBlockMeshGroove;
    public static final RegistryObject<Item> ItemBlockThatchedRoof45;
    public static final RegistryObject<Item> ItemBlockThatchedRoof225;
    public static final RegistryObject<Item> ItemBlockIbushiKawaraRoof45;
    public static final RegistryObject<Item> ItemBlockIbushiKawaraRoof225;
    public static final RegistryObject<Item> ItemBlockCopperKawaraRoof45;
    public static final RegistryObject<Item> ItemBlockCopperKawaraRoof225;
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraRoof45;
    public static final RegistryObject<Item> ItemBlockCupricOxideKawaraRoof225;
    public static final RegistryObject<Item> BambooCharcoalBlock;
    public static final RegistryObject<Item> OakFramedSikkui;
    public static final RegistryObject<Item> SpruceFramedSikkui;
    public static final RegistryObject<Item> BirchFramedSikkui;
    public static final RegistryObject<Item> JungleFramedSikkui;
    public static final RegistryObject<Item> AcaciaFramedSikkui;
    public static final RegistryObject<Item> DarkOakFramedSikkui;
    public static final RegistryObject<Item> JapaneseApricotFramedSikkui;
    public static final RegistryObject<Item> SakuraFramedSikkui;
    public static final RegistryObject<Item> CypressFramedSikkui;
    public static final RegistryObject<Item> RedUrushiFramedSikkui;
    public static final RegistryObject<Item> BlackUrushiFramedSikkui;
    public static final RegistryObject<Item> ConnectableGlass;
    public static final RegistryObject<Item> ConnectableGlassPane;
    public static final RegistryObject<Item> MetalFramedGlass;
    public static final RegistryObject<Item> MetalFramedGlassPane;
    public static final RegistryObject<Item> OilExtractor;
    public static final RegistryObject<Item> VegetableOil;
    public static final RegistryObject<Item> Fryer;
    public static final RegistryObject<Item> Karaage;
    public static final RegistryObject<Item> RoughStone;
    public static final RegistryObject<Item> RoughStoneSlab;
    public static final RegistryObject<Item> RoughStoneStairs;
    public static final RegistryObject<Item> RoughStoneWall;
    public static final RegistryObject<Item> NormalIronIngot0;
    public static final RegistryObject<Item> NormalIronIngot1;
    public static final RegistryObject<Item> NormalIronIngot2;
    public static final RegistryObject<Item> NormalIronIngot3;
    public static final RegistryObject<Item> NormalIronIngot4;
    public static final RegistryObject<Item> NormalIronIngot5;
    public static final RegistryObject<Item> NormalIronIngot6;
    public static final RegistryObject<Item> NormalIronIngot7;
    public static final RegistryObject<Item> NormalIronIngot8;
    public static final RegistryObject<Item> NormalIronIngot9;
    public static final RegistryObject<Item> Hammer;
    public static final RegistryObject<Item> IronsandBlock;
    public static final RegistryObject<Item> Ironsand;
    public static final RegistryObject<Item> NormalKatanaBladeTier1;
    public static final RegistryObject<Item> NormalKatanaBladeTier2;
    public static final RegistryObject<Item> NormalKatanaBladeTier3;
    public static final RegistryObject<Item> NormalKatanaBladeTier4;
    public static final RegistryObject<Item> NormalKatanaBladeTier5;
    public static final RegistryObject<Item> NormalKatanaBladeTier6;
    public static final RegistryObject<Item> NormalKatanaBladeTier7;
    public static final RegistryObject<Item> NormalKatanaBladeTier8;
    public static final RegistryObject<Item> NormalKatanaBladeTier9;
    public static final RegistryObject<Item> NormalKatanaBladeTier10;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier1;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier2;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier3;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier4;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier5;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier6;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier7;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier8;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier9;
    public static final RegistryObject<Item> NormalHotKatanaBladeTier10;
    public static final RegistryObject<Item> NormalKatanaTier1;
    public static final RegistryObject<Item> NormalKatanaTier2;
    public static final RegistryObject<Item> NormalKatanaTier3;
    public static final RegistryObject<Item> NormalKatanaTier4;
    public static final RegistryObject<Item> NormalKatanaTier5;
    public static final RegistryObject<Item> NormalKatanaTier6;
    public static final RegistryObject<Item> NormalKatanaTier7;
    public static final RegistryObject<Item> NormalKatanaTier8;
    public static final RegistryObject<Item> NormalKatanaTier9;
    public static final RegistryObject<Item> NormalKatanaTier10;
    public static final RegistryObject<Item> TKG;
    public static final RegistryObject<Item> WoodChip;
    public static final RegistryObject<Item> KusaMochi;
    //public static final RegistryObject<Item> KitsuneUdon;
    public static final RegistryObject<Item> DeepBlueNoren;
    public static final RegistryObject<Item> RedNoren;
    public static final RegistryObject<Item> CyanNoren;
    public static final RegistryObject<Item> MagentaNoren;
    public static final RegistryObject<Item> MenOnsenNoren;
    public static final RegistryObject<Item> WomenOnsenNoren;
    public static final RegistryObject<Item> SushiNoren;
    public ItemsRegister() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModCore_Urushi.MOD_ID);
        JapaneseTimberBamboo = ITEMS.register("japanese_timber_bamboo", () -> {
            return new BlockItem(BlocksRegister.JapaneseTimberBamboo.get(),(new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        CopperIngot = ITEMS.register("copper_ingot", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCopperOre = ITEMS.register("copper_ore", () -> {
            return new BlockItem((Block) BlocksRegister.CopperOre.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSikkui = ITEMS.register("plaster", () -> {
            return new BlockItem((Block) BlocksRegister.Sikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSikkuiSlab = ITEMS.register("plaster_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SikkuiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSikkuiStairs = ITEMS.register("plaster_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SikkuiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockWattleAndDaub = ITEMS.register("wattle_and_daub", () -> {
            return new BlockItem((Block) BlocksRegister.WattleAndDaub.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockWattleAndDaubSlab = ITEMS.register("wattle_and_daub_slab", () -> {
            return new BlockItem((Block) BlocksRegister.WattleAndDaubSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockWattleAndDaubStairs = ITEMS.register("wattle_and_daub_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.WattleAndDaubStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothOakPlanks = ITEMS.register("smooth_oak_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothOakPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothOakSlab = ITEMS.register("smooth_oak_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothOakSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothOakStairs = ITEMS.register("smooth_oak_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothOakStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothSprucePlanks = ITEMS.register("smooth_spruce_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothSprucePlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothSpruceSlab = ITEMS.register("smooth_spruce_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothSpruceSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothSpruceStairs = ITEMS.register("smooth_spruce_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothSpruceStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothBirchPlanks = ITEMS.register("smooth_birch_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothBirchPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothBirchSlab = ITEMS.register("smooth_birch_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothBirchSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothBirchStairs = ITEMS.register("smooth_birch_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothBirchStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothJunglePlanks = ITEMS.register("smooth_jungle_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothJunglePlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothJungleSlab = ITEMS.register("smooth_jungle_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothJungleSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothJungleStairs = ITEMS.register("smooth_jungle_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothJungleStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothAcaciaPlanks = ITEMS.register("smooth_acacia_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothAcaciaPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothAcaciaSlab = ITEMS.register("smooth_acacia_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothAcaciaSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothAcaciaStairs = ITEMS.register("smooth_acacia_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothAcaciaStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothDarkOakPlanks = ITEMS.register("smooth_dark_oak_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothDarkOakPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothDarkOakSlab = ITEMS.register("smooth_dark_oak_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothDarkOakSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothDarkOakStairs = ITEMS.register("smooth_dark_oak_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothDarkOakStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockNamako = ITEMS.register("namako", () -> {
            return new BlockItem((Block) BlocksRegister.Namako.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockGreenTatami = ITEMS.register("green_tatami", () -> {
            return new BlockItem((Block) BlocksRegister.GreenTatami.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBrownTatami = ITEMS.register("brown_tatami", () -> {
            return new BlockItem((Block) BlocksRegister.BrownTatami.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockGreenTatamiCarpet = ITEMS.register("green_tatami_carpet", () -> {return new BlockItem((Block) BlocksRegister.GreenTatamiCarpet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockBrownTatamiCarpet = ITEMS.register("brown_tatami_carpet", () -> {return new BlockItem((Block) BlocksRegister.BrownTatamiCarpet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});

        ItemBlockBambooWall = ITEMS.register("bamboo_wall", () -> {
            return new BlockItem((Block) BlocksRegister.BambooWall.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockGoldfishBowl = ITEMS.register("goldfish_bowl", () -> {
            return new BlockItem((Block) BlocksRegister.GoldfishBowl.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockAndon = ITEMS.register("andon", () -> {
            return new BlockItem((Block) BlocksRegister.Andon.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        UnfiredIbushiKawara = ITEMS.register("raw_ibushi_kawara", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        IbushiKawara = ITEMS.register("ibushi_kawara", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        CopperKawara = ITEMS.register("copper_kawara", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        OxCopperKawara = ITEMS.register("cupric_oxide_kawara", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockAriakeAndon = ITEMS.register("ariake_andon", () -> {
            return new BlockItem((Block) BlocksRegister.AriakeAndon.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockIbushiKawaraBlock = ITEMS.register("ibushi_kawara_block", () -> {
            return new BlockItem((Block) BlocksRegister.IbushiKawaraBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockIbushiKawaraSlab = ITEMS.register("ibushi_kawara_slab", () -> {
            return new BlockItem((Block) BlocksRegister.IbushiKawaraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockIbushiKawaraStairs = ITEMS.register("ibushi_kawara_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.IbushiKawaraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCopperKawaraBlock = ITEMS.register("copper_kawara_block", () -> {
            return new BlockItem((Block) BlocksRegister.CopperKawaraBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCopperKawaraSlab = ITEMS.register("copper_kawara_slab", () -> {
            return new BlockItem((Block) BlocksRegister.CopperKawaraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCopperKawaraStairs = ITEMS.register("copper_kawara_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.CopperKawaraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCupricOxideKawaraBlock = ITEMS.register("cupric_oxide_kawara_block", () -> {
            return new BlockItem((Block) BlocksRegister.CupricOxideKawaraBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCupricOxideKawaraSlab = ITEMS.register("cupric_oxide_kawara_slab", () -> {
            return new BlockItem((Block) BlocksRegister.CupricOxideKawaraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCupricOxideKawaraStairs = ITEMS.register("cupric_oxide_kawara_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.CupricOxideKawaraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockIronGiboshi = ITEMS.register("iron_giboshi", () -> {
            return new BlockItem((Block) BlocksRegister.IronGiboshi.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockGoldenGiboshi = ITEMS.register("gold_giboshi", () -> {
            return new BlockItem((Block) BlocksRegister.GoldenGiboshi.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotSapling = ITEMS.register("japanese_apricot_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotLeaves = ITEMS.register("japanese_apricot_leaves", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotGlowingSapling = ITEMS.register("glowing_japanese_apricot_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotGlowingSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotGlowingLeaves = ITEMS.register("glowing_japanese_apricot_leaves", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotGlowingLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotLog = ITEMS.register("japanese_apricot_log", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotStrippedLog = ITEMS.register("stripped_japanese_apricot_log", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotWood = ITEMS.register("japanese_apricot_wood", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotStrippedWood = ITEMS.register("stripped_japanese_apricot_wood", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });ItemBlockJapaneseApricotPlanks = ITEMS.register("japanese_apricot_planks", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotSlab = ITEMS.register("japanese_apricot_slab", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotStairs = ITEMS.register("japanese_apricot_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotFence = ITEMS.register("japanese_apricot_fence", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });ItemBlockJapaneseApricotFenceGate = ITEMS.register("japanese_apricot_fence_gate", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotDoor = ITEMS.register("japanese_apricot_door", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotTrapdoor = ITEMS.register("japanese_apricot_trapdoor", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotPressurePlate = ITEMS.register("japanese_apricot_pressure_plate", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotButton = ITEMS.register("japanese_apricot_button", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothJapaneseApricotPlanks = ITEMS.register("smooth_japanese_apricot_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothJapaneseApricotPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothJapaneseApricotSlab = ITEMS.register("smooth_japanese_apricot_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothJapaneseApricotSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });ItemBlockSmoothJapaneseApricotStairs= ITEMS.register("smooth_japanese_apricot_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothJapaneseApricotStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        JapaneseApricotBark = ITEMS.register("japanese_apricot_bark", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });




        ItemBlockSakuraSapling = ITEMS.register("sakura_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraBigSapling = ITEMS.register("big_sakura_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraBigSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraLeaves = ITEMS.register("sakura_leaves", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraGlowingSapling = ITEMS.register("glowing_sakura_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraGlowingSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraGlowingBigSapling = ITEMS.register("glowing_big_sakura_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraGlowingBigSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraGlowingLeaves = ITEMS.register("glowing_sakura_leaves", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraGlowingLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraLog = ITEMS.register("sakura_log", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraStrippedLog = ITEMS.register("stripped_sakura_log", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraWood = ITEMS.register("sakura_wood", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraStrippedWood = ITEMS.register("stripped_sakura_wood", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });ItemBlockSakuraPlanks = ITEMS.register("sakura_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraSlab = ITEMS.register("sakura_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraStairs = ITEMS.register("sakura_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraFence = ITEMS.register("sakura_fence", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });ItemBlockSakuraFenceGate = ITEMS.register("sakura_fence_gate", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraDoor = ITEMS.register("sakura_door", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraTrapdoor = ITEMS.register("sakura_trapdoor", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraPressurePlate = ITEMS.register("sakura_pressure_plate", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraButton = ITEMS.register("sakura_button", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothSakuraPlanks = ITEMS.register("smooth_sakura_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothSakuraPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothSakuraSlab = ITEMS.register("smooth_sakura_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothSakuraSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothSakuraStairs= ITEMS.register("smooth_sakura_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothSakuraStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        SakuraBark = ITEMS.register("sakura_bark", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });



        ItemBlockCypressSapling = ITEMS.register("cypress_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.CypressSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressLeaves = ITEMS.register("cypress_leaves", () -> {
            return new BlockItem((Block) BlocksRegister.CypressLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressLog = ITEMS.register("cypress_log", () -> {
            return new BlockItem((Block) BlocksRegister.CypressLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressStrippedLog = ITEMS.register("stripped_cypress_log", () -> {
            return new BlockItem((Block) BlocksRegister.CypressStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressWood = ITEMS.register("cypress_wood", () -> {
            return new BlockItem((Block) BlocksRegister.CypressWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressStrippedWood = ITEMS.register("stripped_cypress_wood", () -> {
            return new BlockItem((Block) BlocksRegister.CypressStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });ItemBlockCypressPlanks = ITEMS.register("cypress_planks", () -> {
            return new BlockItem((Block) BlocksRegister.CypressPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressSlab = ITEMS.register("cypress_slab", () -> {
            return new BlockItem((Block) BlocksRegister.CypressSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressStairs = ITEMS.register("cypress_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.CypressStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressFence = ITEMS.register("cypress_fence", () -> {
            return new BlockItem((Block) BlocksRegister.CypressFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });ItemBlockCypressFenceGate = ITEMS.register("cypress_fence_gate", () -> {
            return new BlockItem((Block) BlocksRegister.CypressFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressDoor = ITEMS.register("cypress_door", () -> {
            return new BlockItem((Block) BlocksRegister.CypressDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressTrapdoor = ITEMS.register("cypress_trapdoor", () -> {
            return new BlockItem((Block) BlocksRegister.CypressTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressPressurePlate = ITEMS.register("cypress_pressure_plate", () -> {
            return new BlockItem((Block) BlocksRegister.CypressPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressButton = ITEMS.register("cypress_button", () -> {
            return new BlockItem((Block) BlocksRegister.CypressButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothCypressPlanks = ITEMS.register("smooth_cypress_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothCypressPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothCypressSlab = ITEMS.register("smooth_cypress_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothCypressSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothCypressStairs= ITEMS.register("smooth_cypress_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothCypressStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        CypressBark = ITEMS.register("cypress_bark", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockLacquerSapling = ITEMS.register("lacquer_sapling", () -> {
            return new BlockItem((Block) BlocksRegister.LacquerSapling.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockLacquerLeaves = ITEMS.register("lacquer_leaves", () -> {
            return new BlockItem((Block) BlocksRegister.LacquerLeaves.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockLacquerLog = ITEMS.register("lacquer_log", () -> {
            return new BlockItem((Block) BlocksRegister.LacquerLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockChiseledLacquerLog = ITEMS.register("chiseled_lacquer_log", () -> {
            return new BlockItem((Block) BlocksRegister.ChiseledLacquerLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockWoodenCabinetry = ITEMS.register("wooden_cabinetry", () -> {
            return new BlockItem((Block) BlocksRegister.WoodenCabinetry.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockWoodenCabinetrySlab = ITEMS.register("wooden_cabinetry_slab", () -> {
            return new BlockItem((Block) BlocksRegister.WoodenCabinetrySlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRawUrushiLayer = ITEMS.register("raw_urushi_layer", () -> {
            return new BlockItem((Block) BlocksRegister.RawUrushiLayer.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        RawUrushiBall = ITEMS.register("raw_urushi_ball", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        RedUrushiBall = ITEMS.register("red_urushi_ball", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        BlackUrushiBall = ITEMS.register("black_urushi_ball", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });

      /*  ItemBlockRedUrushiStrippedLog = ITEMS.register("stripped_red_urushi_log", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiStrippedWood = ITEMS.register("stripped_red_urushi_wood", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });*/
        ItemBlockRedUrushiPlanks = ITEMS.register("red_urushi_planks", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiSlab = ITEMS.register("red_urushi_slab", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiStairs = ITEMS.register("red_urushi_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiFence = ITEMS.register("red_urushi_fence", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiFenceGate = ITEMS.register("red_urushi_fence_gate", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiDoor = ITEMS.register("red_urushi_door", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiTrapdoor = ITEMS.register("red_urushi_trapdoor", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiPressurePlate = ITEMS.register("red_urushi_pressure_plate", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiButton = ITEMS.register("red_urushi_button", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothRedUrushiPlanks = ITEMS.register("smooth_red_urushi_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothRedUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothRedUrushiSlab = ITEMS.register("smooth_red_urushi_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothRedUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothRedUrushiStairs= ITEMS.register("smooth_red_urushi_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothRedUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });

        /*ItemBlockBlackUrushiStrippedLog = ITEMS.register("stripped_black_urushi_log", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiStrippedLog.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiStrippedWood = ITEMS.register("stripped_black_urushi_wood", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiStrippedWood.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });*/
        ItemBlockBlackUrushiPlanks = ITEMS.register("black_urushi_planks", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiSlab = ITEMS.register("black_urushi_slab", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiStairs = ITEMS.register("black_urushi_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiFence = ITEMS.register("black_urushi_fence", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiFence.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiFenceGate = ITEMS.register("black_urushi_fence_gate", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiFenceGate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiDoor = ITEMS.register("black_urushi_door", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiTrapdoor = ITEMS.register("black_urushi_trapdoor", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiTrapdoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiPressurePlate = ITEMS.register("black_urushi_pressure_plate", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiPressurePlate.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiButton = ITEMS.register("black_urushi_button", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiButton.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothBlackUrushiPlanks = ITEMS.register("smooth_black_urushi_planks", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothBlackUrushiPlanks.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothBlackUrushiSlab = ITEMS.register("smooth_black_urushi_slab", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothBlackUrushiSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSmoothBlackUrushiStairs= ITEMS.register("smooth_black_urushi_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.SmoothBlackUrushiStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        RiceCrop = ITEMS.register("rice_crop", () -> {
            return new BlockItem((Block) BlocksRegister.RiceCrop.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockPaddyField= ITEMS.register("paddy_field", () -> {
            return new BlockItem((Block) BlocksRegister.PaddyField.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        AzukiCrop = ITEMS.register("azuki_crop", () -> {
            return new BlockItem((Block) BlocksRegister.AzukiCrop.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        RawRice = ITEMS.register("raw_rice", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        Rice = ITEMS.register("rice", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Rice));
        });
        RiceMalt = ITEMS.register("rice_malt", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockTawara = ITEMS.register("tawara", () -> {
            return new BlockItem((Block) BlocksRegister.Tawara.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        RiceBall = ITEMS.register("rice_ball", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.RiceBall));
        });
        RiceCake = ITEMS.register("rice_cake", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.RiceCake));
        });
        RoastedRiceCake = ITEMS.register("roasted_rice_cake", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.RoastedRiceCake));
        });
        Gyudon = ITEMS.register("gyudon", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Gyudon));
        });
        Butadon = ITEMS.register("butadon", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Butadon));
        });
        SakuraMochi = ITEMS.register("sakura_mochi", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.SakuraMochi));
        });
        Ohagi = ITEMS.register("ohagi", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Ohagi));
        });
        ColorDango = ITEMS.register("color_dango", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.ColorDango));
        });
        MitarashiDango = ITEMS.register("mitarashi_dango", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.MitarashiDango));
        });
        KusaDango = ITEMS.register("kusa_dango", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.KusaDango));
        });
        ItemBlockOakParapet = ITEMS.register("oak_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.OakParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSpruceParapet = ITEMS.register("spruce_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.SpruceParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBirchParapet = ITEMS.register("birch_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.BirchParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJungleParapet = ITEMS.register("jungle_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.JungleParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockAcaciaParapet = ITEMS.register("acacia_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.AcaciaParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockDarkOakParapet = ITEMS.register("dark_oak_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.DarkOakParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockJapaneseApricotParapet = ITEMS.register("japanese_apricot_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.JapaneseApricotParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSakuraParapet = ITEMS.register("sakura_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.SakuraParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockCypressParapet = ITEMS.register("cypress_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.CypressParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockRedUrushiParapet = ITEMS.register("red_urushi_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.RedUrushiParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlackUrushiParapet = ITEMS.register("black_urushi_parapet", () -> {
            return new BlockItem((Block) BlocksRegister.BlackUrushiParapet.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        BambooCharcoal = ITEMS.register("bamboo_charcoal", () -> {
            return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBambooBlock = ITEMS.register("bamboo_block", () -> {
            return new BlockItem((Block) BlocksRegister.BambooBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBambooSlab = ITEMS.register("bamboo_slab", () -> {
            return new BlockItem((Block) BlocksRegister.BambooSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBambooStairs = ITEMS.register("bamboo_stairs", () -> {
            return new BlockItem((Block) BlocksRegister.BambooStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlankFusuma = ITEMS.register("blank_fusuma", () -> {
            return new BlockItem((Block) BlocksRegister.BlankFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlueSeigaihaFusuma = ITEMS.register("blue_seigaiha_fusuma", () -> {
            return new BlockItem((Block) BlocksRegister.BlueSeigaihaFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlueSayagataFusuma = ITEMS.register("blue_sayagata_fusuma", () -> {
            return new BlockItem((Block) BlocksRegister.BlueSayagataFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockBlankAntiqueFusuma = ITEMS.register("blank_antique_fusuma", () -> {return new BlockItem((Block) BlocksRegister.BlankAntiqueFusuma.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockSlidingGlassDoor = ITEMS.register("sliding_glass_door", () -> {
            return new BlockItem((Block) BlocksRegister.SlidingGlassDoor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockOakShojiPane = ITEMS.register("oak_shoji_pane", () -> {
            return new BlockItem((Block) BlocksRegister.OakShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));
        });
        ItemBlockSpruceShojiPane = ITEMS.register("spruce_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.SpruceShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockBirchShojiPane = ITEMS.register("birch_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.BirchShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockJungleShojiPane = ITEMS.register("jungle_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.JungleShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockAcaciaShojiPane = ITEMS.register("acacia_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.AcaciaShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockDarkOakShojiPane = ITEMS.register("dark_oak_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.DarkOakShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockJapaneseApricotShojiPane= ITEMS.register("japanese_apricot_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.JapaneseApricotShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockSakuraShojiPane = ITEMS.register("sakura_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.SakuraShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockCypressShojiPane = ITEMS.register("cypress_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.CypressShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockRedUrushiShojiPane = ITEMS.register("red_urushi_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.RedUrushiShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockBlackUrushiShojiPane = ITEMS.register("black_urushi_shoji_pane", () -> {return new BlockItem((Block) BlocksRegister.BlackUrushiShojiPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockOakShoji = ITEMS.register("oak_shoji", () -> {return new BlockItem((Block) BlocksRegister.OakShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockSpruceShoji = ITEMS.register("spruce_shoji", () -> {return new BlockItem((Block) BlocksRegister.SpruceShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockBirchShoji = ITEMS.register("birch_shoji", () -> {return new BlockItem((Block) BlocksRegister.BirchShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockJungleShoji = ITEMS.register("jungle_shoji", () -> {return new BlockItem((Block) BlocksRegister.JungleShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockAcaciaShoji = ITEMS.register("acacia_shoji", () -> {return new BlockItem((Block) BlocksRegister.AcaciaShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockDarkOakShoji = ITEMS.register("dark_oak_shoji", () -> {return new BlockItem((Block) BlocksRegister.DarkOakShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockJapaneseApricotShoji = ITEMS.register("japanese_apricot_shoji", () -> {return new BlockItem((Block) BlocksRegister.JapaneseApricotShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockSakuraShoji = ITEMS.register("sakura_shoji", () -> {return new BlockItem((Block) BlocksRegister.SakuraShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockCypressShoji = ITEMS.register("cypress_shoji", () -> {return new BlockItem((Block) BlocksRegister.CypressShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockRedUrushiShoji = ITEMS.register("red_urushi_shoji", () -> {return new BlockItem((Block) BlocksRegister.RedUrushiShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockBlackUrushiShoji = ITEMS.register("black_urushi_shoji", () -> {return new BlockItem((Block) BlocksRegister.BlackUrushiShoji.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        SoyCrop = ITEMS.register("soy_crop", () -> {return new BlockItem((Block) BlocksRegister.SoyCrop.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Tofu = ITEMS.register("tofu", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Tofu));});
        AburaAge = ITEMS.register("abura_age", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.AburaAge));});
        Kitsunebi = ITEMS.register("kitsunebi", () -> {return new KitsunebiItem((new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockFoxHopper = ITEMS.register("fox_hopper", () -> {return new BlockItem((Block) BlocksRegister.FoxHopper.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockSandCoast = ITEMS.register("sand_coast", () -> {return new BlockItem((Block) BlocksRegister.SandCoast.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockThatchedBlock = ITEMS.register("thatched_block", () -> {return new BlockItem((Block) BlocksRegister.ThatchedBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockThatchedSlab = ITEMS.register("thatched_slab", () -> {return new BlockItem((Block) BlocksRegister.ThatchedSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockThatchedStairs = ITEMS.register("thatched_stairs", () -> {return new BlockItem((Block) BlocksRegister.ThatchedStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        //SpawnEggCarp = ITEMS.register("carp_spawn_egg", () -> {return new SpawnEggItem(EntityRegister.CarpEntity.get(), 5349438, 8306542, (new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        CarpBucket = ITEMS.register("carp_bucket", () -> {return new CarpBucketItem( Fluids.WATER,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Carp = ITEMS.register("carp", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Carp));});
        SweetfishBucket = ITEMS.register("sweetfish_bucket", () -> {return new SweetfishBucketItem( Fluids.WATER,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Sweetfish = ITEMS.register("sweetfish", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Sweetfish));});
        GoldfishBucket = ITEMS.register("goldfish_bucket", () -> {return new GoldfishBucketItem( Fluids.WATER,(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Goldfish = ITEMS.register("goldfish", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Goldfish));});
        ItemBlockConcrete = ITEMS.register("concrete", () -> {return new BlockItem((Block) BlocksRegister.Concrete.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockConcreteSlab = ITEMS.register("concrete_slab", () -> {return new BlockItem((Block) BlocksRegister.ConcreteSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockConcreteStairs = ITEMS.register("concrete_stairs", () -> {return new BlockItem((Block) BlocksRegister.ConcreteStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockDirtyConcrete = ITEMS.register("dirty_concrete", () -> {return new BlockItem((Block) BlocksRegister.DirtyConcrete.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockDirtyConcreteSlab = ITEMS.register("dirty_concrete_slab", () -> {return new BlockItem((Block) BlocksRegister.DirtyConcreteSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockDirtyConcreteStairs = ITEMS.register("dirty_concrete_stairs", () -> {return new BlockItem((Block) BlocksRegister.DirtyConcreteStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockLidlessGroove = ITEMS.register("lidless_groove", () -> {return new BlockItem((Block) BlocksRegister.LidlessGroove.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockGroove = ITEMS.register("groove", () -> {return new BlockItem((Block) BlocksRegister.Groove.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockMeshGroove = ITEMS.register("mesh_groove", () -> {return new BlockItem((Block) BlocksRegister.MeshGroove.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockThatchedRoof45 = ITEMS.register("thatched_roof_45", () -> {return new BlockItem((Block) BlocksRegister.ThatchedRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockThatchedRoof225 = ITEMS.register("thatched_roof_225", () -> {return new BlockItem((Block) BlocksRegister.ThatchedRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockIbushiKawaraRoof45 = ITEMS.register("ibushi_kawara_roof_45", () -> {return new BlockItem((Block) BlocksRegister.IbushiKawaraRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockIbushiKawaraRoof225 = ITEMS.register("ibushi_kawara_roof_225", () -> {return new BlockItem((Block) BlocksRegister.IbushiKawaraRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockCopperKawaraRoof45 = ITEMS.register("copper_kawara_roof_45", () -> {return new BlockItem((Block) BlocksRegister.CopperKawaraRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockCopperKawaraRoof225 = ITEMS.register("copper_kawara_roof_225", () -> {return new BlockItem((Block) BlocksRegister.CopperKawaraRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockCupricOxideKawaraRoof45 = ITEMS.register("cupric_oxide_kawara_roof_45", () -> {return new BlockItem((Block) BlocksRegister.CupricOxideKawaraRoof45.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ItemBlockCupricOxideKawaraRoof225 = ITEMS.register("cupric_oxide_kawara_roof_225", () -> {return new BlockItem((Block) BlocksRegister.CupricOxideKawaraRoof225.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        BambooCharcoalBlock = ITEMS.register("bamboo_charcoal_block", () -> {return new BlockItem((Block) BlocksRegister.BambooCharcoalBlock.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        OakFramedSikkui = ITEMS.register("oak_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.OakFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        SpruceFramedSikkui = ITEMS.register("spruce_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.SpruceFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        BirchFramedSikkui = ITEMS.register("birch_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.BirchFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        JungleFramedSikkui = ITEMS.register("jungle_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.JungleFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        AcaciaFramedSikkui = ITEMS.register("acacia_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.AcaciaFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        DarkOakFramedSikkui = ITEMS.register("dark_oak_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.DarkOakFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        JapaneseApricotFramedSikkui = ITEMS.register("japanese_apricot_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.JapaneseApricotFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        SakuraFramedSikkui = ITEMS.register("sakura_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.SakuraFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        CypressFramedSikkui = ITEMS.register("cypress_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.CypressFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        RedUrushiFramedSikkui = ITEMS.register("red_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.RedUrushiFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        BlackUrushiFramedSikkui = ITEMS.register("black_framed_plaster", () -> {return new BlockItem((Block) BlocksRegister.BlackUrushiFramedSikkui.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ConnectableGlass = ITEMS.register("connectable_glass", () -> {return new BlockItem((Block) BlocksRegister.ConnectableGlass.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        ConnectableGlassPane = ITEMS.register("connectable_glass_pane", () -> {return new BlockItem((Block) BlocksRegister.ConnectableGlassPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        MetalFramedGlass = ITEMS.register("metal_framed_glass", () -> {return new BlockItem((Block) BlocksRegister.MetalFramedGlass.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        MetalFramedGlassPane = ITEMS.register("metal_framed_glass_pane", () -> {return new BlockItem((Block) BlocksRegister.MetalFramedGlassPane.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        OilExtractor = ITEMS.register("oil_extractor", () -> {return new BlockItem((Block) BlocksRegister.OilExtractor.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        VegetableOil = ITEMS.register("vegetable_oil", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Fryer = ITEMS.register("fryer", () -> {return new BlockItem((Block) BlocksRegister.Fryer.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Karaage = ITEMS.register("karaage", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.Karaage));});
        RoughStone = ITEMS.register("rough_stone", () -> {return new BlockItem((Block) BlocksRegister.RoughStone.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        RoughStoneSlab = ITEMS.register("rough_stone_slab", () -> {return new BlockItem((Block) BlocksRegister.RoughStoneSlab.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        RoughStoneStairs = ITEMS.register("rough_stone_stairs", () -> {return new BlockItem((Block) BlocksRegister.RoughStoneStairs.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        RoughStoneWall = ITEMS.register("rough_stone_wall", () -> {return new BlockItem((Block) BlocksRegister.RoughStoneWall.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Hammer = ITEMS.register("hammer", () -> {return new HammerItem((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).durability(1024));});
        NormalIronIngot0 = ITEMS.register("normal_iron_ingot_0", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot0.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot1 = ITEMS.register("normal_iron_ingot_1", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot1.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot2 = ITEMS.register("normal_iron_ingot_2", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot2.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot3 = ITEMS.register("normal_iron_ingot_3", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot3.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot4 = ITEMS.register("normal_iron_ingot_4", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot4.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot5 = ITEMS.register("normal_iron_ingot_5", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot5.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot6 = ITEMS.register("normal_iron_ingot_6", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot6.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot7 = ITEMS.register("normal_iron_ingot_7", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot7.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot8 = ITEMS.register("normal_iron_ingot_8", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot8.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalIronIngot9 = ITEMS.register("normal_iron_ingot_9", () -> {return new IronIngotItem((Block) BlocksRegister.NormalIronIngot9.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        IronsandBlock = ITEMS.register("ironsand_ore", () -> {return new BlockItem((Block) BlocksRegister.Ironsand.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        Ironsand = ITEMS.register("ironsand", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier1 = ITEMS.register("normal_katana_blade_tier_1", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier2 = ITEMS.register("normal_katana_blade_tier_2", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier3 = ITEMS.register("normal_katana_blade_tier_3", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier4 = ITEMS.register("normal_katana_blade_tier_4", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier5 = ITEMS.register("normal_katana_blade_tier_5", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier6 = ITEMS.register("normal_katana_blade_tier_6", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier7 = ITEMS.register("normal_katana_blade_tier_7", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier8 = ITEMS.register("normal_katana_blade_tier_8", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier9 = ITEMS.register("normal_katana_blade_tier_9", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaBladeTier10 = ITEMS.register("normal_katana_blade_tier_10", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier1 = ITEMS.register("normal_hot_katana_blade_tier_1", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier1.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier2 = ITEMS.register("normal_hot_katana_blade_tier_2", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier2.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier3 = ITEMS.register("normal_hot_katana_blade_tier_3", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier3.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier4 = ITEMS.register("normal_hot_katana_blade_tier_4", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier4.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier5 = ITEMS.register("normal_hot_katana_blade_tier_5", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier5.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier6 = ITEMS.register("normal_hot_katana_blade_tier_6", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier6.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier7 = ITEMS.register("normal_hot_katana_blade_tier_7", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier7.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier8 = ITEMS.register("normal_hot_katana_blade_tier_8", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier8.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier9 = ITEMS.register("normal_hot_katana_blade_tier_9", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier9.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalHotKatanaBladeTier10 = ITEMS.register("normal_hot_katana_blade_tier_10", () -> {return new HotKatanaBladeItem(NormalKatanaBladeTier10.get(),(new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier1 = ITEMS.register("normal_katana_tier_1", () -> {return new NormalKatanaItem(ItemTier.IRON, 0, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier2 = ITEMS.register("normal_katana_tier_2", () -> {return new NormalKatanaItem(ItemTier.IRON, 2, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier3 = ITEMS.register("normal_katana_tier_3", () -> {return new NormalKatanaItem(ItemTier.IRON, 4, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier4 = ITEMS.register("normal_katana_tier_4", () -> {return new NormalKatanaItem(ItemTier.IRON, 6, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier5 = ITEMS.register("normal_katana_tier_5", () -> {return new NormalKatanaItem(ItemTier.IRON, 8, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier6 = ITEMS.register("normal_katana_tier_6", () -> {return new NormalKatanaItem(ItemTier.IRON, 10, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier7 = ITEMS.register("normal_katana_tier_7", () -> {return new NormalKatanaItem(ItemTier.IRON, 12, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier8 = ITEMS.register("normal_katana_tier_8", () -> {return new NormalKatanaItem(ItemTier.IRON, 14, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier9 = ITEMS.register("normal_katana_tier_9", () -> {return new NormalKatanaItem(ItemTier.IRON, 16, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        NormalKatanaTier10 = ITEMS.register("normal_katana_tier_10", () -> {return new NormalKatanaItem(ItemTier.IRON, 18, -2.9F, (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        TKG = ITEMS.register("tkg", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.TKG));});
        WoodChip = ITEMS.register("wood_chip", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        KusaMochi = ITEMS.register("kusa_mochi", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.KusaMochi));});
        //KitsuneUdon = ITEMS.register("kitsune_udon", () -> {return new Item((new net.minecraft.item.Item.Properties()).tab(ModCore_Urushi.TabUrushi).food(FoodsUrushi.KusaMochi));});
        DeepBlueNoren = ITEMS.register("deep_blue_noren", () -> {return new BlockItem((Block) BlocksRegister.DeepBlueNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        RedNoren = ITEMS.register("red_noren", () -> {return new BlockItem((Block) BlocksRegister.RedNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        CyanNoren = ITEMS.register("cyan_noren", () -> {return new BlockItem((Block) BlocksRegister.CyanNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        MagentaNoren = ITEMS.register("magenta_noren", () -> {return new BlockItem((Block) BlocksRegister.MagentaNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        MenOnsenNoren = ITEMS.register("men_onsen_noren", () -> {return new BlockItem((Block) BlocksRegister.MenOnsenNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        WomenOnsenNoren = ITEMS.register("women_onsen_noren", () -> {return new BlockItem((Block) BlocksRegister.WomenOnsenNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});
        SushiNoren = ITEMS.register("sushi_noren", () -> {return new BlockItem((Block) BlocksRegister.SushiNoren.get(), (new Item.Properties()).tab(ModCore_Urushi.TabUrushi));});

    }
}
