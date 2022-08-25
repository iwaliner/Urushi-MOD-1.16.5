package com.iwaliner.urushi;

import com.iwaliner.urushi.Container.DoubledWoodenCabinetryContainer;
import com.iwaliner.urushi.Container.FryerContainer;

import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ContainerRegister  {
    public static final DeferredRegister<ContainerType<?>> Containers = DeferredRegister.create(ForgeRegistries.CONTAINERS, ModCore_Urushi.MOD_ID);



    public static final RegistryObject<ContainerType<FryerContainer>> FryerContainer = Containers.register("fryer", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return new FryerContainer(windowId, inv);
    }));
    public static final RegistryObject<ContainerType<DoubledWoodenCabinetryContainer>> DoubledWoodenCabinetryContainer = Containers.register("doubled_wooden_cabinetry", () -> IForgeContainerType.create((windowId, inv, data) -> {
        return com.iwaliner.urushi.Container.DoubledWoodenCabinetryContainer.twRows(windowId,inv,new Inventory(13 * 8+4));
    }));



    public static void register(IEventBus eventBus) {
        Containers.register(eventBus);
    }

}
