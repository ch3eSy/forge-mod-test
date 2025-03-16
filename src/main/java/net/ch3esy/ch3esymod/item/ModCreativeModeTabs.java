package net.ch3esy.ch3esymod.item;

import net.ch3esy.ch3esymod.ch3eSy_mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ch3eSy_mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CH3ESYMODTAB = CREATIVE_MODE_TABS.register("ch3esymodtab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BUBBLES.get()))
                    .title(Component.translatable("creativetab.ch3esymodtab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BUBBLES.get());
                        pOutput.accept(ModItems.SLOBBA.get());
                    })
                    .build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TABS.register(eventbus);
    }
}
