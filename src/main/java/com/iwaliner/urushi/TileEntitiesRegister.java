package com.iwaliner.urushi;


import com.iwaliner.urushi.TileEntity.FoxHopperTileEntity;
import com.iwaliner.urushi.TileEntity.WoodenCabinetrySlabTileEntity;
import com.iwaliner.urushi.TileEntity.WoodenCabinetryTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class TileEntitiesRegister {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final DeferredRegister<TileEntityType<?>> Tiles = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ModCore_Urushi.MOD_ID);
    public static final RegistryObject<TileEntityType<WoodenCabinetryTileEntity>>  WoodenCabinetryTile=Tiles.register("wooden_cabinetry", () -> TileEntityType.Builder.of(WoodenCabinetryTileEntity::new, BlocksRegister.WoodenCabinetry.get()).build(null));
    public static final RegistryObject<TileEntityType<WoodenCabinetrySlabTileEntity>>  WoodenCabinetrySlabTile=Tiles.register("wooden_cabinetry_slab", () -> TileEntityType.Builder.of(WoodenCabinetrySlabTileEntity::new, BlocksRegister.WoodenCabinetrySlab.get()).build(null));
    public static final RegistryObject<TileEntityType<FoxHopperTileEntity>>  FoxHopperTile=Tiles.register("fox_hopper", () -> TileEntityType.Builder.of(FoxHopperTileEntity::new, BlocksRegister.FoxHopper.get()).build(null));

    public static void register(IEventBus eventBus) {
        Tiles.register(eventBus);
    }



}
