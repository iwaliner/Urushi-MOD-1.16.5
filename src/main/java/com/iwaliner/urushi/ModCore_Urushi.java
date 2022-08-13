package com.iwaliner.urushi;
import com.iwaliner.urushi.Block.IronIngotBlock;
import com.iwaliner.urushi.RecipeType.RecipeTypeRegister;
import com.iwaliner.urushi.World.OreGen;
import com.iwaliner.urushi.World.TreeGenerator;
import jeresources.proxy.CommonProxy;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.Stats;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;


@Mod("urushi")
public class ModCore_Urushi {
    public static final String MOD_ID = "urushi";
    public static final ResourceLocation INTERACT_WITH_FRYER = makeCustomStat("interact_with_fryer", IStatFormatter.DEFAULT);
    private static ResourceLocation makeCustomStat(String p_199084_0_, IStatFormatter p_199084_1_) {
        ResourceLocation resourcelocation = new ResourceLocation(p_199084_0_);
        Registry.register(Registry.CUSTOM_STAT, p_199084_0_, resourcelocation);
        Stats.CUSTOM.get(resourcelocation, p_199084_1_);
        return resourcelocation;
    }

    /**クリエイティブタブを登録*/
    public static final ItemGroup TabUrushi=new TabUrushi("urushi");

    private static ResourceLocation GrassDrops = new ResourceLocation("minecraft", "blocks/grass");

    public ModCore_Urushi() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        /**エンティティを登録*/
        EntityRegister.register(modEventBus);

        /**ブロックを登録*/
        BlocksRegister.register(modEventBus);

        /**タイルエンティティを登録*/
        TileEntitiesRegister.register(modEventBus);

        /**アイテムを登録*/
        ItemsRegister.register(modEventBus);

        /**レシピタイプを登録*/
        RecipeTypeRegister.register(modEventBus);

        /**GUI付きブロック内のコンテナを登録*/
        ContainerRegister.register(modEventBus);

        /**必須*/
        MinecraftForge.EVENT_BUS.register(this);

        /**ワールド内にモブをスポーンさせる*/
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, MobSpawnInWorld::spawnMobsEvent);

        /**鉱石を生成*/
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::addOres);


        /**コンフィグを登録*/
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON,ConfigUrushi.spec,"urushi.toml");

    }


        /**構造物を自然生成*/
    @SubscribeEvent
    public void FeatureGenEvent(BiomeLoadingEvent event) {
        RegistryKey<Biome> key=RegistryKey.create(Registry.BIOME_REGISTRY,event.getName());
        Set<BiomeDictionary.Type> types=BiomeDictionary.getTypes(key);
        if(key== Biomes.FOREST){

            List<Supplier<ConfiguredFeature<?,?>>> base=event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(()-> TreeGenerator.Sakura.squared().decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.03F, 1))));

        }
        if(key==Biomes.FOREST){

            List<Supplier<ConfiguredFeature<?,?>>> base=event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(()-> TreeGenerator.JapaneseApricot.squared().decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.03F, 1))));

        }
        if(key==Biomes.FOREST){

            List<Supplier<ConfiguredFeature<?,?>>> base=event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(()-> TreeGenerator.Lacquer.squared().decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.03F, 1))));

        }
        if(key==Biomes.MOUNTAINS){

            List<Supplier<ConfiguredFeature<?,?>>> base=event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(()-> TreeGenerator.Cypress.squared().decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.15F, 1))));

        }
        if(key==Biomes.WOODED_HILLS){

            List<Supplier<ConfiguredFeature<?,?>>> base=event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(()-> TreeGenerator.Bamboo.squared().decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.08F, 6))));

        }

    }

    /**燃料を登録*/
    @SubscribeEvent
    public void FuelEvent(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem()==ItemsRegister.BambooCharcoal.get()) {
            event.setBurnTime(1600);
        }else if(event.getItemStack().getItem()==ItemsRegister.JapaneseApricotBark.get()) {
            event.setBurnTime(200);
        }else if(event.getItemStack().getItem()==ItemsRegister.SakuraBark.get()) {
            event.setBurnTime(200);
        }else if(event.getItemStack().getItem()==ItemsRegister.CypressBark.get()) {
            event.setBurnTime(200);
        }else if(event.getItemStack().getItem()==ItemsRegister.BambooCharcoalBlock.get()) {
            event.setBurnTime(16000);
        }
        /*else if(event.getItemStack().getItem()==ItemsRegister.VegetableOil.get()) {
            event.setBurnTime(800);
        }*/
    }

    /**油揚げを狐が食べると狐火に*/
    @SubscribeEvent
    public void FoxEvent(LivingEquipmentChangeEvent event) {
        if (event.getEntityLiving() instanceof FoxEntity&&event.getFrom().getItem()== ItemsRegister.AburaAge.get()) {
            event.getEntityLiving().setItemSlot(EquipmentSlotType.MAINHAND,new ItemStack(ItemsRegister.Kitsunebi.get()));
        }
    }

    /**玉鋼作るときに右クリックおしっぱだとブロックがドロップして壊れる*/
    @SubscribeEvent
    public void HammerCancelEvent(PlayerInteractEvent.RightClickBlock event) {
        if (event.getWorld().getBlockState(event.getPos()).getBlock() instanceof IronIngotBlock){
            {
                if(event.getEntity() instanceof PlayerEntity) {
                   if( event.getPlayer().getCooldowns().isOnCooldown(ItemsRegister.Hammer.get())) {
                      event.getWorld().destroyBlock(event.getPos(),true);
                            event.setCanceled(true);
                    }
                }
            }
        }
    }
    @SubscribeEvent
    public void PlayerSpeedEvent(EntityEvent.EnteringChunk event) {
        if(ConfigUrushi.TurnOnSpeedUp.get()) {
            if (event.getEntity() instanceof PlayerEntity) {
                PlayerEntity entityPlayer = (PlayerEntity) event.getEntity();
                entityPlayer.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.116D);
                entityPlayer.getAttributes().save();
            }
        }
    }
    @SubscribeEvent
    public void GrassDropEvent(BlockEvent.BreakEvent event) {
        if (!event.getPlayer().isCreative() && (event.getWorld().getBlockState(event.getPos()).getBlock()==Blocks.FERN || event.getWorld().getBlockState(event.getPos()).getBlock()==Blocks.TALL_GRASS || event.getWorld().getBlockState(event.getPos()).getBlock()==Blocks.GRASS) ) {
              if (((World) event.getWorld()).random.nextFloat() < 0.075F) {
                        ItemEntity entity = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(BlocksRegister.RiceCrop.get()));
                        event.getWorld().addFreshEntity(entity);
                    } else if (((World) event.getWorld()).random.nextFloat() < 0.075F) {
                        ItemEntity entity = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(BlocksRegister.SoyCrop.get()));
                        event.getWorld().addFreshEntity(entity);
                    } else if (((World) event.getWorld()).random.nextFloat() < 0.075F) {
                        ItemEntity entity = new ItemEntity((World) event.getWorld(),(double) event.getPos().getX(),(double)event.getPos().getY(), (double)event.getPos().getZ(), new ItemStack(BlocksRegister.AzukiCrop.get()));
                        event.getWorld().addFreshEntity(entity);
                    }
                }


    }
