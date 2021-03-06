package com.iwaliner.urushi;


import com.iwaliner.urushi.Block.*;
import com.iwaliner.urushi.World.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlocksRegister {
    private static final DeferredRegister<Block> BLOCKS;
    public static final RegistryObject<Block> CopperOre;
    public static final RegistryObject<Block> Sikkui;
    public static final RegistryObject<Block> SikkuiSlab;
    public static final RegistryObject<Block> SikkuiStairs;
    public static final RegistryObject<Block> WattleAndDaub;
    public static final RegistryObject<Block> WattleAndDaubSlab;
    public static final RegistryObject<Block> WattleAndDaubStairs;
    public static final RegistryObject<Block> SmoothOakPlanks;
    public static final RegistryObject<Block> SmoothOakSlab;
    public static final RegistryObject<Block> SmoothOakStairs;
    public static final RegistryObject<Block> SmoothSprucePlanks;
    public static final RegistryObject<Block> SmoothSpruceSlab;
    public static final RegistryObject<Block> SmoothSpruceStairs;
    public static final RegistryObject<Block> SmoothBirchPlanks;
    public static final RegistryObject<Block> SmoothBirchSlab;
    public static final RegistryObject<Block> SmoothBirchStairs;
    public static final RegistryObject<Block> SmoothJunglePlanks;
    public static final RegistryObject<Block> SmoothJungleSlab;
    public static final RegistryObject<Block> SmoothJungleStairs;
    public static final RegistryObject<Block> SmoothAcaciaPlanks;
    public static final RegistryObject<Block> SmoothAcaciaSlab;
    public static final RegistryObject<Block> SmoothAcaciaStairs;
    public static final RegistryObject<Block> SmoothDarkOakPlanks;
    public static final RegistryObject<Block> SmoothDarkOakSlab;
    public static final RegistryObject<Block> SmoothDarkOakStairs;
    public static final RegistryObject<Block> Namako;
    public static final RegistryObject<Block> GreenTatami;
    public static final RegistryObject<Block> BrownTatami;
    public static final RegistryObject<Block> JapaneseTimberBamboo;
    public static final RegistryObject<Block> BambooWall;
    public static final RegistryObject<Block> GoldfishBowl;
    public static final RegistryObject<Block> Andon;
    public static final RegistryObject<Block> AriakeAndon;
    public static final RegistryObject<Block> IbushiKawaraBlock;
    public static final RegistryObject<Block> IbushiKawaraSlab;
    public static final RegistryObject<Block> IbushiKawaraStairs;
    public static final RegistryObject<Block> CopperKawaraBlock;
    public static final RegistryObject<Block> CopperKawaraSlab;
    public static final RegistryObject<Block> CopperKawaraStairs;
    public static final RegistryObject<Block> CupricOxideKawaraBlock;
    public static final RegistryObject<Block> CupricOxideKawaraSlab;
    public static final RegistryObject<Block> CupricOxideKawaraStairs;
    public static final RegistryObject<Block> IronGiboshi;
    public static final RegistryObject<Block> GoldenGiboshi;
    public static final RegistryObject<Block> JapaneseApricotSapling;
    public static final RegistryObject<Block> JapaneseApricotLeaves;
    public static final RegistryObject<Block> JapaneseApricotGlowingSapling;
    public static final RegistryObject<Block> JapaneseApricotGlowingLeaves;
    public static final RegistryObject<Block> JapaneseApricotLog;
    public static final RegistryObject<Block> JapaneseApricotStrippedLog;
    public static final RegistryObject<Block> JapaneseApricotWood;
    public static final RegistryObject<Block> JapaneseApricotStrippedWood;
    public static final RegistryObject<Block> JapaneseApricotPlanks;
    public static final RegistryObject<Block> JapaneseApricotSlab;
    public static final RegistryObject<Block> JapaneseApricotStairs;
    public static final RegistryObject<Block> JapaneseApricotFence;
    public static final RegistryObject<Block> JapaneseApricotFenceGate;
    public static final RegistryObject<Block> JapaneseApricotDoor;
    public static final RegistryObject<Block> JapaneseApricotTrapdoor;
    public static final RegistryObject<Block> JapaneseApricotPressurePlate;
    public static final RegistryObject<Block> JapaneseApricotButton;
    public static final RegistryObject<Block> SmoothJapaneseApricotPlanks;
    public static final RegistryObject<Block> SmoothJapaneseApricotSlab;
    public static final RegistryObject<Block> SmoothJapaneseApricotStairs;
    public static final RegistryObject<Block> SakuraSapling;
    public static final RegistryObject<Block> SakuraBigSapling;
    public static final RegistryObject<Block> SakuraLeaves;
    public static final RegistryObject<Block> SakuraGlowingSapling;
    public static final RegistryObject<Block> SakuraGlowingBigSapling;
    public static final RegistryObject<Block> SakuraGlowingLeaves;
    public static final RegistryObject<Block> SakuraLog;
    public static final RegistryObject<Block> SakuraStrippedLog;
    public static final RegistryObject<Block> SakuraWood;
    public static final RegistryObject<Block> SakuraStrippedWood;
    public static final RegistryObject<Block> SakuraPlanks;
    public static final RegistryObject<Block> SakuraSlab;
    public static final RegistryObject<Block> SakuraStairs;
    public static final RegistryObject<Block> SakuraFence;
    public static final RegistryObject<Block> SakuraFenceGate;
    public static final RegistryObject<Block> SakuraDoor;
    public static final RegistryObject<Block> SakuraTrapdoor;
    public static final RegistryObject<Block> SakuraPressurePlate;
    public static final RegistryObject<Block> SakuraButton;
    public static final RegistryObject<Block> SmoothSakuraPlanks;
    public static final RegistryObject<Block> SmoothSakuraSlab;
    public static final RegistryObject<Block> SmoothSakuraStairs;
    public static final RegistryObject<Block> CypressSapling;
    public static final RegistryObject<Block> CypressLeaves;
    public static final RegistryObject<Block> CypressLog;
    public static final RegistryObject<Block> CypressStrippedLog;
    public static final RegistryObject<Block> CypressWood;
    public static final RegistryObject<Block> CypressStrippedWood;
    public static final RegistryObject<Block> CypressPlanks;
    public static final RegistryObject<Block> CypressSlab;
    public static final RegistryObject<Block> CypressStairs;
    public static final RegistryObject<Block> CypressFence;
    public static final RegistryObject<Block> CypressFenceGate;
    public static final RegistryObject<Block> CypressDoor;
    public static final RegistryObject<Block> CypressTrapdoor;
    public static final RegistryObject<Block> CypressPressurePlate;
    public static final RegistryObject<Block> CypressButton;
    public static final RegistryObject<Block> SmoothCypressPlanks;
    public static final RegistryObject<Block> SmoothCypressSlab;
    public static final RegistryObject<Block> SmoothCypressStairs;
    public static final RegistryObject<Block> LacquerSapling;
    public static final RegistryObject<Block> LacquerLeaves;
    public static final RegistryObject<Block> LacquerLog;
    public static final RegistryObject<Block> ChiseledLacquerLog;
    public static final RegistryObject<Block> WoodenCabinetry;
    public static final RegistryObject<Block> WoodenCabinetrySlab;
    public static final RegistryObject<Block> RawUrushiLayer;
   // public static final RegistryObject<Block> RedUrushiStrippedLog;
  //  public static final RegistryObject<Block> RedUrushiStrippedWood;
    public static final RegistryObject<Block> RedUrushiPlanks;
    public static final RegistryObject<Block> RedUrushiSlab;
    public static final RegistryObject<Block> RedUrushiStairs;
    public static final RegistryObject<Block> RedUrushiFence;
    public static final RegistryObject<Block> RedUrushiFenceGate;
    public static final RegistryObject<Block> RedUrushiDoor;
    public static final RegistryObject<Block> RedUrushiTrapdoor;
    public static final RegistryObject<Block> RedUrushiPressurePlate;
    public static final RegistryObject<Block> RedUrushiButton;
    public static final RegistryObject<Block> SmoothRedUrushiPlanks;
    public static final RegistryObject<Block> SmoothRedUrushiSlab;
    public static final RegistryObject<Block> SmoothRedUrushiStairs;
//   public static final RegistryObject<Block> BlackUrushiStrippedLog;
  //  public static final RegistryObject<Block> BlackUrushiStrippedWood;
    public static final RegistryObject<Block> BlackUrushiPlanks;
    public static final RegistryObject<Block> BlackUrushiSlab;
    public static final RegistryObject<Block> BlackUrushiStairs;
    public static final RegistryObject<Block> BlackUrushiFence;
    public static final RegistryObject<Block> BlackUrushiFenceGate;
    public static final RegistryObject<Block> BlackUrushiDoor;
    public static final RegistryObject<Block> BlackUrushiTrapdoor;
    public static final RegistryObject<Block> BlackUrushiPressurePlate;
    public static final RegistryObject<Block> BlackUrushiButton;
    public static final RegistryObject<Block> SmoothBlackUrushiPlanks;
    public static final RegistryObject<Block> SmoothBlackUrushiSlab;
    public static final RegistryObject<Block> SmoothBlackUrushiStairs;
    public static final RegistryObject<Block> RiceCrop;
    public static final RegistryObject<Block> PaddyField;
    public static final RegistryObject<Block> AzukiCrop;
    public static final RegistryObject<Block> Tawara;
    public static final RegistryObject<Block> OakParapet;
    public static final RegistryObject<Block> SpruceParapet;
    public static final RegistryObject<Block> BirchParapet;
    public static final RegistryObject<Block> JungleParapet;
    public static final RegistryObject<Block> AcaciaParapet;
    public static final RegistryObject<Block> DarkOakParapet;
    public static final RegistryObject<Block> JapaneseApricotParapet;
    public static final RegistryObject<Block> SakuraParapet;
    public static final RegistryObject<Block> CypressParapet;
    public static final RegistryObject<Block> RedUrushiParapet;
    public static final RegistryObject<Block> BlackUrushiParapet;
    public static final RegistryObject<Block> BambooBlock;
    public static final RegistryObject<Block> BambooSlab;
    public static final RegistryObject<Block> BambooStairs;
    public static final RegistryObject<Block> BlankFusuma;
    public static final RegistryObject<Block> BlueSeigaihaFusuma;
    public static final RegistryObject<Block> BlueSayagataFusuma;
    public static final RegistryObject<Block> SlidingGlassDoor;
    public static final RegistryObject<Block> OakShojiPane;
    public static final RegistryObject<Block> SpruceShojiPane;
    public static final RegistryObject<Block> BirchShojiPane;
    public static final RegistryObject<Block> JungleShojiPane;
    public static final RegistryObject<Block> AcaciaShojiPane;
    public static final RegistryObject<Block> DarkOakShojiPane;
    public static final RegistryObject<Block> JapaneseApricotShojiPane;
    public static final RegistryObject<Block> SakuraShojiPane;
    public static final RegistryObject<Block> CypressShojiPane;
    public static final RegistryObject<Block> RedUrushiShojiPane;
    public static final RegistryObject<Block> BlackUrushiShojiPane;
    public static final RegistryObject<Block> OakShoji;
    public static final RegistryObject<Block> SpruceShoji;
    public static final RegistryObject<Block> BirchShoji;
    public static final RegistryObject<Block> JungleShoji;
    public static final RegistryObject<Block> AcaciaShoji;
    public static final RegistryObject<Block> DarkOakShoji;
    public static final RegistryObject<Block> JapaneseApricotShoji;
    public static final RegistryObject<Block> SakuraShoji;
    public static final RegistryObject<Block> CypressShoji;
    public static final RegistryObject<Block> RedUrushiShoji;
    public static final RegistryObject<Block> BlackUrushiShoji;
    public static final RegistryObject<Block> SoyCrop;
    public static final RegistryObject<Block> Kitsunebi;
    public static final RegistryObject<Block> FoxHopper;
    public static final RegistryObject<Block> GreenTatamiCarpet;
    public static final RegistryObject<Block> BrownTatamiCarpet;
    public static final RegistryObject<Block> SandCoast;
    public static final RegistryObject<Block> ThatchedBlock;
    public static final RegistryObject<Block> ThatchedSlab;
    public static final RegistryObject<Block> ThatchedStairs;
    public static final RegistryObject<Block> BlankAntiqueFusuma;
    public static final RegistryObject<Block> Concrete;
    public static final RegistryObject<Block> ConcreteSlab;
    public static final RegistryObject<Block> ConcreteStairs;
    public static final RegistryObject<Block> DirtyConcrete;
    public static final RegistryObject<Block> DirtyConcreteSlab;
    public static final RegistryObject<Block> DirtyConcreteStairs;
    public static final RegistryObject<Block> LidlessGroove;
    public static final RegistryObject<Block> Groove;
    public static final RegistryObject<Block> MeshGroove;
    public static final RegistryObject<Block> ThatchedRoof45;

    public static final RegistryObject<Block> ThatchedRoof225;
    public static final RegistryObject<Block> IbushiKawaraRoof45;

    public static final RegistryObject<Block> IbushiKawaraRoof225;
    public static final RegistryObject<Block> CopperKawaraRoof45;

    public static final RegistryObject<Block> CopperKawaraRoof225;
    public static final RegistryObject<Block> CupricOxideKawaraRoof45;

    public static final RegistryObject<Block> CupricOxideKawaraRoof225;

    public BlocksRegister() {
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModCore_Urushi.MOD_ID);
        CopperOre = BLOCKS.register("copper_ore", () -> {
            return new OreBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.5F, 10.0F));
        });
        Sikkui = BLOCKS.register("plaster", () -> {
            return new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.SNOW).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));
        });
        SikkuiSlab = BLOCKS.register("plaster_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.SNOW).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).dynamicShape());
        });
        SikkuiStairs = BLOCKS.register("plaster_stairs", () -> {
            return new StairsBlock(((Block)Sikkui.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.STONE, MaterialColor.SNOW).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));
        });
        WattleAndDaub = BLOCKS.register("wattle_and_daub", () -> {
            return new Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.DIRT).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 2.0F));
        });
        WattleAndDaubSlab = BLOCKS.register("wattle_and_daub_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.DIRT).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 2.0F).dynamicShape());
        });
        WattleAndDaubStairs = BLOCKS.register("wattle_and_daub_stairs", () -> {
            return new StairsBlock(((Block)WattleAndDaubSlab.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.GRASS, MaterialColor.DIRT).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 2.0F));
        });
        SmoothOakPlanks = BLOCKS.register("smooth_oak_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothOakSlab = BLOCKS.register("smooth_oak_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothOakStairs = BLOCKS.register("smooth_oak_stairs", () -> {
            return new StairsBlock(((Block)SmoothOakPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothSprucePlanks = BLOCKS.register("smooth_spruce_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.PODZOL).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothSpruceSlab = BLOCKS.register("smooth_spruce_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.PODZOL).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothSpruceStairs = BLOCKS.register("smooth_spruce_stairs", () -> {
            return new StairsBlock(((Block)SmoothSprucePlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.PODZOL).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothBirchPlanks = BLOCKS.register("smooth_birch_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothBirchSlab = BLOCKS.register("smooth_birch_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothBirchStairs = BLOCKS.register("smooth_birch_stairs", () -> {
            return new StairsBlock(((Block)SmoothBirchPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothJunglePlanks = BLOCKS.register("smooth_jungle_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.DIRT).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothJungleSlab = BLOCKS.register("smooth_jungle_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.DIRT).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothJungleStairs = BLOCKS.register("smooth_jungle_stairs", () -> {
            return new StairsBlock(((Block)SmoothJunglePlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.DIRT).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothAcaciaPlanks = BLOCKS.register("smooth_acacia_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothAcaciaSlab = BLOCKS.register("smooth_acacia_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothAcaciaStairs = BLOCKS.register("smooth_acacia_stairs", () -> {
            return new StairsBlock(((Block)SmoothAcaciaPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothDarkOakPlanks = BLOCKS.register("smooth_dark_oak_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothDarkOakSlab = BLOCKS.register("smooth_dark_oak_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothDarkOakStairs = BLOCKS.register("smooth_dark_oak_stairs", () -> {
            return new StairsBlock(((Block)SmoothDarkOakPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        Namako = BLOCKS.register("namako", () -> {
            return new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));
        });
        GreenTatami = BLOCKS.register("green_tatami", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.GRASS).harvestLevel(0).strength(0.2F, 10.0F));
        });
        BrownTatami = BLOCKS.register("brown_tatami", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.GRASS).harvestLevel(0).strength(0.2F, 10.0F));
        });
        JapaneseTimberBamboo = BLOCKS.register("japanese_timber_bamboo", () -> {
            return new JapaneseTimberBambooBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.BAMBOO).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion().randomTicks());
        });
        BambooWall = BLOCKS.register("bamboo_wall", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        GoldfishBowl = BLOCKS.register("goldfish_bowl", () -> {
            return new Block(AbstractBlock.Properties.of(Material.GLASS, MaterialColor.WATER).sound(SoundType.GLASS).harvestLevel(0).strength(0.2F, 10.0F).noOcclusion());
        });
        Andon = BLOCKS.register("andon", () -> {
            return new AndonBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestLevel(0).strength(0.3F, 3.0F).noOcclusion().lightLevel((p_235470_0_) -> {
                return 15;
            }));
        });
        AriakeAndon = BLOCKS.register("ariake_andon", () -> {
            return new AriakeAndonBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestLevel(0).strength(0.3F, 3.0F).noOcclusion().lightLevel((p_235470_0_) -> {
                return 13;
            }));
        });
        IbushiKawaraBlock = BLOCKS.register("ibushi_kawara_block", () -> {
            return new HorizonalRotateBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).strength(1.0F, 10.0F).requiresCorrectToolForDrops());
        });
        IbushiKawaraSlab = BLOCKS.register("ibushi_kawara_slab", () -> {
            return new HorizonalRotateSlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).dynamicShape());
        });
        IbushiKawaraStairs = BLOCKS.register("ibushi_kawara_stairs", () -> {
            return new StairsBlock(((Block)IbushiKawaraBlock.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));
        });
        CopperKawaraBlock = BLOCKS.register("copper_kawara_block", () -> {
            return new HorizonalRotateBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.DIRT).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).strength(1.0F, 10.0F).requiresCorrectToolForDrops());
        });
        CopperKawaraSlab = BLOCKS.register("copper_kawara_slab", () -> {
            return new HorizonalRotateSlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.DIRT).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).dynamicShape());
        });
        CopperKawaraStairs = BLOCKS.register("copper_kawara_stairs", () -> {
            return new StairsBlock(((Block)CopperKawaraBlock.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.STONE, MaterialColor.DIRT).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));
        });
        CupricOxideKawaraBlock = BLOCKS.register("cupric_oxide_kawara_block", () -> {
            return new HorizonalRotateBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.EMERALD).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).strength(1.0F, 10.0F).requiresCorrectToolForDrops());
        });
        CupricOxideKawaraSlab = BLOCKS.register("cupric_oxide_kawara_slab", () -> {
            return new HorizonalRotateSlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.EMERALD).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).dynamicShape());
        });
        CupricOxideKawaraStairs = BLOCKS.register("cupric_oxide_kawara_stairs", () -> {
            return new StairsBlock(((Block)CupricOxideKawaraBlock.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.STONE, MaterialColor.EMERALD).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));
        });
        IronGiboshi = BLOCKS.register("iron_giboshi", () -> {
            return new GiboshiBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(0).requiresCorrectToolForDrops().strength(0.5F, 30.0F).noOcclusion());
        });
        GoldenGiboshi = BLOCKS.register("gold_giboshi", () -> {
            return new GiboshiBlock(AbstractBlock.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL).harvestLevel(0).requiresCorrectToolForDrops().strength(0.5F, 30.0F).noOcclusion());
        });
        JapaneseApricotSapling = BLOCKS.register("japanese_apricot_sapling", () -> {
            return new SaplingBlock(new JapaneseApricotTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks());
        });
        JapaneseApricotLeaves = BLOCKS.register("japanese_apricot_leaves", () -> {
            return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().randomTicks());
        });
        JapaneseApricotGlowingSapling = BLOCKS.register("glowing_japanese_apricot_sapling", () -> {
            return new GlowingSaplingBlock(new GlowingJapaneseApricotTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks().lightLevel((p_235470_0_) -> {
                return 15;
            }));
        });
        JapaneseApricotGlowingLeaves = BLOCKS.register("glowing_japanese_apricot_leaves", () -> {
            return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().randomTicks().lightLevel((p_235470_0_) -> {
                return 15;
            }));
        });

        JapaneseApricotStrippedLog = BLOCKS.register("stripped_japanese_apricot_log", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        JapaneseApricotLog = BLOCKS.register("japanese_apricot_log", () -> {
            return new StrippableLogBlock(JapaneseApricotStrippedLog.get(),0,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        JapaneseApricotStrippedWood = BLOCKS.register("stripped_japanese_apricot_wood", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        JapaneseApricotWood = BLOCKS.register("japanese_apricot_wood", () -> {
            return new StrippableLogBlock(JapaneseApricotStrippedWood.get(),0,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        JapaneseApricotPlanks = BLOCKS.register("japanese_apricot_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        JapaneseApricotSlab = BLOCKS.register("japanese_apricot_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        JapaneseApricotStairs = BLOCKS.register("japanese_apricot_stairs", () -> {
            return new StairsBlock(((Block)JapaneseApricotPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        JapaneseApricotFence = BLOCKS.register("japanese_apricot_fence", () -> {
            return new FenceBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        JapaneseApricotFenceGate = BLOCKS.register("japanese_apricot_fence_gate", () -> {
            return new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        JapaneseApricotDoor = BLOCKS.register("japanese_apricot_door", () -> {
            return new DoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion());
        });
        JapaneseApricotTrapdoor = BLOCKS.register("japanese_apricot_trapdoor", () -> {
            return new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion().isValidSpawn(BlocksRegister::never));
        });
        JapaneseApricotPressurePlate = BLOCKS.register("japanese_apricot_pressure_plate", () -> {
            return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        JapaneseApricotButton = BLOCKS.register("japanese_apricot_button", () -> {
            return new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        SmoothJapaneseApricotPlanks = BLOCKS.register("smooth_japanese_apricot_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothJapaneseApricotSlab = BLOCKS.register("smooth_japanese_apricot_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothJapaneseApricotStairs = BLOCKS.register("smooth_japanese_apricot_stairs", () -> {
            return new StairsBlock(((Block)SmoothJapaneseApricotPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SakuraSapling = BLOCKS.register("sakura_sapling", () -> {
            return new SaplingBlock(new SakuraTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks());
        });
        SakuraBigSapling = BLOCKS.register("big_sakura_sapling", () -> {
            return new SaplingBlock(new BigSakuraTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks());
        });
        SakuraLeaves = BLOCKS.register("sakura_leaves", () -> {
            return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().randomTicks());
        });
        SakuraGlowingSapling = BLOCKS.register("glowing_sakura_sapling", () -> {
            return new GlowingSaplingBlock(new GlowingSakuraTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks().lightLevel((p_235470_0_) -> {
                return 15;
            }));
        });
        SakuraGlowingBigSapling = BLOCKS.register("glowing_big_sakura_sapling", () -> {
            return new GlowingSaplingBlock(new GlowingBigSakuraTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks().lightLevel((p_235470_0_) -> {
                return 15;
            }));
        });
        SakuraGlowingLeaves = BLOCKS.register("glowing_sakura_leaves", () -> {
            return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().randomTicks().lightLevel((p_235470_0_) -> {
                return 15;
            }));
        });

        SakuraStrippedLog = BLOCKS.register("stripped_sakura_log", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        SakuraLog = BLOCKS.register("sakura_log", () -> {
            return new StrippableLogBlock(SakuraStrippedLog.get(),1,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        SakuraStrippedWood = BLOCKS.register("stripped_sakura_wood", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        SakuraWood = BLOCKS.register("sakura_wood", () -> {
            return new StrippableLogBlock(SakuraStrippedWood.get(),1,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        SakuraPlanks = BLOCKS.register("sakura_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        SakuraSlab = BLOCKS.register("sakura_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SakuraStairs = BLOCKS.register("sakura_stairs", () -> {
            return new StairsBlock(((Block)SakuraPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SakuraFence = BLOCKS.register("sakura_fence", () -> {
            return new FenceBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        SakuraFenceGate = BLOCKS.register("sakura_fence_gate", () -> {
            return new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        SakuraDoor = BLOCKS.register("sakura_door", () -> {
            return new DoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion());
        });
        SakuraTrapdoor = BLOCKS.register("sakura_trapdoor", () -> {
            return new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion().isValidSpawn(BlocksRegister::never));
        });
        SakuraPressurePlate = BLOCKS.register("sakura_pressure_plate", () -> {
            return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        SakuraButton = BLOCKS.register("sakura_button", () -> {
            return new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        SmoothSakuraPlanks = BLOCKS.register("smooth_sakura_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothSakuraSlab = BLOCKS.register("smooth_sakura_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothSakuraStairs = BLOCKS.register("smooth_sakura_stairs", () -> {
            return new StairsBlock(((Block)SmoothSakuraPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        CypressSapling = BLOCKS.register("cypress_sapling", () -> {
            return new SaplingBlock(new CypressTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks());
        });
        CypressLeaves = BLOCKS.register("cypress_leaves", () -> {
            return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().randomTicks());
        });
        CypressStrippedLog = BLOCKS.register("stripped_cypress_log", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        CypressLog = BLOCKS.register("cypress_log", () -> {
            return new StrippableLogBlock(CypressStrippedLog.get(),2,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        CypressStrippedWood = BLOCKS.register("stripped_cypress_wood", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        CypressWood = BLOCKS.register("cypress_wood", () -> {
            return new StrippableLogBlock(CypressStrippedWood.get(),2,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        CypressPlanks = BLOCKS.register("cypress_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        CypressSlab = BLOCKS.register("cypress_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        CypressStairs = BLOCKS.register("cypress_stairs", () -> {
            return new StairsBlock(((Block)CypressPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        CypressFence = BLOCKS.register("cypress_fence", () -> {
            return new FenceBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        CypressFenceGate = BLOCKS.register("cypress_fence_gate", () -> {
            return new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        CypressDoor = BLOCKS.register("cypress_door", () -> {
            return new DoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion());
        });
        CypressTrapdoor = BLOCKS.register("cypress_trapdoor", () -> {
            return new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion().isValidSpawn(BlocksRegister::never));
        });
        CypressPressurePlate = BLOCKS.register("cypress_pressure_plate", () -> {
            return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        CypressButton = BLOCKS.register("cypress_button", () -> {
            return new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        SmoothCypressPlanks = BLOCKS.register("smooth_cypress_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothCypressSlab = BLOCKS.register("smooth_cypress_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothCypressStairs = BLOCKS.register("smooth_cypress_stairs", () -> {
            return new StairsBlock(((Block)SmoothCypressPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        LacquerSapling = BLOCKS.register("lacquer_sapling", () -> {
            return new SaplingBlock(new LacquerTree(),AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).sound(SoundType.GRASS).noCollission().instabreak().randomTicks());
        });
        LacquerLeaves = BLOCKS.register("lacquer_leaves", () -> {
            return new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion().randomTicks());
        });
        LacquerLog = BLOCKS.register("lacquer_log", () -> {
            return new LacquerLogBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        ChiseledLacquerLog = BLOCKS.register("chiseled_lacquer_log", () -> {
            return new ChiseledLacquerLogBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).randomTicks());
        });
        WoodenCabinetry = BLOCKS.register("wooden_cabinetry", () -> {
            return new WoodenCabinetryBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).noOcclusion());
        });
        WoodenCabinetrySlab = BLOCKS.register("wooden_cabinetry_slab", () -> {
            return new WoodenCabinetrySlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).noOcclusion().dynamicShape());
        });
        RawUrushiLayer = BLOCKS.register("raw_urushi_layer", () -> {
            return new RawUrushiLayerBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.WOOD).sound(SoundType.SLIME_BLOCK).harvestLevel(0).strength(0.1F, 1.0F).noOcclusion().noCollission());
        });



      /*  RedUrushiStrippedLog = BLOCKS.register("stripped_red_urushi_log", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        RedUrushiStrippedWood = BLOCKS.register("stripped_red_urushi_wood", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });*/
        RedUrushiPlanks = BLOCKS.register("red_urushi_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        RedUrushiSlab = BLOCKS.register("red_urushi_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        RedUrushiStairs = BLOCKS.register("red_urushi_stairs", () -> {
            return new StairsBlock(((Block)RedUrushiPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        RedUrushiFence = BLOCKS.register("red_urushi_fence", () -> {
            return new FenceBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        RedUrushiFenceGate = BLOCKS.register("red_urushi_fence_gate", () -> {
            return new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        RedUrushiDoor = BLOCKS.register("red_urushi_door", () -> {
            return new DoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion());
        });
        RedUrushiTrapdoor = BLOCKS.register("red_urushi_trapdoor", () -> {
            return new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion().isValidSpawn(BlocksRegister::never));
        });
        RedUrushiPressurePlate = BLOCKS.register("red_urushi_pressure_plate", () -> {
            return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        RedUrushiButton = BLOCKS.register("red_urushi_button", () -> {
            return new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        SmoothRedUrushiPlanks = BLOCKS.register("smooth_red_urushi_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothRedUrushiSlab = BLOCKS.register("smooth_red_urushi_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothRedUrushiStairs = BLOCKS.register("smooth_red_urushi_stairs", () -> {
            return new StairsBlock(((Block)SmoothRedUrushiPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        /*BlackUrushiStrippedLog = BLOCKS.register("stripped_black_urushi_log", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });
        BlackUrushiStrippedWood = BLOCKS.register("stripped_black_urushi_wood", () -> {
            return new RotatedPillarBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F));
        });*/
        BlackUrushiPlanks = BLOCKS.register("black_urushi_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        BlackUrushiSlab = BLOCKS.register("black_urushi_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        BlackUrushiStairs = BLOCKS.register("black_urushi_stairs", () -> {
            return new StairsBlock(((Block)BlackUrushiPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        BlackUrushiFence = BLOCKS.register("black_urushi_fence", () -> {
            return new FenceBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        BlackUrushiFenceGate = BLOCKS.register("black_urushi_fence_gate", () -> {
            return new FenceGateBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F));
        });
        BlackUrushiDoor = BLOCKS.register("black_urushi_door", () -> {
            return new DoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion());
        });
        BlackUrushiTrapdoor = BLOCKS.register("black_urushi_trapdoor", () -> {
            return new TrapDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(2.0F, 3.0F).noOcclusion().isValidSpawn(BlocksRegister::never));
        });
        BlackUrushiPressurePlate = BLOCKS.register("black_urushi_pressure_plate", () -> {
            return new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        BlackUrushiButton = BLOCKS.register("black_urushi_button", () -> {
            return new WoodButtonBlock(AbstractBlock.Properties.of(Material.DECORATION, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.5F, 3.0F).noCollission());
        });
        SmoothBlackUrushiPlanks = BLOCKS.register("smooth_black_urushi_planks", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        SmoothBlackUrushiSlab = BLOCKS.register("smooth_black_urushi_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).dynamicShape());
        });
        SmoothBlackUrushiStairs = BLOCKS.register("smooth_black_urushi_stairs", () -> {
            return new StairsBlock(((Block)SmoothBlackUrushiPlanks.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F));
        });
        RiceCrop = BLOCKS.register("rice_crop", () -> {
            return new RiceCropBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).noCollission().randomTicks().instabreak().sound(SoundType.CROP));
        });
        PaddyField = BLOCKS.register("paddy_field", () -> {
            return new FarmlandBlock(AbstractBlock.Properties.of(Material.DIRT, MaterialColor.DIRT).randomTicks().strength(0.6F).sound(SoundType.GRAVEL).isViewBlocking(BlocksRegister::always).isSuffocating(BlocksRegister::always));
        });
        AzukiCrop = BLOCKS.register("azuki_crop", () -> {
            return new AzukiCropBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).noCollission().randomTicks().instabreak().sound(SoundType.CROP));
        });
        Tawara = BLOCKS.register("tawara", () -> {
            return new HorizonalRotateBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.DIRT).sound(SoundType.GRASS).strength(0.3F, 1.0F));
        });
        OakParapet = BLOCKS.register("oak_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        SpruceParapet = BLOCKS.register("spruce_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.PODZOL).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        BirchParapet = BLOCKS.register("birch_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        JungleParapet = BLOCKS.register("jungle_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.DIRT).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        AcaciaParapet = BLOCKS.register("acacia_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        DarkOakParapet = BLOCKS.register("dark_oak_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        JapaneseApricotParapet = BLOCKS.register("japanese_apricot_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        SakuraParapet = BLOCKS.register("sakura_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        CypressParapet = BLOCKS.register("cypress_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        RedUrushiParapet = BLOCKS.register("red_urushi_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        BlackUrushiParapet = BLOCKS.register("black_urushi_parapet", () -> {
            return new ParapetBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(2.0F, 3.0F));
        });
        BambooBlock = BLOCKS.register("bamboo_block", () -> {
            return new Block(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.BAMBOO).harvestLevel(0).strength(0.5F, 10.0F));
        });
        BambooSlab = BLOCKS.register("bamboo_slab", () -> {
            return new SlabBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.BAMBOO).harvestLevel(0).strength(0.5F, 10.0F).dynamicShape());
        });
        BambooStairs = BLOCKS.register("bamboo_stairs", () -> {
            return new StairsBlock(((Block)BambooBlock.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.BAMBOO).harvestLevel(0).strength(0.5F, 10.0F));
        });
        BlankFusuma = BLOCKS.register("blank_fusuma", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SNOW).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        BlueSeigaihaFusuma = BLOCKS.register("blue_seigaiha_fusuma", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SNOW).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        BlueSayagataFusuma = BLOCKS.register("blue_sayagata_fusuma", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SNOW).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        BlankAntiqueFusuma = BLOCKS.register("blank_antique_fusuma", () -> {return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SNOW).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());});
        SlidingGlassDoor = BLOCKS.register("sliding_glass_door", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.2F, 3.0F).noOcclusion());
        });
        OakShojiPane = BLOCKS.register("oak_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        SpruceShojiPane = BLOCKS.register("spruce_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.PODZOL).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        BirchShojiPane = BLOCKS.register("birch_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        JungleShojiPane = BLOCKS.register("jungle_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.DIRT).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        AcaciaShojiPane = BLOCKS.register("acacia_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        DarkOakShojiPane = BLOCKS.register("dark_oak_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        JapaneseApricotShojiPane = BLOCKS.register("japanese_apricot_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        SakuraShojiPane = BLOCKS.register("sakura_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        CypressShojiPane = BLOCKS.register("cypress_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        RedUrushiShojiPane = BLOCKS.register("red_urushi_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        BlackUrushiShojiPane = BLOCKS.register("black_urushi_shoji_pane", () -> {
            return new PaneBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).sound(SoundType.WOOD).harvestTool(ToolType.AXE).harvestLevel(0).strength(0.5F, 10.0F).noOcclusion());
        });
        OakShoji = BLOCKS.register("oak_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        SpruceShoji = BLOCKS.register("spruce_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.PODZOL).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        BirchShoji = BLOCKS.register("birch_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        JungleShoji = BLOCKS.register("jungle_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.DIRT).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        AcaciaShoji = BLOCKS.register("acacia_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        DarkOakShoji = BLOCKS.register("dark_oak_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        JapaneseApricotShoji = BLOCKS.register("japanese_apricot_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        SakuraShoji = BLOCKS.register("sakura_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_ORANGE).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        CypressShoji = BLOCKS.register("cypress_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.SAND).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        RedUrushiShoji = BLOCKS.register("red_urushi_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_RED).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        BlackUrushiShoji = BLOCKS.register("black_urushi_shoji", () -> {
            return new SlideDoorBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.COLOR_BLACK).harvestTool(ToolType.AXE).sound(SoundType.WOOD).strength(0.2F, 3.0F).noOcclusion());
        });
        SoyCrop = BLOCKS.register("soy_crop", () -> {return new SoyCropBlock(AbstractBlock.Properties.of(Material.PLANT, MaterialColor.GRASS).noCollission().randomTicks().instabreak().sound(SoundType.CROP));});
        Kitsunebi = BLOCKS.register("kitsunebi", () -> {return new KitsunebiBlock(AbstractBlock.Properties.of(Material.STONE).sound(SoundType.BAMBOO).instabreak().noCollission().noOcclusion().lightLevel((p_235470_0_) -> {return 15;}));});
        FoxHopper = BLOCKS.register("fox_hopper", () -> {return new FoxHopperBlock(AbstractBlock.Properties.of(Material.WOOD, MaterialColor.WOOD).harvestTool(ToolType.AXE).sound(SoundType.WOOD).harvestLevel(0).strength(1.0F, 10.0F).noOcclusion());});
        GreenTatamiCarpet = BLOCKS.register("green_tatami_carpet", () -> {return new TatamiCarpetBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.GRASS).harvestLevel(0).strength(0.2F, 10.0F).noOcclusion());});
        BrownTatamiCarpet = BLOCKS.register("brown_tatami_carpet", () -> {return new TatamiCarpetBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.GRASS).sound(SoundType.GRASS).harvestLevel(0).strength(0.2F, 10.0F).noOcclusion());});
        SandCoast = BLOCKS.register("sand_coast", () -> {return new Block(AbstractBlock.Properties.of(Material.SAND, MaterialColor.SAND).harvestTool(ToolType.SHOVEL).sound(SoundType.SAND).harvestLevel(0).strength(0.5F, 3.0F));});
        ThatchedBlock = BLOCKS.register("thatched_block", () -> {return new Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_GRAY).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 3.0F));});
        ThatchedSlab = BLOCKS.register("thatched_slab", () -> {return new SlabBlock(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_GRAY).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 3.0F).dynamicShape());});
        ThatchedStairs = BLOCKS.register("thatched_stairs", () -> {return new StairsBlock(((Block)ThatchedBlock.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_GRAY).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 3.0F));});
        Concrete = BLOCKS.register("concrete", () -> {return new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));});
        ConcreteSlab = BLOCKS.register("concrete_slab", () -> {return new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1F, 10.0F).dynamicShape());});
        ConcreteStairs = BLOCKS.register("concrete_stairs", () -> {return new StairsBlock(((Block)Concrete.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).requiresCorrectToolForDrops().harvestLevel(0).strength(1F, 10.0F));});
        DirtyConcrete = BLOCKS.register("dirty_concrete", () -> {return new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));});
        DirtyConcreteSlab = BLOCKS.register("dirty_concrete_slab", () -> {return new SlabBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1F, 10.0F).dynamicShape());});
        DirtyConcreteStairs = BLOCKS.register("dirty_concrete_stairs", () -> {return new StairsBlock(((Block)DirtyConcrete.get()).defaultBlockState(), AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).requiresCorrectToolForDrops().harvestLevel(0).strength(1F, 10.0F));});
        LidlessGroove = BLOCKS.register("lidless_groove", () -> {return new GrooveBlock(false,AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));});
        Groove = BLOCKS.register("groove", () -> {return new GrooveBlock(true,AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));});
        MeshGroove = BLOCKS.register("mesh_groove", () -> {return new GrooveBlock(true,AbstractBlock.Properties.of(Material.STONE, MaterialColor.STONE).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F));});
        ThatchedRoof45 = BLOCKS.register("thatched_roof_45", () -> {return new Roof45Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_GRAY).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 3.0F).noOcclusion().dynamicShape());});
        ThatchedRoof225 = BLOCKS.register("thatched_roof_225", () -> {return new Roof225Block(AbstractBlock.Properties.of(Material.GRASS, MaterialColor.COLOR_GRAY).harvestTool(ToolType.SHOVEL).sound(SoundType.GRASS).harvestLevel(0).strength(0.5F, 3.0F).noOcclusion().dynamicShape());});
        IbushiKawaraRoof45 = BLOCKS.register("ibushi_kawara_roof_45", () -> {return new Roof45Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).noOcclusion().dynamicShape());});
        IbushiKawaraRoof225 = BLOCKS.register("ibushi_kawara_roof_225", () -> {return new Roof225Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).noOcclusion().dynamicShape());});
        CopperKawaraRoof45 = BLOCKS.register("copper_kawara_roof_45", () -> {return new Roof45Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.DIRT).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).noOcclusion().dynamicShape());});
        CopperKawaraRoof225 = BLOCKS.register("copper_kawara_roof_225", () -> {return new Roof225Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.DIRT).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).noOcclusion().dynamicShape());});
        CupricOxideKawaraRoof45 = BLOCKS.register("cupric_oxide_kawara_roof_45", () -> {return new Roof45Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.EMERALD).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).noOcclusion().dynamicShape());});
        CupricOxideKawaraRoof225 = BLOCKS.register("cupric_oxide_kawara_roof_225", () -> {return new Roof225Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.EMERALD).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE).harvestLevel(0).requiresCorrectToolForDrops().strength(1.0F, 10.0F).noOcclusion().dynamicShape());});



    }
    private static Boolean never(BlockState p_235427_0_, IBlockReader p_235427_1_, BlockPos p_235427_2_, EntityType<?> p_235427_3_) {
        return (boolean)false;
    }
    private static boolean always(BlockState p_235426_0_, IBlockReader p_235426_1_, BlockPos p_235426_2_) {
        return true;
    }
    private static boolean never(BlockState p_235436_0_, IBlockReader p_235436_1_, BlockPos p_235436_2_) {
        return false;
    }
}
