package net.codercadet.enchantcraft.item;

import net.codercadet.enchantcraft.EnchantCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EnchantCraft.MOD_ID);

    public static final DeferredItem<Item> ENCHANTED_DIAMOND = ITEMS.register("enchanted_diamond",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