/*
    @SubscribeEvent
    public void LootTableEvent(LootTableLoadEvent event) {
        if (event.getName().equals(GrassDrops))
            event.getTable().addPool(LootPool.lootPool()
                    .add(TableLootEntry.lootTableReference(new ResourceLocation(MOD_ID, "blocks/grass_drops")))
                    .name("sf_grass_drops").build());
    }*/
    /*

    @SubscribeEvent
    public void IceWaterEvent(BlockEvent.BreakEvent event) {
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, event.getPlayer().getMainHandItem()) == 0 && event.getWorld().getBlockState(event.getPos()).getBlock() == net.minecraft.block.BlocksRegister.ICE) {
            event.getWorld().setBlock(event.getPos(), net.minecraft.block.BlocksRegister.WATER.defaultBlockState(), 2);
        }

    }

    @SubscribeEvent
    public void LeavesSpeedEvent(PlayerEvent.BreakSpeed event) {
        try {
            if ((event.getState().getBlock() instanceof LeavesBlock || event.getState().getBlock() instanceof VineBlock) && event.getPlayer().getItemBySlot(EquipmentSlotType.MAINHAND).getItem() instanceof AxeItem) {
                event.setNewSpeed(20.0F);
            }
        } catch (Throwable var3) {
        }

    }

    @SubscribeEvent
    public void FireAddEvent(BlockEvent.NeighborNotifyEvent event) {
        if (event.getState().getMaterial() == Material.FIRE) {
            Block block = event.getState().getBlock();
            if (event.getWorld().getBlockState(event.getPos().offset(0, -1, 0)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(0, -1, 0), net.minecraft.block.BlocksRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(1, 0, 0)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(1, 0, 0), net.minecraft.block.BlocksRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(-1, 0, 0)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(-1, 0, 0), net.minecraft.block.BlocksRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(0, 0, 1)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(0, 0, 1), net.minecraft.block.BlocksRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(0, 0, -1)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(0, 0, -1), net.minecraft.block.BlocksRegister.DIRT.defaultBlockState(), 512);
            }
        }

    }

    @SubscribeEvent
    public void EntitySpawnEvent(LivingSpawnEvent.CheckSpawn event) {
        if (event.getEntity() instanceof WanderingTraderEntity) {
            event.getEntity().remove();
        }

        if (event.getEntity() instanceof PhantomEntity) {
            event.getEntity().remove();
        }

        if (event.getEntity() instanceof EndermiteEntity) {
            event.getEntityLiving().remove();
        }

    }

    @SubscribeEvent
    public void EntityUpdateEvent(EntityEvent.EnteringChunk event) {
        if (event.getEntity() instanceof EndermanEntity && ((EndermanEntity)event.getEntity()).getCarriedBlock() != null) {
            ((EndermanEntity)event.getEntity()).setCarriedBlock((BlockState)null);
        }

    }*/


}

