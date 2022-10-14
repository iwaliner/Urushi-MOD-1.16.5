package com.iwaliner.urushi;
import com.iwaliner.urushi.Block.CutoutLeavesBlock;
import com.iwaliner.urushi.Block.IronIngotBlock;
import com.iwaliner.urushi.Proxy.ClientProxy;
import com.iwaliner.urushi.Proxy.CommonProxy;
import com.iwaliner.urushi.RecipeType.RecipeTypeRegister;
import com.iwaliner.urushi.World.OreGen;
import com.iwaliner.urushi.World.TreeGenerator;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
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
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;


@Mod("urushi")
public class ModCore_Urushi {
    public static final String MOD_ID = "urushi";
    public static final ResourceLocation INTERACT_WITH_FRYER = makeCustomStat("interact_with_fryer", IStatFormatter.DEFAULT);
    public static final ResourceLocation INTERACT_WITH_DOUBLED_WOODEN_CABINETRY = makeCustomStat("interact_with_doubled_wooden_cabinetry", IStatFormatter.DEFAULT);
    private static ResourceLocation makeCustomStat(String p_199084_0_, IStatFormatter p_199084_1_) {
        ResourceLocation resourcelocation = new ResourceLocation(p_199084_0_);
        Registry.register(Registry.CUSTOM_STAT, p_199084_0_, resourcelocation);
        Stats.CUSTOM.get(resourcelocation, p_199084_1_);
        return resourcelocation;
    }

