package com.iwaliner.urushi;


import com.iwaliner.urushi.TileEntity.*;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod.EventBusSubscriber(modid = ModCore_Urushi.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class TileEntitiesRegister {
    public static final DeferredRegister<TileEntityType<?>> Tiles = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ModCore_Urushi.MOD_ID);
    public static final RegistryObject<TileEntityType<WoodenCabinetryTileEntity>>  WoodenCabinetryTile=Tiles.register("wooden_cabinetry", () -> TileEntityType.Builder.of(WoodenCabinetryTileEntity::new, BlocksRegister.WoodenCabinetry.get()).build(null));
    public static final RegistryObject<TileEntityType<WoodenCabinetrySlabTileEntity>>  WoodenCabinetrySlabTile=Tiles.register("wooden_cabinetry_slab", () -> TileEntityType.Builder.of(WoodenCabinetrySlabTileEntity::new, BlocksRegister.WoodenCabinetrySlab.get()).build(null));
    public static final RegistryObject<TileEntityType<FoxHopperTileEntity>>  FoxHopperTile=Tiles.register("fox_hopper", () -> TileEntityType.Builder.of(FoxHopperTileEntity::new, BlocksRegister.FoxHopper.get()).build(null));
    public static final RegistryObject<TileEntityType<FryerTileEntity>>  FryerTile=Tiles.register("fryer", () -> TileEntityType.Builder.of(FryerTileEntity::new, BlocksRegister.Fryer.get()).build(null));
    public static final RegistryObject<TileEntityType<DoubledWoodenCabinetryTileEntity>>  DoubledWoodenCabinetryTile=Tiles.register("doubled_wooden_cabinetry", () -> TileEntityType.Builder.of(DoubledWoodenCabinetryTileEntity::new, BlocksRegister.DoubledWoodenCabinetry.get()).build(null));
    public static final RegistryObject<TileEntityType<RiceHokoraTileEntity>>  RiceHokoraTile=Tiles.register("rice_hokora", () -> TileEntityType.Builder.of(RiceHokoraTileEntity::new, BlocksRegister.rice_hokora.get()).build(null));
    public static final RegistryObject<TileEntityType<ReiryokuTankTier1TileEntity>>  ReiryokuTankTier1=Tiles.register("reiryoku_tank", () -> TileEntityType.Builder.of(ReiryokuTankTier1TileEntity::new, BlocksRegister.reiryoku_tank_tier1.get()).build(null));
    public static final RegistryObject<TileEntityType<ReiryokuPipeTileEntity>>  ReiryokuPipe=Tiles.register("reiryoku_pipe", () -> TileEntityType.Builder.of(ReiryokuPipeTileEntity::new, BlocksRegister.reiryoku_pipe.get()).build(null));
    public static final RegistryObject<TileEntityType<ReiryokuAltarTileEntity>>  ReiryokuAltar=Tiles.register("reiryoku_altar", () -> TileEntityType.Builder.of(ReiryokuAltarTileEntity::new, BlocksRegister.reiryoku_altar.get()).build(null));
    public static void register(IEventBus eventBus) {
        Tiles.register(eventBus);
    }



}
