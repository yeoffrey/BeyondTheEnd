package com.geoffreybelcher.beyondtheend.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {

    public static final CreativeModeTab BEYONDTHEEND_TAB = new CreativeModeTab("beyondtheend") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ECHO_NUGGET.get());
        }
    };

}
