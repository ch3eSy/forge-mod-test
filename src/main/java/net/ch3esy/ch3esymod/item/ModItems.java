package net.ch3esy.ch3esymod.item;

import net.ch3esy.ch3esymod.ch3eSy_mod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ch3eSy_mod.MOD_ID);

    public static final RegistryObject<Item> BUBBLES = ITEMS.register(
            "bubbles",() -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLOBBA = ITEMS.register(
            "slobba",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
