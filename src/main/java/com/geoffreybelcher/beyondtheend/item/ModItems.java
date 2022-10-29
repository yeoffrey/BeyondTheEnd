package com.geoffreybelcher.beyondtheend.item;

import com.geoffreybelcher.beyondtheend.BeyondTheEndMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BeyondTheEndMod.MOD_ID);

    public static final RegistryObject<Item> ECHO_NUGGET = ITEMS.register("echo_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.BEYONDTHEEND_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