    /**クリエイティブタブを登録*/
    public static final ItemGroup TabUrushi=new TabUrushi("urushi");
    public static File assetsDirectory;
    public static File assetsInBuildDirectory;
    public static File dataDirectory;
    public static File dataInBuildDirectory;
    public static Logger logger = LogManager.getLogger("urushi");

    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> com.iwaliner.urushi.Proxy.CommonProxy::new);

    public ModCore_Urushi() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        /**エンティティを登録*/
        EntityRegister.register(modEventBus);

        /**ブロックとアイテムを登録*/
        ItemAndBlockRegister.register(modEventBus);


        /**タイルエンティティを登録*/
        TileEntitiesRegister.register(modEventBus);


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
            base.add(()-> TreeGenerator.JapaneseCedar.squared().decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.15F, 1))));

        }
        if(key==Biomes.WOODED_HILLS){

            List<Supplier<ConfiguredFeature<?,?>>> base=event.getGeneration().getFeatures(GenerationStage.Decoration.VEGETAL_DECORATION);
            base.add(()-> TreeGenerator.Bamboo.squared().decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.08F, 6))));

        }

    }

    /**燃料を登録*/
    @SubscribeEvent
    public void FuelEvent(FurnaceFuelBurnTimeEvent event) {
        if (event.getItemStack().getItem()==ItemAndBlockRegister.BambooCharcoal.get()) {
            event.setBurnTime(1600);
        }else if(event.getItemStack().getItem()==ItemAndBlockRegister.JapaneseApricotBark.get()) {
            event.setBurnTime(200);
        }else if(event.getItemStack().getItem()==ItemAndBlockRegister.SakuraBark.get()) {
            event.setBurnTime(200);
        }else if(event.getItemStack().getItem()==ItemAndBlockRegister.CypressBark.get()) {
            event.setBurnTime(200);
        }else if(event.getItemStack().getItem()==ItemAndBlockRegister.japanese_cedar_bark.get()) {
            event.setBurnTime(200);
        }else if(event.getItemStack().getItem()== Item.byBlock(ItemAndBlockRegister.BambooCharcoalBlock.get())) {
            event.setBurnTime(16000);
        }
        /*else if(event.getItemStack().getItem()==ItemAndBlockRegister.VegetableOil.get()) {
            event.setBurnTime(800);
        }*/
    }

    /**油揚げを狐が食べると狐火に*/
    @SubscribeEvent
    public void FoxEvent(LivingEquipmentChangeEvent event) {
        if (event.getEntityLiving() instanceof FoxEntity&&event.getFrom().getItem().is(TagUrushi.KITSUNEBI_INGREDIENT)) {
            event.getEntityLiving().setItemSlot(EquipmentSlotType.MAINHAND,new ItemStack(ItemAndBlockRegister.KitsunebiItem.get()));
        }
    }

    /**玉鋼作るときに右クリックおしっぱだとブロックがドロップして壊れる*/
    @SubscribeEvent
    public void HammerCancelEvent(PlayerInteractEvent.RightClickBlock event) {
        if (event.getWorld().getBlockState(event.getPos()).getBlock() instanceof IronIngotBlock){
            {
                if(event.getEntity() instanceof PlayerEntity) {
                   if( event.getPlayer().getCooldowns().isOnCooldown(ItemAndBlockRegister.Hammer.get())) {
                      event.getWorld().destroyBlock(event.getPos(),true);
                            event.setCanceled(true);
                    }
                }
            }
        }
    }
    /**プレイヤーの移動速度を上昇*/
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
    /**草を壊して種が出るように*/
    @SubscribeEvent
    public void GrassDropEvent(BlockEvent.BreakEvent event) {
        if (!event.getPlayer().isCreative() && (event.getWorld().getBlockState(event.getPos()).getBlock()==Blocks.FERN || event.getWorld().getBlockState(event.getPos()).getBlock()==Blocks.TALL_GRASS || event.getWorld().getBlockState(event.getPos()).getBlock()==Blocks.GRASS) ) {
            if (((World) event.getWorld()).random.nextFloat() < 0.075F) {
                ItemEntity entity = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ItemAndBlockRegister.RiceCrop.get()));
                event.getWorld().addFreshEntity(entity);
            } else if (((World) event.getWorld()).random.nextFloat() < 0.075F) {
                ItemEntity entity = new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ItemAndBlockRegister.SoyCrop.get()));
                event.getWorld().addFreshEntity(entity);
            } else if (((World) event.getWorld()).random.nextFloat() < 0.075F) {
                ItemEntity entity = new ItemEntity((World) event.getWorld(), (double) event.getPos().getX(), (double) event.getPos().getY(), (double) event.getPos().getZ(), new ItemStack(ItemAndBlockRegister.AzukiCrop.get()));
                event.getWorld().addFreshEntity(entity);
            }
        }
    }

    /**草の道の作成を改善*/
    @SubscribeEvent
    public void GrassPathEvent(BlockEvent.BlockToolInteractEvent event) {
       if(event.getToolType()== ToolType.SHOVEL){
           if(event.getState().getBlock()==Blocks.GRASS_BLOCK||event.getState().getBlock()==Blocks.DIRT||event.getState().getBlock()==Blocks.PODZOL){
                   event.getWorld().destroyBlock(event.getPos().above(),true);
                   event.getWorld().setBlock(event.getPos(),Blocks.GRASS_PATH.defaultBlockState(),2);
                   event.getPlayer().swing(Hand.MAIN_HAND);
               event.getHeldItemStack().hurtAndBreak(1, event.getPlayer(), (p_220041_1_) -> {
                   p_220041_1_.broadcastBreakEvent(Hand.MAIN_HAND);
               });
                   event.getWorld().playSound(event.getPlayer(), event.getPos(), SoundEvents.SHOVEL_FLATTEN, SoundCategory.PLAYERS, 1.0F, 1F);
           }
       }
    }
    /**葉の上に落下したとき落下ダメージを受けないように*/
    @SubscribeEvent
    public void LeavesDamageEvent(LivingHurtEvent event) {
        if(event.getSource()==DamageSource.FALL){
            if(event.getEntityLiving().level.getBlockState(event.getEntityLiving().blockPosition().below()).getBlock() instanceof LeavesBlock||event.getEntityLiving().level.getBlockState(event.getEntityLiving().blockPosition().below()).getBlock() instanceof CutoutLeavesBlock){
                event.setCanceled(true);
            }else if(event.getEntityLiving().level.getBlockState(event.getEntityLiving().blockPosition().below()).getBlock().is(TagUrushi.NO_FALLING_DAMAGE)){
                event.setCanceled(true);
            }
        }
    }
    /**砂が海岸や海系のバイオーム内で水に接すると塩を含んだ砂になる*/
    @SubscribeEvent
    public void SaltEvent(BlockEvent.NeighborNotifyEvent event) {
        if (event.getWorld().getBiome(event.getPos()).getBiomeCategory() == Biome.Category.BEACH || event.getWorld().getBiome(event.getPos()).getBiomeCategory() == Biome.Category.OCEAN) {
            if (event.getState().getMaterial() == Material.WATER) {
                for (int i = 0; i < 6; i++) {
                    if (event.getWorld().getBlockState(event.getPos().relative(UrushiUtils.getDirectionFromInt(i))).getBlock() == Blocks.SAND) {
                        event.getWorld().setBlock(event.getPos().relative(UrushiUtils.getDirectionFromInt(i)), ItemAndBlockRegister.salt_and_sand.get().defaultBlockState(), 2);
                        event.getWorld().playSound((PlayerEntity) null, event.getPos().relative(UrushiUtils.getDirectionFromInt(i)), SoundEvents.SAND_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                    }
                }

            } else if (event.getState().getBlock() == Blocks.SAND) {
                boolean flag = false;
                for (int i = 0; i < 6; i++) {
                    if (event.getWorld().getBlockState(event.getPos().relative(UrushiUtils.getDirectionFromInt(i))).getMaterial() == Material.WATER) {
                        flag = true;
                    }
                }
                if (flag) {
                    event.getWorld().setBlock(event.getPos(), ItemAndBlockRegister.salt_and_sand.get().defaultBlockState(), 2);
                    event.getWorld().playSound((PlayerEntity) null, event.getPos(), SoundEvents.SAND_BREAK, SoundCategory.BLOCKS, 1.0F, 1F);
                }
            }
        }
    }
    @SubscribeEvent
    public void EndermanPlaceEvent(BlockEvent.EntityPlaceEvent event) {
        if(ConfigUrushi.StopEndermanPlace.get()) {
            if (event.getEntity() instanceof EndermanEntity) {
                event.getEntity().kill();
                event.setCanceled(true);
            }
        }
    }
    /*

    @SubscribeEvent
    public void IceWaterEvent(BlockEvent.BreakEvent event) {
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, event.getPlayer().getMainHandItem()) == 0 && event.getWorld().getBlockState(event.getPos()).getBlock() == net.minecraft.block.ItemAndBlockRegister.ICE) {
            event.getWorld().setBlock(event.getPos(), net.minecraft.block.ItemAndBlockRegister.WATER.defaultBlockState(), 2);
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
                event.getWorld().setBlock(event.getPos().offset(0, -1, 0), net.minecraft.block.ItemAndBlockRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(1, 0, 0)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(1, 0, 0), net.minecraft.block.ItemAndBlockRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(-1, 0, 0)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(-1, 0, 0), net.minecraft.block.ItemAndBlockRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(0, 0, 1)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(0, 0, 1), net.minecraft.block.ItemAndBlockRegister.DIRT.defaultBlockState(), 512);
            }

            if (event.getWorld().getBlockState(event.getPos().offset(0, 0, -1)).getBlock() instanceof GrassBlock) {
                event.getWorld().setBlock(event.getPos().offset(0, 0, -1), net.minecraft.block.ItemAndBlockRegister.DIRT.defaultBlockState(), 512);
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

